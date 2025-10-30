package p;

import androidx.appcompat.widget.Toolbar;

/* renamed from: p.R0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1766R0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21903a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Toolbar f21904b;

    public /* synthetic */ RunnableC1766R0(Toolbar toolbar, int i9) {
        this.f21903a = i9;
        this.f21904b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o.n nVar;
        switch (this.f21903a) {
            case 0:
                C1770T0 c1770t0 = this.f21904b.f9505m0;
                if (c1770t0 == null) {
                    nVar = null;
                } else {
                    nVar = c1770t0.f21918b;
                }
                if (nVar != null) {
                    nVar.collapseActionView();
                    return;
                }
                return;
            default:
                this.f21904b.n();
                return;
        }
    }
}
