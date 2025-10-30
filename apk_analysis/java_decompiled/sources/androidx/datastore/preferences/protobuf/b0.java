package androidx.datastore.preferences.protobuf;

import F0.C0120y;
import java.io.IOException;

/* loaded from: classes.dex */
public final class b0 {
    public static a0 a(Object obj) {
        AbstractC0533t abstractC0533t = (AbstractC0533t) obj;
        a0 a0Var = abstractC0533t.unknownFields;
        if (a0Var == a0.f9682f) {
            a0 a0Var2 = new a0(0, new int[8], new Object[8], true);
            abstractC0533t.unknownFields = a0Var2;
            return a0Var2;
        }
        return a0Var;
    }

    public static boolean b(int i9, C0120y c0120y, Object obj) {
        int i10 = c0120y.f2290b;
        int i11 = i10 >>> 3;
        int i12 = i10 & 7;
        W5.d dVar = (W5.d) c0120y.f2293e;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 == 4) {
                            return false;
                        }
                        if (i12 == 5) {
                            c0120y.T(5);
                            ((a0) obj).c(5 | (i11 << 3), Integer.valueOf(dVar.r()));
                            return true;
                        }
                        throw C0537x.b();
                    }
                    a0 a0Var = new a0(0, new int[8], new Object[8], true);
                    int i13 = i11 << 3;
                    int i14 = i13 | 4;
                    int i15 = i9 + 1;
                    if (i15 >= 100) {
                        throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                    }
                    while (c0120y.e() != Integer.MAX_VALUE && b(i15, c0120y, a0Var)) {
                    }
                    if (i14 == c0120y.f2290b) {
                        if (a0Var.f9687e) {
                            a0Var.f9687e = false;
                        }
                        ((a0) obj).c(i13 | 3, a0Var);
                        return true;
                    }
                    throw new IOException("Protocol message end-group tag did not match expected tag.");
                }
                ((a0) obj).c((i11 << 3) | 2, c0120y.l());
                return true;
            }
            c0120y.T(1);
            ((a0) obj).c((i11 << 3) | 1, Long.valueOf(dVar.s()));
            return true;
        }
        c0120y.T(0);
        ((a0) obj).c(i11 << 3, Long.valueOf(dVar.v()));
        return true;
    }
}
