package Y2;

import b3.C0604e;

/* loaded from: classes.dex */
public final class d implements L6.d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f8601a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final L6.c f8602b = new L6.c("logSource", A0.a.s(A0.a.r(O6.e.class, new O6.a(1))));

    /* renamed from: c, reason: collision with root package name */
    public static final L6.c f8603c = new L6.c("logEventDropped", A0.a.s(A0.a.r(O6.e.class, new O6.a(2))));

    @Override // L6.a
    public final void a(Object obj, Object obj2) {
        C0604e c0604e = (C0604e) obj;
        L6.e eVar = (L6.e) obj2;
        eVar.a(f8602b, c0604e.f10526a);
        eVar.a(f8603c, c0604e.f10527b);
    }
}
