package z8;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class M {

    /* renamed from: y, reason: collision with root package name */
    public static final Pattern f25551y = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

    /* renamed from: z, reason: collision with root package name */
    public static final Pattern f25552z = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

    /* renamed from: a, reason: collision with root package name */
    public final Q f25553a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f25554b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f25555c;

    /* renamed from: d, reason: collision with root package name */
    public final Annotation[] f25556d;

    /* renamed from: e, reason: collision with root package name */
    public final Annotation[][] f25557e;

    /* renamed from: f, reason: collision with root package name */
    public final Type[] f25558f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f25559g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f25560h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f25561i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f25562k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f25563l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f25564m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f25565n;

    /* renamed from: o, reason: collision with root package name */
    public String f25566o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f25567p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f25568q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f25569r;

    /* renamed from: s, reason: collision with root package name */
    public String f25570s;

    /* renamed from: t, reason: collision with root package name */
    public i8.w f25571t;

    /* renamed from: u, reason: collision with root package name */
    public i8.A f25572u;

    /* renamed from: v, reason: collision with root package name */
    public LinkedHashSet f25573v;

    /* renamed from: w, reason: collision with root package name */
    public X[] f25574w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f25575x;

    public M(Q q9, Class cls, Method method) {
        this.f25553a = q9;
        this.f25554b = cls;
        this.f25555c = method;
        this.f25556d = method.getAnnotations();
        this.f25558f = method.getGenericParameterTypes();
        this.f25557e = method.getParameterAnnotations();
    }

    public static Class a(Class cls) {
        if (Boolean.TYPE == cls) {
            return Boolean.class;
        }
        if (Byte.TYPE == cls) {
            return Byte.class;
        }
        if (Character.TYPE == cls) {
            return Character.class;
        }
        if (Double.TYPE == cls) {
            return Double.class;
        }
        if (Float.TYPE == cls) {
            return Float.class;
        }
        if (Integer.TYPE == cls) {
            return Integer.class;
        }
        if (Long.TYPE == cls) {
            return Long.class;
        }
        if (Short.TYPE == cls) {
            return Short.class;
        }
        return cls;
    }

    public final void b(String str, String str2, boolean z9) {
        String str3 = this.f25566o;
        Method method = this.f25555c;
        if (str3 == null) {
            this.f25566o = str;
            this.f25567p = z9;
            if (str2.isEmpty()) {
                return;
            }
            int indexOf = str2.indexOf(63);
            Pattern pattern = f25551y;
            if (indexOf != -1 && indexOf < str2.length() - 1) {
                String substring = str2.substring(indexOf + 1);
                if (pattern.matcher(substring).find()) {
                    throw X.n(method, null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                }
            }
            this.f25570s = str2;
            Matcher matcher = pattern.matcher(str2);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            this.f25573v = linkedHashSet;
            return;
        }
        throw X.n(method, null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
    }

    public final void c(int i9, Type type) {
        if (!X.j(type)) {
        } else {
            throw X.o(this.f25555c, i9, "Parameter type must not include a type variable or wildcard: %s", type);
        }
    }
}
