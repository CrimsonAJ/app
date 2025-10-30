package j3;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class Y implements InterfaceC1453f {

    /* renamed from: g, reason: collision with root package name */
    public static final Y f19489g;

    /* renamed from: h, reason: collision with root package name */
    public static final X0.k f19490h;

    /* renamed from: a, reason: collision with root package name */
    public final String f19491a;

    /* renamed from: b, reason: collision with root package name */
    public final U f19492b;

    /* renamed from: c, reason: collision with root package name */
    public final T f19493c;

    /* renamed from: d, reason: collision with root package name */
    public final C1446b0 f19494d;

    /* renamed from: e, reason: collision with root package name */
    public final Q f19495e;

    /* renamed from: f, reason: collision with root package name */
    public final V f19496f;

    /* JADX WARN: Type inference failed for: r4v0, types: [j3.P, j3.Q] */
    static {
        O o9 = new O();
        P5.D d9 = P5.F.f5901b;
        P5.S s9 = P5.S.f5926e;
        List list = Collections.EMPTY_LIST;
        P5.S s10 = P5.S.f5926e;
        f19489g = new Y("", new P(o9), null, new T(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), C1446b0.f19533Z, V.f19480c);
        f19490h = new X0.k(26);
    }

    public Y(String str, Q q9, U u9, T t7, C1446b0 c1446b0, V v8) {
        this.f19491a = str;
        this.f19492b = u9;
        this.f19493c = t7;
        this.f19494d = c1446b0;
        this.f19495e = q9;
        this.f19496f = v8;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Y) {
                Y y9 = (Y) obj;
                if (l4.y.a(this.f19491a, y9.f19491a) && this.f19495e.equals(y9.f19495e) && l4.y.a(this.f19492b, y9.f19492b) && this.f19493c.equals(y9.f19493c) && l4.y.a(this.f19494d, y9.f19494d) && l4.y.a(this.f19496f, y9.f19496f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i9;
        int hashCode = this.f19491a.hashCode() * 31;
        U u9 = this.f19492b;
        if (u9 != null) {
            i9 = u9.hashCode();
        } else {
            i9 = 0;
        }
        return this.f19496f.hashCode() + ((this.f19494d.hashCode() + ((this.f19495e.hashCode() + ((this.f19493c.hashCode() + ((hashCode + i9) * 31)) * 31)) * 31)) * 31);
    }
}
