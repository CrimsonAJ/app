package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.measurement.i2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0944i2 {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f15502a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f15503b;

    static {
        Charset.forName("US-ASCII");
        f15502a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f15503b = bArr;
        ByteBuffer.wrap(bArr);
    }
}
