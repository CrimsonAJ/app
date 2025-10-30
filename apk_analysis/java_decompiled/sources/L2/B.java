package L2;

/* loaded from: classes.dex */
public final class B extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f4578r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ F f4579s;

    /* renamed from: t, reason: collision with root package name */
    public int f4580t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(F f9, G7.c cVar) {
        super(cVar);
        this.f4579s = f9;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f4578r = obj;
        this.f4580t |= Integer.MIN_VALUE;
        return this.f4579s.a(null, 0L, this);
    }
}
