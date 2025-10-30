package com.google.android.gms.internal.cast;

import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.cast.s2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0872s2 {
    public static /* synthetic */ boolean a(Unsafe unsafe, AbstractC0868r2 abstractC0868r2, long j, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(abstractC0868r2, j, obj, obj2)) {
            if (unsafe.getObject(abstractC0868r2, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
