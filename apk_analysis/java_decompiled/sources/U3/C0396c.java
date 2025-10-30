package U3;

import P5.AbstractC0349q;
import P5.X;

/* renamed from: U3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0396c {

    /* renamed from: a, reason: collision with root package name */
    public final String f7349a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7350b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7351c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7352d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7353e;

    /* renamed from: f, reason: collision with root package name */
    public final String f7354f;

    /* renamed from: g, reason: collision with root package name */
    public final String f7355g;

    /* renamed from: h, reason: collision with root package name */
    public final String f7356h;

    /* renamed from: i, reason: collision with root package name */
    public final X f7357i;
    public final C0395b j;

    public C0396c(C0394a c0394a, X x5, C0395b c0395b) {
        this.f7349a = (String) c0394a.f7339d;
        this.f7350b = c0394a.f7336a;
        this.f7351c = (String) c0394a.f7340e;
        this.f7352d = c0394a.f7337b;
        this.f7354f = (String) c0394a.f7341f;
        this.f7355g = (String) c0394a.f7342g;
        this.f7353e = c0394a.f7338c;
        this.f7356h = (String) c0394a.f7343h;
        this.f7357i = x5;
        this.j = c0395b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0396c.class == obj.getClass()) {
            C0396c c0396c = (C0396c) obj;
            if (this.f7349a.equals(c0396c.f7349a) && this.f7350b == c0396c.f7350b && this.f7351c.equals(c0396c.f7351c) && this.f7352d == c0396c.f7352d && this.f7353e == c0396c.f7353e) {
                X x5 = this.f7357i;
                x5.getClass();
                if (AbstractC0349q.e(x5, c0396c.f7357i) && this.j.equals(c0396c.j) && l4.y.a(this.f7354f, c0396c.f7354f) && l4.y.a(this.f7355g, c0396c.f7355g) && l4.y.a(this.f7356h, c0396c.f7356h)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (this.j.hashCode() + ((this.f7357i.hashCode() + ((((u0.z.c(this.f7351c, (u0.z.c(this.f7349a, 217, 31) + this.f7350b) * 31, 31) + this.f7352d) * 31) + this.f7353e) * 31)) * 31)) * 31;
        int i9 = 0;
        String str = this.f7354f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode3 + hashCode) * 31;
        String str2 = this.f7355g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        String str3 = this.f7356h;
        if (str3 != null) {
            i9 = str3.hashCode();
        }
        return i11 + i9;
    }
}
