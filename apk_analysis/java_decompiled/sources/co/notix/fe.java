package co.notix;

/* loaded from: classes.dex */
public final class fe extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public ie f12247a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12248b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ie f12249c;

    /* renamed from: d, reason: collision with root package name */
    public int f12250d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fe(ie ieVar, E7.d dVar) {
        super(dVar);
        this.f12249c = ieVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12248b = obj;
        this.f12250d |= Integer.MIN_VALUE;
        return this.f12249c.a(this);
    }
}
