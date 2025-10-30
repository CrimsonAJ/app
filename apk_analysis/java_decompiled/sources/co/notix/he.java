package co.notix;

/* loaded from: classes.dex */
public final class he extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public ie f12376a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12377b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ie f12378c;

    /* renamed from: d, reason: collision with root package name */
    public int f12379d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public he(ie ieVar, E7.d dVar) {
        super(dVar);
        this.f12378c = ieVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12377b = obj;
        this.f12379d |= Integer.MIN_VALUE;
        return this.f12378c.c(this);
    }
}
