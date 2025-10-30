package Y3;

import P5.F;
import P5.S;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import j2.C1435b;
import j3.AbstractC1449d;
import j3.C1441D;
import j3.M;
import j3.SurfaceHolderCallbackC1438A;
import l4.AbstractC1566a;
import l4.n;
import l4.y;

/* loaded from: classes.dex */
public final class l extends AbstractC1449d implements Handler.Callback {

    /* renamed from: A, reason: collision with root package name */
    public long f8716A;

    /* renamed from: B, reason: collision with root package name */
    public long f8717B;

    /* renamed from: C, reason: collision with root package name */
    public long f8718C;

    /* renamed from: m, reason: collision with root package name */
    public final Handler f8719m;

    /* renamed from: n, reason: collision with root package name */
    public final SurfaceHolderCallbackC1438A f8720n;

    /* renamed from: o, reason: collision with root package name */
    public final j f8721o;

    /* renamed from: p, reason: collision with root package name */
    public final O0.c f8722p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f8723q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f8724r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f8725s;

    /* renamed from: t, reason: collision with root package name */
    public int f8726t;

    /* renamed from: u, reason: collision with root package name */
    public M f8727u;

    /* renamed from: v, reason: collision with root package name */
    public h f8728v;

    /* renamed from: w, reason: collision with root package name */
    public k f8729w;

    /* renamed from: x, reason: collision with root package name */
    public d f8730x;

    /* renamed from: y, reason: collision with root package name */
    public d f8731y;

    /* renamed from: z, reason: collision with root package name */
    public int f8732z;

    public l(SurfaceHolderCallbackC1438A surfaceHolderCallbackC1438A, Looper looper, j jVar) {
        super(3);
        Handler handler;
        this.f8720n = surfaceHolderCallbackC1438A;
        if (looper == null) {
            handler = null;
        } else {
            int i9 = y.f20553a;
            handler = new Handler(looper, this);
        }
        this.f8719m = handler;
        this.f8721o = jVar;
        this.f8722p = new O0.c(28, false);
        this.f8716A = -9223372036854775807L;
        this.f8717B = -9223372036854775807L;
        this.f8718C = -9223372036854775807L;
    }

    public final void A(c cVar) {
        F f9 = cVar.f8696a;
        SurfaceHolderCallbackC1438A surfaceHolderCallbackC1438A = this.f8720n;
        surfaceHolderCallbackC1438A.f19226a.f19271l.e(27, new C1435b(3, f9));
        C1441D c1441d = surfaceHolderCallbackC1438A.f19226a;
        c1441d.f19299z0 = cVar;
        c1441d.f19271l.e(27, new C1435b(4, cVar));
    }

    public final void B() {
        this.f8729w = null;
        this.f8732z = -1;
        d dVar = this.f8730x;
        if (dVar != null) {
            dVar.r();
            this.f8730x = null;
        }
        d dVar2 = this.f8731y;
        if (dVar2 != null) {
            dVar2.r();
            this.f8731y = null;
        }
    }

    @Override // j3.AbstractC1449d
    public final String g() {
        return "TextRenderer";
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
        return this.f8724r;
    }

    @Override // j3.AbstractC1449d
    public final boolean j() {
        return true;
    }

    @Override // j3.AbstractC1449d
    public final void k() {
        this.f8727u = null;
        this.f8716A = -9223372036854775807L;
        c cVar = new c(z(this.f8718C), S.f5926e);
        Handler handler = this.f8719m;
        if (handler != null) {
            handler.obtainMessage(0, cVar).sendToTarget();
        } else {
            A(cVar);
        }
        this.f8717B = -9223372036854775807L;
        this.f8718C = -9223372036854775807L;
        B();
        h hVar = this.f8728v;
        hVar.getClass();
        hVar.a();
        this.f8728v = null;
        this.f8726t = 0;
    }

    @Override // j3.AbstractC1449d
    public final void m(long j, boolean z9) {
        this.f8718C = j;
        c cVar = new c(z(this.f8718C), S.f5926e);
        Handler handler = this.f8719m;
        if (handler != null) {
            handler.obtainMessage(0, cVar).sendToTarget();
        } else {
            A(cVar);
        }
        this.f8723q = false;
        this.f8724r = false;
        this.f8716A = -9223372036854775807L;
        if (this.f8726t != 0) {
            B();
            h hVar = this.f8728v;
            hVar.getClass();
            hVar.a();
            this.f8728v = null;
            this.f8726t = 0;
            this.f8725s = true;
            M m9 = this.f8727u;
            m9.getClass();
            this.f8728v = this.f8721o.j(m9);
            return;
        }
        B();
        h hVar2 = this.f8728v;
        hVar2.getClass();
        hVar2.flush();
    }

    @Override // j3.AbstractC1449d
    public final void q(M[] mArr, long j, long j4) {
        this.f8717B = j4;
        M m9 = mArr[0];
        this.f8727u = m9;
        if (this.f8728v != null) {
            this.f8726t = 1;
            return;
        }
        this.f8725s = true;
        m9.getClass();
        this.f8728v = this.f8721o.j(m9);
    }

