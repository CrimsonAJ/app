package t8;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;
import s8.p;

/* loaded from: classes.dex */
public final class j implements m {

    /* renamed from: a, reason: collision with root package name */
    public static final i f23333a = new Object();

    @Override // t8.m
    public final boolean a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // t8.m
    public final String b(SSLSocket sSLSocket) {
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // t8.m
    public final boolean c() {
        boolean z9 = s8.i.f22798d;
        return s8.i.f22798d;
    }

    @Override // t8.m
    public final void d(SSLSocket sSLSocket, String str, List protocols) {
        kotlin.jvm.internal.h.e(protocols, "protocols");
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            p pVar = p.f22822a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) e0.c.z(protocols).toArray(new String[0]));
        }
    }
}
