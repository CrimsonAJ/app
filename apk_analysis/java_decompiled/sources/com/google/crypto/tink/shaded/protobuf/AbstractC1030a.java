package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;

/* renamed from: com.google.crypto.tink.shaded.protobuf.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1030a implements P {
    protected int memoizedHashCode;

    public abstract int a(b0 b0Var);

    public final String c(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public abstract AbstractC1048t d();

    public final byte[] e() {
        try {
            int a5 = ((AbstractC1050v) this).a(null);
            byte[] bArr = new byte[a5];
            C1040k c1040k = new C1040k(a5, bArr);
            f(c1040k);
            if (a5 - c1040k.j == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e8) {
            throw new RuntimeException(c("byte array"), e8);
        }
    }

    public abstract void f(C1040k c1040k);
}
