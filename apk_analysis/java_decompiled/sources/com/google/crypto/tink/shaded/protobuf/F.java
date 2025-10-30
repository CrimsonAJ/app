package com.google.crypto.tink.shaded.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class F extends H {

    /* renamed from: c, reason: collision with root package name */
    public static final Class f16297c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public static List d(int i9, long j, Object obj) {
        List arrayList;
        List list = (List) n0.f16387c.i(j, obj);
        if (list.isEmpty()) {
            if (list instanceof E) {
                arrayList = new D(i9);
            } else if ((list instanceof X) && (list instanceof InterfaceC1053y)) {
                arrayList = ((InterfaceC1053y) list).h(i9);
            } else {
                arrayList = new ArrayList(i9);
            }
            n0.p(obj, j, arrayList);
            return arrayList;
        }
        if (f16297c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList2 = new ArrayList(list.size() + i9);
            arrayList2.addAll(list);
            n0.p(obj, j, arrayList2);
            return arrayList2;
        }
        if (list instanceof i0) {
            D d9 = new D(list.size() + i9);
            d9.addAll((i0) list);
            n0.p(obj, j, d9);
            return d9;
        }
        if ((list instanceof X) && (list instanceof InterfaceC1053y)) {
            InterfaceC1053y interfaceC1053y = (InterfaceC1053y) list;
            if (!((AbstractC1031b) interfaceC1053y).f16338a) {
                InterfaceC1053y h7 = interfaceC1053y.h(list.size() + i9);
                n0.p(obj, j, h7);
                return h7;
            }
        }
        return list;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.H
    public final void a(long j, Object obj) {
        Object unmodifiableList;
        List list = (List) n0.f16387c.i(j, obj);
        if (list instanceof E) {
            unmodifiableList = ((E) list).l();
        } else {
            if (!f16297c.isAssignableFrom(list.getClass())) {
                if ((list instanceof X) && (list instanceof InterfaceC1053y)) {
                    AbstractC1031b abstractC1031b = (AbstractC1031b) ((InterfaceC1053y) list);
                    if (abstractC1031b.f16338a) {
                        abstractC1031b.f16338a = false;
                        return;
                    }
                    return;
                }
                unmodifiableList = Collections.unmodifiableList(list);
            } else {
                return;
            }
        }
        n0.p(obj, j, unmodifiableList);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.H
    public final void b(Object obj, long j, Object obj2) {
        List list = (List) n0.f16387c.i(j, obj2);
        List d9 = d(list.size(), j, obj);
        int size = d9.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            d9.addAll(list);
        }
        if (size > 0) {
            list = d9;
        }
        n0.p(obj, j, list);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.H
    public final List c(long j, Object obj) {
        return d(10, j, obj);
    }
}
