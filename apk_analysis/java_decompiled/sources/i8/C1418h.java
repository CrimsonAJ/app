package i8;

import java.util.concurrent.TimeUnit;

/* renamed from: i8.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1418h {

    /* renamed from: n, reason: collision with root package name */
    public static final C1418h f19086n = new C1418h(true, false, -1, -1, false, false, false, -1, -1, false, false, false, null);

    /* renamed from: o, reason: collision with root package name */
    public static final C1418h f19087o;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f19088a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f19089b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19090c;

    /* renamed from: d, reason: collision with root package name */
    public final int f19091d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f19092e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f19093f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f19094g;

    /* renamed from: h, reason: collision with root package name */
    public final int f19095h;

    /* renamed from: i, reason: collision with root package name */
    public final int f19096i;
    public final boolean j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f19097k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f19098l;

    /* renamed from: m, reason: collision with root package name */
    public String f19099m;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        kotlin.jvm.internal.h.e(timeUnit, "timeUnit");
        int i9 = Integer.MAX_VALUE;
        long seconds = timeUnit.toSeconds(Integer.MAX_VALUE);
        if (seconds <= 2147483647L) {
            i9 = (int) seconds;
        }
        f19087o = new C1418h(false, false, -1, -1, false, false, false, i9, -1, true, false, false, null);
    }

    public C1418h(boolean z9, boolean z10, int i9, int i10, boolean z11, boolean z12, boolean z13, int i11, int i12, boolean z14, boolean z15, boolean z16, String str) {
        this.f19088a = z9;
        this.f19089b = z10;
        this.f19090c = i9;
        this.f19091d = i10;
        this.f19092e = z11;
        this.f19093f = z12;
        this.f19094g = z13;
        this.f19095h = i11;
        this.f19096i = i12;
        this.j = z14;
        this.f19097k = z15;
        this.f19098l = z16;
        this.f19099m = str;
    }

    public final String toString() {
        String str = this.f19099m;
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f19088a) {
                sb.append("no-cache, ");
            }
            if (this.f19089b) {
                sb.append("no-store, ");
            }
            int i9 = this.f19090c;
            if (i9 != -1) {
                sb.append("max-age=");
                sb.append(i9);
                sb.append(", ");
            }
            int i10 = this.f19091d;
            if (i10 != -1) {
                sb.append("s-maxage=");
                sb.append(i10);
                sb.append(", ");
            }
            if (this.f19092e) {
                sb.append("private, ");
            }
            if (this.f19093f) {
                sb.append("public, ");
            }
            if (this.f19094g) {
                sb.append("must-revalidate, ");
            }
            int i11 = this.f19095h;
            if (i11 != -1) {
                sb.append("max-stale=");
                sb.append(i11);
                sb.append(", ");
            }
            int i12 = this.f19096i;
            if (i12 != -1) {
                sb.append("min-fresh=");
                sb.append(i12);
                sb.append(", ");
            }
            if (this.j) {
                sb.append("only-if-cached, ");
            }
            if (this.f19097k) {
                sb.append("no-transform, ");
            }
            if (this.f19098l) {
                sb.append("immutable, ");
            }
            if (sb.length() == 0) {
                return "";
            }
            sb.delete(sb.length() - 2, sb.length());
            String sb2 = sb.toString();
            kotlin.jvm.internal.h.d(sb2, "StringBuilder().apply(builderAction).toString()");
            this.f19099m = sb2;
            return sb2;
        }
        return str;
    }
}
