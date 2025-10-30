package androidx.datastore.preferences.protobuf;

import a.AbstractC0485a;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: androidx.datastore.preferences.protobuf.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0521g implements Iterable, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final C0521g f9700c = new C0521g(AbstractC0535v.f9766b);

    /* renamed from: d, reason: collision with root package name */
    public static final C0519e f9701d;

    /* renamed from: a, reason: collision with root package name */
    public int f9702a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f9703b;

    static {
        C0519e c0519e;
        if (AbstractC0517c.a()) {
            c0519e = new C0519e(1);
        } else {
            c0519e = new C0519e(0);
        }
        f9701d = c0519e;
    }

    public C0521g(byte[] bArr) {
        bArr.getClass();
        this.f9703b = bArr;
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

    public static C0521g d(byte[] bArr, int i9, int i10) {
        byte[] copyOfRange;
        c(i9, i9 + i10, bArr.length);
        switch (f9701d.f9696a) {
            case 0:
                copyOfRange = Arrays.copyOfRange(bArr, i9, i10 + i9);
                break;
            default:
                copyOfRange = new byte[i10];
                System.arraycopy(bArr, i9, copyOfRange, 0, i10);
                break;
        }
        return new C0521g(copyOfRange);
    }

    public byte b(int i9) {
        return this.f9703b[i9];
    }

    public void e(int i9, byte[] bArr) {
        System.arraycopy(this.f9703b, 0, bArr, 0, i9);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if ((obj instanceof C0521g) && size() == ((C0521g) obj).size()) {
                if (size() != 0) {
                    if (obj instanceof C0521g) {
                        C0521g c0521g = (C0521g) obj;
                        int i9 = this.f9702a;
                        int i10 = c0521g.f9702a;
                        if (i9 == 0 || i10 == 0 || i9 == i10) {
                            int size = size();
                            if (size <= c0521g.size()) {
                                if (size <= c0521g.size()) {
                                    int f9 = f() + size;
                                    int f10 = f();
                                    int f11 = c0521g.f();
                                    while (f10 < f9) {
                                        if (this.f9703b[f10] != c0521g.f9703b[f11]) {
                                            return false;
                                        }
                                        f10++;
                                        f11++;
                                    }
                                    return true;
                                }
                                StringBuilder p9 = A0.a.p("Ran off end of other: 0, ", size, ", ");
                                p9.append(c0521g.size());
                                throw new IllegalArgumentException(p9.toString());
                            }
                            throw new IllegalArgumentException("Length too large: " + size + size());
                        }
                        return false;
                    }
                    return obj.equals(this);
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public int f() {
        return 0;
    }

    public byte g(int i9) {
        return this.f9703b[i9];
    }

    public final int hashCode() {
        int i9 = this.f9702a;
        if (i9 == 0) {
            int size = size();
            int f9 = f();
            int i10 = size;
            for (int i11 = f9; i11 < f9 + size; i11++) {
                i10 = (i10 * 31) + this.f9703b[i11];
            }
            if (i10 == 0) {
                i10 = 1;
            }
            this.f9702a = i10;
            return i10;
        }
        return i9;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0518d(this);
    }

    public int size() {
        return this.f9703b.length;
    }

    public final String toString() {
        C0521g c0520f;
        String sb;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            sb = AbstractC0485a.m(this);
        } else {
            StringBuilder sb2 = new StringBuilder();
            int c3 = c(0, 47, size());
            if (c3 == 0) {
                c0520f = f9700c;
            } else {
                c0520f = new C0520f(this.f9703b, f(), c3);
            }
            sb2.append(AbstractC0485a.m(c0520f));
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
