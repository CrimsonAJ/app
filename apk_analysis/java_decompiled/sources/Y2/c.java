package Y2;

import b3.C0603d;

/* loaded from: classes.dex */
public final class c implements L6.d {

    /* renamed from: a, reason: collision with root package name */
    public static final c f8598a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final L6.c f8599b = new L6.c("eventsDroppedCount", A0.a.s(A0.a.r(O6.e.class, new O6.a(1))));

    /* renamed from: c, reason: collision with root package name */
    public static final L6.c f8600c = new L6.c("reason", A0.a.s(A0.a.r(O6.e.class, new O6.a(3))));

    @Override // L6.a
    public final void a(Object obj, Object obj2) {
        C0603d c0603d = (C0603d) obj;
        L6.e eVar = (L6.e) obj2;
        eVar.f(f8599b, c0603d.f10523a);
        eVar.a(f8600c, c0603d.f10524b);
    }
}
