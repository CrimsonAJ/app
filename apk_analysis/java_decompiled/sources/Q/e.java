package Q;

import P.AbstractC0324z;
import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public static final e f6020e;

    /* renamed from: f, reason: collision with root package name */
    public static final e f6021f;

    /* renamed from: g, reason: collision with root package name */
    public static final e f6022g;

    /* renamed from: h, reason: collision with root package name */
    public static final e f6023h;

    /* renamed from: i, reason: collision with root package name */
    public static final e f6024i;
    public static final e j;

    /* renamed from: k, reason: collision with root package name */
    public static final e f6025k;

    /* renamed from: l, reason: collision with root package name */
    public static final e f6026l;

    /* renamed from: m, reason: collision with root package name */
    public static final e f6027m;

    /* renamed from: n, reason: collision with root package name */
    public static final e f6028n;

    /* renamed from: o, reason: collision with root package name */
    public static final e f6029o;

    /* renamed from: a, reason: collision with root package name */
    public final Object f6030a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6031b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f6032c;

    /* renamed from: d, reason: collision with root package name */
    public final q f6033d;

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction16;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction17;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction18;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction19;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction20;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction21;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction22;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction23;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction24;
        new e(1);
        new e(2);
        new e(4);
        new e(8);
        f6020e = new e(16);
        new e(32);
        new e(64);
        new e(128);
        new e(256, j.class);
        new e(512, j.class);
        new e(1024, k.class);
        new e(2048, k.class);
        f6021f = new e(4096);
        f6022g = new e(8192);
        new e(16384);
        new e(32768);
        new e(65536);
        new e(131072, o.class);
        f6023h = new e(262144);
        f6024i = new e(524288);
        j = new e(1048576);
        new e(2097152, p.class);
        int i9 = Build.VERSION.SDK_INT;
        new e(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        f6025k = new e(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, m.class);
        f6026l = new e(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        new e(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        f6027m = new e(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        new e(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction25 = null;
        if (i9 >= 29) {
            accessibilityAction24 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
            accessibilityAction = accessibilityAction24;
        } else {
            accessibilityAction = null;
        }
        new e(accessibilityAction, R.id.accessibilityActionPageUp, null, null, null);
        if (i9 >= 29) {
            accessibilityAction23 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
            accessibilityAction2 = accessibilityAction23;
        } else {
            accessibilityAction2 = null;
        }
        new e(accessibilityAction2, R.id.accessibilityActionPageDown, null, null, null);
        if (i9 >= 29) {
            accessibilityAction3 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
        } else {
            accessibilityAction3 = null;
        }
        new e(accessibilityAction3, R.id.accessibilityActionPageLeft, null, null, null);
        if (i9 >= 29) {
            accessibilityAction22 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
            accessibilityAction4 = accessibilityAction22;
        } else {
            accessibilityAction4 = null;
        }
        new e(accessibilityAction4, R.id.accessibilityActionPageRight, null, null, null);
        new e(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        if (i9 >= 24) {
            accessibilityAction21 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
            accessibilityAction5 = accessibilityAction21;
        } else {
            accessibilityAction5 = null;
        }
        f6028n = new e(accessibilityAction5, R.id.accessibilityActionSetProgress, null, null, n.class);
        if (i9 >= 26) {
            accessibilityAction6 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
        } else {
            accessibilityAction6 = null;
        }
        new e(accessibilityAction6, R.id.accessibilityActionMoveWindow, null, null, l.class);
        if (i9 >= 28) {
            accessibilityAction20 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
            accessibilityAction7 = accessibilityAction20;
        } else {
            accessibilityAction7 = null;
        }
        new e(accessibilityAction7, R.id.accessibilityActionShowTooltip, null, null, null);
        if (i9 >= 28) {
            accessibilityAction19 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            accessibilityAction8 = accessibilityAction19;
        } else {
            accessibilityAction8 = null;
        }
        new e(accessibilityAction8, R.id.accessibilityActionHideTooltip, null, null, null);
        if (i9 >= 30) {
            accessibilityAction9 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
        } else {
            accessibilityAction9 = null;
        }
        new e(accessibilityAction9, R.id.accessibilityActionPressAndHold, null, null, null);
        if (i9 >= 30) {
            accessibilityAction18 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            accessibilityAction10 = accessibilityAction18;
        } else {
            accessibilityAction10 = null;
        }
        new e(accessibilityAction10, R.id.accessibilityActionImeEnter, null, null, null);
        if (i9 >= 32) {
            accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
        } else {
            accessibilityAction11 = null;
        }
        new e(accessibilityAction11, R.id.ALT, null, null, null);
        if (i9 >= 32) {
            accessibilityAction17 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
            accessibilityAction12 = accessibilityAction17;
        } else {
            accessibilityAction12 = null;
        }
        new e(accessibilityAction12, R.id.CTRL, null, null, null);
        if (i9 >= 32) {
            accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
            accessibilityAction13 = accessibilityAction16;
        } else {
            accessibilityAction13 = null;
        }
        new e(accessibilityAction13, R.id.FUNCTION, null, null, null);
        if (i9 >= 33) {
            accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
            accessibilityAction14 = accessibilityAction15;
        } else {
            accessibilityAction14 = null;
        }
        new e(accessibilityAction14, R.id.KEYCODE_0, null, null, null);
        if (i9 >= 34) {
            accessibilityAction25 = AbstractC0324z.a();
        }
        f6029o = new e(accessibilityAction25, R.id.KEYCODE_3D_MODE, null, null, null);
    }

    public e(int i9) {
        this(null, i9, null, null, null);
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f6030a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof e)) {
            return false;
        }
        Object obj2 = ((e) obj).f6030a;
        Object obj3 = this.f6030a;
        if (obj3 == null) {
            if (obj2 != null) {
                return false;
            }
            return true;
        }
        if (!obj3.equals(obj2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object obj = this.f6030a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String d9 = g.d(this.f6031b);
        if (d9.equals("ACTION_UNKNOWN")) {
            Object obj = this.f6030a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                d9 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(d9);
        return sb.toString();
    }

    public e(int i9, Class cls) {
        this(null, i9, null, null, cls);
    }

    public e(Object obj, int i9, String str, q qVar, Class cls) {
        this.f6031b = i9;
        this.f6033d = qVar;
        if (obj == null) {
            this.f6030a = new AccessibilityNodeInfo.AccessibilityAction(i9, str);
        } else {
            this.f6030a = obj;
        }
        this.f6032c = cls;
    }
}
