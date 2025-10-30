package c6;

import G0.H;
import b6.C0682d;
import b6.C0690l;
import com.google.crypto.tink.shaded.protobuf.AbstractC1030a;
import com.google.crypto.tink.shaded.protobuf.AbstractC1037h;
import com.google.crypto.tink.shaded.protobuf.C1043n;
import h6.C1287b;
import h6.C1289d;
import h6.C1291f;
import h6.O;
import h6.Q;
import h6.S;
import h6.T;
import h6.U;
import h6.V;
import h6.X;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class c extends H {

    /* renamed from: e, reason: collision with root package name */
    public static final C0690l f11663e = new C0690l(C0779a.class, new X0.k(6));

    /* renamed from: f, reason: collision with root package name */
    public static final C0690l f11664f = new C0690l(j.class, new X0.k(8));

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11665d = 1;

    public /* synthetic */ c(Class cls, V5.f[] fVarArr) {
        super(cls, fVarArr);
    }

    public static C0682d k(int i9, int i10, O o9, int i11) {
        S B9 = T.B();
        U B10 = V.B();
        B10.h();
        V.w((V) B10.f16404b, o9);
        B10.h();
        V.x((V) B10.f16404b, i10);
        V v8 = (V) B10.c();
        B9.h();
        T.w((T) B9.f16404b, v8);
        B9.h();
        T.x((T) B9.f16404b, i9);
        return new C0682d((T) B9.c(), i11);
    }

    public static void l(C1291f c1291f) {
        if (c1291f.y() >= 10) {
            if (c1291f.y() <= 16) {
                return;
            } else {
                throw new GeneralSecurityException("tag size too long");
            }
        }
        throw new GeneralSecurityException("tag size too short");
    }

    public static void m(V v8) {
        if (v8.A() >= 10) {
            int ordinal = v8.z().ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                if (v8.A() > 28) {
                                    throw new GeneralSecurityException("tag size too big");
                                }
                                return;
                            }
                            throw new GeneralSecurityException("unknown hash type");
                        }
                        if (v8.A() > 64) {
                            throw new GeneralSecurityException("tag size too big");
                        }
                        return;
                    }
                    if (v8.A() > 32) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                    return;
                }
                if (v8.A() > 48) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            }
            if (v8.A() <= 20) {
                return;
            } else {
                throw new GeneralSecurityException("tag size too big");
            }
        }
        throw new GeneralSecurityException("tag size too small");
    }

    @Override // G0.H
    public int c() {
        switch (this.f11665d) {
            case 1:
                return 2;
            default:
                return super.c();
        }
    }

    @Override // G0.H
    public final String d() {
        switch (this.f11665d) {
            case 0:
                return "type.googleapis.com/google.crypto.tink.AesCmacKey";
            default:
                return "type.googleapis.com/google.crypto.tink.HmacKey";
        }
    }

    @Override // G0.H
    public final D.n f() {
        switch (this.f11665d) {
            case 0:
                return new D.n(C1289d.class);
            default:
                return new V5.g(this);
        }
    }

    @Override // G0.H
    public final X g() {
        switch (this.f11665d) {
            case 0:
                return X.SYMMETRIC;
            default:
                return X.SYMMETRIC;
        }
    }

    @Override // G0.H
    public final AbstractC1030a h(AbstractC1037h abstractC1037h) {
        switch (this.f11665d) {
            case 0:
                return C1287b.D(abstractC1037h, C1043n.a());
            default:
                return Q.E(abstractC1037h, C1043n.a());
        }
    }

    @Override // G0.H
    public final void j(AbstractC1030a abstractC1030a) {
        switch (this.f11665d) {
            case 0:
                C1287b c1287b = (C1287b) abstractC1030a;
                i6.o.c(c1287b.B());
                if (c1287b.z().size() == 32) {
                    l(c1287b.A());
                    return;
                }
                throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
            default:
                Q q9 = (Q) abstractC1030a;
                i6.o.c(q9.C());
                if (q9.A().size() >= 16) {
                    m(q9.B());
                    return;
                }
                throw new GeneralSecurityException("key too short");
        }
    }

    public c() {
        super(Q.class, new V5.f(11, U5.j.class));
    }
}
