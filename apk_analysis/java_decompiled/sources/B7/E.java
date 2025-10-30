package B7;

import a.AbstractC0485a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class E extends G7.i implements O7.p {

    /* renamed from: s, reason: collision with root package name */
    public Object f1111s;

    /* renamed from: t, reason: collision with root package name */
    public Iterator f1112t;

    /* renamed from: u, reason: collision with root package name */
    public int f1113u;

    /* renamed from: v, reason: collision with root package name */
    public int f1114v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f1115w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Iterator f1116x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(Iterator it, E7.d dVar) {
        super(dVar);
        this.f1116x = it;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        E e8 = new E(this.f1116x, dVar);
        e8.f1115w = obj;
        return e8;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((E) create((V7.k) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        V7.k kVar;
        Iterator it;
        ArrayList arrayList;
        int i9;
        C c3;
        V7.k kVar2;
        Object[] array;
        F7.a aVar = F7.a.f2587a;
        int i10 = this.f1114v;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            c3 = (C) this.f1111s;
                            kVar2 = (V7.k) this.f1115w;
                            AbstractC0485a.A(obj);
                            c3.c();
                        }
                    } else {
                        Iterator it2 = this.f1112t;
                        C c9 = (C) this.f1111s;
                        V7.k kVar3 = (V7.k) this.f1115w;
                        AbstractC0485a.A(obj);
                        c9.c();
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            int b9 = c9.b();
                            int i11 = c9.f1108b;
                            if (b9 != i11) {
                                int i12 = c9.f1109c;
                                int i13 = c9.f1110d;
                                Object[] objArr = c9.f1107a;
                                objArr[(i12 + i13) % i11] = next;
                                c9.f1110d = i13 + 1;
                                if (c9.b() == i11) {
                                    if (c9.f1110d < 100) {
                                        int i14 = i11 + (i11 >> 1) + 1;
                                        if (i14 > 100) {
                                            i14 = 100;
                                        }
                                        if (c9.f1109c == 0) {
                                            array = Arrays.copyOf(objArr, i14);
                                            kotlin.jvm.internal.h.d(array, "copyOf(...)");
                                        } else {
                                            array = c9.toArray(new Object[i14]);
                                        }
                                        c9 = new C(c9.f1110d, array);
                                    } else {
                                        ArrayList arrayList2 = new ArrayList(c9);
                                        this.f1115w = kVar3;
                                        this.f1111s = c9;
                                        this.f1112t = it2;
                                        this.f1114v = 3;
                                        kVar3.d(arrayList2, this);
                                        return aVar;
                                    }
                                }
                            } else {
                                throw new IllegalStateException("ring buffer is full");
                            }
                        }
                        c3 = c9;
                        kVar2 = kVar3;
                    }
                    if (c3.f1110d > 100) {
                        ArrayList arrayList3 = new ArrayList(c3);
                        this.f1115w = kVar2;
                        this.f1111s = c3;
                        this.f1112t = null;
                        this.f1114v = 4;
                        kVar2.d(arrayList3, this);
                        return aVar;
                    }
                    if (!c3.isEmpty()) {
                        this.f1115w = null;
                        this.f1111s = null;
                        this.f1112t = null;
                        this.f1114v = 5;
                        kVar2.d(c3, this);
                        return aVar;
                    }
                    return A7.n.f558a;
                }
                AbstractC0485a.A(obj);
                return A7.n.f558a;
            }
            i9 = this.f1113u;
            it = this.f1112t;
            kVar = (V7.k) this.f1115w;
            AbstractC0485a.A(obj);
            arrayList = new ArrayList(100);
        } else {
            AbstractC0485a.A(obj);
            kVar = (V7.k) this.f1115w;
            it = this.f1116x;
            arrayList = new ArrayList(100);
            i9 = 0;
        }
        V7.k kVar4 = kVar;
        Iterator it3 = it;
        int i15 = i9;
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (i9 > 0) {
                i9--;
            } else {
                arrayList.add(next2);
                if (arrayList.size() == 100) {
                    this.f1115w = kVar4;
                    this.f1111s = arrayList;
                    this.f1112t = it3;
                    this.f1113u = i15;
                    this.f1114v = 1;
                    kVar4.d(arrayList, this);
                    return aVar;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.f1115w = null;
            this.f1111s = null;
            this.f1112t = null;
            this.f1114v = 2;
            kVar4.d(arrayList, this);
            return aVar;
        }
        return A7.n.f558a;
    }
}
