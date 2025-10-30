package i8;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public final y f19005a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19006b;

    /* renamed from: c, reason: collision with root package name */
    public final w f19007c;

    /* renamed from: d, reason: collision with root package name */
    public final J f19008d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f19009e;

    /* renamed from: f, reason: collision with root package name */
    public C1418h f19010f;

    public G(y url, String method, w wVar, J j, Map map) {
        kotlin.jvm.internal.h.e(url, "url");
        kotlin.jvm.internal.h.e(method, "method");
        this.f19005a = url;
        this.f19006b = method;
        this.f19007c = wVar;
        this.f19008d = j;
        this.f19009e = map;
    }

    public final C1418h a() {
        C1418h c1418h = this.f19010f;
        if (c1418h == null) {
            C1418h c1418h2 = C1418h.f19086n;
            C1418h M7 = s8.e.M(this.f19007c);
            this.f19010f = M7;
            return M7;
        }
        return c1418h;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y2.r, java.lang.Object] */
    public final Y2.r b() {
        LinkedHashMap I4;
        ?? obj = new Object();
        obj.f8651e = new LinkedHashMap();
        obj.f8647a = this.f19005a;
        obj.f8648b = this.f19006b;
        obj.f8650d = this.f19008d;
        Map map = this.f19009e;
        if (map.isEmpty()) {
            I4 = new LinkedHashMap();
        } else {
            I4 = B7.y.I(map);
        }
        obj.f8651e = I4;
        obj.f8649c = this.f19007c.d();
        return obj;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.f19006b);
        sb.append(", url=");
        sb.append(this.f19005a);
        w wVar = this.f19007c;
        if (wVar.size() != 0) {
            sb.append(", headers=[");
            int i9 = 0;
            for (Object obj : wVar) {
                int i10 = i9 + 1;
                if (i9 >= 0) {
                    A7.h hVar = (A7.h) obj;
                    String str = (String) hVar.f547a;
                    String str2 = (String) hVar.f548b;
                    if (i9 > 0) {
                        sb.append(", ");
                    }
                    sb.append(str);
                    sb.append(':');
                    sb.append(str2);
                    i9 = i10;
                } else {
                    B7.l.e0();
                    throw null;
                }
            }
            sb.append(']');
        }
        Map map = this.f19009e;
        if (!map.isEmpty()) {
            sb.append(", tags=");
            sb.append(map);
        }
        sb.append('}');
        String sb2 = sb.toString();
        kotlin.jvm.internal.h.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
