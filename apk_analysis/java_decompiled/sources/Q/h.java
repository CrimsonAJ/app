package Q;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;
import o1.C1671f;

/* loaded from: classes.dex */
public class h extends AccessibilityNodeProvider {

    /* renamed from: a, reason: collision with root package name */
    public final C1671f f6037a;

    public h(C1671f c1671f) {
        this.f6037a = c1671f;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i9) {
        g r5 = this.f6037a.r(i9);
        if (r5 == null) {
            return null;
        }
        return r5.f6035a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i9) {
        this.f6037a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i9) {
        g C8 = this.f6037a.C(i9);
        if (C8 == null) {
            return null;
        }
        return C8.f6035a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i9, int i10, Bundle bundle) {
        return this.f6037a.H(i9, i10, bundle);
    }
}
