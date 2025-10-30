package t8;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class l implements m {

    /* renamed from: a, reason: collision with root package name */
    public final k f23334a;

    /* renamed from: b, reason: collision with root package name */
    public m f23335b;

    public l(k kVar) {
        this.f23334a = kVar;
    }

    @Override // t8.m
    public final boolean a(SSLSocket sSLSocket) {
        return this.f23334a.a(sSLSocket);
    }

    @Override // t8.m
    public final String b(SSLSocket sSLSocket) {
        m e8 = e(sSLSocket);
        if (e8 != null) {
            return e8.b(sSLSocket);
        }
        return null;
    }

    @Override // t8.m
    public final boolean c() {
        return true;
    }

    @Override // t8.m
    public final void d(SSLSocket sSLSocket, String str, List protocols) {
        kotlin.jvm.internal.h.e(protocols, "protocols");
        m e8 = e(sSLSocket);
        if (e8 != null) {
            e8.d(sSLSocket, str, protocols);
        }
    }

    public final synchronized m e(SSLSocket sSLSocket) {
        try {
            if (this.f23335b == null && this.f23334a.a(sSLSocket)) {
                this.f23335b = this.f23334a.b(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f23335b;
    }
}
