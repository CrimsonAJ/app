package com.google.crypto.tink.shaded.protobuf;

import com.google.android.gms.internal.measurement.AbstractC0953k1;
import com.google.android.gms.internal.measurement.Y1;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.google.crypto.tink.shaded.protobuf.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1037h implements Iterable, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final C1036g f16356b = new C1036g(AbstractC1054z.f16406b);

    /* renamed from: c, reason: collision with root package name */
    public static final C1034e f16357c;

    /* renamed from: a, reason: collision with root package name */
    public int f16358a;

    static {
        C1034e c1034e;
        if (AbstractC1032c.a()) {
            c1034e = new C1034e(1);
        } else {
            c1034e = new C1034e(0);
        }
        f16357c = c1034e;
    }

    public static int c(int i9, int i10, int i11) {
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

    public static C1036g d(byte[] bArr, int i9, int i10) {
        byte[] copyOfRange;
        c(i9, i9 + i10, bArr.length);
        switch (f16357c.f16345a) {
            case 0:
                copyOfRange = Arrays.copyOfRange(bArr, i9, i10 + i9);
                break;
            default:
                copyOfRange = new byte[i10];
                System.arraycopy(bArr, i9, copyOfRange, 0, i10);
                break;
        }
        return new C1036g(copyOfRange);
    }

    public abstract byte b(int i9);

    public abstract void e(int i9, byte[] bArr);

    public final byte[] f() {
        int size = size();
        if (size == 0) {
            return AbstractC1054z.f16406b;
        }
        byte[] bArr = new byte[size];
        e(size, bArr);
        return bArr;
    }

    public final int hashCode() {
        int i9 = this.f16358a;
        if (i9 == 0) {
            int size = size();
            C1036g c1036g = (C1036g) this;
            int g9 = c1036g.g();
            int i10 = size;
            for (int i11 = g9; i11 < g9 + size; i11++) {
                i10 = (i10 * 31) + c1036g.f16354d[i11];
            }
            if (i10 == 0) {
                i10 = 1;
            }
            this.f16358a = i10;
            return i10;
        }
        return i9;
    }

    public abstract int size();

    public final String toString() {
        C1036g c1035f;
        String sb;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            sb = Y1.m(this);
        } else {
            StringBuilder sb2 = new StringBuilder();
            C1036g c1036g = (C1036g) this;
            int c3 = c(0, 47, c1036g.size());
            if (c3 == 0) {
                c1035f = f16356b;
            } else {
                c1035f = new C1035f(c1036g.f16354d, c1036g.g(), c3);
            }
            sb2.append(Y1.m(c1035f));
            sb2.append("...");
            sb = sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder("<ByteString@");
        sb3.append(hexString);
        sb3.append(" size=");
        sb3.append(size);
        sb3.append(" contents=\"");
        return AbstractC0953k1.q(sb3, sb, "\">");
    }
}
