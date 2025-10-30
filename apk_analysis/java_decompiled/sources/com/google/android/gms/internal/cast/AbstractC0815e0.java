package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.cast.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0815e0 extends Z implements Set {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f14826c = 0;

    /* renamed from: b, reason: collision with root package name */
    public transient AbstractC0807c0 f14827b;

    public static int f(int i9) {
        int max = Math.max(i9, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
            } while (highestOneBit * 0.7d < max);
            return highestOneBit;
        }
        if (max < 1073741824) {
            return 1073741824;
        }
        throw new IllegalArgumentException("collection too large");
    }

    public static AbstractC0815e0 g(int i9, Object... objArr) {
        if (i9 != 0) {
            if (i9 != 1) {
                int f9 = f(i9);
                Object[] objArr2 = new Object[f9];
                int i10 = f9 - 1;
                int i11 = 0;
                int i12 = 0;
                for (int i13 = 0; i13 < i9; i13++) {
                    Object obj = objArr[i13];
                    if (obj != null) {
                        int hashCode = obj.hashCode();
                        int b9 = J.b(hashCode);
                        while (true) {
                            int i14 = b9 & i10;
                            Object obj2 = objArr2[i14];
                            if (obj2 == null) {
                                objArr[i12] = obj;
                                objArr2[i14] = obj;
                                i11 += hashCode;
                                i12++;
                                break;
                            }
                            if (!obj2.equals(obj)) {
                                b9++;
                            }
                        }
                    } else {
                        throw new NullPointerException(AbstractC0953k1.j(i13, "at index "));
                    }
                }
                Arrays.fill(objArr, i12, i9, (Object) null);
                if (i12 == 1) {
                    Object obj3 = objArr[0];
                    Objects.requireNonNull(obj3);
                    return new C0851n0(obj3);
                }
                if (f(i12) < f9 / 2) {
                    return g(i12, objArr);
                }
                int length = objArr.length;
                if (i12 < (length >> 1) + (length >> 2)) {
                    objArr = Arrays.copyOf(objArr, i12);
                }
                return new C0847m0(i11, i10, i12, objArr, objArr2);
            }
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new C0851n0(obj4);
        }
        return C0847m0.j;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC0815e0) && (this instanceof C0847m0)) {
            AbstractC0815e0 abstractC0815e0 = (AbstractC0815e0) obj;
            abstractC0815e0.getClass();
            if ((abstractC0815e0 instanceof C0847m0) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                    return false;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int i9;
        int i10 = 0;
        for (Object obj : this) {
            if (obj != null) {
                i9 = obj.hashCode();
            } else {
                i9 = 0;
            }
            i10 += i9;
        }
        return i10;
    }
}
