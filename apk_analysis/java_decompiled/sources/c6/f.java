package c6;

import b6.AbstractC0698t;
import b6.C0679a;
import b6.C0681c;
import b6.C0688j;
import b6.C0689k;
import h6.r0;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final C0689k f11683a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0688j f11684b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0681c f11685c;

    /* renamed from: d, reason: collision with root package name */
    public static final C0679a f11686d;

    static {
        k6.a b9 = AbstractC0698t.b("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f11683a = new C0689k(e.class);
        f11684b = new C0688j(b9);
        f11685c = new C0681c(C0779a.class);
        f11686d = new C0679a(b9, new X0.k(7));
    }

    public static d a(r0 r0Var) {
        int ordinal = r0Var.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal == 4) {
                        return d.f11667d;
                    }
                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + r0Var.b());
                }
                return d.f11669f;
            }
            return d.f11668e;
        }
        return d.f11666c;
    }
}
