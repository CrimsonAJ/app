package Y2;

import android.support.v4.media.session.y;
import android.util.Base64;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f8629a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f8630b;

    /* renamed from: c, reason: collision with root package name */
    public final V2.d f8631c;

    public j(String str, byte[] bArr, V2.d dVar) {
        this.f8629a = str;
        this.f8630b = bArr;
        this.f8631c = dVar;
    }

    public static y a() {
        y yVar = new y(23, (byte) 0);
        yVar.f9333d = V2.d.f7660a;
        return yVar;
    }

    public final j b(V2.d dVar) {
        y a5 = a();
        a5.V(this.f8629a);
        if (dVar != null) {
            a5.f9333d = dVar;
            a5.f9332c = this.f8630b;
            return a5.B();
        }
        throw new NullPointerException("Null priority");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f8629a.equals(jVar.f8629a) && Arrays.equals(this.f8630b, jVar.f8630b) && this.f8631c.equals(jVar.f8631c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f8629a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f8630b)) * 1000003) ^ this.f8631c.hashCode();
    }

    public final String toString() {
        String encodeToString;
        byte[] bArr = this.f8630b;
        if (bArr == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(bArr, 2);
        }
        return "TransportContext(" + this.f8629a + ", " + this.f8631c + ", " + encodeToString + ")";
    }
}
