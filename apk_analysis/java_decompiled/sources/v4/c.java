package v4;

import F4.y;
import android.os.Looper;
import android.util.SparseIntArray;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import u4.C;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public long f23791b;

    /* renamed from: c, reason: collision with root package name */
    public final h f23792c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f23793d;

    /* renamed from: e, reason: collision with root package name */
    public final SparseIntArray f23794e;

    /* renamed from: f, reason: collision with root package name */
    public final x f23795f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f23796g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayDeque f23797h;

    /* renamed from: i, reason: collision with root package name */
    public final T4.d f23798i;
    public final t j;

    /* renamed from: k, reason: collision with root package name */
    public BasePendingResult f23799k;

    /* renamed from: l, reason: collision with root package name */
    public BasePendingResult f23800l;

    /* renamed from: m, reason: collision with root package name */
    public final Set f23801m = Collections.synchronizedSet(new HashSet());

    /* renamed from: a, reason: collision with root package name */
    public final y4.b f23790a = new y4.b("MediaQueue", null);

    public c(h hVar) {
        this.f23792c = hVar;
        Math.max(20, 1);
        this.f23793d = new ArrayList();
        this.f23794e = new SparseIntArray();
        this.f23796g = new ArrayList();
        this.f23797h = new ArrayDeque(20);
        this.f23798i = new T4.d(Looper.getMainLooper(), 4);
        int i9 = 1;
        this.j = new t(i9, this);
        hVar.o(new C(i9, this));
        this.f23795f = new x(this);
        this.f23791b = e();
        d();
    }

    public static void a(c cVar) {
        Set set = cVar.f23801m;
        synchronized (set) {
            try {
                Iterator it = set.iterator();
                if (it.hasNext()) {
                    if (it.next() == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* bridge */ /* synthetic */ void b(c cVar) {
        SparseIntArray sparseIntArray = cVar.f23794e;
        sparseIntArray.clear();
        for (int i9 = 0; i9 < cVar.f23793d.size(); i9++) {
            sparseIntArray.put(((Integer) cVar.f23793d.get(i9)).intValue(), i9);
        }
    }

    public final void c() {
        h();
        this.f23793d.clear();
        this.f23794e.clear();
        this.f23795f.evictAll();
        this.f23796g.clear();
        this.f23798i.removeCallbacks(this.j);
        this.f23797h.clear();
        BasePendingResult basePendingResult = this.f23800l;
        if (basePendingResult != null) {
            basePendingResult.E();
            this.f23800l = null;
        }
        BasePendingResult basePendingResult2 = this.f23799k;
        if (basePendingResult2 != null) {
            basePendingResult2.E();
            this.f23799k = null;
        }
        g();
        f();
    }

    public final void d() {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        y.d();
        if (this.f23791b != 0 && (basePendingResult = this.f23800l) == null) {
            if (basePendingResult != null) {
                basePendingResult.E();
                this.f23800l = null;
            }
            BasePendingResult basePendingResult3 = this.f23799k;
            if (basePendingResult3 != null) {
                basePendingResult3.E();
                this.f23799k = null;
            }
            h hVar = this.f23792c;
            hVar.getClass();
            y.d();
            if (!hVar.w()) {
                basePendingResult2 = h.r();
            } else {
                k kVar = new k(hVar);
                h.x(kVar);
                basePendingResult2 = kVar;
            }
            this.f23800l = basePendingResult2;
            basePendingResult2.K(new w(this, 0));
        }
    }

    public final long e() {
        int i9;
        t4.p d9 = this.f23792c.d();
        if (d9 != null) {
            MediaInfo mediaInfo = d9.f23224a;
            if (mediaInfo == null) {
                i9 = -1;
            } else {
                i9 = mediaInfo.f14609b;
            }
            int i10 = d9.f23228e;
            int i11 = d9.f23229f;
            int i12 = d9.f23234l;
            if (i10 == 1) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            return 0L;
                        }
                    } else if (i9 != 2) {
                        return 0L;
                    }
                }
                if (i12 == 0) {
                    return 0L;
                }
            }
            return d9.f23225b;
        }
        return 0L;
    }

    public final void f() {
        Set set = this.f23801m;
        synchronized (set) {
            try {
                Iterator it = set.iterator();
                if (it.hasNext()) {
                    if (it.next() == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        Set set = this.f23801m;
        synchronized (set) {
            try {
                Iterator it = set.iterator();
                if (it.hasNext()) {
                    if (it.next() == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        Set set = this.f23801m;
        synchronized (set) {
            try {
                Iterator it = set.iterator();
                if (it.hasNext()) {
                    if (it.next() == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
