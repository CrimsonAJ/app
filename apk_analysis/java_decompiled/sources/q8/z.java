package q8;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public int f22572a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f22573b = new int[10];

    public final int a() {
        if ((this.f22572a & 128) != 0) {
            return this.f22573b[7];
        }
        return 65535;
    }

    public final void b(z other) {
        kotlin.jvm.internal.h.e(other, "other");
        for (int i9 = 0; i9 < 10; i9++) {
            boolean z9 = true;
            if (((1 << i9) & other.f22572a) == 0) {
                z9 = false;
            }
            if (z9) {
                c(i9, other.f22573b[i9]);
            }
        }
    }

    public final void c(int i9, int i10) {
        if (i9 >= 0) {
            int[] iArr = this.f22573b;
            if (i9 < iArr.length) {
                this.f22572a = (1 << i9) | this.f22572a;
                iArr[i9] = i10;
            }
        }
    }
}
