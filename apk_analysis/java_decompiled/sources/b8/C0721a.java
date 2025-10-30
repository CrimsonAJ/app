package b8;

import X.C0419t;

/* renamed from: b8.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0721a extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public c8.z f11458r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f11459s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0419t f11460t;

    /* renamed from: u, reason: collision with root package name */
    public int f11461u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0721a(C0419t c0419t, E7.d dVar) {
        super(dVar);
        this.f11460t = c0419t;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f11459s = obj;
        this.f11461u |= Integer.MIN_VALUE;
        return this.f11460t.collect(null, this);
    }
}
