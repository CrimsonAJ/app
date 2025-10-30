package u0;

/* renamed from: u0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2045p extends kotlin.jvm.internal.i implements O7.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.k f23519d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.k f23520e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ H f23521f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f23522g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ B7.i f23523h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2045p(kotlin.jvm.internal.k kVar, kotlin.jvm.internal.k kVar2, H h7, boolean z9, B7.i iVar) {
        super(1);
        this.f23519d = kVar;
        this.f23520e = kVar2;
        this.f23521f = h7;
        this.f23522g = z9;
        this.f23523h = iVar;
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        C2042m entry = (C2042m) obj;
        kotlin.jvm.internal.h.e(entry, "entry");
        this.f23519d.f20155a = true;
        this.f23520e.f20155a = true;
        this.f23521f.p(entry, this.f23522g, this.f23523h);
        return A7.n.f558a;
    }
}
