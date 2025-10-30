package F0;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class A implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadLocal f1979e = new ThreadLocal();

    /* renamed from: f, reason: collision with root package name */
    public static final B.j f1980f = new B.j(3);

    /* renamed from: b, reason: collision with root package name */
    public long f1982b;

    /* renamed from: c, reason: collision with root package name */
    public long f1983c;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1981a = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f1984d = new ArrayList();

    public static r0 c(RecyclerView recyclerView, int i9, long j) {
        int l9 = recyclerView.f10276f.l();
        for (int i10 = 0; i10 < l9; i10++) {
            r0 N8 = RecyclerView.N(recyclerView.f10276f.k(i10));
            if (N8.f2212c == i9 && !N8.g()) {
                return null;
            }
        }
        h0 h0Var = recyclerView.f10273c;
        if (j == Long.MAX_VALUE) {
            try {
                if (L.k.a()) {
                    Trace.beginSection("RV Prefetch forced - needed next frame");
                }
            } catch (Throwable th) {
                recyclerView.V(false);
                Trace.endSection();
                throw th;
            }
        }
        recyclerView.U();
        r0 k5 = h0Var.k(j, i9);
        if (k5 != null) {
            if (k5.f() && !k5.g()) {
                h0Var.h(k5.f2210a);
            } else {
                h0Var.a(k5, false);
            }
        }
        recyclerView.V(false);
        Trace.endSection();
        return k5;
    }

    public final void a(RecyclerView recyclerView, int i9, int i10) {
        if (recyclerView.f10300s) {
            if (RecyclerView.f10232a1 && !this.f1981a.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f1982b == 0) {
                this.f1982b = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        C0120y c0120y = recyclerView.f10249E0;
        c0120y.f2290b = i9;
        c0120y.f2291c = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(long j) {
        C0121z c0121z;
        RecyclerView recyclerView;
        long j4;
        RecyclerView recyclerView2;
        String str;
        C0121z c0121z2;
        boolean z9;
        ArrayList arrayList = this.f1981a;
        int size = arrayList.size();
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i11);
            if (recyclerView3.getWindowVisibility() == 0) {
                C0120y c0120y = recyclerView3.f10249E0;
                c0120y.d(recyclerView3, false);
                i10 += c0120y.f2292d;
            }
        }
        ArrayList arrayList2 = this.f1984d;
        arrayList2.ensureCapacity(i10);
        int i12 = 0;
        int i13 = 0;
        while (i12 < size) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i12);
            if (recyclerView4.getWindowVisibility() == 0) {
                C0120y c0120y2 = recyclerView4.f10249E0;
                int abs = Math.abs(c0120y2.f2291c) + Math.abs(c0120y2.f2290b);
                for (int i14 = i9; i14 < c0120y2.f2292d * 2; i14 += 2) {
                    if (i13 >= arrayList2.size()) {
                        Object obj = new Object();
                        arrayList2.add(obj);
                        c0121z2 = obj;
                    } else {
                        c0121z2 = (C0121z) arrayList2.get(i13);
                    }
                    int[] iArr = (int[]) c0120y2.f2293e;
                    int i15 = iArr[i14 + 1];
                    if (i15 <= abs) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    c0121z2.f2303a = z9;
                    c0121z2.f2304b = abs;
                    c0121z2.f2305c = i15;
                    c0121z2.f2306d = recyclerView4;
                    c0121z2.f2307e = iArr[i14];
                    i13++;
                }
            }
            i12++;
            i9 = 0;
        }
        Collections.sort(arrayList2, f1980f);
        for (int i16 = 0; i16 < arrayList2.size() && (recyclerView = (c0121z = (C0121z) arrayList2.get(i16)).f2306d) != null; i16++) {
            if (c0121z.f2303a) {
                j4 = Long.MAX_VALUE;
            } else {
                j4 = j;
            }
            r0 c3 = c(recyclerView, c0121z.f2307e, j4);
            if (c3 != null && c3.f2211b != null && c3.f() && !c3.g() && (recyclerView2 = (RecyclerView) c3.f2211b.get()) != null) {
                if (recyclerView2.f10247D && recyclerView2.f10276f.l() != 0) {
                    Z z10 = recyclerView2.f10292n0;
                    if (z10 != null) {
                        z10.e();
                    }
                    androidx.recyclerview.widget.a aVar = recyclerView2.f10291n;
                    h0 h0Var = recyclerView2.f10273c;
                    if (aVar != null) {
                        aVar.r0(h0Var);
                        recyclerView2.f10291n.s0(h0Var);
                    }
                    h0Var.f2116a.clear();
                    h0Var.f();
                }
                C0120y c0120y3 = recyclerView2.f10249E0;
                c0120y3.d(recyclerView2, true);
                if (c0120y3.f2292d != 0) {
                    if (j == Long.MAX_VALUE) {
                        str = "RV Nested Prefetch";
                    } else {
                        str = "RV Nested Prefetch forced - needed next frame";
                    }
                    try {
                        Trace.beginSection(str);
                        n0 n0Var = recyclerView2.f10250F0;
                        S s9 = recyclerView2.f10289m;
                        n0Var.f2167d = 1;
                        n0Var.f2168e = s9.a();
                        n0Var.f2170g = false;
                        n0Var.f2171h = false;
                        n0Var.f2172i = false;
                        for (int i17 = 0; i17 < c0120y3.f2292d * 2; i17 += 2) {
                            c(recyclerView2, ((int[]) c0120y3.f2293e)[i17], j);
                        }
                        Trace.endSection();
                        c0121z.f2303a = false;
                        c0121z.f2304b = 0;
                        c0121z.f2305c = 0;
                        c0121z.f2306d = null;
                        c0121z.f2307e = 0;
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            c0121z.f2303a = false;
            c0121z.f2304b = 0;
            c0121z.f2305c = 0;
            c0121z.f2306d = null;
            c0121z.f2307e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f1981a;
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long j = 0;
                for (int i9 = 0; i9 < size; i9++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i9);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(j) + this.f1983c);
                }
            }
        } finally {
            this.f1982b = 0L;
            Trace.endSection();
        }
    }
}
