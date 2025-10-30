package Q3;

import N3.M;
import k4.N;
import l4.AbstractC1566a;

/* loaded from: classes.dex */
public final class d implements N {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f6347a;

    public void a() {
        long j;
        h hVar = this.f6347a;
        synchronized (AbstractC1566a.f20481i) {
            try {
                if (AbstractC1566a.j) {
                    j = AbstractC1566a.f20482k;
                } else {
                    j = -9223372036854775807L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        hVar.f6371j0 = j;
        hVar.x(true);
    }

    @Override // k4.N
    public void b() {
        h hVar = this.f6347a;
        hVar.f6359A.b();
        M m9 = hVar.f6361C;
        if (m9 == null) {
        } else {
            throw m9;
        }
    }
}
