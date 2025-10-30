package k4;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class Y extends AbstractC1507g {

    /* renamed from: e, reason: collision with root package name */
    public final int f20035e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f20036f;

    /* renamed from: g, reason: collision with root package name */
    public final DatagramPacket f20037g;

    /* renamed from: h, reason: collision with root package name */
    public Uri f20038h;

    /* renamed from: i, reason: collision with root package name */
    public DatagramSocket f20039i;
    public MulticastSocket j;

    /* renamed from: k, reason: collision with root package name */
    public InetAddress f20040k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f20041l;

    /* renamed from: m, reason: collision with root package name */
    public int f20042m;

    public Y(int i9) {
        super(true);
        this.f20035e = i9;
        byte[] bArr = new byte[2000];
        this.f20036f = bArr;
        this.f20037g = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // k4.InterfaceC1510j
    public final int D(byte[] bArr, int i9, int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = this.f20042m;
        DatagramPacket datagramPacket = this.f20037g;
        if (i11 == 0) {
            try {
                DatagramSocket datagramSocket = this.f20039i;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f20042m = length;
                c(length);
            } catch (SocketTimeoutException e8) {
                throw new C1514n(e8, 2002);
            } catch (IOException e9) {
                throw new C1514n(e9, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i12 = this.f20042m;
        int min = Math.min(i12, i10);
        System.arraycopy(this.f20036f, length2 - i12, bArr, i9, min);
        this.f20042m -= min;
        return min;
    }

    @Override // k4.InterfaceC1513m
    public final void close() {
        this.f20038h = null;
        MulticastSocket multicastSocket = this.j;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f20040k;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.j = null;
        }
        DatagramSocket datagramSocket = this.f20039i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f20039i = null;
        }
        this.f20040k = null;
        this.f20042m = 0;
        if (this.f20041l) {
            this.f20041l = false;
            d();
        }
    }

    @Override // k4.InterfaceC1513m
    public final long g(C1516p c1516p) {
        Uri uri = c1516p.f20077a;
        this.f20038h = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f20038h.getPort();
        h();
        try {
            this.f20040k = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f20040k, port);
            if (this.f20040k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.j = multicastSocket;
                multicastSocket.joinGroup(this.f20040k);
                this.f20039i = this.j;
            } else {
                this.f20039i = new DatagramSocket(inetSocketAddress);
            }
            this.f20039i.setSoTimeout(this.f20035e);
            this.f20041l = true;
            i(c1516p);
            return -1L;
        } catch (IOException e8) {
            throw new C1514n(e8, 2001);
        } catch (SecurityException e9) {
            throw new C1514n(e9, 2006);
        }
    }

    @Override // k4.InterfaceC1513m
    public final Uri s() {
        return this.f20038h;
    }
}
