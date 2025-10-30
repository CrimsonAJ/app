package j3;

import android.net.Uri;

/* loaded from: classes.dex */
public class X {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f19484a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19485b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19486c;

    /* renamed from: d, reason: collision with root package name */
    public final String f19487d;

    /* renamed from: e, reason: collision with root package name */
    public final String f19488e;

    public X(A3.F f9) {
        this.f19484a = (Uri) f9.f51c;
        this.f19485b = (String) f9.f52d;
        this.f19486c = f9.f50b;
        this.f19487d = (String) f9.f53e;
        this.f19488e = (String) f9.f54f;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof X) {
                X x5 = (X) obj;
                if (this.f19484a.equals(x5.f19484a) && l4.y.a(this.f19485b, x5.f19485b) && this.f19486c == x5.f19486c && l4.y.a(this.f19487d, x5.f19487d) && l4.y.a(this.f19488e, x5.f19488e)) {
                    return true;
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
        int hashCode3 = this.f19484a.hashCode() * 31;
        int i9 = 0;
        String str = this.f19485b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (((hashCode3 + hashCode) * 961) + this.f19486c) * 961;
        String str2 = this.f19487d;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        String str3 = this.f19488e;
        if (str3 != null) {
            i9 = str3.hashCode();
        }
        return i11 + i9;
    }
}
