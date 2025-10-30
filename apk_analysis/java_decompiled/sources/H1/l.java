package H1;

import android.os.SystemClock;
import v1.C2100h;

/* loaded from: classes.dex */
public final class l implements i {

    /* renamed from: a, reason: collision with root package name */
    public static final l f2965a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static C2100h f2966b;

    @Override // H1.i
    public boolean a() {
        boolean z9;
        synchronized (h.f2954a) {
            try {
                int i9 = h.f2956c;
                h.f2956c = i9 + 1;
                if (i9 >= 30 || SystemClock.uptimeMillis() > h.f2957d + 30000) {
                    boolean z10 = false;
                    h.f2956c = 0;
                    h.f2957d = SystemClock.uptimeMillis();
                    String[] list = h.f2955b.list();
                    if (list == null) {
                        list = new String[0];
                    }
                    if (list.length < 800) {
                        z10 = true;
                    }
                    h.f2958e = z10;
                }
                z9 = h.f2958e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z9;
    }

    @Override // H1.i
    public boolean b(D1.h hVar) {
        int i9;
        s8.n nVar = hVar.f1777a;
        int i10 = Integer.MAX_VALUE;
        if (nVar instanceof D1.a) {
            i9 = ((D1.a) nVar).f1767m;
        } else {
            i9 = Integer.MAX_VALUE;
        }
        if (i9 > 100) {
            s8.n nVar2 = hVar.f1778b;
            if (nVar2 instanceof D1.a) {
                i10 = ((D1.a) nVar2).f1767m;
            }
            if (i10 > 100) {
                return true;
            }
            return false;
        }
        return false;
    }
}
