package F0;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* renamed from: F0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0105i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2124a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2125b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0111o f2126c;

    public /* synthetic */ RunnableC0105i(C0111o c0111o, ArrayList arrayList, int i9) {
        this.f2124a = i9;
        this.f2126c = c0111o;
        this.f2125b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        switch (this.f2124a) {
            case 0:
                ArrayList arrayList = this.f2125b;
                int size = arrayList.size();
                int i9 = 0;
                while (true) {
                    C0111o c0111o = this.f2126c;
                    if (i9 < size) {
                        Object obj = arrayList.get(i9);
                        i9++;
                        C0110n c0110n = (C0110n) obj;
                        r0 r0Var = c0110n.f2159a;
                        c0111o.getClass();
                        View view2 = r0Var.f2210a;
                        int i10 = c0110n.f2162d - c0110n.f2160b;
                        int i11 = c0110n.f2163e - c0110n.f2161c;
                        if (i10 != 0) {
                            view2.animate().translationX(0.0f);
                        }
                        if (i11 != 0) {
                            view2.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator animate = view2.animate();
                        c0111o.f2186p.add(r0Var);
                        animate.setDuration(c0111o.f2064e).setListener(new C0107k(c0111o, r0Var, i10, view2, i11, animate)).start();
                    } else {
                        arrayList.clear();
                        c0111o.f2183m.remove(arrayList);
                        return;
                    }
                }
            case 1:
                ArrayList arrayList2 = this.f2125b;
                int size2 = arrayList2.size();
                int i12 = 0;
                while (true) {
                    C0111o c0111o2 = this.f2126c;
                    if (i12 < size2) {
                        Object obj2 = arrayList2.get(i12);
                        i12++;
                        C0109m c0109m = (C0109m) obj2;
                        c0111o2.getClass();
                        r0 r0Var2 = c0109m.f2153a;
                        View view3 = null;
                        if (r0Var2 == null) {
                            view = null;
                        } else {
                            view = r0Var2.f2210a;
                        }
                        r0 r0Var3 = c0109m.f2154b;
                        if (r0Var3 != null) {
                            view3 = r0Var3.f2210a;
                        }
                        View view4 = view3;
                        ArrayList arrayList3 = c0111o2.f2188r;
                        long j = c0111o2.f2065f;
                        if (view != null) {
                            ViewPropertyAnimator duration = view.animate().setDuration(j);
                            arrayList3.add(c0109m.f2153a);
                            duration.translationX(c0109m.f2157e - c0109m.f2155c);
                            duration.translationY(c0109m.f2158f - c0109m.f2156d);
                            duration.alpha(0.0f).setListener(new C0108l(c0111o2, c0109m, duration, view, 0)).start();
                        }
                        if (view4 != null) {
                            ViewPropertyAnimator animate2 = view4.animate();
                            arrayList3.add(c0109m.f2154b);
                            animate2.translationX(0.0f).translationY(0.0f).setDuration(j).alpha(1.0f).setListener(new C0108l(c0111o2, c0109m, animate2, view4, 1)).start();
                        }
                    } else {
                        arrayList2.clear();
                        c0111o2.f2184n.remove(arrayList2);
                        return;
                    }
                }
            default:
                ArrayList arrayList4 = this.f2125b;
                int size3 = arrayList4.size();
                int i13 = 0;
                while (true) {
                    C0111o c0111o3 = this.f2126c;
                    if (i13 < size3) {
                        Object obj3 = arrayList4.get(i13);
                        i13++;
                        r0 r0Var4 = (r0) obj3;
                        c0111o3.getClass();
                        View view5 = r0Var4.f2210a;
                        ViewPropertyAnimator animate3 = view5.animate();
                        c0111o3.f2185o.add(r0Var4);
                        animate3.alpha(1.0f).setDuration(c0111o3.f2062c).setListener(new C0106j(c0111o3, r0Var4, view5, animate3)).start();
                    } else {
                        arrayList4.clear();
                        c0111o3.f2182l.remove(arrayList4);
                        return;
                    }
                }
        }
    }
}
