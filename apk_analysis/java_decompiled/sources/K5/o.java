package K5;

import P.F;
import P.Q;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import java.util.WeakHashMap;
import o.ViewOnKeyListenerC1658C;

/* loaded from: classes.dex */
public final class o implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4351a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4352b;

    public /* synthetic */ o(int i9, Object obj) {
        this.f4351a = i9;
        this.f4352b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager;
        Object obj = this.f4352b;
        switch (this.f4351a) {
            case 0:
                q qVar = (q) obj;
                if (qVar.f4376u != null && (accessibilityManager = qVar.f4375t) != null) {
                    WeakHashMap weakHashMap = Q.f5546a;
                    if (qVar.isAttachedToWindow()) {
                        accessibilityManager.addTouchExplorationStateChangeListener(new Q.b(qVar.f4376u));
                        return;
                    }
                    return;
                }
                return;
            case 1:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap2 = Q.f5546a;
                F.c(view2);
                return;
            case 2:
            default:
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.f4351a) {
            case 0:
                q qVar = (q) this.f4352b;
                C3.v vVar = qVar.f4376u;
                if (vVar != null && (accessibilityManager = qVar.f4375t) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(new Q.b(vVar));
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                o.f fVar = (o.f) this.f4352b;
                ViewTreeObserver viewTreeObserver = fVar.f21357x;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        fVar.f21357x = view.getViewTreeObserver();
                    }
                    fVar.f21357x.removeGlobalOnLayoutListener(fVar.f21343i);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            default:
                ViewOnKeyListenerC1658C viewOnKeyListenerC1658C = (ViewOnKeyListenerC1658C) this.f4352b;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC1658C.f21307o;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC1658C.f21307o = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC1658C.f21307o.removeGlobalOnLayoutListener(viewOnKeyListenerC1658C.f21302i);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }
}
