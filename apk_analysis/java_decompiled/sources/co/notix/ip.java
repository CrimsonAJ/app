package co.notix;

/* loaded from: classes.dex */
public final class ip extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public jp f12494a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12495b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ jp f12496c;

    /* renamed from: d, reason: collision with root package name */
    public int f12497d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ip(jp jpVar, E7.d dVar) {
        super(dVar);
        this.f12496c = jpVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12495b = obj;
        this.f12497d |= Integer.MIN_VALUE;
        return this.f12496c.a(this);
    }
}
