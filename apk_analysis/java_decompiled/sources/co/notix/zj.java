package co.notix;

/* loaded from: classes.dex */
public final class zj extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public sk f13687a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f13688b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sk f13689c;

    /* renamed from: d, reason: collision with root package name */
    public int f13690d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zj(sk skVar, E7.d dVar) {
        super(dVar);
        this.f13689c = skVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f13688b = obj;
        this.f13690d |= Integer.MIN_VALUE;
        return this.f13689c.a(this);
    }
}
