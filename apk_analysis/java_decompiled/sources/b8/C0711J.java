package b8;

import Y7.C0464h;

/* renamed from: b8.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0711J implements Y7.M {

    /* renamed from: a, reason: collision with root package name */
    public final C0713L f11423a;

    /* renamed from: b, reason: collision with root package name */
    public final long f11424b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f11425c;

    /* renamed from: d, reason: collision with root package name */
    public final C0464h f11426d;

    public C0711J(C0713L c0713l, long j, Object obj, C0464h c0464h) {
        this.f11423a = c0713l;
        this.f11424b = j;
        this.f11425c = obj;
        this.f11426d = c0464h;
    }

    @Override // Y7.M
    public final void b() {
        C0713L c0713l = this.f11423a;
        synchronized (c0713l) {
            if (this.f11424b < c0713l.m()) {
                return;
            }
            Object[] objArr = c0713l.f11437h;
            kotlin.jvm.internal.h.b(objArr);
            long j = this.f11424b;
            if (objArr[((int) j) & (objArr.length - 1)] != this) {
                return;
            }
            AbstractC0714M.e(objArr, j, AbstractC0714M.f11441a);
            c0713l.h();
        }
    }
}
