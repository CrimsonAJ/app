package M;

import android.os.Process;

/* loaded from: classes.dex */
public final class j extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final int f4674a;

    public j(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f4674a = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f4674a);
        super.run();
    }
}
