package co.notix;

/* loaded from: classes.dex */
public final class oi extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public ni f12894a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12895b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ej f12896c;

    /* renamed from: d, reason: collision with root package name */
    public int f12897d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oi(ej ejVar, E7.d dVar) {
        super(dVar);
        this.f12896c = ejVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12895b = obj;
        this.f12897d |= Integer.MIN_VALUE;
        return this.f12896c.a((ni) null, this);
    }
}
