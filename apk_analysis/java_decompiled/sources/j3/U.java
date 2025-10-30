package j3;

import P5.AbstractC0349q;
import android.net.Uri;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f19475a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19476b;

    /* renamed from: c, reason: collision with root package name */
    public final S f19477c;

    /* renamed from: d, reason: collision with root package name */
    public final List f19478d;

    /* renamed from: e, reason: collision with root package name */
    public final P5.F f19479e;

    public U(Uri uri, String str, S s9, List list, P5.F f9) {
        this.f19475a = uri;
        this.f19476b = str;
        this.f19477c = s9;
        this.f19478d = list;
        this.f19479e = f9;
        P5.D d9 = P5.F.f5901b;
        AbstractC0349q.c(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i9 = 0;
        int i10 = 0;
        while (i9 < f9.size()) {
            X x5 = (X) f9.get(i9);
            A3.F f10 = new A3.F(3);
            f10.f51c = x5.f19484a;
            f10.f52d = x5.f19485b;
            f10.f50b = x5.f19486c;
            f10.f53e = x5.f19487d;
            f10.f54f = x5.f19488e;
            X x9 = new X(f10);
            int i11 = i10 + 1;
            if (objArr.length < i11) {
                objArr = Arrays.copyOf(objArr, P5.C.e(objArr.length, i11));
            }
            objArr[i10] = x9;
            i9++;
            i10 = i11;
        }
        P5.F.k(i10, objArr);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof U) {
                U u9 = (U) obj;
                if (this.f19475a.equals(u9.f19475a) && l4.y.a(this.f19476b, u9.f19476b) && l4.y.a(this.f19477c, u9.f19477c) && this.f19478d.equals(u9.f19478d) && this.f19479e.equals(u9.f19479e)) {
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
        int hashCode2 = this.f19475a.hashCode() * 31;
        int i9 = 0;
        String str = this.f19476b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode2 + hashCode) * 31;
        S s9 = this.f19477c;
        if (s9 != null) {
            i9 = s9.hashCode();
        }
        return (this.f19479e.hashCode() + ((this.f19478d.hashCode() + ((i10 + i9) * 961)) * 961)) * 31;
    }
}
