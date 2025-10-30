package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class N1 {
    protected int zza;

    public static void b(Iterable iterable, List list) {
        Charset charset = AbstractC0944i2.f15502a;
        iterable.getClass();
        if (!(iterable instanceof InterfaceC1018x2)) {
            if (iterable instanceof Collection) {
                int size = ((Collection) iterable).size();
                if (list instanceof ArrayList) {
                    ((ArrayList) list).ensureCapacity(list.size() + size);
                } else if (list instanceof C1028z2) {
                    C1028z2 c1028z2 = (C1028z2) list;
                    int i9 = ((C1028z2) list).f15713c + size;
                    int length = c1028z2.f15712b.length;
                    if (i9 > length) {
                        if (length != 0) {
                            while (length < i9) {
                                length = A0.a.g(length, 3, 2, 1, 10);
                            }
                            c1028z2.f15712b = Arrays.copyOf(c1028z2.f15712b, length);
                        } else {
                            c1028z2.f15712b = new Object[Math.max(i9, 10)];
                        }
                    }
                }
            }
            int size2 = list.size();
            if ((iterable instanceof List) && (iterable instanceof RandomAccess)) {
                List list2 = (List) iterable;
                int size3 = list2.size();
                for (int i10 = 0; i10 < size3; i10++) {
                    Object obj = list2.get(i10);
                    if (obj != null) {
                        list.add(obj);
                    } else {
                        AbstractC0904a2.b(list, size2);
                        throw null;
                    }
                }
                return;
            }
            for (Object obj2 : iterable) {
                if (obj2 != null) {
                    list.add(obj2);
                } else {
                    AbstractC0904a2.b(list, size2);
                    throw null;
                }
            }
            return;
        }
        list.addAll((Collection) iterable);
    }

    public abstract int a(B2 b22);

    public final byte[] c() {
        try {
            AbstractC0909b2 abstractC0909b2 = (AbstractC0909b2) this;
            int d9 = abstractC0909b2.d();
            byte[] bArr = new byte[d9];
            U1 u12 = new U1(d9, bArr);
            B2 a5 = C1023y2.f15696c.a(abstractC0909b2.getClass());
            C0974o2 c0974o2 = u12.j;
            if (c0974o2 == null) {
                c0974o2 = new C0974o2(u12);
            }
            a5.e(abstractC0909b2, c0974o2);
            if (d9 - u12.f15315m == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e8) {
            throw new RuntimeException(A0.a.n("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e8);
        }
    }
}
