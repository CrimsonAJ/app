package t8;

import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import s8.p;

/* loaded from: classes.dex */
public final class a implements m {
    @Override // t8.m
    public final boolean a(SSLSocket sSLSocket) {
        boolean isSupportedSocket;
        isSupportedSocket = SSLSockets.isSupportedSocket(sSLSocket);
        return isSupportedSocket;
    }

    @Override // t8.m
    public final String b(SSLSocket sSLSocket) {
        String applicationProtocol;
        boolean equals;
        applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null) {
            equals = true;
        } else {
            equals = applicationProtocol.equals("");
        }
        if (equals) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // t8.m
    public final boolean c() {
        p pVar = p.f22822a;
        if (e0.c.F() && Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        return false;
    }

    @Override // t8.m
    public final void d(SSLSocket sSLSocket, String str, List protocols) {
        kotlin.jvm.internal.h.e(protocols, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            p pVar = p.f22822a;
            sSLParameters.setApplicationProtocols((String[]) e0.c.z(protocols).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e8) {
            throw new IOException("Android internal error", e8);
        }
    }
}
