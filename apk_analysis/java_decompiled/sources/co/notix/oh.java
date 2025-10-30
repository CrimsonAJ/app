package co.notix;

/* loaded from: classes.dex */
public final class oh extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public vh f12889a;

    /* renamed from: b, reason: collision with root package name */
    public g8.a f12890b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f12891c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vh f12892d;

    /* renamed from: e, reason: collision with root package name */
    public int f12893e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oh(vh vhVar, E7.d dVar) {
        super(dVar);
        this.f12892d = vhVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12891c = obj;
        this.f12893e |= Integer.MIN_VALUE;
        return this.f12892d.a(this);
    }
}
