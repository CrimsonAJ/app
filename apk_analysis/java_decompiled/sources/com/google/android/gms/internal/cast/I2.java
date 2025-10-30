package com.google.android.gms.internal.cast;

import androidx.datastore.preferences.protobuf.C0518d;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public class I2 implements Iterable, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final I2 f14726c = new I2(S2.f14763b);

    /* renamed from: a, reason: collision with root package name */
    public int f14727a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f14728b;

    static {
        int i9 = G2.f14718a;
    }

    public I2(byte[] bArr) {
        bArr.getClass();
        this.f14728b = bArr;
    }

    public static void e(int i9) {
        if (((i9 - 47) | 47) >= 0) {
        } else {
            throw new IndexOutOfBoundsException(AbstractC0953k1.j(i9, "End index: 47 >= "));
        }
    }

    public byte b(int i9) {
        return this.f14728b[i9];
    }

    public byte c(int i9) {
        return this.f14728b[i9];
    }

    public int d() {
        return this.f14728b.length;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if ((obj instanceof I2) && d() == ((I2) obj).d()) {
                if (d() != 0) {
                    if (obj instanceof I2) {
                        I2 i22 = (I2) obj;
                        int i9 = this.f14727a;
                        int i10 = i22.f14727a;
                        if (i9 == 0 || i10 == 0 || i9 == i10) {
                            int d9 = d();
                            if (d9 <= i22.d()) {
                                if (d9 <= i22.d()) {
                                    int i11 = 0;
                                    int i12 = 0;
                                    while (i11 < d9) {
                                        if (this.f14728b[i11] == i22.f14728b[i12]) {
                                            i11++;
                                            i12++;
                                        }
                                    }
                                    return true;
                                }
                                throw new IllegalArgumentException(A0.a.l("Ran off end of other: 0, ", d9, i22.d(), ", "));
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
        int i9 = 1;
        int i10 = this.f14727a;
        if (i10 == 0) {
            int d9 = d();
            Charset charset = S2.f14762a;
            int i11 = d9;
            for (int i12 = 0; i12 < d9; i12++) {
                i11 = (i11 * 31) + this.f14728b[i12];
            }
            if (i11 != 0) {
                i9 = i11;
            }
            this.f14727a = i9;
            return i9;
        }
        return i10;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C0518d(this);
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int d9 = d();
        if (d() <= 50) {
            concat = J.e(this);
        } else {
            e(d());
            concat = J.e(new H2(this.f14728b)).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(d9);
        sb.append(" contents=\"");
        return AbstractC0953k1.q(sb, concat, "\">");
    }
}
