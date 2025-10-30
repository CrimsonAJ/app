package z3;

import A4.r;
import P5.F;
import j3.L;
import j3.M;
import java.util.ArrayList;
import java.util.Arrays;
import k4.C1499E;
import l3.AbstractC1552a;
import l4.AbstractC1566a;
import l4.y;
import l6.AbstractC1570b;

/* renamed from: z3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2244h extends AbstractC2245i {

    /* renamed from: o, reason: collision with root package name */
    public static final byte[] f25396o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: p, reason: collision with root package name */
    public static final byte[] f25397p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: n, reason: collision with root package name */
    public boolean f25398n;

    public static boolean e(r rVar, byte[] bArr) {
        if (rVar.e() < bArr.length) {
            return false;
        }
        int i9 = rVar.f382a;
        byte[] bArr2 = new byte[bArr.length];
        rVar.h(bArr2, 0, bArr.length);
        rVar.H(i9);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // z3.AbstractC2245i
    public final long b(r rVar) {
        int i9;
        int i10;
        byte[] bArr = (byte[]) rVar.f384c;
        byte b9 = bArr[0];
        int i11 = b9 & 255;
        int i12 = b9 & 3;
        if (i12 != 0) {
            i9 = 2;
            if (i12 != 1 && i12 != 2) {
                i9 = bArr[1] & 63;
            }
        } else {
            i9 = 1;
        }
        int i13 = i11 >> 3;
        int i14 = i13 & 3;
        if (i13 >= 16) {
            i10 = 2500 << i14;
        } else if (i13 >= 12) {
            i10 = 10000 << (i13 & 1);
        } else if (i14 == 3) {
            i10 = 60000;
        } else {
            i10 = 10000 << i14;
        }
        return (this.f25407i * (i9 * i10)) / 1000000;
    }

    @Override // z3.AbstractC2245i
    public final boolean c(r rVar, long j, C1499E c1499e) {
        if (e(rVar, f25396o)) {
            byte[] copyOf = Arrays.copyOf((byte[]) rVar.f384c, rVar.f383b);
            int i9 = copyOf[9] & 255;
            ArrayList c3 = AbstractC1552a.c(copyOf);
            if (((M) c1499e.f19985b) == null) {
                L l9 = new L();
                l9.f19402k = "audio/opus";
                l9.f19415x = i9;
                l9.f19416y = 48000;
                l9.f19404m = c3;
                c1499e.f19985b = new M(l9);
                return true;
            }
        } else if (e(rVar, f25397p)) {
            AbstractC1566a.n((M) c1499e.f19985b);
            if (!this.f25398n) {
                this.f25398n = true;
                rVar.I(8);
                D3.c s9 = AbstractC1570b.s(F.p(AbstractC1570b.v(rVar, false, false).f22358a));
                if (s9 != null) {
                    L a5 = ((M) c1499e.f19985b).a();
                    D3.c cVar = ((M) c1499e.f19985b).j;
                    if (cVar != null) {
                        D3.b[] bVarArr = cVar.f1786a;
                        if (bVarArr.length != 0) {
                            int i10 = y.f20553a;
                            D3.b[] bVarArr2 = s9.f1786a;
                            Object[] copyOf2 = Arrays.copyOf(bVarArr2, bVarArr2.length + bVarArr.length);
                            System.arraycopy(bVarArr, 0, copyOf2, bVarArr2.length, bVarArr.length);
                            s9 = new D3.c(s9.f1787b, (D3.b[]) copyOf2);
                        }
                    }
                    a5.f19401i = s9;
                    c1499e.f19985b = new M(a5);
                    return true;
                }
            }
        } else {
            AbstractC1566a.n((M) c1499e.f19985b);
            return false;
        }
        return true;
    }

    @Override // z3.AbstractC2245i
    public final void d(boolean z9) {
        super.d(z9);
        if (z9) {
            this.f25398n = false;
        }
    }
}
