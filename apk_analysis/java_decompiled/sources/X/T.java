package X;

/* loaded from: classes.dex */
public final class T extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public com.google.firebase.messaging.s f8028r;

    /* renamed from: s, reason: collision with root package name */
    public g8.a f8029s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f8030t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ com.google.firebase.messaging.s f8031u;

    /* renamed from: v, reason: collision with root package name */
    public int f8032v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(com.google.firebase.messaging.s sVar, G7.c cVar) {
        super(cVar);
        this.f8031u = sVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f8030t = obj;
        this.f8032v |= Integer.MIN_VALUE;
        return this.f8031u.s(this);
    }
}
