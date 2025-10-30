package L4;

import android.os.Process;
import com.google.android.gms.internal.measurement.AbstractC1002u1;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4642a;

    /* renamed from: b, reason: collision with root package name */
    public final Runnable f4643b;

    public /* synthetic */ b(Runnable runnable, int i9) {
        this.f4642a = i9;
        this.f4643b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4642a) {
            case 0:
                Process.setThreadPriority(0);
                this.f4643b.run();
                return;
            case 1:
                try {
                    this.f4643b.run();
                    return;
                } catch (Exception e8) {
                    AbstractC1002u1.z("Executor", "Background execution failure.", e8);
                    return;
                }
            default:
                this.f4643b.run();
                return;
        }
    }

    public String toString() {
        switch (this.f4642a) {
            case 2:
                return this.f4643b.toString();
            default:
                return super.toString();
        }
    }
}
