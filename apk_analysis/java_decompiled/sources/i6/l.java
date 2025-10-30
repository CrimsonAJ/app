package i6;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import l4.s;

/* loaded from: classes.dex */
public final class l extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f18733a;

    public l(s sVar) {
        this.f18733a = sVar;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        s sVar = this.f18733a;
        try {
            i iVar = i.f18731c;
            Mac mac = (Mac) iVar.f18732a.k((String) sVar.f20540c);
            mac.init((SecretKeySpec) sVar.f20541d);
            return mac;
        } catch (GeneralSecurityException e8) {
            throw new IllegalStateException(e8);
        }
    }
}
