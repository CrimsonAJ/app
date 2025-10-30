package X0;

import P.H;
import P.Q;
import P.W;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import s.C1935e;
import s.C1937g;
import s.C1939i;

/* loaded from: classes.dex */
public abstract class m implements Cloneable {

    /* renamed from: w, reason: collision with root package name */
    public static final Animator[] f8191w = new Animator[0];

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f8192x = {2, 1, 3, 4};

    /* renamed from: y, reason: collision with root package name */
    public static final Q6.f f8193y = new Q6.f(15);

    /* renamed from: z, reason: collision with root package name */
    public static final ThreadLocal f8194z = new ThreadLocal();

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f8204k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f8205l;

    /* renamed from: m, reason: collision with root package name */
    public j[] f8206m;

    /* renamed from: a, reason: collision with root package name */
    public final String f8195a = getClass().getName();

    /* renamed from: b, reason: collision with root package name */
    public long f8196b = -1;

    /* renamed from: c, reason: collision with root package name */
    public long f8197c = -1;

    /* renamed from: d, reason: collision with root package name */
    public TimeInterpolator f8198d = null;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f8199e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f8200f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public com.google.firebase.messaging.s f8201g = new com.google.firebase.messaging.s(6);

    /* renamed from: h, reason: collision with root package name */
    public com.google.firebase.messaging.s f8202h = new com.google.firebase.messaging.s(6);

    /* renamed from: i, reason: collision with root package name */
    public C0426a f8203i = null;
    public final int[] j = f8192x;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f8207n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public Animator[] f8208o = f8191w;

    /* renamed from: p, reason: collision with root package name */
    public int f8209p = 0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f8210q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f8211r = false;

    /* renamed from: s, reason: collision with root package name */
    public m f8212s = null;

    /* renamed from: t, reason: collision with root package name */
    public ArrayList f8213t = null;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList f8214u = new ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public Q6.f f8215v = f8193y;

    public static void c(com.google.firebase.messaging.s sVar, View view, u uVar) {
        ((C1935e) sVar.f16504b).put(view, uVar);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) sVar.f16505c;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = Q.f5546a;
        String f9 = H.f(view);
        if (f9 != null) {
            C1935e c1935e = (C1935e) sVar.f16507e;
            if (c1935e.containsKey(f9)) {
                c1935e.put(f9, null);
            } else {
                c1935e.put(f9, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                C1937g c1937g = (C1937g) sVar.f16506d;
                if (c1937g.i(itemIdAtPosition) >= 0) {
                    View view2 = (View) c1937g.f(itemIdAtPosition);
                    if (view2 != null) {
                        view2.setHasTransientState(false);
                        c1937g.k(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                view.setHasTransientState(true);
                c1937g.k(itemIdAtPosition, view);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, s.e, s.i] */
    public static C1935e r() {
        ThreadLocal threadLocal = f8194z;
        C1935e c1935e = (C1935e) threadLocal.get();
        if (c1935e == null) {
            ?? c1939i = new C1939i(0);
            threadLocal.set(c1939i);
            return c1939i;
        }
        return c1935e;
    }

    public static boolean x(u uVar, u uVar2, String str) {
        Object obj = uVar.f8226a.get(str);
        Object obj2 = uVar2.f8226a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public m A(j jVar) {
        m mVar;
        ArrayList arrayList = this.f8213t;
        if (arrayList != null) {
            if (!arrayList.remove(jVar) && (mVar = this.f8212s) != null) {
                mVar.A(jVar);
            }
            if (this.f8213t.size() == 0) {
                this.f8213t = null;
            }
        }
        return this;
    }

    public void B(View view) {
        if (this.f8210q) {
            if (!this.f8211r) {
                ArrayList arrayList = this.f8207n;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f8208o);
                this.f8208o = f8191w;
                for (int i9 = size - 1; i9 >= 0; i9--) {
                    Animator animator = animatorArr[i9];
                    animatorArr[i9] = null;
                    animator.resume();
                }
                this.f8208o = animatorArr;
                y(this, l.K);
            }
            this.f8210q = false;
        }
    }

    public void C() {
        J();
        C1935e r5 = r();
        ArrayList arrayList = this.f8214u;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            Animator animator = (Animator) obj;
            if (r5.containsKey(animator)) {
                J();
                if (animator != null) {
                    animator.addListener(new W(this, r5));
                    long j = this.f8197c;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j4 = this.f8196b;
                    if (j4 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j4);
                    }
                    TimeInterpolator timeInterpolator = this.f8198d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new A5.t(4, this));
                    animator.start();
                }
            }
        }
        this.f8214u.clear();
        o();
    }

    public void D(long j) {
        this.f8197c = j;
    }

    public void F(TimeInterpolator timeInterpolator) {
        this.f8198d = timeInterpolator;
    }

    public void G(Q6.f fVar) {
        if (fVar == null) {
            this.f8215v = f8193y;
        } else {
            this.f8215v = fVar;
        }
    }

    public void I(long j) {
        this.f8196b = j;
    }

    public final void J() {
        if (this.f8209p == 0) {
            y(this, l.f8187G);
            this.f8211r = false;
        }
        this.f8209p++;
    }

    public String K(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f8197c != -1) {
            sb.append("dur(");
            sb.append(this.f8197c);
            sb.append(") ");
        }
        if (this.f8196b != -1) {
            sb.append("dly(");
            sb.append(this.f8196b);
            sb.append(") ");
        }
        if (this.f8198d != null) {
            sb.append("interp(");
            sb.append(this.f8198d);
            sb.append(") ");
        }
        ArrayList arrayList = this.f8199e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f8200f;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i9 = 0; i9 < arrayList.size(); i9++) {
                    if (i9 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i9));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    if (i10 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i10));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public void b(j jVar) {
        if (this.f8213t == null) {
            this.f8213t = new ArrayList();
        }
        this.f8213t.add(jVar);
    }

