package P;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.widget.AppCompatEditText;
import co.notix.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o1.C1671f;

/* loaded from: classes.dex */
public abstract class Q {

    /* renamed from: a, reason: collision with root package name */
    public static WeakHashMap f5546a = null;

    /* renamed from: b, reason: collision with root package name */
    public static Field f5547b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f5548c = false;

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f5549d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* renamed from: e, reason: collision with root package name */
    public static final C f5550e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public static final E f5551f = new E();

    public static X a(View view) {
        if (f5546a == null) {
            f5546a = new WeakHashMap();
        }
        X x5 = (X) f5546a.get(view);
        if (x5 == null) {
            X x9 = new X(view);
            f5546a.put(view, x9);
            return x9;
        }
        return x5;
    }

    public static void b(View view, u0 u0Var) {
        WindowInsets a5;
        int i9 = Build.VERSION.SDK_INT;
        WindowInsets f9 = u0Var.f();
        if (f9 != null) {
            if (i9 >= 30) {
                a5 = N.a(view, f9);
            } else {
                a5 = F.a(view, f9);
            }
            if (!a5.equals(f9)) {
                u0.g(view, a5);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [P.P, java.lang.Object] */
    public static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList = P.f5542d;
            P p9 = (P) view.getTag(R.id.tag_unhandled_key_event_manager);
            P p10 = p9;
            if (p9 == null) {
                ?? obj = new Object();
                obj.f5543a = null;
                obj.f5544b = null;
                obj.f5545c = null;
                view.setTag(R.id.tag_unhandled_key_event_manager, obj);
                p10 = obj;
            }
            if (keyEvent.getAction() == 0) {
                WeakHashMap weakHashMap = p10.f5543a;
                if (weakHashMap != null) {
                    weakHashMap.clear();
                }
                ArrayList arrayList2 = P.f5542d;
                if (!arrayList2.isEmpty()) {
                    synchronized (arrayList2) {
                        try {
                            if (p10.f5543a == null) {
                                p10.f5543a = new WeakHashMap();
                            }
                            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                                ArrayList arrayList3 = P.f5542d;
                                View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                                if (view2 == null) {
                                    arrayList3.remove(size);
                                } else {
                                    p10.f5543a.put(view2, Boolean.TRUE);
                                    for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        p10.f5543a.put((View) parent, Boolean.TRUE);
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                }
            }
            View a5 = p10.a(view);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (a5 != null && !KeyEvent.isModifierKey(keyCode)) {
                    if (p10.f5544b == null) {
                        p10.f5544b = new SparseArray();
                    }
                    p10.f5544b.put(keyCode, new WeakReference(a5));
                }
            }
            if (a5 != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static View.AccessibilityDelegate d(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return M.a(view);
        }
        if (!f5548c) {
            if (f5547b == null) {
                try {
                    Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                    f5547b = declaredField;
                    declaredField.setAccessible(true);
                } catch (Throwable unused) {
                    f5548c = true;
                    return null;
                }
            }
            try {
                Object obj = f5547b.get(view);
                if (obj instanceof View.AccessibilityDelegate) {
                    return (View.AccessibilityDelegate) obj;
                }
                return null;
            } catch (Throwable unused2) {
                f5548c = true;
                return null;
            }
        }
        return null;
    }

    public static CharSequence e(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = L.a(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static ArrayList f(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            view.setTag(R.id.tag_accessibility_actions, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public static String[] g(AppCompatEditText appCompatEditText) {
        if (Build.VERSION.SDK_INT >= 31) {
            return O.a(appCompatEditText);
        }
        return (String[]) appCompatEditText.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void h(View view, int i9) {
        boolean z9;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            if (e(view) != null && view.isShown() && view.getWindowVisibility() == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            int i10 = 32;
            if (view.getAccessibilityLiveRegion() == 0 && !z9) {
                if (i9 == 32) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    view.onInitializeAccessibilityEvent(obtain);
                    obtain.setEventType(32);
                    obtain.setContentChangeTypes(i9);
                    obtain.setSource(view);
                    view.onPopulateAccessibilityEvent(obtain);
                    obtain.getText().add(e(view));
                    accessibilityManager.sendAccessibilityEvent(obtain);
                    return;
                }
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i9);
                        return;
                    } catch (AbstractMethodError e8) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e8);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
            if (!z9) {
                i10 = 2048;
            }
            obtain2.setEventType(i10);
            obtain2.setContentChangeTypes(i9);
            if (z9) {
                obtain2.getText().add(e(view));
                if (view.getImportantForAccessibility() == 0) {
                    view.setImportantForAccessibility(1);
                }
            }
            view.sendAccessibilityEventUnchecked(obtain2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C0305f i(View view, C0305f c0305f) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c0305f + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return O.b(view, c0305f);
        }
        S.j jVar = (S.j) view.getTag(R.id.tag_on_receive_content_listener);
        InterfaceC0315p interfaceC0315p = f5550e;
        if (jVar != null) {
            C0305f a5 = S.j.a(view, c0305f);
            if (a5 == null) {
                return null;
            }
            if (view instanceof InterfaceC0315p) {
                interfaceC0315p = (InterfaceC0315p) view;
            }
            return interfaceC0315p.a(a5);
        }
        if (view instanceof InterfaceC0315p) {
            interfaceC0315p = (InterfaceC0315p) view;
        }
        return interfaceC0315p.a(c0305f);
    }

    public static void j(View view, int i9) {
        ArrayList f9 = f(view);
        for (int i10 = 0; i10 < f9.size(); i10++) {
            if (((Q.e) f9.get(i10)).a() == i9) {
                f9.remove(i10);
                return;
            }
        }
    }

    public static void k(View view, Q.e eVar, Q.q qVar) {
        C0301b c0301b;
        Q.e eVar2 = new Q.e(null, eVar.f6031b, null, qVar, eVar.f6032c);
        View.AccessibilityDelegate d9 = d(view);
        if (d9 == null) {
            c0301b = null;
        } else if (d9 instanceof C0300a) {
            c0301b = ((C0300a) d9).f5569a;
        } else {
            c0301b = new C0301b(d9);
        }
        if (c0301b == null) {
            c0301b = new C0301b();
        }
        m(view, c0301b);
        j(view, eVar2.a());
        f(view).add(eVar2);
        h(view, 0);
    }

    public static void l(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i9) {
        if (Build.VERSION.SDK_INT >= 29) {
            M.b(view, context, iArr, attributeSet, typedArray, i9, 0);
        }
    }

    public static void m(View view, C0301b c0301b) {
        C0300a c0300a;
        if (c0301b == null && (d(view) instanceof C0300a)) {
            c0301b = new C0301b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        if (c0301b == null) {
            c0300a = null;
        } else {
            c0300a = c0301b.f5574b;
        }
        view.setAccessibilityDelegate(c0300a);
    }

    public static void n(View view, CharSequence charSequence) {
        boolean z9;
        new D(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).f(view, charSequence);
        E e8 = f5551f;
        if (charSequence != null) {
            WeakHashMap weakHashMap = e8.f5538a;
            if (view.isShown() && view.getWindowVisibility() == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            weakHashMap.put(view, Boolean.valueOf(z9));
            view.addOnAttachStateChangeListener(e8);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(e8);
                return;
            }
            return;
        }
        e8.f5538a.remove(view);
        view.removeOnAttachStateChangeListener(e8);
        view.getViewTreeObserver().removeOnGlobalLayoutListener(e8);
    }

    public static void o(ViewGroup viewGroup, C1671f c1671f) {
        PointerIcon pointerIcon;
        if (Build.VERSION.SDK_INT >= 24) {
            if (c1671f != null) {
                pointerIcon = (PointerIcon) c1671f.f21473b;
            } else {
                pointerIcon = null;
            }
            J.a(viewGroup, C3.d.j(pointerIcon));
        }
    }
}
