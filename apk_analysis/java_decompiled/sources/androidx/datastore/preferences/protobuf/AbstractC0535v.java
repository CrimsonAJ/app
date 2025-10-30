package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: androidx.datastore.preferences.protobuf.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0535v {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f9765a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f9766b;

    static {
        Charset.forName("US-ASCII");
        f9765a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f9766b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new C0522h(bArr, 0, 0, false).l(0);
        } catch (C0537x e8) {
            throw new IllegalArgumentException(e8);
        }
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
