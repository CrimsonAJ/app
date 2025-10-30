package z3;

import A4.r;
import N3.X;
import com.google.android.gms.internal.measurement.D1;
import com.google.android.gms.internal.measurement.Y1;
import j3.M;
import java.util.Arrays;
import k4.C1499E;
import q3.C1909n;

/* renamed from: z3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2239c extends AbstractC2245i {

    /* renamed from: n, reason: collision with root package name */
    public C1909n f25379n;

    /* renamed from: o, reason: collision with root package name */
    public X f25380o;

    @Override // z3.AbstractC2245i
    public final long b(r rVar) {
        byte[] bArr = (byte[]) rVar.f384c;
        if (bArr[0] == -1) {
            int i9 = (bArr[2] & 255) >> 4;
            if (i9 == 6 || i9 == 7) {
                rVar.I(4);
                rVar.D();
            }
            int G8 = D1.G(i9, rVar);
            rVar.H(0);
            return G8;
        }
        return -1L;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, N3.X] */
    @Override // z3.AbstractC2245i
    public final boolean c(r rVar, long j, C1499E c1499e) {
        byte[] bArr = (byte[]) rVar.f384c;
        C1909n c1909n = this.f25379n;
        if (c1909n == null) {
            C1909n c1909n2 = new C1909n(17, bArr);
            this.f25379n = c1909n2;
            c1499e.f19985b = c1909n2.c(Arrays.copyOfRange(bArr, 9, rVar.f383b), null);
            return true;
        }
        byte b9 = bArr[0];
        if ((b9 & Byte.MAX_VALUE) == 3) {
            C1499E A2 = Y1.A(rVar);
            C1909n c1909n3 = new C1909n(c1909n.f22324a, c1909n.f22325b, c1909n.f22326c, c1909n.f22327d, c1909n.f22328e, c1909n.f22330g, c1909n.f22331h, c1909n.j, A2, c1909n.f22334l);
            this.f25379n = c1909n3;
            ?? obj = new Object();
            obj.f5023c = c1909n3;
            obj.f5024d = A2;
            obj.f5021a = -1L;
            obj.f5022b = -1L;
            this.f25380o = obj;
            return true;
        }
        if (b9 != -1) {
            return true;
        }
        X x5 = this.f25380o;
        if (x5 != null) {
            x5.f5021a = j;
            c1499e.f19986c = x5;
        }
        ((M) c1499e.f19985b).getClass();
        return false;
    }

    @Override // z3.AbstractC2245i
    public final void d(boolean z9) {
        super.d(z9);
        if (z9) {
            this.f25379n = null;
            this.f25380o = null;
        }
    }
}
