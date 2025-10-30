package P5;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes.dex */
public abstract class I extends A implements Set {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f5906c = 0;

    /* renamed from: b, reason: collision with root package name */
    public transient F f5907b;

    public static int k(int i9) {
        int max = Math.max(i9, 2);
        boolean z9 = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (highestOneBit * 0.7d < max) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z9 = false;
        }
        if (z9) {
            return 1073741824;
        }
        throw new IllegalArgumentException("collection too large");
    }

    public static I o(int i9, Object... objArr) {
        if (i9 != 0) {
            if (i9 != 1) {
                int k5 = k(i9);
                Object[] objArr2 = new Object[k5];
                int i10 = k5 - 1;
                int i11 = 0;
                int i12 = 0;
                for (int i13 = 0; i13 < i9; i13++) {
                    Object obj = objArr[i13];
                    if (obj != null) {
                        int hashCode = obj.hashCode();
                        int q9 = AbstractC0349q.q(hashCode);
                        while (true) {
                            int i14 = q9 & i10;
                            Object obj2 = objArr2[i14];
                            if (obj2 == null) {
                                objArr[i12] = obj;
                                objArr2[i14] = obj;
                                i11 += hashCode;
                                i12++;
                                break;
                            }
                            if (obj2.equals(obj)) {
                                break;
                            }
                            q9++;
                        }
                    } else {
                        StringBuilder sb = new StringBuilder(20);
                        sb.append("at index ");
                        sb.append(i13);
                        throw new NullPointerException(sb.toString());
                    }
                }
                Arrays.fill(objArr, i12, i9, (Object) null);
                if (i12 == 1) {
                    Object obj3 = objArr[0];
                    Objects.requireNonNull(obj3);
                    return new e0(obj3);
                }
                if (k(i12) < k5 / 2) {
                    return o(i12, objArr);
                }
                int length = objArr.length;
                if (i12 < (length >> 1) + (length >> 2)) {
                    objArr = Arrays.copyOf(objArr, i12);
                }
                return new Y(i11, i10, i12, objArr, objArr2);
            }
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new e0(obj4);
        }
        return Y.j;
    }

    public static I p(Collection collection) {
        if ((collection instanceof I) && !(collection instanceof SortedSet)) {
            I i9 = (I) collection;
            if (!i9.g()) {
                return i9;
            }
        }
        Object[] array = collection.toArray();
        return o(array.length, array);
    }

    @Override // P5.A
    public F b() {
        F f9 = this.f5907b;
        if (f9 == null) {
            F q9 = q();
            this.f5907b = q9;
            return q9;
        }
        return f9;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof I) && (this instanceof Y)) {
            I i9 = (I) obj;
            i9.getClass();
            if ((i9 instanceof Y) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        return AbstractC0349q.f(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return AbstractC0349q.j(this);
    }

    public F q() {
        Object[] array = toArray(A.f5889a);
        D d9 = F.f5901b;
        return F.k(array.length, array);
    }
}
