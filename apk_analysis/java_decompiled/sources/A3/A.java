package A3;

import android.util.SparseArray;
import q3.C1902g;
import q3.InterfaceC1905j;
import q3.InterfaceC1906k;
import q3.InterfaceC1907l;

/* loaded from: classes.dex */
public final class A implements InterfaceC1905j {

    /* renamed from: e, reason: collision with root package name */
    public boolean f30e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f31f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f32g;

    /* renamed from: h, reason: collision with root package name */
    public long f33h;

    /* renamed from: i, reason: collision with root package name */
    public x f34i;
    public InterfaceC1907l j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f35k;

    /* renamed from: a, reason: collision with root package name */
    public final l4.x f26a = new l4.x(0);

    /* renamed from: c, reason: collision with root package name */
    public final A4.r f28c = new A4.r(4096);

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f27b = new SparseArray();

    /* renamed from: d, reason: collision with root package name */
    public final y f29d = new y(0);

    @Override // q3.InterfaceC1905j
    public final void b(long j, long j4) {
        boolean z9;
        l4.x xVar = this.f26a;
        boolean z10 = true;
        if (xVar.d() == -9223372036854775807L) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            long c3 = xVar.c();
            if (c3 == -9223372036854775807L || c3 == 0 || c3 == j4) {
                z10 = false;
            }
            z9 = z10;
        }
        if (z9) {
            xVar.e(j4);
        }
        x xVar2 = this.f34i;
        if (xVar2 != null) {
            xVar2.d(j4);
        }
        int i9 = 0;
        while (true) {
            SparseArray sparseArray = this.f27b;
            if (i9 < sparseArray.size()) {
                z zVar = (z) sparseArray.valueAt(i9);
                zVar.f329f = false;
                zVar.f324a.a();
                i9++;
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0256  */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // q3.InterfaceC1905j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(q3.InterfaceC1906k r28, c7.C0790j r29) {
        /*
            Method dump skipped, instructions count: 845
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A3.A.f(q3.k, c7.j):int");
    }

    @Override // q3.InterfaceC1905j
    public final void i(InterfaceC1907l interfaceC1907l) {
        this.j = interfaceC1907l;
    }

    @Override // q3.InterfaceC1905j
    public final boolean j(InterfaceC1906k interfaceC1906k) {
        byte[] bArr = new byte[14];
        C1902g c1902g = (C1902g) interfaceC1906k;
        c1902g.t(bArr, 0, 14, false);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            c1902g.c(bArr[13] & 7, false);
            c1902g.t(bArr, 0, 3, false);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }

    @Override // q3.InterfaceC1905j
    public final void a() {
    }
}
