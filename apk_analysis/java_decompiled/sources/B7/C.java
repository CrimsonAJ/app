package B7;

import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class C extends AbstractC0054e implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f1107a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1108b;

    /* renamed from: c, reason: collision with root package name */
    public int f1109c;

    /* renamed from: d, reason: collision with root package name */
    public int f1110d;

    public C(int i9, Object[] objArr) {
        this.f1107a = objArr;
        if (i9 >= 0) {
            if (i9 <= objArr.length) {
                this.f1108b = objArr.length;
                this.f1110d = i9;
                return;
            } else {
                StringBuilder p9 = A0.a.p("ring buffer filled size: ", i9, " cannot be larger than the buffer size: ");
                p9.append(objArr.length);
                throw new IllegalArgumentException(p9.toString().toString());
            }
        }
        throw new IllegalArgumentException(AbstractC0953k1.j(i9, "ring buffer filled size should not be negative but it is ").toString());
    }

    @Override // B7.AbstractC0054e
    public final int b() {
        return this.f1110d;
    }

    public final void c() {
        if (100 <= this.f1110d) {
            int i9 = this.f1109c;
            int i10 = this.f1108b;
            int i11 = (i9 + 100) % i10;
            Object[] objArr = this.f1107a;
            if (i9 > i11) {
                Arrays.fill(objArr, i9, i10, (Object) null);
                Arrays.fill(objArr, 0, i11, (Object) null);
            } else {
                Arrays.fill(objArr, i9, i11, (Object) null);
            }
            this.f1109c = i11;
            this.f1110d -= 100;
            return;
        }
        throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = 100, size = " + this.f1110d).toString());
    }

    @Override // java.util.List
    public final Object get(int i9) {
        int b9 = b();
        if (i9 >= 0 && i9 < b9) {
            return this.f1107a[(this.f1109c + i9) % this.f1108b];
        }
        throw new IndexOutOfBoundsException(A0.a.l("index: ", i9, b9, ", size: "));
    }

    @Override // B7.AbstractC0054e, java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new B(this);
    }

    @Override // B7.AbstractC0054e, java.util.List, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[b()]);
    }

    @Override // B7.AbstractC0054e, java.util.List, java.util.Collection
    public final Object[] toArray(Object[] array) {
        Object[] objArr;
        kotlin.jvm.internal.h.e(array, "array");
        int length = array.length;
        int i9 = this.f1110d;
        if (length < i9) {
            array = Arrays.copyOf(array, i9);
            kotlin.jvm.internal.h.d(array, "copyOf(...)");
        }
        int i10 = this.f1110d;
        int i11 = this.f1109c;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            objArr = this.f1107a;
            if (i13 >= i10 || i11 >= this.f1108b) {
                break;
            }
            array[i13] = objArr[i11];
            i13++;
            i11++;
        }
        while (i13 < i10) {
            array[i13] = objArr[i12];
            i13++;
            i12++;
        }
        if (i10 < array.length) {
            array[i10] = null;
        }
        return array;
    }
}
