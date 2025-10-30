package com.google.crypto.tink.shaded.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: com.google.crypto.tink.shaded.protobuf.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1054z {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f16405a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f16406b;

    static {
        Charset.forName("US-ASCII");
        f16405a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f16406b = bArr;
        ByteBuffer.wrap(bArr);
        W5.d.h(bArr, 0, 0, false);
    }

    public static void a(Object obj, String str) {
        if (obj != null) {
        } else {
            throw new NullPointerException(str);
        }
    }

    public static int b(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
