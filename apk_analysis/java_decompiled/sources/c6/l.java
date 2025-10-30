package c6;

import b6.AbstractC0698t;
import b6.C0679a;
import b6.C0681c;
import b6.C0688j;
import b6.C0689k;
import h6.O;
import h6.r0;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final C0689k f11694a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0688j f11695b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0681c f11696c;

    /* renamed from: d, reason: collision with root package name */
    public static final C0679a f11697d;

    static {
        k6.a b9 = AbstractC0698t.b("type.googleapis.com/google.crypto.tink.HmacKey");
        f11694a = new C0689k(k.class);
        f11695b = new C0688j(b9);
        f11696c = new C0681c(j.class);
        f11697d = new C0679a(b9, new X0.k(9));
    }

    public static d a(O o9) {
        int ordinal = o9.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return d.f11671h;
                        }
                        throw new GeneralSecurityException("Unable to parse HashType: " + o9.a());
                    }
                    return d.f11673k;
                }
                return d.f11672i;
            }
            return d.j;
        }
        return d.f11670g;
    }

    public static d b(r0 r0Var) {
        int ordinal = r0Var.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal == 4) {
                        return d.f11675m;
                    }
                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + r0Var.b());
                }
                return d.f11677o;
            }
            return d.f11676n;
        }
        return d.f11674l;
    }
}
