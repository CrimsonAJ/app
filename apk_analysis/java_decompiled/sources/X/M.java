package X;

/* loaded from: classes.dex */
public final class M extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public kotlin.jvm.internal.m f8000r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f8001s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ O f8002t;

    /* renamed from: u, reason: collision with root package name */
    public int f8003u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(O o9, G7.c cVar) {
        super(cVar);
        this.f8002t = o9;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f8001s = obj;
        this.f8003u |= Integer.MIN_VALUE;
        return this.f8002t.k(null, false, this);
    }
}
