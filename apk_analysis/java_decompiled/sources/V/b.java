package V;

import P.C0301b;
import P.Q;
import Q.g;
import Q6.f;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o1.C1671f;
import z2.C2235a;

/* loaded from: classes.dex */
public abstract class b extends C0301b {

    /* renamed from: n, reason: collision with root package name */
    public static final Rect f7540n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o, reason: collision with root package name */
    public static final f f7541o = new f(14);

    /* renamed from: p, reason: collision with root package name */
    public static final C2235a f7542p = new C2235a(14);

    /* renamed from: h, reason: collision with root package name */
    public final AccessibilityManager f7547h;

    /* renamed from: i, reason: collision with root package name */
    public final View f7548i;
    public a j;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f7543d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final Rect f7544e = new Rect();

    /* renamed from: f, reason: collision with root package name */
    public final Rect f7545f = new Rect();

    /* renamed from: g, reason: collision with root package name */
    public final int[] f7546g = new int[2];

    /* renamed from: k, reason: collision with root package name */
    public int f7549k = Integer.MIN_VALUE;

    /* renamed from: l, reason: collision with root package name */
    public int f7550l = Integer.MIN_VALUE;

    /* renamed from: m, reason: collision with root package name */
    public int f7551m = Integer.MIN_VALUE;

    public b(View view) {
        this.f7548i = view;
        this.f7547h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        WeakHashMap weakHashMap = Q.f5546a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    @Override // P.C0301b
    public final C1671f b(View view) {
        if (this.j == null) {
            this.j = new a(this);
        }
        return this.j;
    }

    @Override // P.C0301b
    public final void d(View view, g gVar) {
        this.f5573a.onInitializeAccessibilityNodeInfo(view, gVar.f6035a);
        t(gVar);
    }

    public final boolean j(int i9) {
        if (this.f7550l != i9) {
            return false;
        }
        this.f7550l = Integer.MIN_VALUE;
        v(i9, false);
        x(i9, 8);
        return true;
    }

    public final AccessibilityEvent k(int i9, int i10) {
        View view = this.f7548i;
        if (i9 != -1) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(i10);
            g r5 = r(i9);
            obtain.getText().add(r5.g());
            AccessibilityNodeInfo accessibilityNodeInfo = r5.f6035a;
            obtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            obtain.setScrollable(accessibilityNodeInfo.isScrollable());
            obtain.setPassword(accessibilityNodeInfo.isPassword());
            obtain.setEnabled(accessibilityNodeInfo.isEnabled());
            obtain.setChecked(accessibilityNodeInfo.isChecked());
            if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            obtain.setClassName(accessibilityNodeInfo.getClassName());
            obtain.setSource(view, i9);
            obtain.setPackageName(view.getContext().getPackageName());
            return obtain;
        }
        AccessibilityEvent obtain2 = AccessibilityEvent.obtain(i10);
        view.onInitializeAccessibilityEvent(obtain2);
        return obtain2;
    }

