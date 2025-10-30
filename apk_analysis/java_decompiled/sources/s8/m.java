package s8;

import i8.F;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class m extends p {

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f22808c;

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        if (r0.intValue() >= 9) goto L10;
     */
    static {
        /*
            java.lang.String r0 = "java.specification.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r1 = 0
            if (r0 == 0) goto Le
            java.lang.Integer r0 = W7.k.E(r0)
            goto Lf
        Le:
            r0 = r1
        Lf:
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L1d
            int r0 = r0.intValue()
            r1 = 9
            if (r0 < r1) goto L25
        L1b:
            r2 = r3
            goto L25
        L1d:
            java.lang.Class<javax.net.ssl.SSLSocket> r0 = javax.net.ssl.SSLSocket.class
            java.lang.String r4 = "getApplicationProtocol"
            r0.getMethod(r4, r1)     // Catch: java.lang.NoSuchMethodException -> L25
            goto L1b
        L25:
            s8.m.f22808c = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s8.m.<clinit>():void");
    }

    @Override // s8.p
    public final void d(SSLSocket sSLSocket, String str, List protocols) {
        kotlin.jvm.internal.h.e(protocols, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : protocols) {
            if (((F) obj) != F.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(B7.m.f0(arrayList, 10));
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj2 = arrayList.get(i9);
            i9++;
            arrayList2.add(((F) obj2).f19004a);
        }
        sSLParameters.setApplicationProtocols((String[]) arrayList2.toArray(new String[0]));
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Override // s8.p
    public final String f(SSLSocket sSLSocket) {
        String applicationProtocol;
        boolean equals;
        try {
            applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null) {
                equals = true;
            } else {
                equals = applicationProtocol.equals("");
            }
            if (!equals) {
                return applicationProtocol;
            }
            return null;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
