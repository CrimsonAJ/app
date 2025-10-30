package u4;

import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.internal.cast.C0816e1;
import com.google.android.gms.internal.cast.H1;
import com.google.android.gms.internal.cast.i3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class C extends v4.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23637a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23638b;

    public /* synthetic */ C(int i9, Object obj) {
        this.f23637a = i9;
        this.f23638b = obj;
    }

    @Override // v4.g
    public void b() {
        switch (this.f23637a) {
            case 2:
                ((w4.i) this.f23638b).c();
                return;
            default:
                return;
        }
    }

    @Override // v4.g
    public void c() {
        switch (this.f23637a) {
            case 2:
                ((w4.i) this.f23638b).c();
                return;
            default:
                return;
        }
    }

    @Override // v4.g
    public void l() {
        switch (this.f23637a) {
            case 2:
                ((w4.i) this.f23638b).c();
                return;
            default:
                return;
        }
    }

    @Override // v4.g
    public void m() {
        switch (this.f23637a) {
            case 2:
                ((w4.i) this.f23638b).c();
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.google.android.gms.internal.cast.e1, java.lang.Object] */
    @Override // v4.g
    public final void n() {
        t4.p pVar;
        switch (this.f23637a) {
            case 0:
                C2079d c2079d = (C2079d) this.f23638b;
                v4.h hVar = c2079d.j;
                if (hVar != null) {
                    pVar = hVar.d();
                } else {
                    pVar = null;
                }
                H1 h12 = c2079d.f23684l;
                if (h12 != null && pVar != null) {
                    i3 X8 = h12.f14722a.X();
                    e1.q qVar = new e1.q(pVar);
                    ?? obj = new Object();
                    obj.f14831c = qVar.f17061a;
                    obj.f14829a = System.currentTimeMillis();
                    C0816e1 c0816e1 = X8.f14882m;
                    if (c0816e1 == null || c0816e1.f14831c != 2) {
                        obj.f14830b = X8.f14878h;
                        X8.f14882m = obj;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                v4.c cVar = (v4.c) this.f23638b;
                long e8 = cVar.e();
                if (e8 != cVar.f23791b) {
                    cVar.f23791b = e8;
                    cVar.c();
                    if (cVar.f23791b != 0) {
                        cVar.d();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((w4.i) this.f23638b).c();
                return;
        }
    }

    @Override // v4.g
    public void o(String str, long j, int i9, long j4, long j9) {
        switch (this.f23637a) {
            case 0:
                H1 h12 = ((C2079d) this.f23638b).f23684l;
                if (h12 != null) {
                    i3 X8 = h12.f14722a.X();
                    com.google.android.gms.internal.cast.A a5 = new com.google.android.gms.internal.cast.A(str);
                    a5.f14681b = j;
                    a5.f14682c = i9;
                    a5.f14683d = j4;
                    a5.f14684e = j9;
                    com.google.android.gms.internal.cast.B b9 = new com.google.android.gms.internal.cast.B(a5);
                    b9.f14691f = X8.f14878h;
                    X8.f14874d.add(b9);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // v4.g
    public void p(int[] iArr) {
        switch (this.f23637a) {
            case 1:
                ArrayList d9 = y4.a.d(iArr);
                v4.c cVar = (v4.c) this.f23638b;
                if (!cVar.f23793d.equals(d9)) {
                    cVar.h();
                    cVar.f23795f.evictAll();
                    cVar.f23796g.clear();
                    cVar.f23793d = d9;
                    v4.c.b(cVar);
                    cVar.g();
                    cVar.f();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // v4.g
    public void q(int[] iArr, int i9) {
        int i10;
        switch (this.f23637a) {
            case 1:
                if (i9 == 0) {
                    i10 = ((v4.c) this.f23638b).f23793d.size();
                } else {
                    v4.c cVar = (v4.c) this.f23638b;
                    i10 = cVar.f23794e.get(i9, -1);
                    if (i10 == -1) {
                        cVar.d();
                        return;
                    }
                }
                v4.c cVar2 = (v4.c) this.f23638b;
                cVar2.h();
                cVar2.f23793d.addAll(i10, y4.a.d(iArr));
                v4.c.b(cVar2);
                Set set = cVar2.f23801m;
                synchronized (set) {
                    Iterator it = set.iterator();
                    if (it.hasNext()) {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    }
                }
                cVar2.f();
                return;
            default:
                return;
        }
    }

    @Override // v4.g
    public void r(t4.n[] nVarArr) {
        switch (this.f23637a) {
            case 1:
                HashSet hashSet = new HashSet();
                v4.c cVar = (v4.c) this.f23638b;
                ArrayList arrayList = cVar.f23796g;
                arrayList.clear();
                int i9 = 0;
                int i10 = 0;
                while (true) {
                    int length = nVarArr.length;
                    SparseIntArray sparseIntArray = cVar.f23794e;
                    if (i10 < length) {
                        t4.n nVar = nVarArr[i10];
                        int i11 = nVar.f23215b;
                        cVar.f23795f.put(Integer.valueOf(i11), nVar);
                        int i12 = sparseIntArray.get(i11, -1);
                        if (i12 == -1) {
                            cVar.d();
                            return;
                        } else {
                            hashSet.add(Integer.valueOf(i12));
                            i10++;
                        }
                    } else {
                        int size = arrayList.size();
                        while (i9 < size) {
                            Object obj = arrayList.get(i9);
                            i9++;
                            int i13 = sparseIntArray.get(((Integer) obj).intValue(), -1);
                            if (i13 != -1) {
                                hashSet.add(Integer.valueOf(i13));
                            }
                        }
                        arrayList.clear();
                        ArrayList arrayList2 = new ArrayList(hashSet);
                        Collections.sort(arrayList2);
                        cVar.h();
                        y4.a.f(arrayList2);
                        v4.c.a(cVar);
                        cVar.f();
                        return;
                    }
                }
            default:
                return;
        }
    }

    @Override // v4.g
    public void s(int[] iArr) {
        switch (this.f23637a) {
            case 1:
                ArrayList arrayList = new ArrayList();
                for (int i9 : iArr) {
                    v4.c cVar = (v4.c) this.f23638b;
                    cVar.f23795f.remove(Integer.valueOf(i9));
                    SparseIntArray sparseIntArray = cVar.f23794e;
                    int i10 = sparseIntArray.get(i9, -1);
                    if (i10 == -1) {
                        cVar.d();
                        return;
                    } else {
                        sparseIntArray.delete(i9);
                        arrayList.add(Integer.valueOf(i10));
                    }
                }
                if (!arrayList.isEmpty()) {
                    Collections.sort(arrayList);
                    v4.c cVar2 = (v4.c) this.f23638b;
                    cVar2.h();
                    cVar2.f23793d.removeAll(y4.a.d(iArr));
                    v4.c.b(cVar2);
                    y4.a.f(arrayList);
                    Set set = cVar2.f23801m;
                    synchronized (set) {
                        Iterator it = set.iterator();
                        if (it.hasNext()) {
                            if (it.next() == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        }
                    }
                    cVar2.f();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // v4.g
    public void t(ArrayList arrayList, ArrayList arrayList2, int i9) {
        switch (this.f23637a) {
            case 1:
                ArrayList arrayList3 = new ArrayList();
                int i10 = 0;
                if (i9 == 0) {
                    ((v4.c) this.f23638b).f23793d.size();
                } else if (arrayList2.isEmpty()) {
                    y4.b bVar = ((v4.c) this.f23638b).f23790a;
                    Log.w(bVar.f24917a, bVar.d("Received a Queue Reordered message with an empty reordered items IDs list.", new Object[0]));
                } else {
                    SparseIntArray sparseIntArray = ((v4.c) this.f23638b).f23794e;
                    if (sparseIntArray.get(i9, -1) == -1) {
                        sparseIntArray.get(((Integer) arrayList2.get(0)).intValue(), -1);
                    }
                }
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    int intValue = ((Integer) obj).intValue();
                    v4.c cVar = (v4.c) this.f23638b;
                    int i11 = cVar.f23794e.get(intValue, -1);
                    if (i11 == -1) {
                        cVar.d();
                        return;
                    }
                    arrayList3.add(Integer.valueOf(i11));
                }
                v4.c cVar2 = (v4.c) this.f23638b;
                cVar2.h();
                cVar2.f23793d = arrayList;
                v4.c.b(cVar2);
                Set set = cVar2.f23801m;
                synchronized (set) {
                    Iterator it = set.iterator();
                    if (it.hasNext()) {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    }
                }
                cVar2.f();
                return;
            default:
                return;
        }
    }

    @Override // v4.g
    public void u(int[] iArr) {
        switch (this.f23637a) {
            case 1:
                ArrayList arrayList = new ArrayList();
                int i9 = 0;
                while (true) {
                    int length = iArr.length;
                    v4.c cVar = (v4.c) this.f23638b;
                    if (i9 < length) {
                        int i10 = iArr[i9];
                        cVar.f23795f.remove(Integer.valueOf(i10));
                        int i11 = cVar.f23794e.get(i10, -1);
                        if (i11 == -1) {
                            cVar.d();
                            return;
                        } else {
                            arrayList.add(Integer.valueOf(i11));
                            i9++;
                        }
                    } else {
                        Collections.sort(arrayList);
                        cVar.h();
                        y4.a.f(arrayList);
                        v4.c.a(cVar);
                        cVar.f();
                        return;
                    }
                }
            default:
                return;
        }
    }

    @Override // v4.g
    public void v() {
        switch (this.f23637a) {
            case 1:
                ((v4.c) this.f23638b).d();
                return;
            default:
                return;
        }
    }
}
