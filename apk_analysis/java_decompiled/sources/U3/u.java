package U3;

import android.net.Uri;
import android.util.Base64;
import l4.AbstractC1566a;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final l f7465a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f7466b;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x02b9. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:35:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x06ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public u(U3.C0396c r42, android.net.Uri r43) {
        /*
            Method dump skipped, instructions count: 1992
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: U3.u.<init>(U3.c, android.net.Uri):void");
    }

    public static byte[] a(String str) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length + 4];
        System.arraycopy(AbstractC1566a.f20476d, 0, bArr, 0, 4);
        System.arraycopy(decode, 0, bArr, 4, decode.length);
        return bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u.class == obj.getClass()) {
            u uVar = (u) obj;
            if (this.f7465a.equals(uVar.f7465a) && this.f7466b.equals(uVar.f7466b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f7466b.hashCode() + ((this.f7465a.hashCode() + 217) * 31);
    }
}
