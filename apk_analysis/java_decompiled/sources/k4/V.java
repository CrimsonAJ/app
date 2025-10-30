package k4;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class V implements InterfaceC1513m {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1513m f20032a;

    /* renamed from: b, reason: collision with root package name */
    public long f20033b;

    /* renamed from: c, reason: collision with root package name */
    public Uri f20034c;

    public V(InterfaceC1513m interfaceC1513m) {
        interfaceC1513m.getClass();
        this.f20032a = interfaceC1513m;
        this.f20034c = Uri.EMPTY;
        Map map = Collections.EMPTY_MAP;
    }

    @Override // k4.InterfaceC1510j
    public final int D(byte[] bArr, int i9, int i10) {
        int D8 = this.f20032a.D(bArr, i9, i10);
        if (D8 != -1) {
            this.f20033b += D8;
        }
        return D8;
    }

    @Override // k4.InterfaceC1513m
    public final void a(W w7) {
        w7.getClass();
        this.f20032a.a(w7);
    }

    @Override // k4.InterfaceC1513m
    public final void close() {
        this.f20032a.close();
    }

    @Override // k4.InterfaceC1513m
    public final long g(C1516p c1516p) {
        this.f20034c = c1516p.f20077a;
        Map map = Collections.EMPTY_MAP;
        InterfaceC1513m interfaceC1513m = this.f20032a;
        long g9 = interfaceC1513m.g(c1516p);
        Uri s9 = interfaceC1513m.s();
        s9.getClass();
        this.f20034c = s9;
        interfaceC1513m.l();
        return g9;
    }

    @Override // k4.InterfaceC1513m
    public final Map l() {
        return this.f20032a.l();
    }

    @Override // k4.InterfaceC1513m
    public final Uri s() {
        return this.f20032a.s();
    }
}
