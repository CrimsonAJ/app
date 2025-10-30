package co.notix;

/* loaded from: classes.dex */
public final class cm extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f12051a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lm f12052b;

    /* renamed from: c, reason: collision with root package name */
    public int f12053c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cm(lm lmVar, E7.d dVar) {
        super(dVar);
        this.f12052b = lmVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12051a = obj;
        this.f12053c |= Integer.MIN_VALUE;
        return this.f12052b.c(this);
    }
}
