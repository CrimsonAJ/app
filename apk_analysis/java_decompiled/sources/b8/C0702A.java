package b8;

import X.C0418s;

/* renamed from: b8.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0702A extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f11405r;

    /* renamed from: s, reason: collision with root package name */
    public int f11406s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0418s f11407t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0702A(C0418s c0418s, E7.d dVar) {
        super(dVar);
        this.f11407t = c0418s;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f11405r = obj;
        this.f11406s |= Integer.MIN_VALUE;
        return this.f11407t.emit(null, this);
    }
}
