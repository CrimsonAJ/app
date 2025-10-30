package Q;

import C3.v;
import P.Q;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class b implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final v f6019a;

    public b(v vVar) {
        this.f6019a = vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f6019a.equals(((b) obj).f6019a);
    }

    public final int hashCode() {
        return this.f6019a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z9) {
        int i9;
        K5.l lVar = (K5.l) this.f6019a.f1562b;
        AutoCompleteTextView autoCompleteTextView = lVar.f4339h;
        if (autoCompleteTextView != null && !M4.a.t(autoCompleteTextView)) {
            if (z9) {
                i9 = 2;
            } else {
                i9 = 1;
            }
            WeakHashMap weakHashMap = Q.f5546a;
            lVar.f4381d.setImportantForAccessibility(i9);
        }
    }
}
