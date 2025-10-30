package d;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.internal.measurement.C1;
import i0.AbstractActivityC1369y;
import java.util.concurrent.Executor;

/* renamed from: d.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC1070k implements Executor, ViewTreeObserver.OnDrawListener, Runnable {

    /* renamed from: b, reason: collision with root package name */
    public Runnable f16583b;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC1369y f16585d;

    /* renamed from: a, reason: collision with root package name */
    public final long f16582a = SystemClock.uptimeMillis() + 10000;

    /* renamed from: c, reason: collision with root package name */
    public boolean f16584c = false;

    public ExecutorC1070k(AbstractActivityC1369y abstractActivityC1369y) {
        this.f16585d = abstractActivityC1369y;
    }

    public final void a(View view) {
        if (!this.f16584c) {
            this.f16584c = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f16583b = runnable;
        View decorView = this.f16585d.getWindow().getDecorView();
        if (this.f16584c) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                decorView.invalidate();
                return;
            } else {
                decorView.postInvalidate();
                return;
            }
        }
        decorView.postOnAnimation(new A6.s(18, this));
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z9;
        Runnable runnable = this.f16583b;
        if (runnable != null) {
            runnable.run();
            this.f16583b = null;
            C1 c12 = this.f16585d.j;
            synchronized (c12.f15187b) {
                z9 = c12.f15186a;
            }
            if (z9) {
                this.f16584c = false;
                this.f16585d.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        if (SystemClock.uptimeMillis() > this.f16582a) {
            this.f16584c = false;
            this.f16585d.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16585d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
