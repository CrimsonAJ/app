package k4;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public int f19989a;

    /* renamed from: b, reason: collision with root package name */
    public int f19990b;

    /* renamed from: c, reason: collision with root package name */
    public int f19991c;

    /* renamed from: d, reason: collision with root package name */
    public int f19992d;

    public G(int i9, int i10, int i11, int i12) {
        this.f19989a = i9;
        this.f19990b = i10;
        this.f19991c = i11;
        this.f19992d = i12;
    }

    public boolean a(int i9) {
        if (i9 == 1) {
            if (this.f19989a - this.f19990b <= 1) {
                return false;
            }
        } else if (this.f19991c - this.f19992d <= 1) {
            return false;
        }
        return true;
    }
}
