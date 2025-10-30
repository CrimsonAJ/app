package com.google.android.gms.internal.cast;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class E2 {
    protected int zza;

    public static void b(ArrayList arrayList, List list) {
        Charset charset = S2.f14762a;
        int size = arrayList.size();
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + size);
        } else if (list instanceof e3) {
            e3 e3Var = (e3) list;
            int i9 = ((e3) list).f14835c + size;
            int length = e3Var.f14834b.length;
            if (i9 > length) {
                if (length != 0) {
                    while (length < i9) {
                        length = A0.a.g(length, 3, 2, 1, 10);
                    }
                    e3Var.f14834b = Arrays.copyOf(e3Var.f14834b, length);
                } else {
                    e3Var.f14834b = new Object[Math.max(i9, 10)];
                }
            }
        }
        int size2 = list.size();
        int size3 = arrayList.size();
        for (int i10 = 0; i10 < size3; i10++) {
            Object obj = arrayList.get(i10);
            if (obj == null) {
                String m9 = A0.a.m("Element at index ", list.size() - size2, " is null.");
                int size4 = list.size();
                while (true) {
                    size4--;
                    if (size4 < size2) {
                        break;
                    } else {
                        list.remove(size4);
                    }
                }
                throw new NullPointerException(m9);
            }
            list.add(obj);
        }
    }

    public abstract int a(g3 g3Var);
}
