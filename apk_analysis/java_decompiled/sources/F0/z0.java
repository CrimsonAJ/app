package F0;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class z0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2308a;

    /* renamed from: b, reason: collision with root package name */
    public int f2309b;

    /* renamed from: c, reason: collision with root package name */
    public int f2310c;

    /* renamed from: d, reason: collision with root package name */
    public int f2311d;

    /* renamed from: e, reason: collision with root package name */
    public int f2312e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f2313f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f2314g;

    public z0(int i9) {
        this.f2308a = 1;
        this.f2309b = i9;
        if (i9 > 0) {
            this.f2313f = new G0.C(1);
            this.f2314g = new d0.o(13);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public void a() {
        View view = (View) ((ArrayList) this.f2313f).get(r0.size() - 1);
        w0 w0Var = (w0) view.getLayoutParams();
        this.f2310c = ((StaggeredGridLayoutManager) this.f2314g).f10328r.d(view);
        w0Var.getClass();
    }

    public void b() {
        ((ArrayList) this.f2313f).clear();
        this.f2309b = Integer.MIN_VALUE;
        this.f2310c = Integer.MIN_VALUE;
        this.f2311d = 0;
    }

    public Object c(Object key) {
        kotlin.jvm.internal.h.e(key, "key");
        return null;
    }

    public void d(Object key, Object oldValue, Object obj) {
        kotlin.jvm.internal.h.e(key, "key");
        kotlin.jvm.internal.h.e(oldValue, "oldValue");
    }

    public int e() {
        boolean z9 = ((StaggeredGridLayoutManager) this.f2314g).f10333w;
        ArrayList arrayList = (ArrayList) this.f2313f;
        if (z9) {
            return g(arrayList.size() - 1, -1);
        }
        return g(0, arrayList.size());
    }

    public int f() {
        boolean z9 = ((StaggeredGridLayoutManager) this.f2314g).f10333w;
        ArrayList arrayList = (ArrayList) this.f2313f;
        if (z9) {
            return g(0, arrayList.size());
        }
        return g(arrayList.size() - 1, -1);
    }

    public int g(int i9, int i10) {
        int i11;
        boolean z9;
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f2314g;
        int m9 = staggeredGridLayoutManager.f10328r.m();
        int i12 = staggeredGridLayoutManager.f10328r.i();
        if (i10 > i9) {
            i11 = 1;
        } else {
            i11 = -1;
        }
        while (i9 != i10) {
            View view = (View) ((ArrayList) this.f2313f).get(i9);
            int g9 = staggeredGridLayoutManager.f10328r.g(view);
            int d9 = staggeredGridLayoutManager.f10328r.d(view);
            boolean z10 = false;
            if (g9 <= i12) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (d9 >= m9) {
                z10 = true;
            }
            if (z9 && z10 && (g9 < m9 || d9 > i12)) {
                return androidx.recyclerview.widget.a.L(view);
            }
            i9 += i11;
        }
        return -1;
    }

    public Object h(Object key) {
        Object put;
        kotlin.jvm.internal.h.e(key, "key");
        synchronized (((d0.o) this.f2314g)) {
            G0.C c3 = (G0.C) this.f2313f;
            c3.getClass();
            Object obj = c3.f2640a.get(key);
            if (obj != null) {
                this.f2311d++;
                return obj;
            }
            this.f2312e++;
            Object c9 = c(key);
            if (c9 == null) {
                return null;
            }
            synchronized (((d0.o) this.f2314g)) {
                G0.C c10 = (G0.C) this.f2313f;
                c10.getClass();
                put = c10.f2640a.put(key, c9);
                if (put != null) {
                    G0.C c11 = (G0.C) this.f2313f;
                    c11.getClass();
                    c11.f2640a.put(key, put);
                } else {
                    this.f2310c += n(key, c9);
                }
            }
            if (put != null) {
                d(key, c9, put);
                return put;
            }
            q(this.f2309b);
            return c9;
        }
    }

    public int i(int i9) {
        int i10 = this.f2310c;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        if (((ArrayList) this.f2313f).size() == 0) {
            return i9;
        }
        a();
        return this.f2310c;
    }

    public View j(int i9, int i10) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f2314g;
        ArrayList arrayList = (ArrayList) this.f2313f;
        View view = null;
        if (i10 == -1) {
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                View view2 = (View) arrayList.get(i11);
                if ((staggeredGridLayoutManager.f10333w && androidx.recyclerview.widget.a.L(view2) <= i9) || ((!staggeredGridLayoutManager.f10333w && androidx.recyclerview.widget.a.L(view2) >= i9) || !view2.hasFocusable())) {
                    break;
                }
                i11++;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size() - 1;
        while (size2 >= 0) {
            View view3 = (View) arrayList.get(size2);
            if ((staggeredGridLayoutManager.f10333w && androidx.recyclerview.widget.a.L(view3) >= i9) || ((!staggeredGridLayoutManager.f10333w && androidx.recyclerview.widget.a.L(view3) <= i9) || !view3.hasFocusable())) {
                break;
            }
            size2--;
            view = view3;
        }
        return view;
    }

    public int k(int i9) {
        int i10 = this.f2309b;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        if (((ArrayList) this.f2313f).size() == 0) {
            return i9;
        }
        View view = (View) ((ArrayList) this.f2313f).get(0);
        w0 w0Var = (w0) view.getLayoutParams();
        this.f2309b = ((StaggeredGridLayoutManager) this.f2314g).f10328r.g(view);
        w0Var.getClass();
        return this.f2309b;
    }

    public Object l(Object key, Object obj) {
        Object put;
        kotlin.jvm.internal.h.e(key, "key");
        synchronized (((d0.o) this.f2314g)) {
            this.f2310c += n(key, obj);
            G0.C c3 = (G0.C) this.f2313f;
            c3.getClass();
            put = c3.f2640a.put(key, obj);
            if (put != null) {
                this.f2310c -= n(key, put);
            }
        }
        if (put != null) {
            d(key, put, obj);
        }
        q(this.f2309b);
        return put;
    }

    public void m(Object key) {
        Object remove;
        kotlin.jvm.internal.h.e(key, "key");
        synchronized (((d0.o) this.f2314g)) {
            G0.C c3 = (G0.C) this.f2313f;
            c3.getClass();
            remove = c3.f2640a.remove(key);
            if (remove != null) {
                this.f2310c -= n(key, remove);
            }
        }
        if (remove != null) {
            d(key, remove, null);
        }
    }

    public int n(Object obj, Object obj2) {
        int o9 = o(obj, obj2);
        if (o9 >= 0) {
            return o9;
        }
        throw new IllegalStateException(("Negative size: " + obj + '=' + obj2).toString());
    }

    public int o(Object key, Object value) {
        kotlin.jvm.internal.h.e(key, "key");
        kotlin.jvm.internal.h.e(value, "value");
        return 1;
    }

    public LinkedHashMap p() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (((d0.o) this.f2314g)) {
            Set<Map.Entry> entrySet = ((G0.C) this.f2313f).f2640a.entrySet();
            kotlin.jvm.internal.h.d(entrySet, "map.entries");
            for (Map.Entry entry : entrySet) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0098, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0067 A[Catch: all -> 0x001a, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x001a, blocks: (B:4:0x0005, B:6:0x0009, B:8:0x0015, B:16:0x001d, B:18:0x0021, B:20:0x002e, B:22:0x0042, B:25:0x0061, B:27:0x0067, B:33:0x004c, B:34:0x0052, B:37:0x005d, B:12:0x0091, B:13:0x0098), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q(int r7) {
        /*
            r6 = this;
        L0:
            java.lang.Object r0 = r6.f2314g
            d0.o r0 = (d0.o) r0
            monitor-enter(r0)
            int r1 = r6.f2310c     // Catch: java.lang.Throwable -> L1a
            if (r1 < 0) goto L91
            java.lang.Object r1 = r6.f2313f     // Catch: java.lang.Throwable -> L1a
            G0.C r1 = (G0.C) r1     // Catch: java.lang.Throwable -> L1a
            java.util.LinkedHashMap r1 = r1.f2640a     // Catch: java.lang.Throwable -> L1a
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L1d
            int r1 = r6.f2310c     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L91
            goto L1d
        L1a:
            r7 = move-exception
            goto L99
        L1d:
            int r1 = r6.f2310c     // Catch: java.lang.Throwable -> L1a
            if (r1 <= r7) goto L8f
            java.lang.Object r1 = r6.f2313f     // Catch: java.lang.Throwable -> L1a
            G0.C r1 = (G0.C) r1     // Catch: java.lang.Throwable -> L1a
            java.util.LinkedHashMap r1 = r1.f2640a     // Catch: java.lang.Throwable -> L1a
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L2e
            goto L8f
        L2e:
            java.lang.Object r1 = r6.f2313f     // Catch: java.lang.Throwable -> L1a
            G0.C r1 = (G0.C) r1     // Catch: java.lang.Throwable -> L1a
            java.util.LinkedHashMap r1 = r1.f2640a     // Catch: java.lang.Throwable -> L1a
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r2 = "map.entries"
            kotlin.jvm.internal.h.d(r1, r2)     // Catch: java.lang.Throwable -> L1a
            boolean r2 = r1 instanceof java.util.List     // Catch: java.lang.Throwable -> L1a
            r3 = 0
            if (r2 == 0) goto L52
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L1a
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1a
            if (r2 == 0) goto L4c
        L4a:
            r1 = r3
            goto L61
        L4c:
            r2 = 0
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L1a
            goto L61
        L52:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1a
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L1a
            if (r2 != 0) goto L5d
            goto L4a
        L5d:
            java.lang.Object r1 = r1.next()     // Catch: java.lang.Throwable -> L1a
        L61:
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L67
            monitor-exit(r0)
            return
        L67:
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r4 = r6.f2313f     // Catch: java.lang.Throwable -> L1a
            G0.C r4 = (G0.C) r4     // Catch: java.lang.Throwable -> L1a
            r4.getClass()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r5 = "key"
            kotlin.jvm.internal.h.e(r2, r5)     // Catch: java.lang.Throwable -> L1a
            java.util.LinkedHashMap r4 = r4.f2640a     // Catch: java.lang.Throwable -> L1a
            r4.remove(r2)     // Catch: java.lang.Throwable -> L1a
            int r4 = r6.f2310c     // Catch: java.lang.Throwable -> L1a
            int r5 = r6.n(r2, r1)     // Catch: java.lang.Throwable -> L1a
            int r4 = r4 - r5
            r6.f2310c = r4     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)
            r6.d(r2, r1, r3)
            goto L0
        L8f:
            monitor-exit(r0)
            return
        L91:
            java.lang.String r7 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1a
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L1a
            throw r1     // Catch: java.lang.Throwable -> L1a
        L99:
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: F0.z0.q(int):void");
    }

    public String toString() {
        int i9;
        String str;
        switch (this.f2308a) {
            case 1:
                synchronized (((d0.o) this.f2314g)) {
                    try {
                        int i10 = this.f2311d;
                        int i11 = this.f2312e + i10;
                        if (i11 != 0) {
                            i9 = (i10 * 100) / i11;
                        } else {
                            i9 = 0;
                        }
                        str = "LruCache[maxSize=" + this.f2309b + ",hits=" + this.f2311d + ",misses=" + this.f2312e + ",hitRate=" + i9 + "%]";
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    public z0(StaggeredGridLayoutManager staggeredGridLayoutManager, int i9) {
        this.f2308a = 0;
        this.f2314g = staggeredGridLayoutManager;
        this.f2313f = new ArrayList();
        this.f2309b = Integer.MIN_VALUE;
        this.f2310c = Integer.MIN_VALUE;
        this.f2311d = 0;
        this.f2312e = i9;
    }
}
