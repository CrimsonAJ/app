package b5;

import java.lang.Thread;

/* renamed from: b5.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0638j0 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final String f11160a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0647m0 f11161b;

    public C0638j0(C0647m0 c0647m0, String str) {
        this.f11161b = c0647m0;
        this.f11160a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        V v8 = ((C0650n0) this.f11161b.f1707a).f11229i;
        C0650n0.f(v8);
        v8.f10971f.c(th, this.f11160a);
    }
}