    public final g l(int i9) {
        boolean z9;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        g gVar = new g(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        gVar.i("android.view.View");
        Rect rect = f7540n;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        View view = this.f7548i;
        obtain.setParent(view);
        u(i9, gVar);
        if (gVar.g() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f7544e;
        gVar.f(rect2);
        if (!rect2.equals(rect)) {
            int actions = obtain.getActions();
            if ((actions & 64) == 0) {
                if ((actions & 128) == 0) {
                    obtain.setPackageName(view.getContext().getPackageName());
                    gVar.f6036b = i9;
                    obtain.setSource(view, i9);
                    if (this.f7549k == i9) {
                        obtain.setAccessibilityFocused(true);
                        gVar.a(128);
                    } else {
                        obtain.setAccessibilityFocused(false);
                        gVar.a(64);
                    }
                    if (this.f7550l == i9) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        gVar.a(2);
                    } else if (obtain.isFocusable()) {
                        gVar.a(1);
                    }
                    obtain.setFocused(z9);
                    int[] iArr = this.f7546g;
                    view.getLocationOnScreen(iArr);
                    Rect rect3 = this.f7543d;
                    obtain.getBoundsInScreen(rect3);
                    if (rect3.equals(rect)) {
                        gVar.f(rect3);
                        rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                    }
                    Rect rect4 = this.f7545f;
                    if (view.getLocalVisibleRect(rect4)) {
                        rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                        if (rect3.intersect(rect4)) {
                            obtain.setBoundsInScreen(rect3);
                            if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                                Object parent = view.getParent();
                                while (true) {
                                    if (parent instanceof View) {
                                        View view2 = (View) parent;
                                        if (view2.getAlpha() <= 0.0f || view2.getVisibility() != 0) {
                                            break;
                                        }
                                        parent = view2.getParent();
                                    } else if (parent != null) {
                                        obtain.setVisibleToUser(true);
                                    }
                                }
                            }
                        }
                    }
                    return gVar;
                }
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
    }

    public final boolean m(MotionEvent motionEvent) {
        int i9;
        AccessibilityManager accessibilityManager = this.f7547h;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action != 7 && action != 9) {
                if (action == 10 && (i9 = this.f7551m) != Integer.MIN_VALUE) {
                    if (i9 != Integer.MIN_VALUE) {
                        this.f7551m = Integer.MIN_VALUE;
                        x(i9, 256);
                        return true;
                    }
                } else {
                    return false;
                }
            } else {
                int n7 = n(motionEvent.getX(), motionEvent.getY());
                int i10 = this.f7551m;
                if (i10 != n7) {
                    this.f7551m = n7;
                    x(n7, 128);
                    x(i10, 256);
                }
                if (n7 == Integer.MIN_VALUE) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public abstract int n(float f9, float f10);

    public abstract void o(ArrayList arrayList);

    public final void p(int i9) {
        View view;
        ViewParent parent;
        if (i9 != Integer.MIN_VALUE && this.f7547h.isEnabled() && (parent = (view = this.f7548i).getParent()) != null) {
            AccessibilityEvent k5 = k(i9, 2048);
            k5.setContentChangeTypes(0);
            parent.requestSendAccessibilityEvent(view, k5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(int r21, android.graphics.Rect r22) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: V.b.q(int, android.graphics.Rect):boolean");
    }

    public final g r(int i9) {
        if (i9 == -1) {
            View view = this.f7548i;
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(view);
            g gVar = new g(obtain);
            WeakHashMap weakHashMap = Q.f5546a;
            view.onInitializeAccessibilityNodeInfo(obtain);
            ArrayList arrayList = new ArrayList();
            o(arrayList);
            if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
                throw new RuntimeException("Views cannot have both real and virtual children");
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                gVar.f6035a.addChild(view, ((Integer) arrayList.get(i10)).intValue());
            }
            return gVar;
        }
        return l(i9);
    }

    public abstract boolean s(int i9, int i10, Bundle bundle);

    public abstract void u(int i9, g gVar);

    public final boolean w(int i9) {
        int i10;
        View view = this.f7548i;
        if ((view.isFocused() || view.requestFocus()) && (i10 = this.f7550l) != i9) {
            if (i10 != Integer.MIN_VALUE) {
                j(i10);
            }
            if (i9 == Integer.MIN_VALUE) {
                return false;
            }
            this.f7550l = i9;
            v(i9, true);
            x(i9, 8);
            return true;
        }
        return false;
    }

    public final void x(int i9, int i10) {
        View view;
        ViewParent parent;
        if (i9 != Integer.MIN_VALUE && this.f7547h.isEnabled() && (parent = (view = this.f7548i).getParent()) != null) {
            parent.requestSendAccessibilityEvent(view, k(i9, i10));
        }
    }

    public void t(g gVar) {
    }

    public void v(int i9, boolean z9) {
    }
}
