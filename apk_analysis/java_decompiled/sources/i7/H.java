package i7;

import b8.C0737q;

/* loaded from: classes.dex */
public final class H extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f18754r;

    /* renamed from: s, reason: collision with root package name */
    public int f18755s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0737q f18756t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(C0737q c0737q, E7.d dVar) {
        super(dVar);
        this.f18756t = c0737q;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f18754r = obj;
        this.f18755s |= Integer.MIN_VALUE;
        return this.f18756t.emit(null, this);
    }
}
