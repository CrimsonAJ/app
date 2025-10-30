package co.notix;

/* loaded from: classes.dex */
public final class bm extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public ql f11949a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f11950b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lm f11951c;

    /* renamed from: d, reason: collision with root package name */
    public int f11952d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm(lm lmVar, E7.d dVar) {
        super(dVar);
        this.f11951c = lmVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f11950b = obj;
        this.f11952d |= Integer.MIN_VALUE;
        return this.f11951c.a((ql) null, this);
    }
}
