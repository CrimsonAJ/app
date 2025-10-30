package P;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import co.notix.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import o1.C1671f;

/* renamed from: P.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0301b {

    /* renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f5572c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f5573a;

    /* renamed from: b, reason: collision with root package name */
    public final C0300a f5574b;

    public C0301b() {
        this(f5572c);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f5573a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public C1671f b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f5573a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C1671f(16, accessibilityNodeProvider);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f5573a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, Q.g gVar) {
        this.f5573a.onInitializeAccessibilityNodeInfo(view, gVar.f6035a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f5573a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f5573a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i9, Bundle bundle) {
        ClickableSpan[] clickableSpanArr;
        boolean z9;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            clickableSpanArr = null;
            if (i10 >= list.size()) {
                break;
            }
            Q.e eVar = (Q.e) list.get(i10);
            if (eVar.a() == i9) {
                Q.q qVar = eVar.f6033d;
                if (qVar != null) {
                    Class cls = eVar.f6032c;
                    if (cls != null) {
                        try {
                            if (cls.getDeclaredConstructor(null).newInstance(null) == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        } catch (Exception e8) {
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e8);
                        }
                    }
                    z9 = qVar.g(view);
                }
            } else {
                i10++;
            }
        }
        z9 = false;
        if (!z9) {
            z9 = this.f5573a.performAccessibilityAction(view, i9, bundle);
        }
        if (!z9 && i9 == R.id.accessibility_action_clickable_span && bundle != null) {
            int i11 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
            SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
            if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i11)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
                CharSequence text = view.createAccessibilityNodeInfo().getText();
                if (text instanceof Spanned) {
                    clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
                }
                int i12 = 0;
                while (true) {
                    if (clickableSpanArr == null || i12 >= clickableSpanArr.length) {
                        break;
                    }
                    if (clickableSpan.equals(clickableSpanArr[i12])) {
                        clickableSpan.onClick(view);
                        z10 = true;
                        break;
                    }
                    i12++;
                }
            }
            return z10;
        }
        return z9;
    }

    public void h(View view, int i9) {
        this.f5573a.sendAccessibilityEvent(view, i9);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f5573a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C0301b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f5573a = accessibilityDelegate;
        this.f5574b = new C0300a(this);
    }
}
