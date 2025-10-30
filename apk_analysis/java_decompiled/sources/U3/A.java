package U3;

import j3.j0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: c, reason: collision with root package name */
    public static final A f7298c = new A(0, -9223372036854775807L);

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f7299d = Pattern.compile("npt[:=]([.\\d]+|now)\\s?-\\s?([.\\d]+)?");

    /* renamed from: a, reason: collision with root package name */
    public final long f7300a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7301b;

    public A(long j, long j4) {
        this.f7300a = j;
        this.f7301b = j4;
    }

    public static A a(String str) {
        long parseFloat;
        long parseFloat2;
        Matcher matcher = f7299d.matcher(str);
        boolean matches = matcher.matches();
        Pattern pattern = y.f7482a;
        if (matches) {
            String group = matcher.group(1);
            if (group != null) {
                int i9 = l4.y.f20553a;
                if (group.equals("now")) {
                    parseFloat = 0;
                } else {
                    parseFloat = Float.parseFloat(group) * 1000.0f;
                }
                String group2 = matcher.group(2);
                if (group2 != null) {
                    try {
                        parseFloat2 = Float.parseFloat(group2) * 1000.0f;
                        if (parseFloat2 < parseFloat) {
                            throw j0.b(str, null);
                        }
                    } catch (NumberFormatException e8) {
                        throw j0.b(group2, e8);
                    }
                } else {
                    parseFloat2 = -9223372036854775807L;
                }
                return new A(parseFloat, parseFloat2);
            }
            throw j0.b(str, null);
        }
        throw j0.b(str, null);
    }
}
