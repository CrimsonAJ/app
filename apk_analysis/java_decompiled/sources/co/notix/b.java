package co.notix;

import Y7.C0473n;
import Y7.InterfaceC0472m;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import android.app.ActivityManager;
import android.content.Context;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final y8 f11899a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0484z f11900b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0472m f11901c;

    public b(d9 contextProvider, InterfaceC0484z cs) {
        kotlin.jvm.internal.h.e(contextProvider, "contextProvider");
        kotlin.jvm.internal.h.e(cs, "cs");
        this.f11899a = contextProvider;
        this.f11900b = cs;
        Boolean bool = Boolean.FALSE;
        C0473n c0473n = new C0473n();
        c0473n.L(bool);
        this.f11901c = c0473n;
    }

    public static final boolean a(b bVar, Context context) {
        Object h7;
        bVar.getClass();
        Object systemService = context.getSystemService("activity");
        kotlin.jvm.internal.h.c(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        try {
            kotlin.jvm.internal.h.d(((ActivityManager) systemService).getAppTasks(), "am.appTasks");
            h7 = Boolean.valueOf(!r1.isEmpty());
        } catch (Throwable th) {
            h7 = AbstractC0485a.h(th);
        }
        Object obj = Boolean.TRUE;
        if (h7 instanceof A7.i) {
            h7 = obj;
        }
        return ((Boolean) h7).booleanValue();
    }
}
