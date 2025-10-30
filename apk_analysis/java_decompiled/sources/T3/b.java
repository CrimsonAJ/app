package T3;

import N3.C0266q;
import N3.G;
import android.net.Uri;
import android.os.SystemClock;
import j3.j0;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import k4.C1498D;
import k4.H;
import k4.InterfaceC1512l;
import k4.InterfaceC1513m;
import k4.J;
import k4.M;
import k4.P;
import l4.y;

/* loaded from: classes.dex */
public final class b implements H {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f7068a;

    /* renamed from: b, reason: collision with root package name */
    public final M f7069b = new M("DefaultHlsPlaylistTracker:MediaPlaylist");

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1513m f7070c;

    /* renamed from: d, reason: collision with root package name */
    public j f7071d;

    /* renamed from: e, reason: collision with root package name */
    public long f7072e;

    /* renamed from: f, reason: collision with root package name */
    public long f7073f;

    /* renamed from: g, reason: collision with root package name */
    public long f7074g;

    /* renamed from: h, reason: collision with root package name */
    public long f7075h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f7076i;
    public IOException j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ c f7077k;

    public b(c cVar, Uri uri) {
        this.f7077k = cVar;
        this.f7068a = uri;
        this.f7070c = ((InterfaceC1512l) cVar.f7079a.f11404b).c();
    }

    public static boolean a(b bVar, long j) {
        bVar.f7075h = SystemClock.elapsedRealtime() + j;
        c cVar = bVar.f7077k;
        if (!bVar.f7068a.equals(cVar.f7088k)) {
            return false;
        }
        List list = cVar.j.f7143e;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i9 = 0; i9 < size; i9++) {
            b bVar2 = (b) cVar.f7082d.get(((l) list.get(i9)).f7135a);
            bVar2.getClass();
            if (elapsedRealtime > bVar2.f7075h) {
                Uri uri = bVar2.f7068a;
                cVar.f7088k = uri;
                bVar2.c(cVar.b(uri));
                return false;
            }
        }
        return true;
    }

    public final void b(Uri uri) {
        c cVar = this.f7077k;
        P p9 = new P(this.f7070c, uri, 4, cVar.f7080b.g(cVar.j, this.f7071d));
        e1.q qVar = cVar.f7081c;
        int i9 = p9.f20010c;
        this.f7069b.f(p9, this, qVar.f(i9));
        cVar.f7084f.l(new C0266q(p9.f20009b), i9, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void c(Uri uri) {
        this.f7075h = 0L;
        if (!this.f7076i) {
            M m9 = this.f7069b;
            if (!m9.d() && !m9.c()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = this.f7074g;
                if (elapsedRealtime < j) {
                    this.f7076i = true;
                    this.f7077k.f7086h.postDelayed(new A6.r(this, 6, uri), j - elapsedRealtime);
                } else {
                    b(uri);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(T3.j r65) {
        /*
            Method dump skipped, instructions count: 690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T3.b.d(T3.j):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, N3.q] */
    @Override // k4.H
    public final B3.f e(J j, IOException iOException, int i9) {
        boolean z9;
        int i10;
        P p9 = (P) j;
        long j4 = p9.f20008a;
        Uri uri = p9.f20011d.f20034c;
        ?? obj = new Object();
        if (uri.getQueryParameter("_HLS_msn") != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        boolean z10 = iOException instanceof o;
        B3.f fVar = M.f20003e;
        Uri uri2 = this.f7068a;
        c cVar = this.f7077k;
        int i11 = p9.f20010c;
        if (z9 || z10) {
            if (iOException instanceof C1498D) {
                i10 = ((C1498D) iOException).f19982d;
            } else {
                i10 = Integer.MAX_VALUE;
            }
            if (z10 || i10 == 400 || i10 == 503) {
                this.f7074g = SystemClock.elapsedRealtime();
                c(uri2);
                G g9 = cVar.f7084f;
                int i12 = y.f20553a;
                g9.j(obj, i11, iOException, true);
                return fVar;
            }
        }
        A1.i iVar = new A1.i(i9, iOException);
        Iterator it = cVar.f7083e.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            z11 |= !((r) it.next()).d(uri2, iVar, false);
        }
        e1.q qVar = cVar.f7081c;
        if (z11) {
            qVar.getClass();
            long h7 = e1.q.h(iVar);
            if (h7 != -9223372036854775807L) {
                fVar = new B3.f(0, h7, false);
            } else {
                fVar = M.f20004f;
            }
        }
        boolean a5 = fVar.a();
        cVar.f7084f.j(obj, i11, iOException, true ^ a5);
        if (!a5) {
            qVar.getClass();
        }
        return fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, N3.q] */
    @Override // k4.H
    public final void f(J j, long j4, long j9) {
        P p9 = (P) j;
        n nVar = (n) p9.f20013f;
        Uri uri = p9.f20011d.f20034c;
        ?? obj = new Object();
        if (nVar instanceof j) {
            d((j) nVar);
            this.f7077k.f7084f.f(obj, 4);
        } else {
            j0 b9 = j0.b("Loaded playlist has unexpected type.", null);
            this.j = b9;
            this.f7077k.f7084f.j(obj, 4, b9, true);
        }
        this.f7077k.f7081c.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, N3.q] */
    @Override // k4.H
    public final void s(J j, long j4, long j9, boolean z9) {
        P p9 = (P) j;
        long j10 = p9.f20008a;
        Uri uri = p9.f20011d.f20034c;
        ?? obj = new Object();
        c cVar = this.f7077k;
        cVar.f7081c.getClass();
        cVar.f7084f.d(obj, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
