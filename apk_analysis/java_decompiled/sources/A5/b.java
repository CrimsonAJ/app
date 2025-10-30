package A5;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f385a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f386b;

    public /* synthetic */ b(d dVar, int i9) {
        this.f385a = i9;
        this.f386b = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f385a) {
            case 0:
                d dVar = this.f386b;
                if (dVar.f393d > 0) {
                    SystemClock.uptimeMillis();
                }
                dVar.setVisibility(0);
                return;
            default:
                d dVar2 = this.f386b;
                ((n) dVar2.getCurrentDrawable()).c(false, false, true);
                if ((dVar2.getProgressDrawable() == null || !dVar2.getProgressDrawable().isVisible()) && (dVar2.getIndeterminateDrawable() == null || !dVar2.getIndeterminateDrawable().isVisible())) {
                    dVar2.setVisibility(4);
                }
                dVar2.getClass();
                return;
        }
    }
}
