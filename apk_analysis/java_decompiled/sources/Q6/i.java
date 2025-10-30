package Q6;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f6459a;

    public i(Context context, String str) {
        this.f6459a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    public final synchronized void a() {
        try {
            long j = this.f6459a.getLong("fire-count", 0L);
            String str = "";
            String str2 = null;
            for (Map.Entry<String, ?> entry : this.f6459a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str3 : (Set) entry.getValue()) {
                        if (str2 != null && str2.compareTo(str3) <= 0) {
                        }
                        str = entry.getKey();
                        str2 = str3;
                    }
                }
            }
            HashSet hashSet = new HashSet(this.f6459a.getStringSet(str, new HashSet()));
            hashSet.remove(str2);
            this.f6459a.edit().putStringSet(str, hashSet).putLong("fire-count", j - 1).commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        try {
            SharedPreferences.Editor edit = this.f6459a.edit();
            int i9 = 0;
            for (Map.Entry<String, ?> entry : this.f6459a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set set = (Set) entry.getValue();
                    String d9 = d(System.currentTimeMillis());
                    String key = entry.getKey();
                    if (set.contains(d9)) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(d9);
                        i9++;
                        edit.putStringSet(key, hashSet);
                    } else {
                        edit.remove(key);
                    }
                }
            }
            if (i9 == 0) {
                edit.remove("fire-count");
            } else {
                edit.putLong("fire-count", i9);
            }
            edit.commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized ArrayList c() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : this.f6459a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(d(System.currentTimeMillis()));
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new a(entry.getKey(), new ArrayList(hashSet)));
                    }
                }
            }
            l(System.currentTimeMillis());
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized String d(long j) {
        Instant instant;
        OffsetDateTime atOffset;
        LocalDateTime localDateTime;
        String format;
        ZoneOffset unused;
        DateTimeFormatter unused2;
        if (Build.VERSION.SDK_INT >= 26) {
            instant = new Date(j).toInstant();
            unused = ZoneOffset.UTC;
            atOffset = instant.atOffset(ZoneOffset.UTC);
            localDateTime = atOffset.toLocalDateTime();
            unused2 = DateTimeFormatter.ISO_LOCAL_DATE;
            format = localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE);
            return format;
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
    }

    public final synchronized String e(String str) {
        for (Map.Entry<String, ?> entry : this.f6459a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    public final synchronized boolean f(long j, long j4) {
        return d(j).equals(d(j4));
    }

    public final synchronized void g() {
        String d9 = d(System.currentTimeMillis());
        this.f6459a.edit().putString("last-used-date", d9).commit();
        h(d9);
    }

    public final synchronized void h(String str) {
        try {
            String e8 = e(str);
            if (e8 == null) {
                return;
            }
            HashSet hashSet = new HashSet(this.f6459a.getStringSet(e8, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                this.f6459a.edit().remove(e8).commit();
            } else {
                this.f6459a.edit().putStringSet(e8, hashSet).commit();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean i(long j) {
        return j(j);
    }

    public final synchronized boolean j(long j) {
        if (this.f6459a.contains("fire-global")) {
            if (!f(this.f6459a.getLong("fire-global", -1L), j)) {
                this.f6459a.edit().putLong("fire-global", j).commit();
                return true;
            }
            return false;
        }
        this.f6459a.edit().putLong("fire-global", j).commit();
        return true;
    }

    public final synchronized void k(long j, String str) {
        String d9 = d(j);
        if (this.f6459a.getString("last-used-date", "").equals(d9)) {
            String e8 = e(d9);
            if (e8 == null) {
                return;
            }
            if (e8.equals(str)) {
                return;
            }
            m(str, d9);
            return;
        }
        long j4 = this.f6459a.getLong("fire-count", 0L);
        if (j4 + 1 == 30) {
            a();
            j4 = this.f6459a.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.f6459a.getStringSet(str, new HashSet()));
        hashSet.add(d9);
        this.f6459a.edit().putStringSet(str, hashSet).putLong("fire-count", j4 + 1).putString("last-used-date", d9).commit();
    }

    public final synchronized void l(long j) {
        this.f6459a.edit().putLong("fire-global", j).commit();
    }

    public final synchronized void m(String str, String str2) {
        h(str2);
        HashSet hashSet = new HashSet(this.f6459a.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.f6459a.edit().putStringSet(str, hashSet).commit();
    }
}
