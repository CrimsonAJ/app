package co.notix;

/* loaded from: classes.dex */
public final class zl extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f13698a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lm f13699b;

    /* renamed from: c, reason: collision with root package name */
    public int f13700c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zl(lm lmVar, E7.d dVar) {
        super(dVar);
        this.f13699b = lmVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f13698a = obj;
        this.f13700c |= Integer.MIN_VALUE;
        return this.f13699b.a(this);
    }
}
