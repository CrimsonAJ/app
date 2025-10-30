package co.notix;

/* loaded from: classes.dex */
public final class cj extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public String f12040a;

    /* renamed from: b, reason: collision with root package name */
    public O7.l f12041b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f12042c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ej f12043d;

    /* renamed from: e, reason: collision with root package name */
    public int f12044e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cj(ej ejVar, E7.d dVar) {
        super(dVar);
        this.f12043d = ejVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12042c = obj;
        this.f12044e |= Integer.MIN_VALUE;
        return this.f12043d.a(null, null, this);
    }
}