    public void cancel() {
        ArrayList arrayList = this.f8207n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f8208o);
        this.f8208o = f8191w;
        for (int i9 = size - 1; i9 >= 0; i9--) {
            Animator animator = animatorArr[i9];
            animatorArr[i9] = null;
            animator.cancel();
        }
        this.f8208o = animatorArr;
        y(this, l.f8189I);
    }

    public abstract void e(u uVar);

    public final void f(View view, boolean z9) {
        if (view != null) {
            view.getId();
            if (view.getParent() instanceof ViewGroup) {
                u uVar = new u(view);
                if (z9) {
                    i(uVar);
                } else {
                    e(uVar);
                }
                uVar.f8228c.add(this);
                h(uVar);
                if (z9) {
                    c(this.f8201g, view, uVar);
                } else {
                    c(this.f8202h, view, uVar);
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                    f(viewGroup.getChildAt(i9), z9);
                }
            }
        }
    }

    public abstract void i(u uVar);

    public final void j(ViewGroup viewGroup, boolean z9) {
        k(z9);
        ArrayList arrayList = this.f8199e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f8200f;
        if (size <= 0 && arrayList2.size() <= 0) {
            f(viewGroup, z9);
            return;
        }
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            View findViewById = viewGroup.findViewById(((Integer) arrayList.get(i9)).intValue());
            if (findViewById != null) {
                u uVar = new u(findViewById);
                if (z9) {
                    i(uVar);
                } else {
                    e(uVar);
                }
                uVar.f8228c.add(this);
                h(uVar);
                if (z9) {
                    c(this.f8201g, findViewById, uVar);
                } else {
                    c(this.f8202h, findViewById, uVar);
                }
            }
        }
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            View view = (View) arrayList2.get(i10);
            u uVar2 = new u(view);
            if (z9) {
                i(uVar2);
            } else {
                e(uVar2);
            }
            uVar2.f8228c.add(this);
            h(uVar2);
            if (z9) {
                c(this.f8201g, view, uVar2);
            } else {
                c(this.f8202h, view, uVar2);
            }
        }
    }

    public final void k(boolean z9) {
        if (z9) {
            ((C1935e) this.f8201g.f16504b).clear();
            ((SparseArray) this.f8201g.f16505c).clear();
            ((C1937g) this.f8201g.f16506d).c();
        } else {
            ((C1935e) this.f8202h.f16504b).clear();
            ((SparseArray) this.f8202h.f16505c).clear();
            ((C1937g) this.f8202h.f16506d).c();
        }
    }

    @Override // 
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public m clone() {
        try {
            m mVar = (m) super.clone();
            mVar.f8214u = new ArrayList();
            mVar.f8201g = new com.google.firebase.messaging.s(6);
            mVar.f8202h = new com.google.firebase.messaging.s(6);
            mVar.f8204k = null;
            mVar.f8205l = null;
            mVar.f8212s = this;
            mVar.f8213t = null;
            return mVar;
        } catch (CloneNotSupportedException e8) {
            throw new RuntimeException(e8);
        }
    }

    public Animator m(ViewGroup viewGroup, u uVar, u uVar2) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, X0.i] */
    public void n(ViewGroup viewGroup, com.google.firebase.messaging.s sVar, com.google.firebase.messaging.s sVar2, ArrayList arrayList, ArrayList arrayList2) {
        int i9;
        int i10;
        View view;
        u uVar;
        Animator animator;
        u uVar2;
        C1935e r5 = r();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        q().getClass();
        int i11 = 0;
        while (i11 < size) {
            u uVar3 = (u) arrayList.get(i11);
            u uVar4 = (u) arrayList2.get(i11);
            if (uVar3 != null && !uVar3.f8228c.contains(this)) {
                uVar3 = null;
            }
            if (uVar4 != null && !uVar4.f8228c.contains(this)) {
                uVar4 = null;
            }
            if ((uVar3 != null || uVar4 != null) && (uVar3 == null || uVar4 == null || v(uVar3, uVar4))) {
                Animator m9 = m(viewGroup, uVar3, uVar4);
                if (m9 != null) {
                    String str = this.f8195a;
                    if (uVar4 != null) {
                        String[] t7 = t();
                        view = uVar4.f8227b;
                        if (t7 != null && t7.length > 0) {
                            uVar2 = new u(view);
                            u uVar5 = (u) ((C1935e) sVar2.f16504b).get(view);
                            i9 = size;
                            if (uVar5 != null) {
                                int i12 = 0;
                                while (i12 < t7.length) {
                                    HashMap hashMap = uVar2.f8226a;
                                    int i13 = i11;
                                    String str2 = t7[i12];
                                    hashMap.put(str2, uVar5.f8226a.get(str2));
                                    i12++;
                                    i11 = i13;
                                }
                            }
                            i10 = i11;
                            int i14 = r5.f22660c;
                            int i15 = 0;
                            while (true) {
                                if (i15 < i14) {
                                    i iVar = (i) r5.get((Animator) r5.f(i15));
                                    if (iVar.f8182c != null && iVar.f8180a == view && iVar.f8181b.equals(str) && iVar.f8182c.equals(uVar2)) {
                                        animator = null;
                                        break;
                                    }
                                    i15++;
                                } else {
                                    animator = m9;
                                    break;
                                }
                            }
                        } else {
                            i9 = size;
                            i10 = i11;
                            animator = m9;
                            uVar2 = null;
                        }
                        m9 = animator;
                        uVar = uVar2;
                    } else {
                        i9 = size;
                        i10 = i11;
                        view = uVar3.f8227b;
                        uVar = null;
                    }
                    if (m9 != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        ?? obj = new Object();
                        obj.f8180a = view;
                        obj.f8181b = str;
                        obj.f8182c = uVar;
                        obj.f8183d = windowId;
                        obj.f8184e = this;
                        obj.f8185f = m9;
                        r5.put(m9, obj);
                        this.f8214u.add(m9);
                    }
                    i11 = i10 + 1;
                    size = i9;
                }
            }
            i9 = size;
            i10 = i11;
            i11 = i10 + 1;
            size = i9;
        }
        if (sparseIntArray.size() != 0) {
            for (int i16 = 0; i16 < sparseIntArray.size(); i16++) {
                i iVar2 = (i) r5.get((Animator) this.f8214u.get(sparseIntArray.keyAt(i16)));
                iVar2.f8185f.setStartDelay(iVar2.f8185f.getStartDelay() + (sparseIntArray.valueAt(i16) - Long.MAX_VALUE));
            }
        }
    }

    public final void o() {
        int i9 = this.f8209p - 1;
        this.f8209p = i9;
        if (i9 == 0) {
            y(this, l.f8188H);
            for (int i10 = 0; i10 < ((C1937g) this.f8201g.f16506d).m(); i10++) {
                View view = (View) ((C1937g) this.f8201g.f16506d).n(i10);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i11 = 0; i11 < ((C1937g) this.f8202h.f16506d).m(); i11++) {
                View view2 = (View) ((C1937g) this.f8202h.f16506d).n(i11);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f8211r = true;
        }
    }

    public final u p(View view, boolean z9) {
        ArrayList arrayList;
        ArrayList arrayList2;
        C0426a c0426a = this.f8203i;
        if (c0426a != null) {
            return c0426a.p(view, z9);
        }
        if (z9) {
            arrayList = this.f8204k;
        } else {
            arrayList = this.f8205l;
        }
        if (arrayList != null) {
            int size = arrayList.size();
            int i9 = 0;
            while (true) {
                if (i9 < size) {
                    u uVar = (u) arrayList.get(i9);
                    if (uVar != null) {
                        if (uVar.f8227b == view) {
                            break;
                        }
                        i9++;
                    } else {
                        return null;
                    }
                } else {
                    i9 = -1;
                    break;
                }
            }
            if (i9 >= 0) {
                if (z9) {
                    arrayList2 = this.f8205l;
                } else {
                    arrayList2 = this.f8204k;
                }
                return (u) arrayList2.get(i9);
            }
            return null;
        }
        return null;
    }

    public final m q() {
        C0426a c0426a = this.f8203i;
        if (c0426a != null) {
            return c0426a.q();
        }
        return this;
    }

    public String[] t() {
        return null;
    }

    public final String toString() {
        return K("");
    }

    public final u u(View view, boolean z9) {
        com.google.firebase.messaging.s sVar;
        C0426a c0426a = this.f8203i;
        if (c0426a != null) {
            return c0426a.u(view, z9);
        }
        if (z9) {
            sVar = this.f8201g;
        } else {
            sVar = this.f8202h;
        }
        return (u) ((C1935e) sVar.f16504b).get(view);
    }

    public boolean v(u uVar, u uVar2) {
        if (uVar != null && uVar2 != null) {
            String[] t7 = t();
            if (t7 != null) {
                for (String str : t7) {
                    if (x(uVar, uVar2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = uVar.f8226a.keySet().iterator();
                while (it.hasNext()) {
                    if (x(uVar, uVar2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean w(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f8199e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f8200f;
        if ((size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view)) {
            return true;
        }
        return false;
    }

    public final void y(m mVar, l lVar) {
        m mVar2 = this.f8212s;
        if (mVar2 != null) {
            mVar2.y(mVar, lVar);
        }
        ArrayList arrayList = this.f8213t;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = this.f8213t.size();
            j[] jVarArr = this.f8206m;
            if (jVarArr == null) {
                jVarArr = new j[size];
            }
            this.f8206m = null;
            j[] jVarArr2 = (j[]) this.f8213t.toArray(jVarArr);
            for (int i9 = 0; i9 < size; i9++) {
                lVar.f(jVarArr2[i9], mVar);
                jVarArr2[i9] = null;
            }
            this.f8206m = jVarArr2;
        }
    }

    public void z(ViewGroup viewGroup) {
        if (!this.f8211r) {
            ArrayList arrayList = this.f8207n;
            int size = arrayList.size();
            Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f8208o);
            this.f8208o = f8191w;
            for (int i9 = size - 1; i9 >= 0; i9--) {
                Animator animator = animatorArr[i9];
                animatorArr[i9] = null;
                animator.pause();
            }
            this.f8208o = animatorArr;
            y(this, l.f8190J);
            this.f8210q = true;
        }
    }

    public void H() {
    }

    public void E(s8.n nVar) {
    }

    public void h(u uVar) {
    }
}
