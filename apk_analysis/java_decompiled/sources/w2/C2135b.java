package w2;

import B6.u0;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.Comparator;

/* renamed from: w2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2135b implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24034a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f24034a) {
            case 0:
                return u0.o(Boolean.valueOf(Inet6Address.class.isInstance((InetAddress) obj)), Boolean.valueOf(Inet6Address.class.isInstance((InetAddress) obj2)));
            case 1:
                return u0.o(Boolean.valueOf(Inet6Address.class.isInstance((InetAddress) obj)), Boolean.valueOf(Inet6Address.class.isInstance((InetAddress) obj2)));
            default:
                return u0.o(Boolean.valueOf(Inet6Address.class.isInstance((InetAddress) obj)), Boolean.valueOf(Inet6Address.class.isInstance((InetAddress) obj2)));
        }
    }
}
