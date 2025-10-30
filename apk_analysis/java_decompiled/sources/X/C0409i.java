package X;

/* renamed from: X.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0409i extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public com.google.firebase.messaging.s f8070r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f8071s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.google.firebase.messaging.s f8072t;

    /* renamed from: u, reason: collision with root package name */
    public int f8073u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0409i(com.google.firebase.messaging.s sVar, G7.c cVar) {
        super(cVar);
        this.f8072t = sVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f8071s = obj;
        this.f8073u |= Integer.MIN_VALUE;
        return this.f8072t.g(this);
    }
}
