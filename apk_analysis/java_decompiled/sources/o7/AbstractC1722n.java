package o7;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import k4.C1499E;

/* renamed from: o7.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1722n implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public int f21687a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f21688b;

    /* renamed from: c, reason: collision with root package name */
    public String[] f21689c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f21690d;

    public abstract boolean F();

    public abstract double I();

    public abstract int N();

    public abstract void O();

    public abstract String S();

    public abstract void a();

    public abstract int a0();

    public abstract void d();

    public abstract void g();

    public final void g0(int i9) {
        int i10 = this.f21687a;
        int[] iArr = this.f21688b;
        if (i10 == iArr.length) {
            if (i10 != 256) {
                this.f21688b = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f21689c;
                this.f21689c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f21690d;
                this.f21690d = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                throw new RuntimeException("Nesting too deep at " + x());
            }
        }
        int[] iArr3 = this.f21688b;
        int i11 = this.f21687a;
        this.f21687a = i11 + 1;
        iArr3[i11] = i9;
    }

    public abstract int h0(C1499E c1499e);

    public abstract void i0();

    public abstract void j0();

    public final void k0(String str) {
        throw new IOException(str + " at path " + x());
    }

    public abstract void s();

    public final String x() {
        return AbstractC1708D.c(this.f21687a, this.f21688b, this.f21690d, this.f21689c);
    }
}
