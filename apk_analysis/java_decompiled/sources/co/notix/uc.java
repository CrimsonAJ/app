package co.notix;

/* loaded from: classes.dex */
public final class uc extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f13290a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ed f13291b;

    /* renamed from: c, reason: collision with root package name */
    public int f13292c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uc(ed edVar, E7.d dVar) {
        super(dVar);
        this.f13291b = edVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f13290a = obj;
        this.f13292c |= Integer.MIN_VALUE;
        return this.f13291b.a(this);
    }
}
