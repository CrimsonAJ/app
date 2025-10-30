package k4;

import android.net.Uri;
import android.util.Base64;
import j3.j0;
import java.net.URLDecoder;
import l4.AbstractC1566a;

/* renamed from: k4.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1511k extends AbstractC1507g {

    /* renamed from: e, reason: collision with root package name */
    public C1516p f20066e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f20067f;

    /* renamed from: g, reason: collision with root package name */
    public int f20068g;

    /* renamed from: h, reason: collision with root package name */
    public int f20069h;

    @Override // k4.InterfaceC1510j
    public final int D(byte[] bArr, int i9, int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = this.f20069h;
        if (i11 == 0) {
            return -1;
        }
        int min = Math.min(i10, i11);
        byte[] bArr2 = this.f20067f;
        int i12 = l4.y.f20553a;
        System.arraycopy(bArr2, this.f20068g, bArr, i9, min);
        this.f20068g += min;
        this.f20069h -= min;
        c(min);
        return min;
    }

    @Override // k4.InterfaceC1513m
    public final void close() {
        if (this.f20067f != null) {
            this.f20067f = null;
            d();
        }
        this.f20066e = null;
    }

    @Override // k4.InterfaceC1513m
    public final long g(C1516p c1516p) {
        h();
        this.f20066e = c1516p;
        Uri uri = c1516p.f20077a;
        String scheme = uri.getScheme();
        AbstractC1566a.g("Unsupported scheme: " + scheme, "data".equals(scheme));
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        int i9 = l4.y.f20553a;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length == 2) {
            String str = split[1];
            if (split[0].contains(";base64")) {
                try {
                    this.f20067f = Base64.decode(str, 0);
                } catch (IllegalArgumentException e8) {
                    throw new j0(u0.z.e("Error while parsing Base64 encoded string: ", str), e8, true, 0);
                }
            } else {
                this.f20067f = URLDecoder.decode(str, O5.e.f5489a.name()).getBytes(O5.e.f5491c);
            }
            byte[] bArr = this.f20067f;
            long length = bArr.length;
            long j = c1516p.f20081e;
            if (j <= length) {
                int i10 = (int) j;
                this.f20068g = i10;
                int length2 = bArr.length - i10;
                this.f20069h = length2;
                long j4 = c1516p.f20082f;
                if (j4 != -1) {
                    this.f20069h = (int) Math.min(length2, j4);
                }
                i(c1516p);
                if (j4 != -1) {
                    return j4;
                }
                return this.f20069h;
            }
            this.f20067f = null;
            throw new C1514n(2008);
        }
        throw new j0("Unexpected URI format: " + uri, null, true, 0);
    }

    @Override // k4.InterfaceC1513m
    public final Uri s() {
        C1516p c1516p = this.f20066e;
        if (c1516p != null) {
            return c1516p.f20077a;
        }
        return null;
    }
}
