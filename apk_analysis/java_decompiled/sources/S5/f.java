package S5;

import com.google.android.gms.internal.measurement.AbstractC1002u1;

/* loaded from: classes.dex */
public final class f extends AbstractC1002u1 {
    @Override // com.google.android.gms.internal.measurement.AbstractC1002u1
    public final d C(n nVar) {
        d dVar;
        d dVar2 = d.f6940d;
        synchronized (nVar) {
            dVar = nVar.f6961b;
            if (dVar != dVar2) {
                nVar.f6961b = dVar2;
            }
        }
        return dVar;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1002u1
    public final m D(n nVar) {
        m mVar;
        m mVar2 = m.f6953c;
        synchronized (nVar) {
            mVar = nVar.f6962c;
            if (mVar != mVar2) {
                nVar.f6962c = mVar2;
            }
        }
        return mVar;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1002u1
    public final void S(m mVar, m mVar2) {
        mVar.f6955b = mVar2;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1002u1
    public final void U(m mVar, Thread thread) {
        mVar.f6954a = thread;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1002u1
    public final boolean b(n nVar, d dVar, d dVar2) {
        synchronized (nVar) {
            try {
                if (nVar.f6961b == dVar) {
                    nVar.f6961b = dVar2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1002u1
    public final boolean d(n nVar, Object obj, Object obj2) {
        synchronized (nVar) {
            try {
                if (nVar.f6960a == obj) {
                    nVar.f6960a = obj2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1002u1
    public final boolean f(n nVar, m mVar, m mVar2) {
        synchronized (nVar) {
            try {
                if (nVar.f6962c == mVar) {
                    nVar.f6962c = mVar2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
