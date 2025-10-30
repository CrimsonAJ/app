package t8;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import s8.p;

/* loaded from: classes.dex */
public final class h implements m {

    /* renamed from: a, reason: collision with root package name */
    public static final g f23332a = new Object();

    @Override // t8.m
    public final boolean a(SSLSocket sSLSocket) {
        return false;
    }

    @Override // t8.m
    public final String b(SSLSocket sSLSocket) {
        boolean equals;
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
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
        boolean z9 = s8.f.f22795d;
        return s8.f.f22795d;
    }

    @Override // t8.m
    public final void d(SSLSocket sSLSocket, String str, List protocols) {
        kotlin.jvm.internal.h.e(protocols, "protocols");
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            p pVar = p.f22822a;
            parameters.setApplicationProtocols((String[]) e0.c.z(protocols).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
