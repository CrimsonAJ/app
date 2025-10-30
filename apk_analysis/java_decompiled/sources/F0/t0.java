package F0;

import P.C0301b;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class t0 extends C0301b {

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f2239d;

    /* renamed from: e, reason: collision with root package name */
    public final s0 f2240e;

    public t0(RecyclerView recyclerView) {
        this.f2239d = recyclerView;
        s0 s0Var = this.f2240e;
        if (s0Var != null) {
            this.f2240e = s0Var;
        } else {
            this.f2240e = new s0(this);
        }
    }

    @Override // P.C0301b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !this.f2239d.P()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().Z(accessibilityEvent);
            }
        }
    }

    @Override // P.C0301b
    public final void d(View view, Q.g gVar) {
        this.f5573a.onInitializeAccessibilityNodeInfo(view, gVar.f6035a);
        RecyclerView recyclerView = this.f2239d;
        if (!recyclerView.P() && recyclerView.getLayoutManager() != null) {
            androidx.recyclerview.widget.a layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.f10338b;
            layoutManager.a0(recyclerView2.f10273c, recyclerView2.f10250F0, gVar);
        }
    }

    @Override // P.C0301b
    public final boolean g(View view, int i9, Bundle bundle) {
        if (super.g(view, i9, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f2239d;
        if (!recyclerView.P() && recyclerView.getLayoutManager() != null) {
            return recyclerView.getLayoutManager().o0(i9, bundle);
        }
        return false;
    }
}
