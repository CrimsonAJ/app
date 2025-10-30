package W7;

import java.io.Serializable;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class c implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Pattern f7942a;

    public c(String str) {
        Pattern compile = Pattern.compile(str);
        kotlin.jvm.internal.h.d(compile, "compile(...)");
        this.f7942a = compile;
    }

    public final String toString() {
        String pattern = this.f7942a.toString();
        kotlin.jvm.internal.h.d(pattern, "toString(...)");
        return pattern;
    }
}
