package j3;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public boolean f19330a;

    /* renamed from: b, reason: collision with root package name */
    public l0 f19331b;

    /* renamed from: c, reason: collision with root package name */
    public int f19332c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f19333d;

    /* renamed from: e, reason: collision with root package name */
    public int f19334e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f19335f;

    /* renamed from: g, reason: collision with root package name */
    public int f19336g;

    public G(l0 l0Var) {
        this.f19331b = l0Var;
    }

    public final void a(int i9) {
        boolean z9;
        boolean z10 = this.f19330a;
        if (i9 > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f19330a = z10 | z9;
        this.f19332c += i9;
    }
}
