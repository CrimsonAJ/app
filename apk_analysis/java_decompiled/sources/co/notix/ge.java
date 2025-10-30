package co.notix;

/* loaded from: classes.dex */
public final class ge extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f12316a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ie f12317b;

    /* renamed from: c, reason: collision with root package name */
    public int f12318c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ge(ie ieVar, E7.d dVar) {
        super(dVar);
        this.f12317b = ieVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12316a = obj;
        this.f12318c |= Integer.MIN_VALUE;
        return this.f12317b.b(this);
    }
}
