package co.notix;

/* loaded from: classes.dex */
public final class vc extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f13351a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ed f13352b;

    /* renamed from: c, reason: collision with root package name */
    public int f13353c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vc(ed edVar, E7.d dVar) {
        super(dVar);
        this.f13352b = edVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f13351a = obj;
        this.f13353c |= Integer.MIN_VALUE;
        return this.f13352b.b(this);
    }
}
