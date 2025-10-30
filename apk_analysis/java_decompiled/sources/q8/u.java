package q8;

import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.net.SocketTimeoutException;
import x8.C2184d;

/* loaded from: classes.dex */
public final class u extends C2184d {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f22548m;

    public u(v vVar) {
        this.f22548m = vVar;
    }

    @Override // x8.C2184d
    public final void j() {
        this.f22548m.e(9);
        n nVar = this.f22548m.f22550b;
        synchronized (nVar) {
            long j = nVar.f22508n;
            long j4 = nVar.f22507m;
            if (j < j4) {
                return;
            }
            nVar.f22507m = j4 + 1;
            nVar.f22509o = System.nanoTime() + 1000000000;
            nVar.f22503h.c(new l8.f(AbstractC0953k1.q(new StringBuilder(), nVar.f22498c, " ping"), nVar, 3), 0L);
        }
    }

    public final void k() {
        if (!i()) {
        } else {
            throw new SocketTimeoutException("timeout");
        }
    }
}
