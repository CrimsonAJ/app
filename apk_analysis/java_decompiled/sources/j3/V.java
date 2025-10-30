package j3;

import android.net.Uri;
import b5.G1;

/* loaded from: classes.dex */
public final class V implements InterfaceC1453f {

    /* renamed from: c, reason: collision with root package name */
    public static final V f19480c = new V(new G1(13, false));

    /* renamed from: d, reason: collision with root package name */
    public static final X0.k f19481d = new X0.k(29);

    /* renamed from: a, reason: collision with root package name */
    public final Uri f19482a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19483b;

    public V(G1 g12) {
        this.f19482a = (Uri) g12.f10718c;
        this.f19483b = (String) g12.f10717b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V)) {
            return false;
        }
        V v8 = (V) obj;
        if (l4.y.a(this.f19482a, v8.f19482a) && l4.y.a(this.f19483b, v8.f19483b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i9 = 0;
        Uri uri = this.f19482a;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        int i10 = hashCode * 31;
        String str = this.f19483b;
        if (str != null) {
            i9 = str.hashCode();
        }
        return i10 + i9;
    }
}
