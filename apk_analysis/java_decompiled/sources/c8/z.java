package c8;

import B6.u0;
import b8.InterfaceC0726f;
import com.google.android.gms.internal.measurement.Y1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class z extends G7.c implements InterfaceC0726f {

    /* renamed from: r, reason: collision with root package name */
    public final InterfaceC0726f f11810r;

    /* renamed from: s, reason: collision with root package name */
    public final E7.i f11811s;

    /* renamed from: t, reason: collision with root package name */
    public final int f11812t;

    /* renamed from: u, reason: collision with root package name */
    public E7.i f11813u;

    /* renamed from: v, reason: collision with root package name */
    public E7.d f11814v;

    public z(InterfaceC0726f interfaceC0726f, E7.i iVar) {
        super(w.f11807a, E7.j.f1978a);
        this.f11810r = interfaceC0726f;
        this.f11811s = iVar;
        this.f11812t = ((Number) iVar.fold(0, y.f11809d)).intValue();
    }

    public final Object a(E7.d dVar, Object obj) {
        List list;
        Comparable comparable;
        int i9;
        String str;
        E7.i context = dVar.getContext();
        Y7.B.h(context);
        E7.i iVar = this.f11813u;
        if (iVar != context) {
            int i10 = 0;
            if (iVar instanceof t) {
                String str2 = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((t) iVar).f11805a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                kotlin.jvm.internal.h.e(str2, "<this>");
                W7.b bVar = new W7.b(str2);
                if (!bVar.hasNext()) {
                    list = B7.t.f1135a;
                } else {
                    Object next = bVar.next();
                    if (!bVar.hasNext()) {
                        list = u0.D(next);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(next);
                        while (bVar.hasNext()) {
                            arrayList.add(bVar.next());
                        }
                        list = arrayList;
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    if (!W7.d.U((String) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(B7.m.f0(arrayList2, 10));
                int size = arrayList2.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj3 = arrayList2.get(i11);
                    i11++;
                    String str3 = (String) obj3;
                    int length = str3.length();
                    int i12 = 0;
                    while (true) {
                        if (i12 < length) {
                            if (!Y1.u(str3.charAt(i12))) {
                                break;
                            }
                            i12++;
                        } else {
                            i12 = -1;
                            break;
                        }
                    }
                    if (i12 == -1) {
                        i12 = str3.length();
                    }
                    arrayList3.add(Integer.valueOf(i12));
                }
                Iterator it = arrayList3.iterator();
                if (!it.hasNext()) {
                    comparable = null;
                } else {
                    comparable = (Comparable) it.next();
                    while (it.hasNext()) {
                        Comparable comparable2 = (Comparable) it.next();
                        if (comparable.compareTo(comparable2) > 0) {
                            comparable = comparable2;
                        }
                    }
                }
                Integer num = (Integer) comparable;
                if (num != null) {
                    i9 = num.intValue();
                } else {
                    i9 = 0;
                }
                int length2 = str2.length();
                list.size();
                int a02 = B7.l.a0(list);
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : list) {
                    int i13 = i10 + 1;
                    if (i10 >= 0) {
                        String str4 = (String) obj4;
                        if ((i10 == 0 || i10 == a02) && W7.d.U(str4)) {
                            str = null;
                        } else {
                            kotlin.jvm.internal.h.e(str4, "<this>");
                            if (i9 >= 0) {
                                int length3 = str4.length();
                                if (i9 <= length3) {
                                    length3 = i9;
                                }
                                str = str4.substring(length3);
                                kotlin.jvm.internal.h.d(str, "substring(...)");
                            } else {
                                throw new IllegalArgumentException(A0.a.m("Requested character count ", i9, " is less than zero.").toString());
                            }
                        }
                        if (str != null) {
                            arrayList4.add(str);
                        }
                        i10 = i13;
                    } else {
                        B7.l.e0();
                        throw null;
                    }
                }
                StringBuilder sb = new StringBuilder(length2);
                B7.k.s0(arrayList4, sb, "\n", "", "", "...", null);
                throw new IllegalStateException(sb.toString().toString());
            }
            if (((Number) context.fold(0, new C(this))).intValue() == this.f11812t) {
                this.f11813u = context;
            } else {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f11811s + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
        }
        this.f11814v = dVar;
        A a5 = B.f11738a;
        InterfaceC0726f interfaceC0726f = this.f11810r;
        kotlin.jvm.internal.h.c(interfaceC0726f, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        a5.getClass();
        Object emit = interfaceC0726f.emit(obj, this);
        if (!kotlin.jvm.internal.h.a(emit, F7.a.f2587a)) {
            this.f11814v = null;
        }
        return emit;
    }

    @Override // b8.InterfaceC0726f
    public final Object emit(Object obj, E7.d dVar) {
        try {
            Object a5 = a(dVar, obj);
            if (a5 == F7.a.f2587a) {
                return a5;
            }
            return A7.n.f558a;
        } catch (Throwable th) {
            this.f11813u = new t(dVar.getContext(), th);
            throw th;
        }
    }

    @Override // G7.a, G7.d
    public final G7.d getCallerFrame() {
        E7.d dVar = this.f11814v;
        if (dVar instanceof G7.d) {
            return (G7.d) dVar;
        }
        return null;
    }

    @Override // G7.c, E7.d
    public final E7.i getContext() {
        E7.i iVar = this.f11813u;
        if (iVar == null) {
            return E7.j.f1978a;
        }
        return iVar;
    }

    @Override // G7.a
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        Throwable a5 = A7.j.a(obj);
        if (a5 != null) {
            this.f11813u = new t(getContext(), a5);
        }
        E7.d dVar = this.f11814v;
        if (dVar != null) {
            dVar.resumeWith(obj);
        }
        return F7.a.f2587a;
    }
}
