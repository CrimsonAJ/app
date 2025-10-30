package D1;

import Y7.C0464h;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class k implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1782a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f1783b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver f1784c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0464h f1785d;

    public k(f fVar, ViewTreeObserver viewTreeObserver, C0464h c0464h) {
        this.f1783b = fVar;
        this.f1784c = viewTreeObserver;
        this.f1785d = c0464h;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        f fVar = this.f1783b;
        h b9 = A0.a.b(fVar);
        if (b9 != null) {
            ViewTreeObserver viewTreeObserver = this.f1784c;
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            } else {
                fVar.f1772a.getViewTreeObserver().removeOnPreDrawListener(this);
            }
            if (!this.f1782a) {
                this.f1782a = true;
                this.f1785d.resumeWith(b9);
            }
        }
        return true;
    }
}
