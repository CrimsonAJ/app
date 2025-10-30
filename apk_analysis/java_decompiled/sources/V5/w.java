package V5;

import i.G;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class w extends b {
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, V5.w] */
    public static w b(j jVar, G g9, Integer num) {
        j jVar2 = j.f7758q;
        if (jVar != jVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + jVar + " the value of idRequirement must be non-null");
        }
        if (jVar == jVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        k6.a aVar = (k6.a) g9.f17990b;
        if (aVar.f20137a.length == 32) {
            if (jVar == jVar2) {
                k6.a.a(new byte[0]);
            } else if (jVar == j.f7757p) {
                k6.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
            } else if (jVar == j.f7756o) {
                k6.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
            } else {
                throw new IllegalStateException("Unknown Variant: " + jVar);
            }
            return new Object();
        }
        throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + aVar.f20137a.length);
    }
}
