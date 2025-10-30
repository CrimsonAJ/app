package x;

import com.google.firebase.messaging.s;
import java.util.ArrayList;
import java.util.Arrays;
import l3.I;
import v4.q;
import w.C2125e;
import x8.m;
import y.k;
import y.l;

/* renamed from: x.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2150e extends C2149d {

    /* renamed from: d0, reason: collision with root package name */
    public ArrayList f24397d0 = new ArrayList();

    /* renamed from: e0, reason: collision with root package name */
    public final q f24398e0 = new q(this);

    /* renamed from: f0, reason: collision with root package name */
    public final m f24399f0;

    /* renamed from: g0, reason: collision with root package name */
    public I f24400g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f24401h0;

    /* renamed from: i0, reason: collision with root package name */
    public final C2125e f24402i0;

    /* renamed from: j0, reason: collision with root package name */
    public int f24403j0;

    /* renamed from: k0, reason: collision with root package name */
    public int f24404k0;

    /* renamed from: l0, reason: collision with root package name */
    public int f24405l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f24406m0;

    /* renamed from: n0, reason: collision with root package name */
    public C2147b[] f24407n0;

    /* renamed from: o0, reason: collision with root package name */
    public C2147b[] f24408o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f24409p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f24410q0;
    public boolean r0;

    public C2150e() {
        m mVar = new m();
        mVar.f24656b = true;
        mVar.f24657c = true;
        mVar.f24660f = new ArrayList();
        new ArrayList();
        mVar.f24661g = null;
        mVar.f24662h = new Object();
        mVar.f24663i = new ArrayList();
        mVar.f24658d = this;
        mVar.f24659e = this;
        this.f24399f0 = mVar;
        this.f24400g0 = null;
        this.f24401h0 = false;
        this.f24402i0 = new C2125e();
        this.f24405l0 = 0;
        this.f24406m0 = 0;
        this.f24407n0 = new C2147b[4];
        this.f24408o0 = new C2147b[4];
        this.f24409p0 = 263;
        this.f24410q0 = false;
        this.r0 = false;
    }

    public final void B(C2149d c2149d, int i9) {
        if (i9 == 0) {
            int i10 = this.f24405l0 + 1;
            C2147b[] c2147bArr = this.f24408o0;
            if (i10 >= c2147bArr.length) {
                this.f24408o0 = (C2147b[]) Arrays.copyOf(c2147bArr, c2147bArr.length * 2);
            }
            C2147b[] c2147bArr2 = this.f24408o0;
            int i11 = this.f24405l0;
            c2147bArr2[i11] = new C2147b(c2149d, 0, this.f24401h0);
            this.f24405l0 = i11 + 1;
            return;
        }
        if (i9 == 1) {
            int i12 = this.f24406m0 + 1;
            C2147b[] c2147bArr3 = this.f24407n0;
            if (i12 >= c2147bArr3.length) {
                this.f24407n0 = (C2147b[]) Arrays.copyOf(c2147bArr3, c2147bArr3.length * 2);
            }
            C2147b[] c2147bArr4 = this.f24407n0;
            int i13 = this.f24406m0;
            c2147bArr4[i13] = new C2147b(c2149d, 1, this.f24401h0);
            this.f24406m0 = i13 + 1;
        }
    }

    public final void C(C2125e c2125e) {
        a(c2125e);
        int size = this.f24397d0.size();
        boolean z9 = false;
        for (int i9 = 0; i9 < size; i9++) {
            C2149d c2149d = (C2149d) this.f24397d0.get(i9);
            boolean[] zArr = c2149d.f24352H;
            zArr[0] = false;
            zArr[1] = false;
            if (c2149d instanceof C2146a) {
                z9 = true;
            }
        }
        if (z9) {
            for (int i10 = 0; i10 < size; i10++) {
                C2149d c2149d2 = (C2149d) this.f24397d0.get(i10);
                if (c2149d2 instanceof C2146a) {
                    C2146a c2146a = (C2146a) c2149d2;
                    for (int i11 = 0; i11 < c2146a.f24469e0; i11++) {
                        C2149d c2149d3 = c2146a.f24468d0[i11];
                        int i12 = c2146a.f24319f0;
                        if (i12 != 0 && i12 != 1) {
                            if (i12 == 2 || i12 == 3) {
                                c2149d3.f24352H[1] = true;
                            }
                        } else {
                            c2149d3.f24352H[0] = true;
                        }
                    }
                }
            }
        }
        for (int i13 = 0; i13 < size; i13++) {
            C2149d c2149d4 = (C2149d) this.f24397d0.get(i13);
            c2149d4.getClass();
            if ((c2149d4 instanceof C2152g) || (c2149d4 instanceof C2153h)) {
                c2149d4.a(c2125e);
            }
        }
        for (int i14 = 0; i14 < size; i14++) {
            C2149d c2149d5 = (C2149d) this.f24397d0.get(i14);
            if (c2149d5 instanceof C2150e) {
                int[] iArr = c2149d5.f24374c0;
                int i15 = iArr[0];
                int i16 = iArr[1];
                if (i15 == 2) {
                    c2149d5.w(1);
                }
                if (i16 == 2) {
                    c2149d5.x(1);
                }
                c2149d5.a(c2125e);
                if (i15 == 2) {
                    c2149d5.w(i15);
                }
                if (i16 == 2) {
                    c2149d5.x(i16);
                }
            } else {
                c2149d5.f24379h = -1;
                c2149d5.f24380i = -1;
                int[] iArr2 = this.f24374c0;
                int i17 = iArr2[0];
                int[] iArr3 = c2149d5.f24374c0;
                if (i17 != 2 && iArr3[0] == 4) {
                    C2148c c2148c = c2149d5.f24394x;
                    int i18 = c2148c.f24342e;
                    int l9 = l();
                    C2148c c2148c2 = c2149d5.f24396z;
                    int i19 = l9 - c2148c2.f24342e;
                    c2148c.f24344g = c2125e.j(c2148c);
                    c2148c2.f24344g = c2125e.j(c2148c2);
                    c2125e.d(c2148c.f24344g, i18);
                    c2125e.d(c2148c2.f24344g, i19);
                    c2149d5.f24379h = 2;
                    c2149d5.f24357N = i18;
                    int i20 = i19 - i18;
                    c2149d5.f24354J = i20;
                    int i21 = c2149d5.f24360Q;
                    if (i20 < i21) {
                        c2149d5.f24354J = i21;
                    }
                }
                if (iArr2[1] != 2 && iArr3[1] == 4) {
                    C2148c c2148c3 = c2149d5.f24395y;
                    int i22 = c2148c3.f24342e;
                    int i23 = i();
                    C2148c c2148c4 = c2149d5.f24345A;
                    int i24 = i23 - c2148c4.f24342e;
                    c2148c3.f24344g = c2125e.j(c2148c3);
                    c2148c4.f24344g = c2125e.j(c2148c4);
                    c2125e.d(c2148c3.f24344g, i22);
                    c2125e.d(c2148c4.f24344g, i24);
                    if (c2149d5.f24359P > 0 || c2149d5.f24365V == 8) {
                        C2148c c2148c5 = c2149d5.f24346B;
                        w.i j = c2125e.j(c2148c5);
                        c2148c5.f24344g = j;
                        c2125e.d(j, c2149d5.f24359P + i22);
                    }
                    c2149d5.f24380i = 2;
                    c2149d5.f24358O = i22;
                    int i25 = i24 - i22;
                    c2149d5.K = i25;
                    int i26 = c2149d5.f24361R;
                    if (i25 < i26) {
                        c2149d5.K = i26;
                    }
                }
                if (!(c2149d5 instanceof C2152g) && !(c2149d5 instanceof C2153h)) {
                    c2149d5.a(c2125e);
                }
            }
        }
        if (this.f24405l0 > 0) {
            AbstractC2155j.a(this, c2125e, 0);
        }
        if (this.f24406m0 > 0) {
            AbstractC2155j.a(this, c2125e, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean D(int i9, boolean z9) {
        boolean z10;
        int i10;
        int i11;
        boolean z11;
        boolean z12;
        m mVar = this.f24399f0;
        C2150e c2150e = (C2150e) mVar.f24658d;
        int h7 = c2150e.h(0);
        int h9 = c2150e.h(1);
        int m9 = c2150e.m();
        int n7 = c2150e.n();
        ArrayList arrayList = (ArrayList) mVar.f24660f;
        k kVar = c2150e.f24376e;
        y.i iVar = c2150e.f24375d;
        if (z9 && (h7 == 2 || h9 == 2)) {
            int size = arrayList.size();
            int i12 = 0;
            while (true) {
                if (i12 < size) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    l lVar = (l) obj;
                    if (lVar.f24726f == i9 && !lVar.k()) {
                        z12 = false;
                        break;
                    }
                } else {
                    z12 = z9;
                    break;
                }
            }
            if (i9 == 0) {
                if (z12 && h7 == 2) {
                    c2150e.w(1);
                    c2150e.y(mVar.d(c2150e, 0));
                    iVar.f24725e.d(c2150e.l());
                }
            } else if (z12 && h9 == 2) {
                c2150e.x(1);
                c2150e.v(mVar.d(c2150e, 1));
                kVar.f24725e.d(c2150e.i());
            }
        }
        int[] iArr = c2150e.f24374c0;
        if (i9 == 0) {
            i10 = 0;
            int i13 = iArr[0];
            if (i13 != 1 && i13 != 4) {
                z10 = true;
                i11 = i10;
            } else {
                int l9 = c2150e.l() + m9;
                iVar.f24729i.d(l9);
                iVar.f24725e.d(l9 - m9);
                i11 = 1;
                z10 = true;
            }
        } else {
            z10 = true;
            i10 = 0;
            int i14 = iArr[1];
            if (i14 == 1 || i14 == 4) {
                int i15 = c2150e.i() + n7;
                kVar.f24729i.d(i15);
                kVar.f24725e.d(i15 - n7);
                i11 = 1;
            }
            i11 = i10;
        }
        mVar.g();
        int size2 = arrayList.size();
        int i16 = i10;
        while (i16 < size2) {
            Object obj2 = arrayList.get(i16);
            i16++;
            l lVar2 = (l) obj2;
            if (lVar2.f24726f == i9 && (lVar2.f24722b != c2150e || lVar2.f24727g)) {
                lVar2.e();
            }
        }
        int size3 = arrayList.size();
        int i17 = i10;
        while (i17 < size3) {
            Object obj3 = arrayList.get(i17);
            i17++;
            l lVar3 = (l) obj3;
            if (lVar3.f24726f == i9 && (i11 != 0 || lVar3.f24722b != c2150e)) {
                if (!lVar3.f24728h.j || !lVar3.f24729i.j || (!(lVar3 instanceof y.c) && !lVar3.f24725e.j)) {
                    z11 = i10;
                    break;
                }
            }
        }
        z11 = z10;
        c2150e.w(h7);
        c2150e.x(h9);
        return z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x011a  */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E() {
        /*
            Method dump skipped, instructions count: 537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x.C2150e.E():void");
    }

    @Override // x.C2149d
    public final void s() {
        this.f24402i0.r();
        this.f24403j0 = 0;
        this.f24404k0 = 0;
        this.f24397d0.clear();
        super.s();
    }

    @Override // x.C2149d
    public final void u(s sVar) {
        super.u(sVar);
        int size = this.f24397d0.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((C2149d) this.f24397d0.get(i9)).u(sVar);
        }
    }

    @Override // x.C2149d
    public final void z(boolean z9, boolean z10) {
        super.z(z9, z10);
        int size = this.f24397d0.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((C2149d) this.f24397d0.get(i9)).z(z9, z10);
        }
    }
}
