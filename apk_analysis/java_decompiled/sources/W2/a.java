package W2;

import V2.c;
import a.AbstractC0485a;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final String f7873c;

    /* renamed from: d, reason: collision with root package name */
    public static final Set f7874d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f7875e;

    /* renamed from: f, reason: collision with root package name */
    public static final a f7876f;

    /* renamed from: a, reason: collision with root package name */
    public final String f7877a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7878b;

    static {
        String w7 = AbstractC0485a.w("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f7873c = w7;
        String w9 = AbstractC0485a.w("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String w10 = AbstractC0485a.w("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f7874d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new c("proto"), new c("json"))));
        f7875e = new a(w7, null);
        f7876f = new a(w9, w10);
    }

    public a(String str, String str2) {
        this.f7877a = str;
        this.f7878b = str2;
    }

    public static a a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new a(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }
}
