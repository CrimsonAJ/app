package Q4;

import android.content.Context;
import android.os.Binder;
import android.os.Process;
import b5.BinderC0672w0;
import b5.C0635i0;
import b5.C0665t;
import b5.J1;
import b5.Z;
import com.google.android.gms.internal.measurement.I1;
import java.util.concurrent.Callable;
import o0.RunnableC1664a;

/* loaded from: classes.dex */
public final class b implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6440a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6441b;

    public /* synthetic */ b(int i9, Object obj) {
        this.f6440a = i9;
        this.f6441b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f6440a) {
            case 0:
                return ((Context) this.f6441b).getSharedPreferences("google_sdk_flags", 0);
            case 1:
                return new I1(((C0635i0) this.f6441b).f11146k);
            case 2:
                BinderC0672w0 binderC0672w0 = (BinderC0672w0) this.f6441b;
                binderC0672w0.f11339e.e();
                Z z9 = binderC0672w0.f11339e.f10751h;
                J1.J(z9);
                z9.l0();
                throw new IllegalStateException("Unexpected call on client side");
            default:
                RunnableC1664a runnableC1664a = (RunnableC1664a) this.f6441b;
                runnableC1664a.f21455d.set(true);
                try {
                    Process.setThreadPriority(10);
                    runnableC1664a.f21456e.d();
                    Binder.flushPendingCommands();
                    return null;
                } finally {
                }
        }
    }

    public b(BinderC0672w0 binderC0672w0, C0665t c0665t, String str) {
        this.f6440a = 2;
        this.f6441b = binderC0672w0;
    }
}
