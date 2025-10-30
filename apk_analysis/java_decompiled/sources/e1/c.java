package e1;

import android.os.Build;
import w.AbstractC2128h;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: i, reason: collision with root package name */
    public static final c f17030i;

    /* renamed from: b, reason: collision with root package name */
    public boolean f17032b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f17033c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f17034d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f17035e;

    /* renamed from: a, reason: collision with root package name */
    public int f17031a = 1;

    /* renamed from: f, reason: collision with root package name */
    public long f17036f = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f17037g = -1;

    /* renamed from: h, reason: collision with root package name */
    public e f17038h = new e();

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, e1.c] */
    static {
        e eVar = new e();
        ?? obj = new Object();
        obj.f17031a = 1;
        obj.f17036f = -1L;
        obj.f17037g = -1L;
        obj.f17038h = new e();
        obj.f17032b = false;
        int i9 = Build.VERSION.SDK_INT;
        obj.f17033c = false;
        obj.f17031a = 1;
        obj.f17034d = false;
        obj.f17035e = false;
        if (i9 >= 24) {
            obj.f17038h = eVar;
            obj.f17036f = -1L;
            obj.f17037g = -1L;
        }
        f17030i = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f17032b == cVar.f17032b && this.f17033c == cVar.f17033c && this.f17034d == cVar.f17034d && this.f17035e == cVar.f17035e && this.f17036f == cVar.f17036f && this.f17037g == cVar.f17037g && this.f17031a == cVar.f17031a) {
                return this.f17038h.equals(cVar.f17038h);
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int b9 = ((((((((AbstractC2128h.b(this.f17031a) * 31) + (this.f17032b ? 1 : 0)) * 31) + (this.f17033c ? 1 : 0)) * 31) + (this.f17034d ? 1 : 0)) * 31) + (this.f17035e ? 1 : 0)) * 31;
        long j = this.f17036f;
        int i9 = (b9 + ((int) (j ^ (j >>> 32)))) * 31;
        long j4 = this.f17037g;
        return this.f17038h.f17041a.hashCode() + ((i9 + ((int) (j4 ^ (j4 >>> 32)))) * 31);
    }
}
