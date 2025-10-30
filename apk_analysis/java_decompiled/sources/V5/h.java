package V5;

import G0.H;
import b6.C0682d;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import com.google.crypto.tink.shaded.protobuf.AbstractC1030a;
import com.google.crypto.tink.shaded.protobuf.AbstractC1037h;
import com.google.crypto.tink.shaded.protobuf.C1043n;
import h6.B;
import h6.C;
import h6.C1293h;
import h6.C1294i;
import h6.C1295j;
import h6.C1297l;
import h6.C1298m;
import h6.C1299n;
import h6.C1300o;
import h6.C1301p;
import h6.C1303s;
import h6.C1304t;
import h6.C1305u;
import h6.C1306v;
import h6.C1308x;
import h6.C1309y;
import h6.C1310z;
import h6.D;
import h6.F;
import h6.J;
import h6.O;
import h6.Q;
import h6.S;
import h6.T;
import h6.U;
import h6.V;
import h6.X;
import h6.m0;
import h6.p0;
import h6.u0;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class h extends H {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7744d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Class cls, f[] fVarArr, int i9) {
        super(cls, fVarArr);
        this.f7744d = i9;
    }

    public static C0682d k(int i9, int i10) {
        C1303s A2 = C1304t.A();
        A2.h();
        C1304t.x((C1304t) A2.f16404b, i9);
        C1305u z9 = C1306v.z();
        z9.h();
        C1306v.w((C1306v) z9.f16404b);
        C1306v c1306v = (C1306v) z9.c();
        A2.h();
        C1304t.w((C1304t) A2.f16404b, c1306v);
        return new C0682d((C1304t) A2.c(), i10);
    }

    public static C0682d l(int i9, int i10, int i11) {
        O o9 = O.SHA256;
        C1298m B9 = C1299n.B();
        C1300o z9 = C1301p.z();
        z9.h();
        C1301p.w((C1301p) z9.f16404b);
        C1301p c1301p = (C1301p) z9.c();
        B9.h();
        C1299n.w((C1299n) B9.f16404b, c1301p);
        B9.h();
        C1299n.x((C1299n) B9.f16404b, i9);
        C1299n c1299n = (C1299n) B9.c();
        S B10 = T.B();
        U B11 = V.B();
        B11.h();
        V.w((V) B11.f16404b, o9);
        B11.h();
        V.x((V) B11.f16404b, i10);
        V v8 = (V) B11.c();
        B10.h();
        T.w((T) B10.f16404b, v8);
        B10.h();
        T.x((T) B10.f16404b, 32);
        T t7 = (T) B10.c();
        C1294i A2 = C1295j.A();
        A2.h();
        C1295j.w((C1295j) A2.f16404b, c1299n);
        A2.h();
        C1295j.x((C1295j) A2.f16404b, t7);
        return new C0682d((C1295j) A2.c(), i11);
    }

    public static C0682d m(int i9, int i10) {
        C1309y y9 = C1310z.y();
        y9.h();
        C1310z.w((C1310z) y9.f16404b, i9);
        return new C0682d((C1310z) y9.c(), i10);
    }

    public static C0682d n(int i9, int i10) {
        C y9 = D.y();
        y9.h();
        D.w((D) y9.f16404b, i9);
        return new C0682d((D) y9.c(), i10);
    }

    @Override // G0.H
    public int c() {
        switch (this.f7744d) {
            case 0:
                return 2;
            case 1:
            default:
                return super.c();
            case 2:
                return 2;
        }
    }

    @Override // G0.H
    public final String d() {
        switch (this.f7744d) {
            case 0:
                return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
            case 1:
                return "type.googleapis.com/google.crypto.tink.AesEaxKey";
            case 2:
                return "type.googleapis.com/google.crypto.tink.AesGcmKey";
            case 3:
                return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
            case 4:
                return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
            case 5:
                return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
            case 6:
                return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
            case 7:
                return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
            default:
                return "type.googleapis.com/google.crypto.tink.AesSivKey";
        }
    }

    @Override // G0.H
    public final D.n f() {
        switch (this.f7744d) {
            case 0:
                return new g(this);
            case 1:
                return new g(this, (byte) 0);
            case 2:
                return new g(this, (char) 0);
            case 3:
                return new g(this, 0);
            case 4:
                return new g(this, (short) 0);
            case 5:
                return new g(this, (byte) 0, false);
            case 6:
                return new g(this, (byte) 0, (byte) 0);
            case 7:
                return new g(this, (byte) 0, (char) 0);
            default:
                return new g(this, (byte) 0, 0);
        }
    }

    @Override // G0.H
    public final X g() {
        switch (this.f7744d) {
            case 0:
                return X.SYMMETRIC;
            case 1:
                return X.SYMMETRIC;
            case 2:
                return X.SYMMETRIC;
            case 3:
                return X.SYMMETRIC;
            case 4:
                return X.SYMMETRIC;
            case 5:
                return X.REMOTE;
            case 6:
                return X.REMOTE;
            case 7:
                return X.SYMMETRIC;
            default:
                return X.SYMMETRIC;
        }
    }

    @Override // G0.H
    public final AbstractC1030a h(AbstractC1037h abstractC1037h) {
        switch (this.f7744d) {
            case 0:
                return C1293h.D(abstractC1037h, C1043n.a());
            case 1:
                return h6.r.D(abstractC1037h, C1043n.a());
            case 2:
                return C1308x.B(abstractC1037h, C1043n.a());
            case 3:
                return B.B(abstractC1037h, C1043n.a());
            case 4:
                return J.B(abstractC1037h, C1043n.a());
            case 5:
                return m0.B(abstractC1037h, C1043n.a());
            case 6:
                return p0.B(abstractC1037h, C1043n.a());
            case 7:
                return u0.B(abstractC1037h, C1043n.a());
            default:
                return F.B(abstractC1037h, C1043n.a());
        }
    }

    @Override // G0.H
    public final void j(AbstractC1030a abstractC1030a) {
        switch (this.f7744d) {
            case 0:
                C1293h c1293h = (C1293h) abstractC1030a;
                i6.o.c(c1293h.B());
                f[] fVarArr = {new f(1, i6.k.class)};
                HashMap hashMap = new HashMap();
                for (int i9 = 0; i9 < 1; i9++) {
                    f fVar = fVarArr[i9];
                    boolean containsKey = hashMap.containsKey(fVar.f7740a);
                    Class cls = fVar.f7740a;
                    if (!containsKey) {
                        hashMap.put(cls, fVar);
                    } else {
                        throw new IllegalArgumentException(AbstractC0953k1.l(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                    }
                }
                Class cls2 = fVarArr[0].f7740a;
                Collections.unmodifiableMap(hashMap);
                C1297l z9 = c1293h.z();
                i6.o.c(z9.C());
                i6.o.a(z9.A().size());
                C1301p B9 = z9.B();
                if (B9.y() >= 12 && B9.y() <= 16) {
                    f[] fVarArr2 = {new f(11, U5.j.class)};
                    HashMap hashMap2 = new HashMap();
                    f fVar2 = fVarArr2[0];
                    boolean containsKey2 = hashMap2.containsKey(fVar2.f7740a);
                    Class cls3 = fVar2.f7740a;
                    if (!containsKey2) {
                        hashMap2.put(cls3, fVar2);
                        Class cls4 = fVarArr2[0].f7740a;
                        Collections.unmodifiableMap(hashMap2);
                        Q A2 = c1293h.A();
                        i6.o.c(A2.C());
                        if (A2.A().size() >= 16) {
                            c6.c.m(A2.B());
                            return;
                        }
                        throw new GeneralSecurityException("key too short");
                    }
                    throw new IllegalArgumentException(AbstractC0953k1.l(cls3, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                }
                throw new GeneralSecurityException("invalid IV size");
            case 1:
                h6.r rVar = (h6.r) abstractC1030a;
                i6.o.c(rVar.B());
                i6.o.a(rVar.z().size());
                if (rVar.A().y() != 12 && rVar.A().y() != 16) {
                    throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
                }
                return;
            case 2:
                C1308x c1308x = (C1308x) abstractC1030a;
                i6.o.c(c1308x.z());
                i6.o.a(c1308x.y().size());
                return;
            case 3:
                B b9 = (B) abstractC1030a;
                i6.o.c(b9.z());
                i6.o.a(b9.y().size());
                return;
            case 4:
                J j = (J) abstractC1030a;
                i6.o.c(j.z());
                if (j.y().size() == 32) {
                    return;
                } else {
                    throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
                }
            case 5:
                i6.o.c(((m0) abstractC1030a).z());
                return;
            case 6:
                i6.o.c(((p0) abstractC1030a).z());
                return;
            case 7:
                u0 u0Var = (u0) abstractC1030a;
                i6.o.c(u0Var.z());
                if (u0Var.y().size() == 32) {
                    return;
                } else {
                    throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
                }
            default:
                F f9 = (F) abstractC1030a;
                i6.o.c(f9.z());
                if (f9.y().size() == 64) {
                    return;
                }
                throw new InvalidKeyException("invalid key size: " + f9.y().size() + ". Valid keys must have 64 bytes.");
        }
    }
}
