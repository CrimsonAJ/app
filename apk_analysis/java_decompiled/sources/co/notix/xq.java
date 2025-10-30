package co.notix;

import a.AbstractC0485a;
import android.content.Context;
import android.content.SharedPreferences;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/* loaded from: classes.dex */
public final class xq {
    public static String a() {
        return a(wq.f13475b.a(), "NOTIX_APP_ID");
    }

    public static void d() {
        wq.f13475b.a().getSharedPreferences("NOTIX_PREF_STORAGE", 0).edit().remove("NOTIX_DEVICE_TOKEN").apply();
    }

    public final synchronized long b() {
        long j;
        Object h7;
        long time;
        try {
            d9 d9Var = wq.f13475b;
            j = d9Var.a().getSharedPreferences("NOTIX_PREF_STORAGE", 0).getLong("NOTIX_CREATED_DATE_TIMESTAMP", 0L);
            if (j == 0) {
                String a5 = a(d9Var.a(), "NOTIX_CREATED_DATE");
                if (a5 != null) {
                    try {
                        h7 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(a5);
                    } catch (Throwable th) {
                        h7 = AbstractC0485a.h(th);
                    }
                    if (h7 instanceof A7.i) {
                        h7 = null;
                    }
                    Date date = (Date) h7;
                    if (date != null) {
                        time = date.getTime();
                        j = time;
                        a(wq.f13475b.a(), "NOTIX_CREATED_DATE_TIMESTAMP", j);
                    }
                }
                time = System.currentTimeMillis();
                j = time;
                a(wq.f13475b.a(), "NOTIX_CREATED_DATE_TIMESTAMP", j);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return j;
    }

    public final synchronized String c() {
        String a5;
        d9 d9Var = wq.f13475b;
        a5 = a(d9Var.a(), "NOTIX_PREF_UNIQUE_ID");
        if (a5 == null) {
            String uuid = UUID.randomUUID().toString();
            kotlin.jvm.internal.h.d(uuid, "randomUUID().toString()");
            a5 = W7.l.J(uuid, "-", "");
            a(d9Var.a(), "NOTIX_PREF_UNIQUE_ID", a5);
        }
        return a5;
    }

    public static String a(Context context, String str) {
        return context.getSharedPreferences("NOTIX_PREF_STORAGE", 0).getString(str, null);
    }

    public static void a(Context context, String str, long j) {
        SharedPreferences.Editor edit = context.getSharedPreferences("NOTIX_PREF_STORAGE", 0).edit();
        kotlin.jvm.internal.h.d(edit, "sharedPrefs.edit()");
        edit.putLong(str, j);
        edit.apply();
    }

    public static void a(Context context, String str, String str2) {
        SharedPreferences.Editor edit = context.getSharedPreferences("NOTIX_PREF_STORAGE", 0).edit();
        kotlin.jvm.internal.h.d(edit, "sharedPrefs.edit()");
        edit.putString(str, str2);
        edit.apply();
    }
}
