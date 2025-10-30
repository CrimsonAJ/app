package N3;

import android.net.Uri;
import java.util.Map;
import k4.C1516p;
import k4.InterfaceC1513m;
import l4.AbstractC1566a;

/* renamed from: N3.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0265p implements InterfaceC1513m {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1513m f5174a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5175b;

    /* renamed from: c, reason: collision with root package name */
    public final P f5176c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f5177d;

    /* renamed from: e, reason: collision with root package name */
    public int f5178e;

    public C0265p(InterfaceC1513m interfaceC1513m, int i9, P p9) {
        boolean z9;
        if (i9 > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC1566a.h(z9);
        this.f5174a = interfaceC1513m;
        this.f5175b = i9;
        this.f5176c = p9;
        this.f5177d = new byte[1];
        this.f5178e = i9;
    }

    @Override // k4.InterfaceC1510j
    public final int D(byte[] bArr, int i9, int i10) {
        long max;
        int i11 = this.f5178e;
        InterfaceC1513m interfaceC1513m = this.f5174a;
        if (i11 == 0) {
            byte[] bArr2 = this.f5177d;
            int i12 = 0;
            if (interfaceC1513m.D(bArr2, 0, 1) != -1) {
                int i13 = (bArr2[0] & 255) << 4;
                if (i13 != 0) {
                    byte[] bArr3 = new byte[i13];
                    int i14 = i13;
                    while (i14 > 0) {
                        int D8 = interfaceC1513m.D(bArr3, i12, i14);
                        if (D8 != -1) {
                            i12 += D8;
                            i14 -= D8;
                        }
                    }
                    while (i13 > 0 && bArr3[i13 - 1] == 0) {
                        i13--;
                    }
                    if (i13 > 0) {
                        A4.r rVar = new A4.r(i13, bArr3);
                        P p9 = this.f5176c;
                        if (!p9.f4961l) {
                            max = p9.f4959i;
                        } else {
                            max = Math.max(p9.f4962m.j(true), p9.f4959i);
                        }
                        long j = max;
                        int e8 = rVar.e();
                        c0 c0Var = p9.f4960k;
                        c0Var.getClass();
                        c0Var.b(e8, rVar);
                        c0Var.d(j, 1, e8, 0, null);
                        p9.f4961l = true;
                    }
                }
                this.f5178e = this.f5175b;
            }
            return -1;
        }
        int D9 = interfaceC1513m.D(bArr, i9, Math.min(this.f5178e, i10));
        if (D9 != -1) {
            this.f5178e -= D9;
        }
        return D9;
    }

    @Override // k4.InterfaceC1513m
    public final void a(k4.W w7) {
        w7.getClass();
        this.f5174a.a(w7);
    }

    @Override // k4.InterfaceC1513m
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // k4.InterfaceC1513m
    public final long g(C1516p c1516p) {
        throw new UnsupportedOperationException();
    }

    @Override // k4.InterfaceC1513m
    public final Map l() {
        return this.f5174a.l();
    }

    @Override // k4.InterfaceC1513m
    public final Uri s() {
        return this.f5174a.s();
    }
}
