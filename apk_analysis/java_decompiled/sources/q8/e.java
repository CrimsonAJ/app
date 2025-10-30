package q8;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import x8.C2190j;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final b[] f22471a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map f22472b;

    static {
        b bVar = new b("", b.f22452i);
        C2190j c2190j = b.f22449f;
        b bVar2 = new b("GET", c2190j);
        b bVar3 = new b("POST", c2190j);
        C2190j c2190j2 = b.f22450g;
        b bVar4 = new b("/", c2190j2);
        b bVar5 = new b("/index.html", c2190j2);
        C2190j c2190j3 = b.f22451h;
        b bVar6 = new b("http", c2190j3);
        b bVar7 = new b("https", c2190j3);
        C2190j c2190j4 = b.f22448e;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, new b("200", c2190j4), new b("204", c2190j4), new b("206", c2190j4), new b("304", c2190j4), new b("400", c2190j4), new b("404", c2190j4), new b("500", c2190j4), new b("accept-charset", ""), new b("accept-encoding", "gzip, deflate"), new b("accept-language", ""), new b("accept-ranges", ""), new b("accept", ""), new b("access-control-allow-origin", ""), new b("age", ""), new b("allow", ""), new b("authorization", ""), new b("cache-control", ""), new b("content-disposition", ""), new b("content-encoding", ""), new b("content-language", ""), new b("content-length", ""), new b("content-location", ""), new b("content-range", ""), new b("content-type", ""), new b("cookie", ""), new b("date", ""), new b("etag", ""), new b("expect", ""), new b("expires", ""), new b("from", ""), new b("host", ""), new b("if-match", ""), new b("if-modified-since", ""), new b("if-none-match", ""), new b("if-range", ""), new b("if-unmodified-since", ""), new b("last-modified", ""), new b("link", ""), new b("location", ""), new b("max-forwards", ""), new b("proxy-authenticate", ""), new b("proxy-authorization", ""), new b("range", ""), new b("referer", ""), new b("refresh", ""), new b("retry-after", ""), new b("server", ""), new b("set-cookie", ""), new b("strict-transport-security", ""), new b("transfer-encoding", ""), new b("user-agent", ""), new b("vary", ""), new b("via", ""), new b("www-authenticate", "")};
        f22471a = bVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i9 = 0; i9 < 61; i9++) {
            if (!linkedHashMap.containsKey(bVarArr[i9].f22453a)) {
                linkedHashMap.put(bVarArr[i9].f22453a, Integer.valueOf(i9));
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        kotlin.jvm.internal.h.d(unmodifiableMap, "unmodifiableMap(result)");
        f22472b = unmodifiableMap;
    }

    public static void a(C2190j name) {
        kotlin.jvm.internal.h.e(name, "name");
        int d9 = name.d();
        for (int i9 = 0; i9 < d9; i9++) {
            byte i10 = name.i(i9);
            if (65 <= i10 && i10 < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(name.q()));
            }
        }
    }
}
