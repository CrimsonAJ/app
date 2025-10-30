package F0;

import P.C0301b;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import o1.C1671f;

/* loaded from: classes.dex */
public final class s0 extends C0301b {

    /* renamed from: d, reason: collision with root package name */
    public final t0 f2232d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakHashMap f2233e = new WeakHashMap();

    public s0(t0 t0Var) {
        this.f2232d = t0Var;
    }

    @Override // P.C0301b
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        C0301b c0301b = (C0301b) this.f2233e.get(view);
        if (c0301b != null) {
            return c0301b.a(view, accessibilityEvent);
        }
        return this.f5573a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // P.C0301b
    public final C1671f b(View view) {
        C0301b c0301b = (C0301b) this.f2233e.get(view);
        if (c0301b != null) {
            return c0301b.b(view);
        }
        return super.b(view);
    }

    @Override // P.C0301b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        C0301b c0301b = (C0301b) this.f2233e.get(view);
        if (c0301b != null) {
            c0301b.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // P.C0301b
    public final void d(View view, Q.g gVar) {
        t0 t0Var = this.f2232d;
        boolean P8 = t0Var.f2239d.P();
        View.AccessibilityDelegate accessibilityDelegate = this.f5573a;
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f6035a;
        if (!P8) {
            RecyclerView recyclerView = t0Var.f2239d;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().c0(view, gVar);
                C0301b c0301b = (C0301b) this.f2233e.get(view);
                if (c0301b != null) {
                    c0301b.d(view, gVar);
                    return;
                } else {
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    return;
                }
            }
        }
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
    }

    @Override // P.C0301b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        C0301b c0301b = (C0301b) this.f2233e.get(view);
        if (c0301b != null) {
            c0301b.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // P.C0301b
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C0301b c0301b = (C0301b) this.f2233e.get(viewGroup);
        if (c0301b != null) {
            return c0301b.f(viewGroup, view, accessibilityEvent);
        }
        return this.f5573a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // P.C0301b
    public final boolean g(View view, int i9, Bundle bundle) {
        t0 t0Var = this.f2232d;
        if (!t0Var.f2239d.P()) {
            RecyclerView recyclerView = t0Var.f2239d;
            if (recyclerView.getLayoutManager() != null) {
                C0301b c0301b = (C0301b) this.f2233e.get(view);
                if (c0301b != null) {
                    if (c0301b.g(view, i9, bundle)) {
                        return true;
                    }
                } else if (super.g(view, i9, bundle)) {
                    return true;
                }
                h0 h0Var = recyclerView.getLayoutManager().f10338b.f10273c;
                return false;
            }
        }
        return super.g(view, i9, bundle);
    }

    @Override // P.C0301b
    public final void h(View view, int i9) {
        C0301b c0301b = (C0301b) this.f2233e.get(view);
        if (c0301b != null) {
            c0301b.h(view, i9);
        } else {
            super.h(view, i9);
        }
    }

    @Override // P.C0301b
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        C0301b c0301b = (C0301b) this.f2233e.get(view);
        if (c0301b != null) {
            c0301b.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
