package B1;

import W7.k;
import W7.l;
import android.graphics.Bitmap;
import i8.G;
import i8.w;
import java.util.Date;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final G f606a;

    /* renamed from: b, reason: collision with root package name */
    public final b f607b;

    /* renamed from: c, reason: collision with root package name */
    public final Date f608c;

    /* renamed from: d, reason: collision with root package name */
    public final String f609d;

    /* renamed from: e, reason: collision with root package name */
    public final Date f610e;

    /* renamed from: f, reason: collision with root package name */
    public final String f611f;

    /* renamed from: g, reason: collision with root package name */
    public final Date f612g;

    /* renamed from: h, reason: collision with root package name */
    public final long f613h;

    /* renamed from: i, reason: collision with root package name */
    public final long f614i;
    public final String j;

    /* renamed from: k, reason: collision with root package name */
    public final int f615k;

    public c(G g9, b bVar) {
        int i9;
        this.f606a = g9;
        this.f607b = bVar;
        this.f615k = -1;
        if (bVar != null) {
            this.f613h = bVar.f602c;
            this.f614i = bVar.f603d;
            w wVar = bVar.f605f;
            int size = wVar.size();
            for (int i10 = 0; i10 < size; i10++) {
                String c3 = wVar.c(i10);
                if (l.H(c3, "Date", true)) {
                    String b9 = wVar.b("Date");
                    this.f608c = b9 != null ? o8.a.a(b9) : null;
                    this.f609d = wVar.f(i10);
                } else if (l.H(c3, "Expires", true)) {
                    String b10 = wVar.b("Expires");
                    this.f612g = b10 != null ? o8.a.a(b10) : null;
                } else if (l.H(c3, "Last-Modified", true)) {
                    String b11 = wVar.b("Last-Modified");
                    this.f610e = b11 != null ? o8.a.a(b11) : null;
                    this.f611f = wVar.f(i10);
                } else if (l.H(c3, "ETag", true)) {
                    this.j = wVar.f(i10);
                } else if (l.H(c3, "Age", true)) {
                    String f9 = wVar.f(i10);
                    Bitmap.Config[] configArr = H1.f.f2949a;
                    Long F2 = k.F(f9);
                    if (F2 != null) {
                        long longValue = F2.longValue();
                        if (longValue > 2147483647L) {
                            i9 = Integer.MAX_VALUE;
                        } else if (longValue < 0) {
                            i9 = 0;
                        } else {
                            i9 = (int) longValue;
                        }
                    } else {
                        i9 = -1;
                    }
                    this.f615k = i9;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d2, code lost:
    
        if (r4 > 0) goto L55;
     */
    /* JADX WARN: Type inference failed for: r5v1, types: [A7.e, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final B1.d a() {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B1.c.a():B1.d");
    }
}
