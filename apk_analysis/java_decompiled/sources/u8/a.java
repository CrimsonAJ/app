package u8;

import B6.u0;
import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;

/* loaded from: classes.dex */
public final class a extends ProxySelector {

    /* renamed from: a, reason: collision with root package name */
    public static final a f23715a = new ProxySelector();

    @Override // java.net.ProxySelector
    public final List select(URI uri) {
        if (uri != null) {
            return u0.D(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null");
    }

    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }
}
