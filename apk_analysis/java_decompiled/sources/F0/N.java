package F0;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class N implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2050a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f2051b;

    public /* synthetic */ N(RecyclerView recyclerView, int i9) {
        this.f2050a = i9;
        this.f2051b = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        long j;
        RecyclerView recyclerView3 = this.f2051b;
        int i9 = 1;
        switch (this.f2050a) {
            case 0:
                if (recyclerView3.f10304u && !recyclerView3.isLayoutRequested()) {
                    if (!recyclerView3.f10300s) {
                        recyclerView3.requestLayout();
                        return;
                    } else if (recyclerView3.f10310x) {
                        recyclerView3.f10308w = true;
                        return;
                    } else {
                        recyclerView3.p();
                        return;
                    }
                }
                return;
            default:
                Z z9 = recyclerView3.f10292n0;
                if (z9 != null) {
                    C0111o c0111o = (C0111o) z9;
                    ArrayList arrayList = c0111o.f2179h;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c0111o.j;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c0111o.f2181k;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c0111o.f2180i;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (isEmpty && isEmpty2 && isEmpty4 && isEmpty3) {
                        recyclerView2 = recyclerView3;
                    } else {
                        int size = arrayList.size();
                        recyclerView2 = recyclerView3;
                        int i10 = 0;
                        while (true) {
                            long j4 = c0111o.f2063d;
                            if (i10 < size) {
                                Object obj = arrayList.get(i10);
                                i10 += i9;
                                r0 r0Var = (r0) obj;
                                View view = r0Var.f2210a;
                                ViewPropertyAnimator animate = view.animate();
                                c0111o.f2187q.add(r0Var);
                                animate.setDuration(j4).alpha(0.0f).setListener(new C0106j(c0111o, r0Var, animate, view)).start();
                                arrayList = arrayList;
                                i9 = 1;
                            } else {
                                arrayList.clear();
                                if (!isEmpty2) {
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.addAll(arrayList2);
                                    c0111o.f2183m.add(arrayList5);
                                    arrayList2.clear();
                                    RunnableC0105i runnableC0105i = new RunnableC0105i(c0111o, arrayList5, 0);
                                    if (!isEmpty) {
                                        View view2 = ((C0110n) arrayList5.get(0)).f2159a.f2210a;
                                        WeakHashMap weakHashMap = P.Q.f5546a;
                                        view2.postOnAnimationDelayed(runnableC0105i, j4);
                                    } else {
                                        runnableC0105i.run();
                                    }
                                }
                                if (!isEmpty3) {
                                    ArrayList arrayList6 = new ArrayList();
                                    arrayList6.addAll(arrayList3);
                                    c0111o.f2184n.add(arrayList6);
                                    arrayList3.clear();
                                    RunnableC0105i runnableC0105i2 = new RunnableC0105i(c0111o, arrayList6, 1);
                                    if (!isEmpty) {
                                        View view3 = ((C0109m) arrayList6.get(0)).f2153a.f2210a;
                                        WeakHashMap weakHashMap2 = P.Q.f5546a;
                                        view3.postOnAnimationDelayed(runnableC0105i2, j4);
                                    } else {
                                        runnableC0105i2.run();
                                    }
                                }
                                if (!isEmpty4) {
                                    ArrayList arrayList7 = new ArrayList();
                                    arrayList7.addAll(arrayList4);
                                    c0111o.f2182l.add(arrayList7);
                                    arrayList4.clear();
                                    RunnableC0105i runnableC0105i3 = new RunnableC0105i(c0111o, arrayList7, 2);
                                    if (isEmpty && isEmpty2 && isEmpty3) {
                                        runnableC0105i3.run();
                                    } else {
                                        long j9 = 0;
                                        if (isEmpty) {
                                            j4 = 0;
                                        }
                                        if (!isEmpty2) {
                                            j = c0111o.f2064e;
                                        } else {
                                            j = 0;
                                        }
                                        if (!isEmpty3) {
                                            j9 = c0111o.f2065f;
                                        }
                                        long max = Math.max(j, j9) + j4;
                                        View view4 = ((r0) arrayList7.get(0)).f2210a;
                                        WeakHashMap weakHashMap3 = P.Q.f5546a;
                                        view4.postOnAnimationDelayed(runnableC0105i3, max);
                                    }
                                }
                            }
                        }
                    }
                    recyclerView = recyclerView2;
                } else {
                    recyclerView = recyclerView3;
                }
                recyclerView.f10256L0 = false;
                return;
        }
    }
}
