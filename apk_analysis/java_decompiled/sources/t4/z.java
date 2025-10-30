package t4;

import com.google.android.gms.common.api.Status;
import f5.C1177i;

/* loaded from: classes.dex */
public final class z extends y4.h {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C2009A f23285f;

    public z(C2009A c2009a) {
        this.f23285f = c2009a;
    }

    @Override // y4.i
    public final void A0(int i9) {
        C2009A.k(this.f23285f).post(new y(this, i9, 0));
    }

    @Override // y4.i
    public final void B(int i9) {
        C2009A.k(this.f23285f).post(new y(this, i9, 1));
    }

    @Override // y4.i
    public final void E(int i9) {
        C2009A.e(this.f23285f, i9);
    }

    @Override // y4.i
    public final void G0(String str, String str2) {
        C2009A.f23120G.b("Receive (type=text, ns=%s) %s", str, str2);
        C2009A.k(this.f23285f).post(new A4.j(this, str, str2, 20));
    }

    @Override // y4.i
    public final void J0(int i9) {
        C2009A.e(this.f23285f, i9);
    }

    @Override // y4.i
    public final void Q0(String str, byte[] bArr) {
        C2009A.f23120G.b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override // y4.i
    public final void T(C2014d c2014d, String str, String str2, boolean z9) {
        C2009A c2009a = this.f23285f;
        c2009a.f23137t = c2014d;
        c2009a.f23138u = str;
        y4.t tVar = new y4.t(new Status(0, null, null, null), c2014d, str, str2, z9);
        synchronized (c2009a.f23135r) {
            try {
                C1177i c1177i = c2009a.f23132o;
                if (c1177i != null) {
                    c1177i.b(tVar);
                }
                c2009a.f23132o = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // y4.i
    public final void T0(long j) {
        C2009A.d(this.f23285f, j, 0);
    }

    @Override // y4.i
    public final void X0(y4.e eVar) {
        C2009A.k(this.f23285f).post(new d2.v(this, eVar, 15, false));
    }

    @Override // y4.i
    public final void a(int i9) {
        C2009A c2009a = this.f23285f;
        C2009A.e(c2009a, i9);
        if (c2009a.f23125D != null) {
            C2009A.k(c2009a).post(new y(this, i9, 2));
        }
    }

    @Override // y4.i
    public final void h0() {
        C2009A.f23120G.b("Deprecated callback: \"onStatusReceived\"", new Object[0]);
    }

    @Override // y4.i
    public final void k(int i9) {
        this.f23285f.h(i9);
    }

    @Override // y4.i
    public final void l0(y4.c cVar) {
        C2009A.k(this.f23285f).post(new d2.v(this, cVar, 16, false));
    }

    @Override // y4.i
    public final void p(long j, int i9) {
        C2009A.d(this.f23285f, j, i9);
    }

    @Override // y4.i
    public final void u0(int i9) {
        C2009A.k(this.f23285f).post(new y(this, i9, 3));
    }
}
