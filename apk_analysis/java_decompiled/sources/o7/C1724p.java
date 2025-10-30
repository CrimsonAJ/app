package o7;

import java.io.IOException;
import java.util.Arrays;
import x8.C2187g;

/* renamed from: o7.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1724p extends AbstractC1725q {

    /* renamed from: i, reason: collision with root package name */
    public static final String[] f21701i = new String[128];

    /* renamed from: g, reason: collision with root package name */
    public final C2187g f21702g;

    /* renamed from: h, reason: collision with root package name */
    public String f21703h;

    static {
        for (int i9 = 0; i9 <= 31; i9++) {
            f21701i[i9] = String.format("\\u%04x", Integer.valueOf(i9));
        }
        String[] strArr = f21701i;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public C1724p(C2187g c2187g) {
        int[] iArr = new int[32];
        this.f21705b = iArr;
        this.f21706c = new String[32];
        this.f21707d = new int[32];
        this.f21709f = -1;
        this.f21702g = c2187g;
        this.f21704a = 1;
        iArr[0] = 6;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void h0(x8.C2187g r7, java.lang.String r8) {
        /*
            java.lang.String[] r0 = o7.C1724p.f21701i
            r1 = 34
            r7.w0(r1)
            int r2 = r8.length()
            r3 = 0
            r4 = r3
        Ld:
            if (r3 >= r2) goto L36
            char r5 = r8.charAt(r3)
            r6 = 128(0x80, float:1.794E-43)
            if (r5 >= r6) goto L1c
            r5 = r0[r5]
            if (r5 != 0) goto L29
            goto L33
        L1c:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L23
            java.lang.String r5 = "\\u2028"
            goto L29
        L23:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L33
            java.lang.String r5 = "\\u2029"
        L29:
            if (r4 >= r3) goto L2e
            r7.C0(r8, r4, r3)
        L2e:
            r7.B0(r5)
            int r4 = r3 + 1
        L33:
            int r3 = r3 + 1
            goto Ld
        L36:
            if (r4 >= r2) goto L3b
            r7.C0(r8, r4, r2)
        L3b:
            r7.w0(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o7.C1724p.h0(x8.g, java.lang.String):void");
    }

    @Override // o7.AbstractC1725q
    public final C1724p F() {
        if (!this.f21708e) {
            if (this.f21703h != null) {
                this.f21703h = null;
                return this;
            }
            S();
            this.f21702g.B0("null");
            int[] iArr = this.f21707d;
            int i9 = this.f21704a - 1;
            iArr[i9] = iArr[i9] + 1;
            return this;
        }
        throw new IllegalStateException("null cannot be used as a map key in JSON at path " + s());
    }

    @Override // o7.AbstractC1725q
    public final C1724p N(long j) {
        if (this.f21708e) {
            this.f21708e = false;
            x(Long.toString(j));
            return this;
        }
        i0();
        S();
        this.f21702g.B0(Long.toString(j));
        int[] iArr = this.f21707d;
        int i9 = this.f21704a - 1;
        iArr[i9] = iArr[i9] + 1;
        return this;
    }

    @Override // o7.AbstractC1725q
    public final C1724p O(String str) {
        if (str == null) {
            F();
            return this;
        }
        if (this.f21708e) {
            this.f21708e = false;
            x(str);
            return this;
        }
        i0();
        S();
        h0(this.f21702g, str);
        int[] iArr = this.f21707d;
        int i9 = this.f21704a - 1;
        iArr[i9] = iArr[i9] + 1;
        return this;
    }

    public final void S() {
        int I4 = I();
        int i9 = 2;
        if (I4 != 1) {
            C2187g c2187g = this.f21702g;
            if (I4 != 2) {
                if (I4 != 4) {
                    if (I4 != 9) {
                        if (I4 != 6) {
                            if (I4 == 7) {
                                throw new IllegalStateException("JSON must have only one top-level value.");
                            }
                            throw new IllegalStateException("Nesting problem.");
                        }
                        i9 = 7;
                    } else {
                        throw new IllegalStateException("Sink from valueSink() was not closed");
                    }
                } else {
                    c2187g.B0(":");
                    i9 = 5;
                }
            } else {
                c2187g.w0(44);
            }
        }
        this.f21705b[this.f21704a - 1] = i9;
    }

    @Override // o7.AbstractC1725q
    public final C1724p a() {
        if (!this.f21708e) {
            i0();
            g0(1, 2, '[');
            return this;
        }
        throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + s());
    }

    public final void a0(int i9, int i10, char c3) {
        int I4 = I();
        if (I4 != i10 && I4 != i9) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f21703h == null) {
            int i11 = this.f21704a;
            int i12 = ~this.f21709f;
            if (i11 == i12) {
                this.f21709f = i12;
                return;
            }
            int i13 = i11 - 1;
            this.f21704a = i13;
            this.f21706c[i13] = null;
            int[] iArr = this.f21707d;
            int i14 = i11 - 2;
            iArr[i14] = iArr[i14] + 1;
            this.f21702g.w0(c3);
            return;
        }
        throw new IllegalStateException("Dangling name: " + this.f21703h);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i9 = this.f21704a;
        if (i9 <= 1 && (i9 != 1 || this.f21705b[i9 - 1] == 7)) {
            this.f21704a = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override // o7.AbstractC1725q
    public final C1724p d() {
        if (!this.f21708e) {
            i0();
            g0(3, 5, '{');
            return this;
        }
        throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + s());
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.f21704a != 0) {
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    @Override // o7.AbstractC1725q
    public final C1724p g() {
        this.f21708e = false;
        a0(3, 5, '}');
        return this;
    }

    public final void g0(int i9, int i10, char c3) {
        int i11;
        int i12 = this.f21704a;
        int i13 = this.f21709f;
        if (i12 == i13 && ((i11 = this.f21705b[i12 - 1]) == i9 || i11 == i10)) {
            this.f21709f = ~i13;
            return;
        }
        S();
        int i14 = this.f21704a;
        int[] iArr = this.f21705b;
        if (i14 == iArr.length) {
            if (i14 != 256) {
                this.f21705b = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f21706c;
                this.f21706c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f21707d;
                this.f21707d = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                throw new RuntimeException("Nesting too deep at " + s() + ": circular reference?");
            }
        }
        int[] iArr3 = this.f21705b;
        int i15 = this.f21704a;
        this.f21704a = i15 + 1;
        iArr3[i15] = i9;
        this.f21707d[i15] = 0;
        this.f21702g.w0(c3);
    }

    public final void i0() {
        if (this.f21703h != null) {
            int I4 = I();
            C2187g c2187g = this.f21702g;
            if (I4 == 5) {
                c2187g.w0(44);
            } else if (I4 != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            this.f21705b[this.f21704a - 1] = 4;
            h0(c2187g, this.f21703h);
            this.f21703h = null;
        }
    }

    @Override // o7.AbstractC1725q
    public final C1724p x(String str) {
        if (str != null) {
            if (this.f21704a != 0) {
                int I4 = I();
                if ((I4 == 3 || I4 == 5) && this.f21703h == null && !this.f21708e) {
                    this.f21703h = str;
                    this.f21706c[this.f21704a - 1] = str;
                    return this;
                }
                throw new IllegalStateException("Nesting problem.");
            }
            throw new IllegalStateException("JsonWriter is closed.");
        }
        throw new NullPointerException("name == null");
    }
}
