package Y2;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final V2.c f8639a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f8640b;

    public m(V2.c cVar, byte[] bArr) {
        if (cVar != null) {
            if (bArr != null) {
                this.f8639a = cVar;
                this.f8640b = bArr;
                return;
            }
            throw new NullPointerException("bytes is null");
        }
        throw new NullPointerException("encoding is null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (!this.f8639a.equals(mVar.f8639a)) {
            return false;
        }
        return Arrays.equals(this.f8640b, mVar.f8640b);
    }

    public final int hashCode() {
        return ((this.f8639a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f8640b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f8639a + ", bytes=[...]}";
    }
}
