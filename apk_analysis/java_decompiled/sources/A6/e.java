package A6;

import android.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f500a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final int f501b = 64;

    /* renamed from: c, reason: collision with root package name */
    public final int f502c;

    public e(int i9) {
        this.f502c = i9;
    }

    public static String b(int i9, String str) {
        if (str != null) {
            str = str.trim();
            if (str.length() > i9) {
                return str.substring(0, i9);
            }
        }
        return str;
    }

    public final synchronized Map a() {
        return Collections.unmodifiableMap(new HashMap(this.f500a));
    }

    public final synchronized boolean c(String str, String str2) {
        boolean equals;
        if (str != null) {
            String b9 = b(this.f502c, str);
            if (this.f500a.size() >= this.f501b && !this.f500a.containsKey(b9)) {
                Log.w("FirebaseCrashlytics", "Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.f501b, null);
                return false;
            }
            String b10 = b(this.f502c, str2);
            String str3 = (String) this.f500a.get(b9);
            if (str3 == null) {
                if (b10 == null) {
                    equals = true;
                } else {
                    equals = false;
                }
            } else {
                equals = str3.equals(b10);
            }
            if (equals) {
                return false;
            }
            HashMap hashMap = this.f500a;
            if (str2 == null) {
                b10 = "";
            }
            hashMap.put(b9, b10);
            return true;
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    public final synchronized void d(Map map) {
        String b9;
        try {
            int i9 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str != null) {
                    String b10 = b(this.f502c, str);
                    if (this.f500a.size() >= this.f501b && !this.f500a.containsKey(b10)) {
                        i9++;
                    }
                    String str2 = (String) entry.getValue();
                    HashMap hashMap = this.f500a;
                    if (str2 == null) {
                        b9 = "";
                    } else {
                        b9 = b(this.f502c, str2);
                    }
                    hashMap.put(b10, b9);
                } else {
                    throw new IllegalArgumentException("Custom attribute key must not be null.");
                }
            }
            if (i9 > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i9 + " entries when adding custom keys. Maximum allowable: " + this.f501b, null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
