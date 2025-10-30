package O5;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f5489a = Charset.forName("US-ASCII");

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f5490b = Charset.forName("ISO-8859-1");

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f5491c = Charset.forName("UTF-8");

    /* renamed from: d, reason: collision with root package name */
    public static final Charset f5492d;

    /* renamed from: e, reason: collision with root package name */
    public static final Charset f5493e;

    static {
        Charset.forName("UTF-16BE");
        f5492d = Charset.forName("UTF-16LE");
        f5493e = Charset.forName("UTF-16");
    }
}
