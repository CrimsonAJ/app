package F0;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class M extends d0 {

    /* renamed from: a, reason: collision with root package name */
    public RecyclerView f2046a;

    /* renamed from: b, reason: collision with root package name */
    public final u0 f2047b = new u0(this);

    /* renamed from: c, reason: collision with root package name */
    public J f2048c;

    /* renamed from: d, reason: collision with root package name */
    public J f2049d;

    public static int c(View view, K k5) {
        return ((k5.e(view) / 2) + k5.g(view)) - ((k5.n() / 2) + k5.m());
    }

    public static View d(androidx.recyclerview.widget.a aVar, K k5) {
        int w7 = aVar.w();
        View view = null;
        if (w7 == 0) {
            return null;
        }
        int n7 = (k5.n() / 2) + k5.m();
        int i9 = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < w7; i10++) {
            View v8 = aVar.v(i10);
            int abs = Math.abs(((k5.e(v8) / 2) + k5.g(v8)) - n7);
            if (abs < i9) {
                view = v8;
                i9 = abs;
            }
        }
        return view;
    }

    public final void a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f2046a;
        if (recyclerView2 != recyclerView) {
            u0 u0Var = this.f2047b;
            if (recyclerView2 != null) {
                ArrayList arrayList = recyclerView2.f10252H0;
                if (arrayList != null) {
                    arrayList.remove(u0Var);
                }
                this.f2046a.setOnFlingListener(null);
            }
            this.f2046a = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() == null) {
                    this.f2046a.j(u0Var);
                    this.f2046a.setOnFlingListener(this);
                    new Scroller(this.f2046a.getContext(), new DecelerateInterpolator());
                    h();
                    return;
                }
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
        }
    }

    public final int[] b(androidx.recyclerview.widget.a aVar, View view) {
        int[] iArr = new int[2];
        if (aVar.e()) {
            iArr[0] = c(view, f(aVar));
        } else {
            iArr[0] = 0;
        }
        if (aVar.f()) {
            iArr[1] = c(view, g(aVar));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    public View e(androidx.recyclerview.widget.a aVar) {
        if (aVar.f()) {
            return d(aVar, g(aVar));
        }
        if (aVar.e()) {
            return d(aVar, f(aVar));
        }
        return null;
    }

    public final K f(androidx.recyclerview.widget.a aVar) {
        J j = this.f2049d;
        if (j == null || ((androidx.recyclerview.widget.a) j.f2042b) != aVar) {
            this.f2049d = new J(aVar, 0);
        }
        return this.f2049d;
    }

    public final K g(androidx.recyclerview.widget.a aVar) {
        J j = this.f2048c;
        if (j == null || ((androidx.recyclerview.widget.a) j.f2042b) != aVar) {
            this.f2048c = new J(aVar, 1);
        }
        return this.f2048c;
    }

    public final void h() {
        androidx.recyclerview.widget.a layoutManager;
        View e8;
        RecyclerView recyclerView = this.f2046a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (e8 = e(layoutManager)) != null) {
            int[] b9 = b(layoutManager, e8);
            int i9 = b9[0];
            if (i9 == 0 && b9[1] == 0) {
                return;
            }
            this.f2046a.j0(i9, b9[1], false);
        }
    }
}
