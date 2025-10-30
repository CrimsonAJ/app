package O6;

/* loaded from: classes.dex */
public final class h implements L6.g {

    /* renamed from: a, reason: collision with root package name */
    public boolean f5527a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5528b = false;

    /* renamed from: c, reason: collision with root package name */
    public L6.c f5529c;

    /* renamed from: d, reason: collision with root package name */
    public final f f5530d;

    public h(f fVar) {
        this.f5530d = fVar;
    }

    @Override // L6.g
    public final L6.g d(String str) {
        if (!this.f5527a) {
            this.f5527a = true;
            this.f5530d.h(this.f5529c, str, this.f5528b);
            return this;
        }
        throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
    }

    @Override // L6.g
    public final L6.g g(boolean z9) {
        if (!this.f5527a) {
            this.f5527a = true;
            this.f5530d.g(this.f5529c, z9 ? 1 : 0, this.f5528b);
            return this;
        }
        throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
    }
}
