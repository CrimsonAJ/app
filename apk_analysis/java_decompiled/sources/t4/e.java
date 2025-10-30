package t4;

import android.os.Bundle;
import b5.G1;
import com.google.android.gms.cast.CastDevice;
import java.util.Arrays;
import java.util.UUID;
import u4.D;

/* loaded from: classes.dex */
public final class e implements C4.b {

    /* renamed from: a, reason: collision with root package name */
    public final CastDevice f23179a;

    /* renamed from: b, reason: collision with root package name */
    public final D f23180b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f23181c;

    /* renamed from: d, reason: collision with root package name */
    public final String f23182d = UUID.randomUUID().toString();

    public /* synthetic */ e(G1 g12) {
        this.f23179a = (CastDevice) g12.f10717b;
        this.f23180b = (D) g12.f10718c;
        this.f23181c = (Bundle) g12.f10719d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0058, code lost:
    
        if (r1 == r3) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof t4.e
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            t4.e r8 = (t4.e) r8
            com.google.android.gms.cast.CastDevice r1 = r8.f23179a
            com.google.android.gms.cast.CastDevice r3 = r7.f23179a
            boolean r1 = F4.y.k(r3, r1)
            if (r1 == 0) goto L65
            android.os.Bundle r1 = r7.f23181c
            android.os.Bundle r3 = r8.f23181c
            if (r1 == 0) goto L58
            if (r3 != 0) goto L1f
            goto L58
        L1f:
            int r4 = r1.size()
            int r5 = r3.size()
            if (r4 == r5) goto L2a
            goto L65
        L2a:
            java.util.Set r4 = r1.keySet()
            java.util.Set r5 = r3.keySet()
            boolean r5 = r4.containsAll(r5)
            if (r5 != 0) goto L39
            goto L65
        L39:
            java.util.Iterator r4 = r4.iterator()
        L3d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L5a
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r1.get(r5)
            java.lang.Object r5 = r3.get(r5)
            boolean r5 = F4.y.k(r6, r5)
            if (r5 != 0) goto L3d
            goto L65
        L58:
            if (r1 != r3) goto L65
        L5a:
            java.lang.String r1 = r7.f23182d
            java.lang.String r8 = r8.f23182d
            boolean r8 = F4.y.k(r1, r8)
            if (r8 == 0) goto L65
            return r0
        L65:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: t4.e.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f23179a, this.f23181c, 0, this.f23182d});
    }
}
