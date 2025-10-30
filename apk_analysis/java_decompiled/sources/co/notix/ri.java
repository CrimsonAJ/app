package co.notix;

/* loaded from: classes.dex */
public final class ri extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public String f13123a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f13124b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ej f13125c;

    /* renamed from: d, reason: collision with root package name */
    public int f13126d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ri(ej ejVar, E7.d dVar) {
        super(dVar);
        this.f13125c = ejVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f13124b = obj;
        this.f13126d |= Integer.MIN_VALUE;
        return this.f13125c.a((String) null, this);
    }
}
