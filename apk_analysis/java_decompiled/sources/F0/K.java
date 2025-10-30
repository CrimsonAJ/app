package F0;

import android.graphics.Rect;
import android.view.View;
import d0.C1086d;
import d0.InterfaceC1090h;

/* loaded from: classes.dex */
public abstract class K {

    /* renamed from: a, reason: collision with root package name */
    public int f2041a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2042b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2043c;

    public K(String str, int i9, String str2) {
        this.f2041a = i9;
        this.f2042b = str;
        this.f2043c = str2;
    }

    public static K b(androidx.recyclerview.widget.a aVar, int i9) {
        if (i9 != 0) {
            if (i9 == 1) {
                return new J(aVar, 1);
            }
            throw new IllegalArgumentException("invalid orientation");
        }
        return new J(aVar, 0);
    }

    public abstract void a(P0.a aVar);

    public abstract void c(P0.a aVar);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public int o() {
        if (Integer.MIN_VALUE == this.f2041a) {
            return 0;
        }
        return n() - this.f2041a;
    }

    public abstract int p(View view);

    public abstract int q(View view);

    public abstract void r(int i9);

    public abstract void s(P0.a aVar);

    public abstract void t(P0.a aVar);

    public abstract void u(P0.a aVar);

    public abstract void v(P0.a aVar);

    public abstract F4.L w(P0.a aVar);

    public K(androidx.recyclerview.widget.a aVar) {
        this.f2041a = Integer.MIN_VALUE;
        this.f2043c = new Rect();
        this.f2042b = aVar;
    }

    public K(InterfaceC1090h interfaceC1090h) {
        this.f2041a = 0;
        this.f2043c = new C1086d();
        this.f2042b = interfaceC1090h;
    }
}
