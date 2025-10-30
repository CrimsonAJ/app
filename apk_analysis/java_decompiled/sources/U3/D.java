package U3;

import P5.AbstractC0349q;
import P5.S;
import P5.X;
import android.net.Uri;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public final X f7316a;

    /* renamed from: b, reason: collision with root package name */
    public final S f7317b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7318c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7319d;

    /* renamed from: e, reason: collision with root package name */
    public final String f7320e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7321f;

    /* renamed from: g, reason: collision with root package name */
    public final Uri f7322g;

    /* renamed from: h, reason: collision with root package name */
    public final String f7323h;

    /* renamed from: i, reason: collision with root package name */
    public final String f7324i;
    public final String j;

    /* renamed from: k, reason: collision with root package name */
    public final String f7325k;

    /* renamed from: l, reason: collision with root package name */
    public final String f7326l;

    public D(C c3) {
        this.f7316a = X.a(c3.f7305a);
        this.f7317b = c3.f7306b.d();
        String str = c3.f7308d;
        int i9 = l4.y.f20553a;
        this.f7318c = str;
        this.f7319d = c3.f7309e;
        this.f7320e = c3.f7310f;
        this.f7322g = c3.f7311g;
        this.f7323h = c3.f7312h;
        this.f7321f = c3.f7307c;
        this.f7324i = c3.f7313i;
        this.j = c3.f7314k;
        this.f7325k = c3.f7315l;
        this.f7326l = c3.j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && D.class == obj.getClass()) {
                D d9 = (D) obj;
                if (this.f7321f == d9.f7321f) {
                    X x5 = this.f7316a;
                    x5.getClass();
                    if (AbstractC0349q.e(x5, d9.f7316a) && this.f7317b.equals(d9.f7317b) && l4.y.a(this.f7319d, d9.f7319d) && l4.y.a(this.f7318c, d9.f7318c) && l4.y.a(this.f7320e, d9.f7320e) && l4.y.a(this.f7326l, d9.f7326l) && l4.y.a(this.f7322g, d9.f7322g) && l4.y.a(this.j, d9.j) && l4.y.a(this.f7325k, d9.f7325k) && l4.y.a(this.f7323h, d9.f7323h) && l4.y.a(this.f7324i, d9.f7324i)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9 = (this.f7317b.hashCode() + ((this.f7316a.hashCode() + 217) * 31)) * 31;
        int i9 = 0;
        String str = this.f7319d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode9 + hashCode) * 31;
        String str2 = this.f7318c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        String str3 = this.f7320e;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i12 = (((i11 + hashCode3) * 31) + this.f7321f) * 31;
        String str4 = this.f7326l;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i13 = (i12 + hashCode4) * 31;
        Uri uri = this.f7322g;
        if (uri == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = uri.hashCode();
        }
        int i14 = (i13 + hashCode5) * 31;
        String str5 = this.j;
        if (str5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str5.hashCode();
        }
        int i15 = (i14 + hashCode6) * 31;
        String str6 = this.f7325k;
        if (str6 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str6.hashCode();
        }
        int i16 = (i15 + hashCode7) * 31;
        String str7 = this.f7323h;
        if (str7 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str7.hashCode();
        }
        int i17 = (i16 + hashCode8) * 31;
        String str8 = this.f7324i;
        if (str8 != null) {
            i9 = str8.hashCode();
        }
        return i17 + i9;
    }
}
