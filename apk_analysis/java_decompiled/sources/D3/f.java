package D3;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import j2.C1435b;
import j3.AbstractC1449d;
import j3.C1441D;
import j3.C1444a0;
import j3.C1446b0;
import j3.M;
import j3.SurfaceHolderCallbackC1438A;
import java.util.ArrayList;
import l4.AbstractC1566a;
import l4.l;
import l4.y;

/* loaded from: classes.dex */
public final class f extends AbstractC1449d implements Handler.Callback {

    /* renamed from: m, reason: collision with root package name */
    public final d f1790m;

    /* renamed from: n, reason: collision with root package name */
    public final SurfaceHolderCallbackC1438A f1791n;

    /* renamed from: o, reason: collision with root package name */
    public final Handler f1792o;

    /* renamed from: p, reason: collision with root package name */
    public final e f1793p;

    /* renamed from: q, reason: collision with root package name */
    public v4.e f1794q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1795r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1796s;

    /* renamed from: t, reason: collision with root package name */
    public long f1797t;

    /* renamed from: u, reason: collision with root package name */
    public c f1798u;

    /* renamed from: v, reason: collision with root package name */
    public long f1799v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v4, types: [D3.e, m3.f] */
    public f(SurfaceHolderCallbackC1438A surfaceHolderCallbackC1438A, Looper looper) {
        super(5);
        Handler handler;
        d dVar = d.f1788a;
        this.f1791n = surfaceHolderCallbackC1438A;
        if (looper == null) {
            handler = null;
        } else {
            int i9 = y.f20553a;
            handler = new Handler(looper, this);
        }
        this.f1792o = handler;
        this.f1790m = dVar;
        this.f1793p = new m3.f(1);
        this.f1799v = -9223372036854775807L;
    }

    public final void A(c cVar) {
        SurfaceHolderCallbackC1438A surfaceHolderCallbackC1438A = this.f1791n;
        C1441D c1441d = surfaceHolderCallbackC1438A.f19226a;
        C1444a0 a5 = c1441d.f19250E0.a();
        int i9 = 0;
        while (true) {
            b[] bVarArr = cVar.f1786a;
            if (i9 >= bVarArr.length) {
                break;
            }
            bVarArr[i9].b(a5);
            i9++;
        }
        c1441d.f19250E0 = new C1446b0(a5);
        C1446b0 m02 = c1441d.m0();
        boolean equals = m02.equals(c1441d.f19272l0);
        l lVar = c1441d.f19271l;
        if (!equals) {
            c1441d.f19272l0 = m02;
            lVar.c(14, new C1435b(5, surfaceHolderCallbackC1438A));
        }
        lVar.c(28, new C1435b(6, cVar));
        lVar.b();
    }

    @Override // j3.AbstractC1449d
    public final String g() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            A((c) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // j3.AbstractC1449d
    public final boolean i() {
        return this.f1796s;
    }

    @Override // j3.AbstractC1449d
    public final boolean j() {
        return true;
    }

    @Override // j3.AbstractC1449d
    public final void k() {
        this.f1798u = null;
        this.f1794q = null;
        this.f1799v = -9223372036854775807L;
    }

    @Override // j3.AbstractC1449d
    public final void m(long j, boolean z9) {
        this.f1798u = null;
        this.f1795r = false;
        this.f1796s = false;
    }

    @Override // j3.AbstractC1449d
    public final void q(M[] mArr, long j, long j4) {
        this.f1794q = this.f1790m.a(mArr[0]);
        c cVar = this.f1798u;
        if (cVar != null) {
            long j9 = this.f1799v;
            long j10 = cVar.f1787b;
            long j11 = (j9 + j10) - j4;
            if (j10 != j11) {
                cVar = new c(j11, cVar.f1786a);
            }
            this.f1798u = cVar;
        }
        this.f1799v = j4;
    }

    @Override // j3.AbstractC1449d
    public final void s(long j, long j4) {
        boolean z9 = true;
        while (z9) {
            if (!this.f1795r && this.f1798u == null) {
                e eVar = this.f1793p;
                eVar.r();
                O0.c cVar = this.f19585b;
                cVar.j();
                int r5 = r(cVar, eVar, 0);
                if (r5 == -4) {
                    if (eVar.e(4)) {
                        this.f1795r = true;
                    } else {
                        eVar.f1789i = this.f1797t;
                        eVar.u();
                        v4.e eVar2 = this.f1794q;
                        int i9 = y.f20553a;
                        c i10 = eVar2.i(eVar);
                        if (i10 != null) {
                            ArrayList arrayList = new ArrayList(i10.f1786a.length);
                            y(i10, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.f1798u = new c(z(eVar.f20706f), (b[]) arrayList.toArray(new b[0]));
                            }
                        }
                    }
                } else if (r5 == -5) {
                    M m9 = (M) cVar.f5264c;
                    m9.getClass();
                    this.f1797t = m9.f19439p;
                }
            }
            c cVar2 = this.f1798u;
            if (cVar2 != null && cVar2.f1787b <= z(j)) {
                c cVar3 = this.f1798u;
                Handler handler = this.f1792o;
                if (handler != null) {
                    handler.obtainMessage(0, cVar3).sendToTarget();
                } else {
                    A(cVar3);
                }
                this.f1798u = null;
                z9 = true;
            } else {
                z9 = false;
            }
            if (this.f1795r && this.f1798u == null) {
                this.f1796s = true;
            }
        }
    }

    @Override // j3.AbstractC1449d
    public final int w(M m9) {
        int i9;
        if (this.f1790m.b(m9)) {
            if (m9.f19424X == 0) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            return AbstractC0953k1.e(i9, 0, 0);
        }
        return AbstractC0953k1.e(0, 0, 0);
    }

    public final void y(c cVar, ArrayList arrayList) {
        int i9 = 0;
        while (true) {
            b[] bVarArr = cVar.f1786a;
            if (i9 < bVarArr.length) {
                M c3 = bVarArr[i9].c();
                if (c3 != null) {
                    d dVar = this.f1790m;
                    if (dVar.b(c3)) {
                        v4.e a5 = dVar.a(c3);
                        byte[] e8 = bVarArr[i9].e();
                        e8.getClass();
                        e eVar = this.f1793p;
                        eVar.r();
                        eVar.t(e8.length);
                        eVar.f20704d.put(e8);
                        eVar.u();
                        c i10 = a5.i(eVar);
                        if (i10 != null) {
                            y(i10, arrayList);
                        }
                        i9++;
                    }
                }
                arrayList.add(bVarArr[i9]);
                i9++;
            } else {
                return;
            }
        }
    }

    public final long z(long j) {
        boolean z9;
        boolean z10 = false;
        if (j != -9223372036854775807L) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC1566a.m(z9);
        if (this.f1799v != -9223372036854775807L) {
            z10 = true;
        }
        AbstractC1566a.m(z10);
        return j - this.f1799v;
    }
}
