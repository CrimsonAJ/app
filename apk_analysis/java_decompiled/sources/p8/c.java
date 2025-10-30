package p8;

import i8.y;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.h;
import n8.i;

/* loaded from: classes.dex */
public final class c extends a {

    /* renamed from: d, reason: collision with root package name */
    public final y f22216d;

    /* renamed from: e, reason: collision with root package name */
    public long f22217e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f22218f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ U6.a f22219g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(U6.a aVar, y url) {
        super(aVar);
        h.e(url, "url");
        this.f22219g = aVar;
        this.f22216d = url;
        this.f22217e = -1L;
        this.f22218f = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0075, code lost:
    
        if (r12 == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x011b, code lost:
    
        if (r18.f22218f == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0078, code lost:
    
        com.google.android.gms.internal.measurement.Y1.i(16);
        r2 = java.lang.Integer.toString(r4, 16);
        kotlin.jvm.internal.h.d(r2, "toString(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0091, code lost:
    
        throw new java.lang.NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(r2));
     */
    @Override // p8.a, x8.I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b0(x8.C2187g r19, long r20) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p8.c.b0(x8.g, long):long");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f22211b) {
            return;
        }
        if (this.f22218f) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            if (!k8.c.h(this)) {
                ((i) this.f22219g.f7523c).l();
                a();
            }
        }
        this.f22211b = true;
    }
}
