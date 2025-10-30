package D4;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.util.Map;

/* loaded from: classes.dex */
public final class F extends I {

    /* renamed from: b, reason: collision with root package name */
    public final s4.g f1817b;

    public F(s4.g gVar) {
        super(1);
        this.f1817b = gVar;
    }

    @Override // D4.I
    public final void a(Status status) {
        try {
            this.f1817b.O(status);
        } catch (IllegalStateException e8) {
            Log.w("ApiCallRunner", "Exception reporting failure", e8);
        }
    }

    @Override // D4.I
    public final void b(RuntimeException runtimeException) {
        try {
            this.f1817b.O(new Status(10, AbstractC0953k1.o(runtimeException.getClass().getSimpleName(), ": ", runtimeException.getLocalizedMessage()), null, null));
        } catch (IllegalStateException e8) {
            Log.w("ApiCallRunner", "Exception reporting failure", e8);
        }
    }

    @Override // D4.I
    public final void c(t tVar) {
        try {
            s4.g gVar = this.f1817b;
            C4.c cVar = tVar.f1882f;
            gVar.getClass();
            try {
                gVar.N(cVar);
            } catch (DeadObjectException e8) {
                gVar.O(new Status(8, e8.getLocalizedMessage(), null, null));
                throw e8;
            } catch (RemoteException e9) {
                gVar.O(new Status(8, e9.getLocalizedMessage(), null, null));
            }
        } catch (RuntimeException e10) {
            b(e10);
        }
    }

    @Override // D4.I
    public final void d(A1.g gVar, boolean z9) {
        Boolean valueOf = Boolean.valueOf(z9);
        Map map = (Map) gVar.f18b;
        s4.g gVar2 = this.f1817b;
        map.put(gVar2, valueOf);
        gVar2.D(new o(gVar, gVar2));
    }
}
