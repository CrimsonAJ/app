package P;

import android.graphics.Insets;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class c0 extends WindowInsetsAnimation$Callback {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.firebase.messaging.n f5579a;

    /* renamed from: b, reason: collision with root package name */
    public List f5580b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f5581c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f5582d;

    public c0(com.google.firebase.messaging.n nVar) {
        super(0);
        this.f5582d = new HashMap();
        this.f5579a = nVar;
    }

    public final f0 a(WindowInsetsAnimation windowInsetsAnimation) {
        f0 f0Var = (f0) this.f5582d.get(windowInsetsAnimation);
        if (f0Var == null) {
            f0Var = new f0(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                f0Var.f5595a = new d0(windowInsetsAnimation);
            }
            this.f5582d.put(windowInsetsAnimation, f0Var);
        }
        return f0Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        com.google.firebase.messaging.n nVar = this.f5579a;
        a(windowInsetsAnimation);
        ((View) nVar.f16491d).setTranslationY(0.0f);
        this.f5582d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        com.google.firebase.messaging.n nVar = this.f5579a;
        a(windowInsetsAnimation);
        View view = (View) nVar.f16491d;
        int[] iArr = (int[]) nVar.f16492e;
        view.getLocationOnScreen(iArr);
        nVar.f16488a = iArr[1];
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        float fraction;
        ArrayList arrayList = this.f5581c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f5581c = arrayList2;
            this.f5580b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation j = C4.h.j(list.get(size));
            f0 a5 = a(j);
            fraction = j.getFraction();
            a5.f5595a.d(fraction);
            this.f5581c.add(a5);
        }
        com.google.firebase.messaging.n nVar = this.f5579a;
        u0 g9 = u0.g(null, windowInsets);
        nVar.f(g9, this.f5580b);
        return g9.f();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        com.google.firebase.messaging.n nVar = this.f5579a;
        a(windowInsetsAnimation);
        lowerBound = bounds.getLowerBound();
        H.c c3 = H.c.c(lowerBound);
        upperBound = bounds.getUpperBound();
        H.c c9 = H.c.c(upperBound);
        View view = (View) nVar.f16491d;
        int[] iArr = (int[]) nVar.f16492e;
        view.getLocationOnScreen(iArr);
        int i9 = nVar.f16488a - iArr[1];
        nVar.f16489b = i9;
        view.setTranslationY(i9);
        C4.h.m();
        return C4.h.h(c3.d(), c9.d());
    }
}
