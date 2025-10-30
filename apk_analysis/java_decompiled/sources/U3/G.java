package U3;

import android.net.Uri;
import java.net.DatagramSocket;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import k4.C1516p;
import k4.W;
import k4.X;
import k4.Y;
import l4.AbstractC1566a;

/* loaded from: classes.dex */
public final class G implements InterfaceC0398e {

    /* renamed from: a, reason: collision with root package name */
    public final Y f7334a = new Y(v4.e.e(8000));

    /* renamed from: b, reason: collision with root package name */
    public G f7335b;

    @Override // k4.InterfaceC1510j
    public final int D(byte[] bArr, int i9, int i10) {
        try {
            return this.f7334a.D(bArr, i9, i10);
        } catch (X e8) {
            if (e8.f20071a == 2002) {
                return -1;
            }
            throw e8;
        }
    }

    @Override // k4.InterfaceC1513m
    public final void a(W w7) {
        this.f7334a.a(w7);
    }

    @Override // U3.InterfaceC0398e
    public final String b() {
        boolean z9;
        int f9 = f();
        if (f9 != -1) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC1566a.m(z9);
        int i9 = l4.y.f20553a;
        Locale locale = Locale.US;
        return A0.a.l("RTP/AVP;unicast;client_port=", f9, 1 + f9, "-");
    }

    @Override // k4.InterfaceC1513m
    public final void close() {
        this.f7334a.close();
        G g9 = this.f7335b;
        if (g9 != null) {
            g9.close();
        }
    }

    @Override // U3.InterfaceC0398e
    public final int f() {
        int localPort;
        DatagramSocket datagramSocket = this.f7334a.f20039i;
        if (datagramSocket == null) {
            localPort = -1;
        } else {
            localPort = datagramSocket.getLocalPort();
        }
        if (localPort == -1) {
            return -1;
        }
        return localPort;
    }

    @Override // k4.InterfaceC1513m
    public final long g(C1516p c1516p) {
        this.f7334a.g(c1516p);
        return -1L;
    }

    @Override // k4.InterfaceC1513m
    public final Map l() {
        return Collections.EMPTY_MAP;
    }

    @Override // k4.InterfaceC1513m
    public final Uri s() {
        return this.f7334a.f20038h;
    }

    @Override // U3.InterfaceC0398e
    public final F x() {
        return null;
    }
}
