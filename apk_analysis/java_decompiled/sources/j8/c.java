package j8;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import kotlin.jvm.internal.h;
import x8.C2190j;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f19803a = 0;

    static {
        Charset charset = StandardCharsets.US_ASCII;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, x8.g] */
    public static ArrayList a(String hostname, C2190j byteString) {
        h.e(hostname, "hostname");
        h.e(byteString, "byteString");
        ArrayList arrayList = new ArrayList();
        ?? obj = new Object();
        obj.t0(byteString);
        obj.n0();
        short n02 = obj.n0();
        if (((n02 & 65535) >> 15) != 0) {
            int i9 = n02 & 15;
            if (i9 != 2) {
                if (i9 != 3) {
                    int n03 = obj.n0() & 65535;
                    int n04 = obj.n0() & 65535;
                    obj.n0();
                    obj.n0();
                    for (int i10 = 0; i10 < n03; i10++) {
                        byte h02 = obj.h0();
                        if (h02 < 0) {
                            obj.n(1L);
                        } else {
                            while (h02 > 0) {
                                obj.n(h02);
                                h02 = obj.h0();
                            }
                        }
                        obj.n0();
                        obj.n0();
                    }
                    for (int i11 = 0; i11 < n04; i11++) {
                        byte h03 = obj.h0();
                        if (h03 < 0) {
                            obj.n(1L);
                        } else {
                            while (h03 > 0) {
                                obj.n(h03);
                                h03 = obj.h0();
                            }
                        }
                        int n05 = obj.n0() & 65535;
                        obj.n0();
                        obj.m0();
                        int n06 = obj.n0() & 65535;
                        if (n05 != 1 && n05 != 28) {
                            obj.n(n06);
                        } else {
                            byte[] bArr = new byte[n06];
                            obj.g0(bArr, 0, n06);
                            InetAddress byAddress = InetAddress.getByAddress(bArr);
                            h.d(byAddress, "getByAddress(bytes)");
                            arrayList.add(byAddress);
                        }
                    }
                    return arrayList;
                }
                throw new UnknownHostException(hostname.concat(": NXDOMAIN"));
            }
            throw new UnknownHostException(hostname.concat(": SERVFAIL"));
        }
        throw new IllegalArgumentException("not a response");
    }
}
