package c1;

import android.view.ViewParent;
import androidx.lifecycle.EnumC0555p;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import c2.C0768n;
import i0.AbstractC1336M;
import i0.AbstractComponentCallbacksC1366v;
import i0.C1345a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import s.C1937g;

/* renamed from: c1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0753b {

    /* renamed from: a, reason: collision with root package name */
    public long f11588a;

    /* renamed from: b, reason: collision with root package name */
    public Object f11589b;

    /* renamed from: c, reason: collision with root package name */
    public Object f11590c;

    /* renamed from: d, reason: collision with root package name */
    public Object f11591d;

    /* renamed from: e, reason: collision with root package name */
    public Object f11592e;

    /* renamed from: f, reason: collision with root package name */
    public Object f11593f;

    public static ViewPager2 a(RecyclerView recyclerView) {
        ViewParent parent = recyclerView.getParent();
        if (parent instanceof ViewPager2) {
            return (ViewPager2) parent;
        }
        throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
    }

    public void b(boolean z9) {
        int currentItem;
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v;
        boolean z10;
        C0768n c0768n = (C0768n) this.f11593f;
        if (!c0768n.f11626e.M() && ((ViewPager2) this.f11592e).getScrollState() == 0) {
            C1937g c1937g = c0768n.f11627f;
            if (c1937g.m() != 0 && (currentItem = ((ViewPager2) this.f11592e).getCurrentItem()) < 2) {
                long j = currentItem;
                if ((j != this.f11588a || z9) && (abstractComponentCallbacksC1366v = (AbstractComponentCallbacksC1366v) c1937g.f(j)) != null && abstractComponentCallbacksC1366v.y()) {
                    this.f11588a = j;
                    AbstractC1336M abstractC1336M = c0768n.f11626e;
                    abstractC1336M.getClass();
                    C1345a c1345a = new C1345a(abstractC1336M);
                    ArrayList arrayList = new ArrayList();
                    int i9 = 0;
                    AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v2 = null;
                    for (int i10 = 0; i10 < c1937g.m(); i10++) {
                        long j4 = c1937g.j(i10);
                        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v3 = (AbstractComponentCallbacksC1366v) c1937g.n(i10);
                        if (abstractComponentCallbacksC1366v3.y()) {
                            if (j4 != this.f11588a) {
                                c1345a.j(abstractComponentCallbacksC1366v3, EnumC0555p.f9896d);
                                C0752a c0752a = c0768n.j;
                                c0752a.getClass();
                                ArrayList arrayList2 = new ArrayList();
                                Iterator it = c0752a.f11587a.iterator();
                                if (!it.hasNext()) {
                                    arrayList.add(arrayList2);
                                } else {
                                    throw A0.a.h(it);
                                }
                            } else {
                                abstractComponentCallbacksC1366v2 = abstractComponentCallbacksC1366v3;
                            }
                            if (j4 == this.f11588a) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (abstractComponentCallbacksC1366v3.f18381C != z10) {
                                abstractComponentCallbacksC1366v3.f18381C = z10;
                            }
                        }
                    }
                    if (abstractComponentCallbacksC1366v2 != null) {
                        c1345a.j(abstractComponentCallbacksC1366v2, EnumC0555p.f9897e);
                        C0752a c0752a2 = c0768n.j;
                        c0752a2.getClass();
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it2 = c0752a2.f11587a.iterator();
                        if (!it2.hasNext()) {
                            arrayList.add(arrayList3);
                        } else {
                            throw A0.a.h(it2);
                        }
                    }
                    if (!c1345a.f18282a.isEmpty()) {
                        c1345a.f();
                        Collections.reverse(arrayList);
                        int size = arrayList.size();
                        while (i9 < size) {
                            Object obj = arrayList.get(i9);
                            i9++;
                            c0768n.j.getClass();
                            C0752a.a((List) obj);
                        }
                    }
                }
            }
        }
    }
}
