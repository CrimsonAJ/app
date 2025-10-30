package P3;

import android.util.SparseArray;
import c7.C0790j;
import j3.M;
import l4.AbstractC1566a;
import q3.InterfaceC1905j;
import q3.InterfaceC1907l;
import q3.r;
import q3.u;

/* loaded from: classes.dex */
public final class d implements InterfaceC1907l {
    public static final C0790j j = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1905j f5829a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5830b;

    /* renamed from: c, reason: collision with root package name */
    public final M f5831c;

    /* renamed from: d, reason: collision with root package name */
    public final SparseArray f5832d = new SparseArray();

    /* renamed from: e, reason: collision with root package name */
    public boolean f5833e;

    /* renamed from: f, reason: collision with root package name */
    public O0.c f5834f;

    /* renamed from: g, reason: collision with root package name */
    public long f5835g;

    /* renamed from: h, reason: collision with root package name */
    public r f5836h;

    /* renamed from: i, reason: collision with root package name */
    public M[] f5837i;

    public d(InterfaceC1905j interfaceC1905j, int i9, M m9) {
        this.f5829a = interfaceC1905j;
        this.f5830b = i9;
        this.f5831c = m9;
    }

    public final void a(O0.c cVar, long j4, long j9) {
        this.f5834f = cVar;
        this.f5835g = j9;
        boolean z9 = this.f5833e;
        InterfaceC1905j interfaceC1905j = this.f5829a;
        if (!z9) {
            interfaceC1905j.i(this);
            if (j4 != -9223372036854775807L) {
                interfaceC1905j.b(0L, j4);
            }
            this.f5833e = true;
            return;
        }
        if (j4 == -9223372036854775807L) {
            j4 = 0;
        }
        interfaceC1905j.b(0L, j4);
        int i9 = 0;
        while (true) {
            SparseArray sparseArray = this.f5832d;
            if (i9 < sparseArray.size()) {
                c cVar2 = (c) sparseArray.valueAt(i9);
                if (cVar == null) {
                    cVar2.f5827e = cVar2.f5825c;
                } else {
                    cVar2.f5828f = j9;
                    u Q7 = cVar.Q(cVar2.f5823a);
                    cVar2.f5827e = Q7;
                    M m9 = cVar2.f5826d;
                    if (m9 != null) {
                        Q7.e(m9);
                    }
                }
                i9++;
            } else {
                return;
            }
        }
    }

    @Override // q3.InterfaceC1907l
    public final void i() {
        SparseArray sparseArray = this.f5832d;
        M[] mArr = new M[sparseArray.size()];
        for (int i9 = 0; i9 < sparseArray.size(); i9++) {
            M m9 = ((c) sparseArray.valueAt(i9)).f5826d;
            AbstractC1566a.n(m9);
            mArr[i9] = m9;
        }
        this.f5837i = mArr;
    }

    @Override // q3.InterfaceC1907l
    public final void r(r rVar) {
        this.f5836h = rVar;
    }

    @Override // q3.InterfaceC1907l
    public final u u(int i9, int i10) {
        boolean z9;
        M m9;
        SparseArray sparseArray = this.f5832d;
        c cVar = (c) sparseArray.get(i9);
        if (cVar == null) {
            if (this.f5837i == null) {
                z9 = true;
            } else {
                z9 = false;
            }
            AbstractC1566a.m(z9);
            if (i10 == this.f5830b) {
                m9 = this.f5831c;
            } else {
                m9 = null;
            }
            cVar = new c(i9, i10, m9);
            O0.c cVar2 = this.f5834f;
            long j4 = this.f5835g;
            if (cVar2 == null) {
                cVar.f5827e = cVar.f5825c;
            } else {
                cVar.f5828f = j4;
                u Q7 = cVar2.Q(i10);
                cVar.f5827e = Q7;
                M m10 = cVar.f5826d;
                if (m10 != null) {
                    Q7.e(m10);
                }
            }
            sparseArray.put(i9, cVar);
        }
        return cVar;
    }
}
