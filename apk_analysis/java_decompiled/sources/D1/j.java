package D1;

import A7.n;
import O7.l;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class j implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f1779a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver f1780b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f1781c;

    public j(f fVar, ViewTreeObserver viewTreeObserver, k kVar) {
        this.f1779a = fVar;
        this.f1780b = viewTreeObserver;
        this.f1781c = kVar;
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        k kVar = this.f1781c;
        ViewTreeObserver viewTreeObserver = this.f1780b;
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(kVar);
        } else {
            this.f1779a.f1772a.getViewTreeObserver().removeOnPreDrawListener(kVar);
        }
        return n.f558a;
    }
}
