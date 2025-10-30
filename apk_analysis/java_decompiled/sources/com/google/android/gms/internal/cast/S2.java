package com.google.android.gms.internal.cast;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class S2 {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f14762a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f14763b;

    static {
        Charset.forName("US-ASCII");
        f14762a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f14763b = bArr;
        ByteBuffer.wrap(bArr);
    }
}
