package co.notix;

/* loaded from: classes.dex */
public final class jm extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f12568a;

    /* renamed from: b, reason: collision with root package name */
    public pl f12569b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f12570c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lm f12571d;

    /* renamed from: e, reason: collision with root package name */
    public int f12572e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jm(lm lmVar, E7.d dVar) {
        super(dVar);
        this.f12571d = lmVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12570c = obj;
        this.f12572e |= Integer.MIN_VALUE;
        return this.f12571d.c(null, this);
    }
}
