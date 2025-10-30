package t8;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* loaded from: classes.dex */
public final class i implements k {
    @Override // t8.k
    public final boolean a(SSLSocket sSLSocket) {
        if (s8.i.f22798d && Conscrypt.isConscrypt(sSLSocket)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [t8.m, java.lang.Object] */
    @Override // t8.k
    public final m b(SSLSocket sSLSocket) {
        return new Object();
    }
}
