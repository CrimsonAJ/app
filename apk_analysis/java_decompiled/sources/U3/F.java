package U3;

import android.net.Uri;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import k4.AbstractC1507g;
import k4.C1516p;
import l4.AbstractC1566a;

/* loaded from: classes.dex */
public final class F extends AbstractC1507g implements InterfaceC0398e {

    /* renamed from: e, reason: collision with root package name */
    public final LinkedBlockingQueue f7330e;

    /* renamed from: f, reason: collision with root package name */
    public final long f7331f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f7332g;

    /* renamed from: h, reason: collision with root package name */
    public int f7333h;

    public F() {
        super(true);
        this.f7331f = 8000L;
        this.f7330e = new LinkedBlockingQueue();
        this.f7332g = new byte[0];
        this.f7333h = -1;
    }

    @Override // k4.InterfaceC1510j
    public final int D(byte[] bArr, int i9, int i10) {
        if (i10 == 0) {
            return 0;
        }
        int min = Math.min(i10, this.f7332g.length);
        System.arraycopy(this.f7332g, 0, bArr, i9, min);
        byte[] bArr2 = this.f7332g;
        this.f7332g = Arrays.copyOfRange(bArr2, min, bArr2.length);
        if (min == i10) {
            return min;
        }
        try {
            byte[] bArr3 = (byte[]) this.f7330e.poll(this.f7331f, TimeUnit.MILLISECONDS);
            if (bArr3 == null) {
                return -1;
            }
            int min2 = Math.min(i10 - min, bArr3.length);
            System.arraycopy(bArr3, 0, bArr, i9 + min, min2);
            if (min2 < bArr3.length) {
                this.f7332g = Arrays.copyOfRange(bArr3, min2, bArr3.length);
            }
            return min + min2;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return -1;
        }
    }

    @Override // U3.InterfaceC0398e
    public final String b() {
        boolean z9;
        if (this.f7333h != -1) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC1566a.m(z9);
        int i9 = this.f7333h;
        int i10 = this.f7333h + 1;
        int i11 = l4.y.f20553a;
        Locale locale = Locale.US;
        return A0.a.l("RTP/AVP/TCP;unicast;interleaved=", i9, i10, "-");
    }

    @Override // U3.InterfaceC0398e
    public final int f() {
        return this.f7333h;
    }

    @Override // k4.InterfaceC1513m
    public final long g(C1516p c1516p) {
        this.f7333h = c1516p.f20077a.getPort();
        return -1L;
    }

    @Override // k4.InterfaceC1513m
    public final Uri s() {
        return null;
    }

    @Override // k4.InterfaceC1513m
    public final void close() {
    }

    @Override // U3.InterfaceC0398e
    public final F x() {
        return this;
    }
}
