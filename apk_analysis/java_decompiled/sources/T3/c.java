package T3;

import N3.G;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import b7.C0701c;
import j3.L;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import k4.H;
import k4.J;
import k4.M;
import k4.P;
import l4.y;

/* loaded from: classes.dex */
public final class c implements H {

    /* renamed from: o, reason: collision with root package name */
    public static final C6.a f7078o = new C6.a(21);

    /* renamed from: a, reason: collision with root package name */
    public final C0701c f7079a;

    /* renamed from: b, reason: collision with root package name */
    public final q f7080b;

    /* renamed from: c, reason: collision with root package name */
    public final e1.q f7081c;

    /* renamed from: f, reason: collision with root package name */
    public G f7084f;

    /* renamed from: g, reason: collision with root package name */
    public M f7085g;

    /* renamed from: h, reason: collision with root package name */
    public Handler f7086h;

    /* renamed from: i, reason: collision with root package name */
    public S3.m f7087i;
    public m j;

    /* renamed from: k, reason: collision with root package name */
    public Uri f7088k;

    /* renamed from: l, reason: collision with root package name */
    public j f7089l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7090m;

    /* renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArrayList f7083e = new CopyOnWriteArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f7082d = new HashMap();

    /* renamed from: n, reason: collision with root package name */
    public long f7091n = -9223372036854775807L;

    public c(C0701c c0701c, e1.q qVar, q qVar2) {
        this.f7079a = c0701c;
        this.f7080b = qVar2;
        this.f7081c = qVar;
    }

    public final j a(Uri uri, boolean z9) {
        HashMap hashMap = this.f7082d;
        j jVar = ((b) hashMap.get(uri)).f7071d;
        if (jVar != null && z9 && !uri.equals(this.f7088k)) {
            List list = this.j.f7143e;
            int i9 = 0;
            while (true) {
                if (i9 >= list.size()) {
                    break;
                }
                if (uri.equals(((l) list.get(i9)).f7135a)) {
                    j jVar2 = this.f7089l;
                    if (jVar2 == null || !jVar2.f7124o) {
                        this.f7088k = uri;
                        b bVar = (b) hashMap.get(uri);
                        j jVar3 = bVar.f7071d;
                        if (jVar3 != null && jVar3.f7124o) {
                            this.f7089l = jVar3;
                            this.f7087i.w(jVar3);
                            return jVar;
                        }
                        bVar.c(b(uri));
                        return jVar;
                    }
                } else {
                    i9++;
                }
            }
        }
        return jVar;
    }

    public final Uri b(Uri uri) {
        f fVar;
        j jVar = this.f7089l;
        if (jVar != null && jVar.f7131v.f7113e && (fVar = (f) jVar.f7129t.get(uri)) != null) {
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(fVar.f7095b));
            int i9 = fVar.f7096c;
            if (i9 != -1) {
                buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i9));
            }
            return buildUpon.build();
        }
        return uri;
    }

    public final boolean c(Uri uri) {
        int i9;
        b bVar = (b) this.f7082d.get(uri);
        if (bVar.f7071d != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long max = Math.max(30000L, y.T(bVar.f7071d.f7130u));
            j jVar = bVar.f7071d;
            if (jVar.f7124o || (i9 = jVar.f7114d) == 2 || i9 == 1 || bVar.f7072e + max > elapsedRealtime) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, N3.q] */
    @Override // k4.H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final B3.f e(k4.J r9, java.io.IOException r10, int r11) {
        /*
            r8 = this;
            r0 = 0
            k4.P r9 = (k4.P) r9
            N3.q r1 = new N3.q
            long r2 = r9.f20008a
            k4.V r2 = r9.f20011d
            android.net.Uri r2 = r2.f20034c
            r1.<init>()
            e1.q r2 = r8.f7081c
            r2.getClass()
            boolean r2 = r10 instanceof j3.j0
            r3 = 1
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 != 0) goto L4c
            boolean r2 = r10 instanceof java.io.FileNotFoundException
            if (r2 != 0) goto L4c
            boolean r2 = r10 instanceof k4.C1495A
            if (r2 != 0) goto L4c
            boolean r2 = r10 instanceof k4.L
            if (r2 != 0) goto L4c
            int r2 = k4.C1514n.f20070b
            r2 = r10
        L2c:
            if (r2 == 0) goto L41
            boolean r6 = r2 instanceof k4.C1514n
            if (r6 == 0) goto L3c
            r6 = r2
            k4.n r6 = (k4.C1514n) r6
            int r6 = r6.f20071a
            r7 = 2008(0x7d8, float:2.814E-42)
            if (r6 != r7) goto L3c
            goto L4c
        L3c:
            java.lang.Throwable r2 = r2.getCause()
            goto L2c
        L41:
            int r11 = r11 - r3
            int r11 = r11 * 1000
            r2 = 5000(0x1388, float:7.006E-42)
            int r11 = java.lang.Math.min(r11, r2)
            long r6 = (long) r11
            goto L4d
        L4c:
            r6 = r4
        L4d:
            int r11 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r11 != 0) goto L52
            goto L53
        L52:
            r3 = r0
        L53:
            N3.G r11 = r8.f7084f
            int r9 = r9.f20010c
            r11.j(r1, r9, r10, r3)
            if (r3 == 0) goto L5f
            B3.f r9 = k4.M.f20004f
            return r9
        L5f:
            B3.f r9 = new B3.f
            r9.<init>(r0, r6, r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: T3.c.e(k4.J, java.io.IOException, int):B3.f");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, N3.q] */
    @Override // k4.H
    public final void f(J j, long j4, long j9) {
        m mVar;
        P p9 = (P) j;
        n nVar = (n) p9.f20013f;
        boolean z9 = nVar instanceof j;
        if (z9) {
            String str = nVar.f7151a;
            m mVar2 = m.f7141n;
            Uri parse = Uri.parse(str);
            L l9 = new L();
            l9.f19393a = "0";
            l9.j = "application/x-mpegURL";
            List singletonList = Collections.singletonList(new l(parse, new j3.M(l9), null, null, null, null));
            List list = Collections.EMPTY_LIST;
            mVar = new m("", list, singletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            mVar = (m) nVar;
        }
        this.j = mVar;
        this.f7088k = ((l) mVar.f7143e.get(0)).f7135a;
        this.f7083e.add(new a(this));
        List list2 = mVar.f7142d;
        int size = list2.size();
        for (int i9 = 0; i9 < size; i9++) {
            Uri uri = (Uri) list2.get(i9);
            this.f7082d.put(uri, new b(this, uri));
        }
        Uri uri2 = p9.f20011d.f20034c;
        ?? obj = new Object();
        b bVar = (b) this.f7082d.get(this.f7088k);
        if (z9) {
            bVar.d((j) nVar);
        } else {
            bVar.c(bVar.f7068a);
        }
        this.f7081c.getClass();
        this.f7084f.f(obj, 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, N3.q] */
    @Override // k4.H
    public final void s(J j, long j4, long j9, boolean z9) {
        P p9 = (P) j;
        long j10 = p9.f20008a;
        Uri uri = p9.f20011d.f20034c;
        ?? obj = new Object();
        this.f7081c.getClass();
        this.f7084f.d(obj, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
