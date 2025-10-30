package k4;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import l4.AbstractC1566a;

/* renamed from: k4.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1516p {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f20077a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20078b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f20079c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f20080d;

    /* renamed from: e, reason: collision with root package name */
    public final long f20081e;

    /* renamed from: f, reason: collision with root package name */
    public final long f20082f;

    /* renamed from: g, reason: collision with root package name */
    public final String f20083g;

    /* renamed from: h, reason: collision with root package name */
    public final int f20084h;

    static {
        j3.K.a("goog.exo.datasource");
    }

    public C1516p(Uri uri) {
        this(uri, 0L, -1L);
    }

    public static String b(int i9) {
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 == 3) {
                    return "HEAD";
                }
                throw new IllegalStateException();
            }
            return "POST";
        }
        return "GET";
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [B3.c, java.lang.Object] */
    public final B3.c a() {
        ?? obj = new Object();
        obj.f658e = this.f20077a;
        obj.f654a = this.f20078b;
        obj.f659f = this.f20079c;
        obj.f660g = this.f20080d;
        obj.f655b = this.f20081e;
        obj.f656c = this.f20082f;
        obj.f661h = this.f20083g;
        obj.f657d = this.f20084h;
        return obj;
    }

    public final C1516p c(long j) {
        long j4 = this.f20082f;
        long j9 = -1;
        if (j4 != -1) {
            j9 = j4 - j;
        }
        long j10 = j9;
        if (j == 0 && j4 == j10) {
            return this;
        }
        long j11 = this.f20081e + j;
        return new C1516p(this.f20077a, this.f20078b, this.f20079c, this.f20080d, j11, j10, this.f20083g, this.f20084h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataSpec[");
        sb.append(b(this.f20078b));
        sb.append(" ");
        sb.append(this.f20077a);
        sb.append(", ");
        sb.append(this.f20081e);
        sb.append(", ");
        sb.append(this.f20082f);
        sb.append(", ");
        sb.append(this.f20083g);
        sb.append(", ");
        return u0.z.g(sb, this.f20084h, "]");
    }

    public C1516p(Uri uri, long j, long j4) {
        this(uri, 1, null, Collections.EMPTY_MAP, j, j4, null, 0);
    }

    public C1516p(Uri uri, int i9, byte[] bArr, Map map, long j, long j4, String str, int i10) {
        AbstractC1566a.h(j >= 0);
        AbstractC1566a.h(j >= 0);
        AbstractC1566a.h(j4 > 0 || j4 == -1);
        this.f20077a = uri;
        this.f20078b = i9;
        this.f20079c = (bArr == null || bArr.length == 0) ? null : bArr;
        this.f20080d = Collections.unmodifiableMap(new HashMap(map));
        this.f20081e = j;
        this.f20082f = j4;
        this.f20083g = str;
        this.f20084h = i10;
    }
}
