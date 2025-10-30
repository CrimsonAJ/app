package Q3;

import A4.r;
import N3.Y;
import N3.c0;
import android.os.Handler;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import j3.M;
import j3.j0;
import k4.C1517q;
import k4.InterfaceC1510j;
import l4.y;
import q3.t;
import q3.u;

/* loaded from: classes.dex */
public final class o implements u {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f6422a;

    /* renamed from: b, reason: collision with root package name */
    public final O0.c f6423b = new O0.c(28, false);

    /* renamed from: c, reason: collision with root package name */
    public final D3.e f6424c = new m3.f(1);

    /* renamed from: d, reason: collision with root package name */
    public long f6425d = -9223372036854775807L;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f6426e;

    /* JADX WARN: Type inference failed for: r2v3, types: [D3.e, m3.f] */
    public o(p pVar, C1517q c1517q) {
        this.f6426e = pVar;
        this.f6422a = new c0(c1517q, null, null);
    }

    @Override // q3.u
    public final int a(InterfaceC1510j interfaceC1510j, int i9, boolean z9) {
        c0 c0Var = this.f6422a;
        c0Var.getClass();
        return c0Var.D(interfaceC1510j, i9, z9);
    }

    @Override // q3.u
    public final void b(int i9, r rVar) {
        c0 c0Var = this.f6422a;
        c0Var.getClass();
        c0Var.b(i9, rVar);
    }

    @Override // q3.u
    public final /* synthetic */ void c(int i9, r rVar) {
        AbstractC0953k1.a(this, rVar, i9);
    }

    @Override // q3.u
    public final void d(long j, int i9, int i10, int i11, t tVar) {
        long g9;
        long j4;
        this.f6422a.d(j, i9, i10, i11, tVar);
        while (this.f6422a.u(false)) {
            D3.e eVar = this.f6424c;
            eVar.r();
            if (this.f6422a.z(this.f6423b, eVar, 0, false) == -4) {
                eVar.u();
            } else {
                eVar = null;
            }
            if (eVar != null) {
                long j9 = eVar.f20706f;
                D3.c i12 = this.f6426e.f6429c.i(eVar);
                if (i12 != null) {
                    F3.a aVar = (F3.a) i12.f1786a[0];
                    String str = aVar.f2323a;
                    String str2 = aVar.f2324b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            j4 = y.K(y.m(aVar.f2327e));
                        } catch (j0 unused) {
                            j4 = -9223372036854775807L;
                        }
                        if (j4 != -9223372036854775807L) {
                            n nVar = new n(j9, j4);
                            Handler handler = this.f6426e.f6430d;
                            handler.sendMessage(handler.obtainMessage(1, nVar));
                        }
                    }
                }
            }
        }
        c0 c0Var = this.f6422a;
        Y y9 = c0Var.f5054a;
        synchronized (c0Var) {
            int i13 = c0Var.f5071s;
            if (i13 == 0) {
                g9 = -1;
            } else {
                g9 = c0Var.g(i13);
            }
        }
        y9.b(g9);
    }

    @Override // q3.u
    public final void e(M m9) {
        this.f6422a.e(m9);
    }
}
