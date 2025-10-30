package i4;

import F0.C0096b;
import N3.m0;
import N3.n0;
import P5.C0353v;
import P5.F;
import P5.Q;
import P5.S;
import android.content.Context;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import j3.J;
import j3.M;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.RandomAccess;
import l3.C1556e;
import l4.AbstractC1566a;
import l4.y;

/* loaded from: classes.dex */
public final class o extends s {
    public static final Q j = new C0353v(new E6.a(12));

    /* renamed from: k, reason: collision with root package name */
    public static final Q f18585k = new C0353v(new E6.a(13));

    /* renamed from: c, reason: collision with root package name */
    public final Object f18586c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f18587d;

    /* renamed from: e, reason: collision with root package name */
    public final e0.c f18588e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f18589f;

    /* renamed from: g, reason: collision with root package name */
    public h f18590g;

    /* renamed from: h, reason: collision with root package name */
    public final A6.t f18591h;

    /* renamed from: i, reason: collision with root package name */
    public C1556e f18592i;

    public o(Context context) {
        Spatializer spatializer;
        A6.t tVar;
        e0.c cVar = new e0.c(3);
        int i9 = h.f18544o0;
        h hVar = new h(new g(context));
        this.f18586c = new Object();
        this.f18587d = context.getApplicationContext();
        this.f18588e = cVar;
        this.f18590g = hVar;
        this.f18592i = C1556e.f20389g;
        boolean G8 = y.G(context);
        this.f18589f = G8;
        if (!G8 && y.f20553a >= 32) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager != null) {
                spatializer = audioManager.getSpatializer();
                tVar = new A6.t(spatializer);
            } else {
                tVar = null;
            }
            this.f18591h = tVar;
        }
        boolean z9 = this.f18590g.f18553i0;
    }

    public static void b(n0 n0Var, h hVar, HashMap hashMap) {
        for (int i9 = 0; i9 < n0Var.f5170a; i9++) {
            t tVar = (t) hVar.f18648y.get(n0Var.a(i9));
            if (tVar != null) {
                m0 m0Var = tVar.f18597a;
                t tVar2 = (t) hashMap.get(Integer.valueOf(m0Var.f5166c));
                if (tVar2 == null || (tVar2.f18598b.isEmpty() && !tVar.f18598b.isEmpty())) {
                    hashMap.put(Integer.valueOf(m0Var.f5166c), tVar);
                }
            }
        }
    }

    public static int c(M m9, String str, boolean z9) {
        if (!TextUtils.isEmpty(str) && str.equals(m9.f19427c)) {
            return 4;
        }
        String g9 = g(str);
        String g10 = g(m9.f19427c);
        if (g10 != null && g9 != null) {
            if (!g10.startsWith(g9) && !g9.startsWith(g10)) {
                int i9 = y.f20553a;
                if (!g10.split("-", 2)[0].equals(g9.split("-", 2)[0])) {
                    return 0;
                }
                return 2;
            }
            return 3;
        }
        if (!z9 || g10 != null) {
            return 0;
        }
        return 1;
    }

    public static boolean e(int i9, boolean z9) {
        int i10 = i9 & 7;
        if (i10 != 4) {
            if (!z9 || i10 != 3) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static String g(String str) {
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "und")) {
            return str;
        }
        return null;
    }

    public static Pair h(int i9, C0096b c0096b, int[][][] iArr, l lVar, Comparator comparator) {
        RandomAccess randomAccess;
        C0096b c0096b2 = c0096b;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < c0096b2.f2070a) {
            if (i9 == ((int[]) c0096b2.f2071b)[i10]) {
                n0 n0Var = ((n0[]) c0096b2.f2072c)[i10];
                for (int i11 = 0; i11 < n0Var.f5170a; i11++) {
                    m0 a5 = n0Var.a(i11);
                    S c3 = lVar.c(i10, a5, iArr[i10][i11]);
                    int i12 = a5.f5164a;
                    boolean[] zArr = new boolean[i12];
                    for (int i13 = 0; i13 < i12; i13++) {
                        m mVar = (m) c3.get(i13);
                        int a9 = mVar.a();
                        if (!zArr[i13] && a9 != 0) {
                            boolean z9 = true;
                            if (a9 == 1) {
                                randomAccess = F.s(mVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(mVar);
                                int i14 = i13 + 1;
                                while (i14 < i12) {
                                    boolean z10 = z9;
                                    m mVar2 = (m) c3.get(i14);
                                    if (mVar2.a() == 2 && mVar.b(mVar2)) {
                                        arrayList2.add(mVar2);
                                        zArr[i14] = z10;
                                    }
                                    i14++;
                                    z9 = z10;
                                }
                                randomAccess = arrayList2;
                            }
                            arrayList.add(randomAccess);
                        }
                    }
                }
            }
            i10++;
            c0096b2 = c0096b;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i15 = 0; i15 < list.size(); i15++) {
            iArr2[i15] = ((m) list.get(i15)).f18570c;
        }
        m mVar3 = (m) list.get(0);
        return Pair.create(new p(0, mVar3.f18569b, iArr2), Integer.valueOf(mVar3.f18568a));
    }

    @Override // i4.s
    public final void a() {
        A6.t tVar;
        j jVar;
        synchronized (this.f18586c) {
            try {
                if (y.f20553a >= 32 && (tVar = this.f18591h) != null && (jVar = (j) tVar.f542d) != null && ((Handler) tVar.f541c) != null) {
                    ((Spatializer) tVar.f540b).removeOnSpatializerStateChangedListener(jVar);
                    ((Handler) tVar.f541c).removeCallbacksAndMessages(null);
                    tVar.f541c = null;
                    tVar.f542d = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f18595a = null;
        this.f18596b = null;
    }

    public final h d() {
        h hVar;
        synchronized (this.f18586c) {
            hVar = this.f18590g;
        }
        return hVar;
    }

    public final void f() {
        boolean z9;
        J j4;
        A6.t tVar;
        synchronized (this.f18586c) {
            try {
                if (this.f18590g.f18553i0 && !this.f18589f && y.f20553a >= 32 && (tVar = this.f18591h) != null && tVar.f539a) {
                    z9 = true;
                } else {
                    z9 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z9 && (j4 = this.f18595a) != null) {
            j4.f19363h.c(10);
        }
    }

    public final void i(h hVar) {
        boolean equals;
        hVar.getClass();
        synchronized (this.f18586c) {
            equals = this.f18590g.equals(hVar);
            this.f18590g = hVar;
        }
        if (!equals) {
            if (hVar.f18553i0 && this.f18587d == null) {
                AbstractC1566a.P("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            J j4 = this.f18595a;
            if (j4 != null) {
                j4.f19363h.c(10);
            }
        }
    }
}
