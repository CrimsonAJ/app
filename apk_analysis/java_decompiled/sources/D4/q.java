package D4;

import android.os.Handler;
import android.os.Looper;
import b5.C0647m0;
import b5.C0650n0;
import b5.G1;
import b5.S0;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1875a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1876b;

    public /* synthetic */ q(int i9, Object obj) {
        this.f1875a = i9;
        this.f1876b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f1875a) {
            case 0:
                ((T4.d) this.f1876b).post(runnable);
                return;
            case 1:
                ((ExecutorService) this.f1876b).execute(new L4.b(runnable, 1));
                return;
            case 2:
                C0647m0 c0647m0 = ((C0650n0) ((S0) this.f1876b).f1707a).j;
                C0650n0.f(c0647m0);
                c0647m0.v0(runnable);
                return;
            case 3:
                ((T4.d) this.f1876b).post(runnable);
                return;
            default:
                ((Handler) ((G1) this.f1876b).f10718c).post(runnable);
                return;
        }
    }

    public q() {
        this.f1875a = 3;
        Handler handler = new Handler(Looper.getMainLooper());
        Looper.getMainLooper();
        this.f1876b = handler;
    }
}
