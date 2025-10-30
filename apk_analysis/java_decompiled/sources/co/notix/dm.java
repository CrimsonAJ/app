package co.notix;

/* loaded from: classes.dex */
public final class dm extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f12115a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lm f12116b;

    /* renamed from: c, reason: collision with root package name */
    public int f12117c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dm(lm lmVar, E7.d dVar) {
        super(dVar);
        this.f12116b = lmVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12115a = obj;
        this.f12117c |= Integer.MIN_VALUE;
        return this.f12116b.d(this);
    }
}
