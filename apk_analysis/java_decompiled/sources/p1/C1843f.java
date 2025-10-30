package p1;

import com.google.android.gms.internal.measurement.Y1;

/* renamed from: p1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1843f extends Y1 {
    @Override // com.google.android.gms.internal.measurement.Y1
    public final boolean e(AbstractC1845h abstractC1845h, C1840c c1840c, C1840c c1840c2) {
        synchronized (abstractC1845h) {
            try {
                if (abstractC1845h.f22132b == c1840c) {
                    abstractC1845h.f22132b = c1840c2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.Y1
    public final boolean f(AbstractC1845h abstractC1845h, Object obj, Object obj2) {
        synchronized (abstractC1845h) {
            try {
                if (abstractC1845h.f22131a == obj) {
                    abstractC1845h.f22131a = obj2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.Y1
    public final boolean g(AbstractC1845h abstractC1845h, C1844g c1844g, C1844g c1844g2) {
        synchronized (abstractC1845h) {
            try {
                if (abstractC1845h.f22133c == c1844g) {
                    abstractC1845h.f22133c = c1844g2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.Y1
    public final void y(C1844g c1844g, C1844g c1844g2) {
        c1844g.f22126b = c1844g2;
    }

    @Override // com.google.android.gms.internal.measurement.Y1
    public final void z(C1844g c1844g, Thread thread) {
        c1844g.f22125a = thread;
    }
}
