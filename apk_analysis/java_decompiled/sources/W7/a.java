package W7;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f7934a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile Charset f7935b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile Charset f7936c;

    static {
        Charset forName = Charset.forName("UTF-8");
        kotlin.jvm.internal.h.d(forName, "forName(...)");
        f7934a = forName;
        kotlin.jvm.internal.h.d(Charset.forName("UTF-16"), "forName(...)");
        kotlin.jvm.internal.h.d(Charset.forName("UTF-16BE"), "forName(...)");
        kotlin.jvm.internal.h.d(Charset.forName("UTF-16LE"), "forName(...)");
        kotlin.jvm.internal.h.d(Charset.forName("US-ASCII"), "forName(...)");
        kotlin.jvm.internal.h.d(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
