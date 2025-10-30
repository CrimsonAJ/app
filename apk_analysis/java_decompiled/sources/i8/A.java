package i8;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f18925d = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f18926e = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a, reason: collision with root package name */
    public final String f18927a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18928b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f18929c;

    public A(String str, String str2, String[] strArr) {
        this.f18927a = str;
        this.f18928b = str2;
        this.f18929c = strArr;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof A) && kotlin.jvm.internal.h.a(((A) obj).f18927a, this.f18927a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f18927a.hashCode();
    }

    public final String toString() {
        return this.f18927a;
    }
}
