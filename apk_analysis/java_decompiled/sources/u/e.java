package u;

import com.google.android.gms.internal.measurement.AbstractC1002u1;

/* loaded from: classes.dex */
public final class e extends AbstractC1002u1 {
    @Override // com.google.android.gms.internal.measurement.AbstractC1002u1
    public final void T(f fVar, f fVar2) {
        fVar.f23351b = fVar2;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1002u1
    public final void V(f fVar, Thread thread) {
        fVar.f23350a = thread;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1002u1
    public final boolean c(g gVar, c cVar, c cVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f23357b == cVar) {
                    gVar.f23357b = cVar2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1002u1
    public final boolean e(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f23356a == obj) {
                    gVar.f23356a = obj2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1002u1
    public final boolean g(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f23358c == fVar) {
                    gVar.f23358c = fVar2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
