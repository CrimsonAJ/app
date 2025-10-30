package com.google.crypto.tink.shaded.protobuf;

import F0.C0120y;
import java.io.IOException;

/* loaded from: classes.dex */
public final class f0 {
    public static e0 a(Object obj) {
        AbstractC1050v abstractC1050v = (AbstractC1050v) obj;
        e0 e0Var = abstractC1050v.unknownFields;
        if (e0Var == e0.f16346f) {
            e0 c3 = e0.c();
            abstractC1050v.unknownFields = c3;
            return c3;
        }
        return e0Var;
    }

    public static boolean b(Object obj, C0120y c0120y) {
        int i9 = c0120y.f2290b;
        int i10 = i9 >>> 3;
        int i11 = i9 & 7;
        W5.d dVar = (W5.d) c0120y.f2293e;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            return false;
                        }
                        if (i11 == 5) {
                            c0120y.T(5);
                            ((e0) obj).d((i10 << 3) | 5, Integer.valueOf(dVar.r()));
                            return true;
                        }
                        throw B.c();
                    }
                    e0 c3 = e0.c();
                    int i12 = i10 << 3;
                    int i13 = i12 | 4;
                    while (c0120y.e() != Integer.MAX_VALUE && b(c3, c0120y)) {
                    }
                    if (i13 == c0120y.f2290b) {
                        c3.f16351e = false;
                        ((e0) obj).d(i12 | 3, c3);
                        return true;
                    }
                    throw new IOException("Protocol message end-group tag did not match expected tag.");
                }
                ((e0) obj).d((i10 << 3) | 2, c0120y.m());
                return true;
            }
            c0120y.T(1);
            ((e0) obj).d((i10 << 3) | 1, Long.valueOf(dVar.s()));
            return true;
        }
        c0120y.T(0);
        ((e0) obj).d(i10 << 3, Long.valueOf(dVar.v()));
        return true;
    }
}
