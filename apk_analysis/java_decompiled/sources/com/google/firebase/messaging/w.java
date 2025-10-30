package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: d, reason: collision with root package name */
    public static WeakReference f16517d;

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f16518a;

    /* renamed from: b, reason: collision with root package name */
    public Y2.r f16519b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f16520c;

    public w(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f16520c = scheduledThreadPoolExecutor;
        this.f16518a = sharedPreferences;
    }

    public final synchronized v a() {
        v vVar;
        String H8 = this.f16519b.H();
        Pattern pattern = v.f16513d;
        vVar = null;
        if (!TextUtils.isEmpty(H8)) {
            String[] split = H8.split("!", -1);
            if (split.length == 2) {
                vVar = new v(split[0], split[1]);
            }
        }
        return vVar;
    }

    public final synchronized void b() {
        this.f16519b = Y2.r.t(this.f16518a, this.f16520c);
    }

    public final synchronized void c(v vVar) {
        this.f16519b.I(vVar.f16516c);
    }
}
