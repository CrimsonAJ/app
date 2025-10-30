package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.C0518d;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public class T1 implements Iterable, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final T1 f15297c = new T1(AbstractC0944i2.f15503b);

    /* renamed from: a, reason: collision with root package name */
    public int f15298a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f15299b;

    static {
        int i9 = P1.f15282a;
    }

    public T1(byte[] bArr) {
        bArr.getClass();
        this.f15299b = bArr;
    }

    public static int e(int i9, int i10, int i11) {
        int i12 = i10 - i9;
        if ((i9 | i10 | i12 | (i11 - i10)) < 0) {
            if (i9 >= 0) {
                if (i10 < i9) {
                    throw new IndexOutOfBoundsException(A0.a.l("Beginning index larger than ending index: ", i9, i10, ", "));
                }
                throw new IndexOutOfBoundsException(A0.a.l("End index: ", i10, i11, " >= "));
            }
            throw new IndexOutOfBoundsException(A0.a.m("Beginning index: ", i9, " < 0"));
        }
        return i12;
    }

    public static T1 f(byte[] bArr, int i9, int i10) {
        e(i9, i9 + i10, bArr.length);
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, i9, bArr2, 0, i10);
        return new T1(bArr2);
    }

    public byte b(int i9) {
        return this.f15299b[i9];
    }

    public byte c(int i9) {
        return this.f15299b[i9];
    }

    public int d() {
        return this.f15299b.length;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if ((obj instanceof T1) && d() == ((T1) obj).d()) {
                if (d() != 0) {
                    if (obj instanceof T1) {
                        T1 t12 = (T1) obj;
                        int i9 = this.f15298a;
                        int i10 = t12.f15298a;
                        if (i9 == 0 || i10 == 0 || i9 == i10) {
                            int d9 = d();
                            if (d9 <= t12.d()) {
                                if (d9 <= t12.d()) {
                                    int i11 = 0;
                                    int i12 = 0;
                                    while (i11 < d9) {
                                        if (this.f15299b[i11] == t12.f15299b[i12]) {
                                            i11++;
                                            i12++;
                                        }
                                    }
                                    return true;
                                }
                                throw new IllegalArgumentException(A0.a.l("Ran off end of other: 0, ", d9, t12.d(), ", "));
                            }
                            throw new IllegalArgumentException("Length too large: " + d9 + d());
                        }
                    } else {
                        return obj.equals(this);
                    }
                } else {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i9 = this.f15298a;
        if (i9 == 0) {
            int d9 = d();
            int i10 = d9;
            for (int i11 = 0; i11 < d9; i11++) {
                i10 = (i10 * 31) + this.f15299b[i11];
            }
            if (i10 == 0) {
                i10 = 1;
            }
            this.f15298a = i10;
            return i10;
        }
        return i9;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C0518d(this);
    }

    public final String toString() {
        T1 r1;
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int d9 = d();
        if (d() <= 50) {
            concat = Z0.a.D(this);
        } else {
            int e8 = e(0, 47, d());
            if (e8 == 0) {
                r1 = f15297c;
            } else {
                r1 = new R1(e8, this.f15299b);
            }
            concat = Z0.a.D(r1).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(d9);
        sb.append(" contents=\"");
        return AbstractC0953k1.q(sb, concat, "\">");
    }
}