    @Override // j3.AbstractC1449d
    public final void s(long j, long j4) {
        boolean z9;
        long m9;
        O0.c cVar = this.f8722p;
        this.f8718C = j;
        if (this.f19593k) {
            long j9 = this.f8716A;
            if (j9 != -9223372036854775807L && j >= j9) {
                B();
                this.f8724r = true;
            }
        }
        if (!this.f8724r) {
            d dVar = this.f8731y;
            j jVar = this.f8721o;
            Handler handler = this.f8719m;
            if (dVar == null) {
                h hVar = this.f8728v;
                hVar.getClass();
                hVar.c(j);
                try {
                    h hVar2 = this.f8728v;
                    hVar2.getClass();
                    this.f8731y = (d) hVar2.d();
                } catch (i e8) {
                    AbstractC1566a.u("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f8727u, e8);
                    c cVar2 = new c(z(this.f8718C), S.f5926e);
                    if (handler != null) {
                        handler.obtainMessage(0, cVar2).sendToTarget();
                    } else {
                        A(cVar2);
                    }
                    B();
                    h hVar3 = this.f8728v;
                    hVar3.getClass();
                    hVar3.a();
                    this.f8728v = null;
                    this.f8726t = 0;
                    this.f8725s = true;
                    M m10 = this.f8727u;
                    m10.getClass();
                    this.f8728v = jVar.j(m10);
                    return;
                }
            }
            if (this.f19589f == 2) {
                if (this.f8730x != null) {
                    long y9 = y();
                    z9 = false;
                    while (y9 <= j) {
                        this.f8732z++;
                        y9 = y();
                        z9 = true;
                    }
                } else {
                    z9 = false;
                }
                d dVar2 = this.f8731y;
                if (dVar2 != null) {
                    if (dVar2.e(4)) {
                        if (!z9 && y() == Long.MAX_VALUE) {
                            if (this.f8726t == 2) {
                                B();
                                h hVar4 = this.f8728v;
                                hVar4.getClass();
                                hVar4.a();
                                this.f8728v = null;
                                this.f8726t = 0;
                                this.f8725s = true;
                                M m11 = this.f8727u;
                                m11.getClass();
                                this.f8728v = jVar.j(m11);
                            } else {
                                B();
                                this.f8724r = true;
                            }
                        }
                    } else if (dVar2.f20709c <= j) {
                        d dVar3 = this.f8730x;
                        if (dVar3 != null) {
                            dVar3.r();
                        }
                        this.f8732z = dVar2.a(j);
                        this.f8730x = dVar2;
                        this.f8731y = null;
                        z9 = true;
                    }
                }
                if (z9) {
                    this.f8730x.getClass();
                    int a5 = this.f8730x.a(j);
                    if (a5 == 0) {
                        m9 = this.f8730x.f20709c;
                    } else if (a5 == -1) {
                        d dVar4 = this.f8730x;
                        m9 = dVar4.m(dVar4.J() - 1);
                    } else {
                        m9 = this.f8730x.m(a5 - 1);
                    }
                    c cVar3 = new c(z(m9), this.f8730x.w(j));
                    if (handler != null) {
                        handler.obtainMessage(0, cVar3).sendToTarget();
                    } else {
                        A(cVar3);
                    }
                }
                if (this.f8726t != 2) {
                    while (!this.f8723q) {
                        try {
                            k kVar = this.f8729w;
                            if (kVar == null) {
                                h hVar5 = this.f8728v;
                                hVar5.getClass();
                                kVar = (k) hVar5.e();
                                if (kVar != null) {
                                    this.f8729w = kVar;
                                } else {
                                    return;
                                }
                            }
                            if (this.f8726t == 1) {
                                kVar.f6039b = 4;
                                h hVar6 = this.f8728v;
                                hVar6.getClass();
                                hVar6.b(kVar);
                                this.f8729w = null;
                                this.f8726t = 2;
                                return;
                            }
                            int r5 = r(cVar, kVar, 0);
                            if (r5 == -4) {
                                if (kVar.e(4)) {
                                    this.f8723q = true;
                                    this.f8725s = false;
                                } else {
                                    M m12 = (M) cVar.f5264c;
                                    if (m12 != null) {
                                        kVar.f8715i = m12.f19439p;
                                        kVar.u();
                                        this.f8725s &= !kVar.e(1);
                                    } else {
                                        return;
                                    }
                                }
                                if (!this.f8725s) {
                                    h hVar7 = this.f8728v;
                                    hVar7.getClass();
                                    hVar7.b(kVar);
                                    this.f8729w = null;
                                }
                            } else if (r5 == -3) {
                                return;
                            }
                        } catch (i e9) {
                            AbstractC1566a.u("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f8727u, e9);
                            c cVar4 = new c(z(this.f8718C), S.f5926e);
                            if (handler != null) {
                                handler.obtainMessage(0, cVar4).sendToTarget();
                            } else {
                                A(cVar4);
                            }
                            B();
                            h hVar8 = this.f8728v;
                            hVar8.getClass();
                            hVar8.a();
                            this.f8728v = null;
                            this.f8726t = 0;
                            this.f8725s = true;
                            M m13 = this.f8727u;
                            m13.getClass();
                            this.f8728v = jVar.j(m13);
                            return;
                        }
                    }
                }
            }
        }
    }

    @Override // j3.AbstractC1449d
    public final int w(M m9) {
        int i9;
        if (this.f8721o.k(m9)) {
            if (m9.f19424X == 0) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            return AbstractC0953k1.e(i9, 0, 0);
        }
        if (n.k(m9.f19435l)) {
            return AbstractC0953k1.e(1, 0, 0);
        }
        return AbstractC0953k1.e(0, 0, 0);
    }

    public final long y() {
        if (this.f8732z == -1) {
            return Long.MAX_VALUE;
        }
        this.f8730x.getClass();
        if (this.f8732z >= this.f8730x.J()) {
            return Long.MAX_VALUE;
        }
        return this.f8730x.m(this.f8732z);
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
        if (this.f8717B != -9223372036854775807L) {
            z10 = true;
        }
        AbstractC1566a.m(z10);
        return j - this.f8717B;
    }
}
