package V;

import P.Q;
import Q.g;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.WeakHashMap;
import o1.C1671f;

/* loaded from: classes.dex */
public final class a extends C1671f {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f7539c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(16);
        this.f7539c = bVar;
    }

    @Override // o1.C1671f
    public final g C(int i9) {
        int i10;
        b bVar = this.f7539c;
        if (i9 == 2) {
            i10 = bVar.f7549k;
        } else {
            i10 = bVar.f7550l;
        }
        if (i10 == Integer.MIN_VALUE) {
            return null;
        }
        return r(i10);
    }

    @Override // o1.C1671f
    public final boolean H(int i9, int i10, Bundle bundle) {
        int i11;
        b bVar = this.f7539c;
        View view = bVar.f7548i;
        if (i9 != -1) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 64) {
                        if (i10 != 128) {
                            return bVar.s(i9, i10, bundle);
                        }
                        if (bVar.f7549k != i9) {
                            return false;
                        }
                        bVar.f7549k = Integer.MIN_VALUE;
                        view.invalidate();
                        bVar.x(i9, 65536);
                        return true;
                    }
                    AccessibilityManager accessibilityManager = bVar.f7547h;
                    if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i11 = bVar.f7549k) == i9) {
                        return false;
                    }
                    if (i11 != Integer.MIN_VALUE) {
                        bVar.f7549k = Integer.MIN_VALUE;
                        bVar.f7548i.invalidate();
                        bVar.x(i11, 65536);
                    }
                    bVar.f7549k = i9;
                    view.invalidate();
                    bVar.x(i9, 32768);
                    return true;
                }
                return bVar.j(i9);
            }
            return bVar.w(i9);
        }
        WeakHashMap weakHashMap = Q.f5546a;
        return view.performAccessibilityAction(i10, bundle);
    }

    @Override // o1.C1671f
    public final g r(int i9) {
        return new g(AccessibilityNodeInfo.obtain(this.f7539c.r(i9).f6035a));
    }
}
