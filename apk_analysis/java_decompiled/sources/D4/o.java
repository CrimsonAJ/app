package D4;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import f5.C1177i;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1865a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BasePendingResult f1866b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1867c;

    public o(A1.g gVar, BasePendingResult basePendingResult) {
        this.f1867c = gVar;
        this.f1866b = basePendingResult;
    }

    public final void a(Status status) {
        switch (this.f1865a) {
            case 0:
                ((Map) ((A1.g) this.f1867c).f18b).remove(this.f1866b);
                return;
            default:
                if (status.f()) {
                    BasePendingResult basePendingResult = this.f1866b;
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    F4.y.j("Result has already been consumed.", !basePendingResult.f14673s);
                    try {
                        if (!basePendingResult.f14667m.await(0L, timeUnit)) {
                            basePendingResult.G(Status.f14658h);
                        }
                    } catch (InterruptedException unused) {
                        basePendingResult.G(Status.f14656f);
                    }
                    F4.y.j("Result is not ready.", basePendingResult.I());
                    basePendingResult.L();
                    ((C1177i) this.f1867c).b(null);
                    return;
                }
                ((C1177i) this.f1867c).a(F4.y.l(status));
                return;
        }
    }

    public o(BasePendingResult basePendingResult, C1177i c1177i, F5.e eVar) {
        this.f1866b = basePendingResult;
        this.f1867c = c1177i;
    }
}
