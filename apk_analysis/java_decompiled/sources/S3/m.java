package S3;

import N3.A;
import N3.AbstractC0250a;
import N3.C0266q;
import N3.G;
import N3.InterfaceC0272x;
import P5.F;
import android.net.Uri;
import android.os.Looper;
import b7.C0701c;
import j3.K;
import j3.T;
import j3.U;
import j3.Y;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import k4.C1517q;
import k4.InterfaceC1512l;
import k4.M;
import k4.P;
import k4.W;
import l4.AbstractC1566a;
import l4.y;
import n3.C1635l;
import n3.InterfaceC1632i;
import n3.InterfaceC1638o;

/* loaded from: classes.dex */
public final class m extends AbstractC0250a {

    /* renamed from: h, reason: collision with root package name */
    public final c f6836h;

    /* renamed from: i, reason: collision with root package name */
    public final U f6837i;
    public final C0701c j;

    /* renamed from: k, reason: collision with root package name */
    public final F5.e f6838k;

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC1638o f6839l;

    /* renamed from: m, reason: collision with root package name */
    public final e1.q f6840m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f6841n;

    /* renamed from: o, reason: collision with root package name */
    public final int f6842o;

    /* renamed from: p, reason: collision with root package name */
    public final T3.c f6843p;

    /* renamed from: q, reason: collision with root package name */
    public final long f6844q;

    /* renamed from: r, reason: collision with root package name */
    public final Y f6845r;

    /* renamed from: s, reason: collision with root package name */
    public T f6846s;

    /* renamed from: t, reason: collision with root package name */
    public W f6847t;

    static {
        K.a("goog.exo.hls");
    }

    public m(Y y9, C0701c c0701c, c cVar, F5.e eVar, InterfaceC1638o interfaceC1638o, e1.q qVar, T3.c cVar2, long j, boolean z9, int i9) {
        U u9 = y9.f19492b;
        u9.getClass();
        this.f6837i = u9;
        this.f6845r = y9;
        this.f6846s = y9.f19493c;
        this.j = c0701c;
        this.f6836h = cVar;
        this.f6838k = eVar;
        this.f6839l = interfaceC1638o;
        this.f6840m = qVar;
        this.f6843p = cVar2;
        this.f6844q = j;
        this.f6841n = z9;
        this.f6842o = i9;
    }

    public static T3.e v(long j, F f9) {
        T3.e eVar = null;
        for (int i9 = 0; i9 < f9.size(); i9++) {
            T3.e eVar2 = (T3.e) f9.get(i9);
            long j4 = eVar2.f7103e;
            if (j4 <= j && eVar2.f7092l) {
                eVar = eVar2;
            } else if (j4 > j) {
                break;
            }
        }
        return eVar;
    }

    @Override // N3.AbstractC0250a
    public final InterfaceC0272x b(A a5, C1517q c1517q, long j) {
        G a9 = a(a5);
        C1635l c1635l = new C1635l(this.f5038d.f21132c, 0, a5);
        W w7 = this.f6847t;
        k3.l lVar = this.f5041g;
        AbstractC1566a.n(lVar);
        return new l(this.f6836h, this.f6843p, this.j, w7, this.f6839l, c1635l, this.f6840m, a9, c1517q, this.f6838k, this.f6841n, this.f6842o, lVar);
    }

    @Override // N3.AbstractC0250a
    public final Y j() {
        return this.f6845r;
    }

    @Override // N3.AbstractC0250a
    public final void l() {
        T3.c cVar = this.f6843p;
        M m9 = cVar.f7085g;
        if (m9 != null) {
            m9.b();
        }
        Uri uri = cVar.f7088k;
        if (uri != null) {
            T3.b bVar = (T3.b) cVar.f7082d.get(uri);
            bVar.f7069b.b();
            IOException iOException = bVar.j;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override // N3.AbstractC0250a
    public final void n(W w7) {
        boolean z9;
        this.f6847t = w7;
        InterfaceC1638o interfaceC1638o = this.f6839l;
        interfaceC1638o.b();
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        k3.l lVar = this.f5041g;
        AbstractC1566a.n(lVar);
        interfaceC1638o.l(myLooper, lVar);
        G a5 = a(null);
        Uri uri = this.f6837i.f19475a;
        T3.c cVar = this.f6843p;
        cVar.getClass();
        cVar.f7086h = y.l(null);
        cVar.f7084f = a5;
        cVar.f7087i = this;
        P p9 = new P(((InterfaceC1512l) cVar.f7079a.f11404b).c(), uri, 4, cVar.f7080b.i());
        if (cVar.f7085g == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC1566a.m(z9);
        M m9 = new M("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        cVar.f7085g = m9;
        e1.q qVar = cVar.f7081c;
        int i9 = p9.f20010c;
        m9.f(p9, cVar, qVar.f(i9));
        a5.l(new C0266q(p9.f20009b), i9, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // N3.AbstractC0250a
    public final void p(InterfaceC0272x interfaceC0272x) {
        l lVar = (l) interfaceC0272x;
        lVar.f6815b.f7083e.remove(lVar);
        for (r rVar : lVar.f6832t) {
            if (rVar.f6866D) {
                for (q qVar : rVar.f6904v) {
                    qVar.i();
                    InterfaceC1632i interfaceC1632i = qVar.f5061h;
                    if (interfaceC1632i != null) {
                        interfaceC1632i.e(qVar.f5058e);
                        qVar.f5061h = null;
                        qVar.f5060g = null;
                    }
                }
            }
            rVar.j.e(rVar);
            rVar.f6897r.removeCallbacksAndMessages(null);
            rVar.f6875f0 = true;
            rVar.f6898s.clear();
        }
        lVar.f6829q = null;
    }

    @Override // N3.AbstractC0250a
    public final void r() {
        T3.c cVar = this.f6843p;
        cVar.f7088k = null;
        cVar.f7089l = null;
        cVar.j = null;
        cVar.f7091n = -9223372036854775807L;
        cVar.f7085g.e(null);
        cVar.f7085g = null;
        HashMap hashMap = cVar.f7082d;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            ((T3.b) it.next()).f7069b.e(null);
        }
        cVar.f7086h.removeCallbacksAndMessages(null);
        cVar.f7086h = null;
        hashMap.clear();
        this.f6839l.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(T3.j r48) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S3.m.w(T3.j):void");
    }
}
