package co.notix;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import b8.C0718Q;
import b8.InterfaceC0707F;

/* loaded from: classes.dex */
public final class lf {

    /* renamed from: a, reason: collision with root package name */
    public final y8 f12705a;

    /* renamed from: b, reason: collision with root package name */
    public final A7.e f12706b;

    /* renamed from: c, reason: collision with root package name */
    public final A7.e f12707c;

    public lf(d9 contextProvider) {
        kotlin.jvm.internal.h.e(contextProvider, "contextProvider");
        this.f12705a = contextProvider;
        this.f12706b = Z0.a.q(new jf(this));
        this.f12707c = Z0.a.q(new kf(this));
    }

    public final boolean a() {
        if (Build.VERSION.SDK_INT < 33) {
            return true;
        }
        Context a5 = ((d9) this.f12705a).a();
        kotlin.jvm.internal.h.e(a5, "<this>");
        return a5.getApplicationInfo().targetSdkVersion < 33 || E.d.a(((d9) this.f12705a).a(), "android.permission.POST_NOTIFICATIONS") == 0;
    }

    public final boolean b() {
        if (Build.VERSION.SDK_INT >= 33) {
            Context a5 = ((d9) this.f12705a).a();
            kotlin.jvm.internal.h.e(a5, "<this>");
            if (a5.getApplicationInfo().targetSdkVersion >= 33 && E.d.a(((d9) this.f12705a).a(), "android.permission.POST_NOTIFICATIONS") != 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean c() {
        boolean a5 = a();
        InterfaceC0707F interfaceC0707F = (InterfaceC0707F) this.f12706b.getValue();
        Boolean valueOf = Boolean.valueOf(a5);
        C0718Q c0718q = (C0718Q) interfaceC0707F;
        c0718q.getClass();
        c0718q.j(null, valueOf);
        return a5;
    }

    public static void a(Activity activity) {
        kotlin.jvm.internal.h.e(activity, "activity");
        activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 71283);
    }
}
