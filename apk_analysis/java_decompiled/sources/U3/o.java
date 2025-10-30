package U3;

import B6.u0;
import P5.AbstractC0349q;
import P5.C0350s;
import P5.C0352u;
import P5.C0357z;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import o1.C1671f;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final P5.G f7423a;

    static {
        new o(new C1671f(21));
    }

    public o(C1671f c1671f) {
        P5.G g9;
        Collection entrySet = ((C0352u) ((C1671f) c1671f.f21473b).f21473b).entrySet();
        if (((AbstractCollection) entrySet).isEmpty()) {
            g9 = C0357z.f6015e;
        } else {
            C0350s c0350s = (C0350s) entrySet;
            A3.E e8 = new A3.E(c0350s.f5997b.size(), 6);
            Iterator it = c0350s.iterator();
            int i9 = 0;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                P5.F o9 = P5.F.o((Collection) entry.getValue());
                if (!o9.isEmpty()) {
                    e8.n(key, o9);
                    i9 = o9.size() + i9;
                }
            }
            g9 = new P5.G(e8.d(), i9);
        }
        this.f7423a = g9;
    }

    public static String a(String str) {
        if (u0.w(str, "Accept")) {
            return "Accept";
        }
        if (u0.w(str, "Allow")) {
            return "Allow";
        }
        if (u0.w(str, "Authorization")) {
            return "Authorization";
        }
        if (u0.w(str, "Bandwidth")) {
            return "Bandwidth";
        }
        if (u0.w(str, "Blocksize")) {
            return "Blocksize";
        }
        if (u0.w(str, "Cache-Control")) {
            return "Cache-Control";
        }
        if (u0.w(str, "Connection")) {
            return "Connection";
        }
        if (u0.w(str, "Content-Base")) {
            return "Content-Base";
        }
        if (u0.w(str, "Content-Encoding")) {
            return "Content-Encoding";
        }
        if (u0.w(str, "Content-Language")) {
            return "Content-Language";
        }
        if (u0.w(str, "Content-Length")) {
            return "Content-Length";
        }
        if (u0.w(str, "Content-Location")) {
            return "Content-Location";
        }
        if (u0.w(str, "Content-Type")) {
            return "Content-Type";
        }
        if (u0.w(str, "CSeq")) {
            return "CSeq";
        }
        if (u0.w(str, "Date")) {
            return "Date";
        }
        if (u0.w(str, "Expires")) {
            return "Expires";
        }
        if (u0.w(str, "Location")) {
            return "Location";
        }
        if (u0.w(str, "Proxy-Authenticate")) {
            return "Proxy-Authenticate";
        }
        if (u0.w(str, "Proxy-Require")) {
            return "Proxy-Require";
        }
        if (u0.w(str, "Public")) {
            return "Public";
        }
        if (u0.w(str, "Range")) {
            return "Range";
        }
        if (u0.w(str, "RTP-Info")) {
            return "RTP-Info";
        }
        if (u0.w(str, "RTCP-Interval")) {
            return "RTCP-Interval";
        }
        if (u0.w(str, "Scale")) {
            return "Scale";
        }
        if (u0.w(str, "Session")) {
            return "Session";
        }
        if (u0.w(str, "Speed")) {
            return "Speed";
        }
        if (u0.w(str, "Supported")) {
            return "Supported";
        }
        if (u0.w(str, "Timestamp")) {
            return "Timestamp";
        }
        if (u0.w(str, "Transport")) {
            return "Transport";
        }
        if (u0.w(str, "User-Agent")) {
            return "User-Agent";
        }
        if (u0.w(str, "Via")) {
            return "Via";
        }
        if (u0.w(str, "WWW-Authenticate")) {
            return "WWW-Authenticate";
        }
        return str;
    }

    public final String b(String str) {
        P5.F c3 = this.f7423a.c(a(str));
        if (c3.isEmpty()) {
            return null;
        }
        return (String) AbstractC0349q.i(c3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        return this.f7423a.equals(((o) obj).f7423a);
    }

    public final int hashCode() {
        return this.f7423a.hashCode();
    }
}
