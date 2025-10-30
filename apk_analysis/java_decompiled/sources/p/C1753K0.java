package p;

/* renamed from: p.K0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1753K0 {

    /* renamed from: a, reason: collision with root package name */
    public int f21832a;

    /* renamed from: b, reason: collision with root package name */
    public int f21833b;

    /* renamed from: c, reason: collision with root package name */
    public int f21834c;

    /* renamed from: d, reason: collision with root package name */
    public int f21835d;

    /* renamed from: e, reason: collision with root package name */
    public int f21836e;

    /* renamed from: f, reason: collision with root package name */
    public int f21837f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f21838g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f21839h;

    public final void a(int i9, int i10) {
        this.f21834c = i9;
        this.f21835d = i10;
        this.f21839h = true;
        if (this.f21838g) {
            if (i10 != Integer.MIN_VALUE) {
                this.f21832a = i10;
            }
            if (i9 != Integer.MIN_VALUE) {
                this.f21833b = i9;
                return;
            }
            return;
        }
        if (i9 != Integer.MIN_VALUE) {
            this.f21832a = i9;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f21833b = i10;
        }
    }
}
