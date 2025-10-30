package S3;

import N3.d0;
import j3.M;
import java.io.IOException;
import java.util.ArrayList;
import l4.AbstractC1566a;
import l4.y;

/* loaded from: classes.dex */
public final class n implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f6848a;

    /* renamed from: b, reason: collision with root package name */
    public final r f6849b;

    /* renamed from: c, reason: collision with root package name */
    public int f6850c = -1;

    public n(r rVar, int i9) {
        this.f6849b = rVar;
        this.f6848a = i9;
    }

    public final void a() {
        boolean z9;
        if (this.f6850c == -1) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC1566a.h(z9);
        r rVar = this.f6849b;
        rVar.b();
        rVar.f6881i0.getClass();
        int[] iArr = rVar.f6881i0;
        int i9 = this.f6848a;
        int i10 = iArr[i9];
        if (i10 == -1) {
            if (rVar.f6879h0.contains(rVar.f6877g0.a(i9))) {
                i10 = -3;
            }
            i10 = -2;
        } else {
            boolean[] zArr = rVar.f6886l0;
            if (!zArr[i10]) {
                zArr[i10] = true;
            }
            i10 = -2;
        }
        this.f6850c = i10;
    }

    @Override // N3.d0
    public final void b() {
        int i9 = this.f6850c;
        r rVar = this.f6849b;
        if (i9 != -2) {
            if (i9 == -1) {
                rVar.E();
                return;
            } else {
                if (i9 != -3) {
                    rVar.E();
                    rVar.f6904v[i9].w();
                    return;
                }
                return;
            }
        }
        rVar.b();
        throw new IOException(A0.a.n("Unable to bind a sample queue to TrackGroup with mime type ", rVar.f6877g0.a(this.f6848a).f5167d[0].f19435l, "."));
    }

    public final boolean c() {
        int i9 = this.f6850c;
        if (i9 != -1 && i9 != -3 && i9 != -2) {
            return true;
        }
        return false;
    }

    @Override // N3.d0
    public final int d(O0.c cVar, m3.f fVar, int i9) {
        M m9;
        if (this.f6850c == -3) {
            fVar.b(4);
            return -4;
        }
        if (c()) {
            int i10 = this.f6850c;
            r rVar = this.f6849b;
            if (!rVar.C()) {
                ArrayList arrayList = rVar.f6889n;
                int i11 = 0;
                if (!arrayList.isEmpty()) {
                    int i12 = 0;
                    loop0: while (i12 < arrayList.size() - 1) {
                        int i13 = ((k) arrayList.get(i12)).f6798k;
                        int length = rVar.f6904v.length;
                        for (int i14 = 0; i14 < length; i14++) {
                            if (rVar.f6886l0[i14] && rVar.f6904v[i14].y() == i13) {
                                break loop0;
                            }
                        }
                        i12++;
                    }
                    y.N(arrayList, 0, i12);
                    k kVar = (k) arrayList.get(0);
                    M m10 = kVar.f5841d;
                    if (!m10.equals(rVar.f6868Z)) {
                        rVar.f6883k.b(rVar.f6870b, m10, kVar.f5842e, kVar.f5843f, kVar.f5844g);
                    }
                    rVar.f6868Z = m10;
                }
                if (arrayList.isEmpty() || ((k) arrayList.get(0)).f6797i0) {
                    int z9 = rVar.f6904v[i10].z(cVar, fVar, i9, rVar.r0);
                    if (z9 == -5) {
                        M m11 = (M) cVar.f5264c;
                        m11.getClass();
                        if (i10 == rVar.f6864B) {
                            int y9 = rVar.f6904v[i10].y();
                            while (i11 < arrayList.size() && ((k) arrayList.get(i11)).f6798k != y9) {
                                i11++;
                            }
                            if (i11 < arrayList.size()) {
                                m9 = ((k) arrayList.get(i11)).f5841d;
                            } else {
                                m9 = rVar.Y;
                                m9.getClass();
                            }
                            m11 = m11.c(m9);
                        }
                        cVar.f5264c = m11;
                    }
                    return z9;
                }
            }
        }
        return -3;
    }

    @Override // N3.d0
    public final boolean j() {
        if (this.f6850c != -3) {
            if (c()) {
                int i9 = this.f6850c;
                r rVar = this.f6849b;
                if (rVar.C() || !rVar.f6904v[i9].u(rVar.r0)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
    
        if (r6.hasNext() != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
    
        r1 = r6.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
    
        if (r6.hasNext() != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
    
        r6 = r1;
     */
    @Override // N3.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m(long r5) {
        /*
            r4 = this;
            boolean r0 = r4.c()
            if (r0 == 0) goto L61
            int r0 = r4.f6850c
            S3.r r1 = r4.f6849b
            boolean r2 = r1.C()
            if (r2 == 0) goto L11
            goto L61
        L11:
            S3.q[] r2 = r1.f6904v
            r2 = r2[r0]
            boolean r3 = r1.r0
            int r5 = r2.s(r5, r3)
            java.util.ArrayList r6 = r1.f6889n
            if (r6 == 0) goto L31
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L26
            goto L47
        L26:
            int r1 = r6.size()
            int r1 = r1 + (-1)
            java.lang.Object r6 = r6.get(r1)
            goto L48
        L31:
            java.util.Iterator r6 = r6.iterator()
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L47
        L3b:
            java.lang.Object r1 = r6.next()
            boolean r3 = r6.hasNext()
            if (r3 != 0) goto L3b
            r6 = r1
            goto L48
        L47:
            r6 = 0
        L48:
            S3.k r6 = (S3.k) r6
            if (r6 == 0) goto L5d
            boolean r1 = r6.f6797i0
            if (r1 != 0) goto L5d
            int r1 = r2.q()
            int r6 = r6.g(r0)
            int r6 = r6 - r1
            int r5 = java.lang.Math.min(r5, r6)
        L5d:
            r2.F(r5)
            return r5
        L61:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: S3.n.m(long):int");
    }
}
