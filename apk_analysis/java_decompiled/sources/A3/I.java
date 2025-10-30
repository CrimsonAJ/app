package A3;

/* loaded from: classes.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    public final String f74a;

    /* renamed from: b, reason: collision with root package name */
    public final int f75b;

    /* renamed from: c, reason: collision with root package name */
    public final int f76c;

    /* renamed from: d, reason: collision with root package name */
    public int f77d;

    /* renamed from: e, reason: collision with root package name */
    public String f78e;

    public I(int i9, int i10) {
        this(Integer.MIN_VALUE, i9, i10);
    }

    public final void a() {
        int i9;
        int i10 = this.f77d;
        if (i10 == Integer.MIN_VALUE) {
            i9 = this.f75b;
        } else {
            i9 = i10 + this.f76c;
        }
        this.f77d = i9;
        this.f78e = this.f74a + this.f77d;
    }

    public final void b() {
        if (this.f77d != Integer.MIN_VALUE) {
        } else {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public I(int i9, int i10, int i11) {
        String str;
        if (i9 != Integer.MIN_VALUE) {
            str = i9 + "/";
        } else {
            str = "";
        }
        this.f74a = str;
        this.f75b = i10;
        this.f76c = i11;
        this.f77d = Integer.MIN_VALUE;
        this.f78e = "";
    }
}
