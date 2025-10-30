package A5;

/* loaded from: classes.dex */
public final class x extends e {

    /* renamed from: h, reason: collision with root package name */
    public int f483h;

    /* renamed from: i, reason: collision with root package name */
    public int f484i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public int f485k;

    @Override // A5.e
    public final void a() {
        super.a();
        if (this.f485k >= 0) {
            if (this.f483h == 0) {
                if (this.f401b > 0 && this.f406g == 0) {
                    throw new IllegalArgumentException("Rounded corners without gap are not supported in contiguous indeterminate animation.");
                }
                if (this.f402c.length < 3) {
                    throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Stop indicator size must be >= 0.");
    }
}
