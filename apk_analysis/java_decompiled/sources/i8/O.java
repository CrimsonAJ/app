package i8;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public final C1411a f19046a;

    /* renamed from: b, reason: collision with root package name */
    public final Proxy f19047b;

    /* renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f19048c;

    public O(C1411a c1411a, Proxy proxy, InetSocketAddress socketAddress) {
        kotlin.jvm.internal.h.e(socketAddress, "socketAddress");
        this.f19046a = c1411a;
        this.f19047b = proxy;
        this.f19048c = socketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof O) {
            O o9 = (O) obj;
            if (kotlin.jvm.internal.h.a(o9.f19046a, this.f19046a) && kotlin.jvm.internal.h.a(o9.f19047b, this.f19047b) && kotlin.jvm.internal.h.a(o9.f19048c, this.f19048c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f19048c.hashCode() + ((this.f19047b.hashCode() + ((this.f19046a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f19048c + '}';
    }
}
