package z8;

import b5.G1;
import d4.C1126e;
import f5.C1183o;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class L {

    /* renamed from: l, reason: collision with root package name */
    public static final char[] f25539l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f25540m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: a, reason: collision with root package name */
    public final String f25541a;

    /* renamed from: b, reason: collision with root package name */
    public final i8.y f25542b;

    /* renamed from: c, reason: collision with root package name */
    public String f25543c;

    /* renamed from: d, reason: collision with root package name */
    public i8.x f25544d;

    /* renamed from: e, reason: collision with root package name */
    public final Y2.r f25545e = new Y2.r(5);

    /* renamed from: f, reason: collision with root package name */
    public final C1183o f25546f;

    /* renamed from: g, reason: collision with root package name */
    public i8.A f25547g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f25548h;

    /* renamed from: i, reason: collision with root package name */
    public final G1 f25549i;
    public final C1126e j;

    /* renamed from: k, reason: collision with root package name */
    public i8.J f25550k;

    public L(String str, i8.y yVar, String str2, i8.w wVar, i8.A a5, boolean z9, boolean z10, boolean z11) {
        this.f25541a = str;
        this.f25542b = yVar;
        this.f25543c = str2;
        this.f25547g = a5;
        this.f25548h = z9;
        if (wVar != null) {
            this.f25546f = wVar.d();
        } else {
            this.f25546f = new C1183o(5);
        }
        if (z10) {
            this.j = new C1126e();
            return;
        }
        if (z11) {
            G1 g12 = new G1(12);
            this.f25549i = g12;
            i8.A type = i8.C.f18933f;
            kotlin.jvm.internal.h.e(type, "type");
            if (type.f18928b.equals("multipart")) {
                g12.f10718c = type;
            } else {
                throw new IllegalArgumentException(("multipart != " + type).toString());
            }
        }
    }

    public final void a(String name, String str, boolean z9) {
        C1126e c1126e = this.j;
        if (z9) {
            c1126e.getClass();
            kotlin.jvm.internal.h.e(name, "name");
            c1126e.f16867a.add(i8.r.c(name, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", 83));
            c1126e.f16868b.add(i8.r.c(str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", 83));
            return;
        }
        c1126e.getClass();
        kotlin.jvm.internal.h.e(name, "name");
        c1126e.f16867a.add(i8.r.c(name, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", 91));
        c1126e.f16868b.add(i8.r.c(str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", 91));
    }

    public final void b(String str, String str2, boolean z9) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                Pattern pattern = i8.A.f18925d;
                this.f25547g = M4.a.o(str2);
                return;
            } catch (IllegalArgumentException e8) {
                throw new IllegalArgumentException(u0.z.e("Malformed content type: ", str2), e8);
            }
        }
        C1183o c1183o = this.f25546f;
        if (z9) {
            c1183o.y(str, str2);
        } else {
            c1183o.v(str, str2);
        }
    }

    public final void c(i8.w wVar, i8.J body) {
        G1 g12 = this.f25549i;
        g12.getClass();
        kotlin.jvm.internal.h.e(body, "body");
        if (wVar.b("Content-Type") == null) {
            if (wVar.b("Content-Length") == null) {
                ((ArrayList) g12.f10719d).add(new i8.B(wVar, body));
                return;
            }
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }
        throw new IllegalArgumentException("Unexpected header: Content-Type");
    }

    public final void d(String encodedName, String str, boolean z9) {
        String str2 = this.f25543c;
        String str3 = null;
        if (str2 != null) {
            i8.y yVar = this.f25542b;
            i8.x g9 = yVar.g(str2);
            this.f25544d = g9;
            if (g9 != null) {
                this.f25543c = null;
            } else {
                throw new IllegalArgumentException("Malformed URL. Base: " + yVar + ", Relative: " + this.f25543c);
            }
        }
        if (z9) {
            i8.x xVar = this.f25544d;
            xVar.getClass();
            kotlin.jvm.internal.h.e(encodedName, "encodedName");
            if (xVar.f19166g == null) {
                xVar.f19166g = new ArrayList();
            }
            ArrayList arrayList = xVar.f19166g;
            kotlin.jvm.internal.h.b(arrayList);
            arrayList.add(i8.r.c(encodedName, 0, 0, " \"'<>#&=", 211));
            ArrayList arrayList2 = xVar.f19166g;
            kotlin.jvm.internal.h.b(arrayList2);
            if (str != null) {
                str3 = i8.r.c(str, 0, 0, " \"'<>#&=", 211);
            }
            arrayList2.add(str3);
            return;
        }
        this.f25544d.a(encodedName, str);
    }
}
