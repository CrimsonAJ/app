package V5;

import G0.H;
import b6.C0682d;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import com.google.crypto.tink.shaded.protobuf.AbstractC1030a;
import com.google.crypto.tink.shaded.protobuf.AbstractC1037h;
import com.google.crypto.tink.shaded.protobuf.C1036g;
import com.google.crypto.tink.shaded.protobuf.C1043n;
import h6.B;
import h6.C1285A;
import h6.C1292g;
import h6.C1293h;
import h6.C1295j;
import h6.C1296k;
import h6.C1297l;
import h6.C1299n;
import h6.C1301p;
import h6.C1302q;
import h6.C1304t;
import h6.C1306v;
import h6.C1307w;
import h6.C1308x;
import h6.C1310z;
import h6.D;
import h6.E;
import h6.F;
import h6.G;
import h6.I;
import h6.J;
import h6.L;
import h6.O;
import h6.P;
import h6.Q;
import h6.T;
import h6.V;
import h6.l0;
import h6.m0;
import h6.n0;
import h6.o0;
import h6.p0;
import h6.q0;
import h6.t0;
import h6.u0;
import h6.v0;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class g extends D.n {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7742b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ H f7743c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, byte b9, boolean z9) {
        super(n0.class);
        this.f7743c = hVar;
    }

    @Override // D.n
    public final AbstractC1030a X(AbstractC1030a abstractC1030a) {
        H h7 = this.f7743c;
        switch (this.f7742b) {
            case 0:
                C1295j c1295j = (C1295j) abstractC1030a;
                f[] fVarArr = {new f(1, i6.k.class)};
                HashMap hashMap = new HashMap();
                for (f fVar : fVarArr) {
                    boolean containsKey = hashMap.containsKey(fVar.f7740a);
                    Class cls = fVar.f7740a;
                    if (!containsKey) {
                        hashMap.put(cls, fVar);
                    } else {
                        throw new IllegalArgumentException(AbstractC0953k1.l(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                    }
                }
                if (fVarArr.length > 0) {
                    Class cls2 = fVarArr[0].f7740a;
                }
                Collections.unmodifiableMap(hashMap);
                C1299n y9 = c1295j.y();
                C1296k D8 = C1297l.D();
                C1301p A2 = y9.A();
                D8.h();
                C1297l.x((C1297l) D8.f16404b, A2);
                byte[] a5 = i6.n.a(y9.z());
                C1036g d9 = AbstractC1037h.d(a5, 0, a5.length);
                D8.h();
                C1297l.y((C1297l) D8.f16404b, d9);
                D8.h();
                C1297l.w((C1297l) D8.f16404b);
                C1297l c1297l = (C1297l) D8.c();
                f[] fVarArr2 = {new f(11, U5.j.class)};
                HashMap hashMap2 = new HashMap();
                for (f fVar2 : fVarArr2) {
                    boolean containsKey2 = hashMap2.containsKey(fVar2.f7740a);
                    Class cls3 = fVar2.f7740a;
                    if (!containsKey2) {
                        hashMap2.put(cls3, fVar2);
                    } else {
                        throw new IllegalArgumentException(AbstractC0953k1.l(cls3, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                    }
                }
                if (fVarArr2.length > 0) {
                    Class cls4 = fVarArr2[0].f7740a;
                }
                Collections.unmodifiableMap(hashMap2);
                T z9 = c1295j.z();
                P D9 = Q.D();
                D9.h();
                Q.w((Q) D9.f16404b);
                V A9 = z9.A();
                D9.h();
                Q.x((Q) D9.f16404b, A9);
                byte[] a9 = i6.n.a(z9.z());
                C1036g d10 = AbstractC1037h.d(a9, 0, a9.length);
                D9.h();
                Q.y((Q) D9.f16404b, d10);
                Q q9 = (Q) D9.c();
                C1292g C8 = C1293h.C();
                C8.h();
                C1293h.x((C1293h) C8.f16404b, c1297l);
                C8.h();
                C1293h.y((C1293h) C8.f16404b, q9);
                ((h) h7).getClass();
                C8.h();
                C1293h.w((C1293h) C8.f16404b);
                return (C1293h) C8.c();
            case 1:
                C1304t c1304t = (C1304t) abstractC1030a;
                C1302q C9 = h6.r.C();
                byte[] a10 = i6.n.a(c1304t.y());
                C1036g d11 = AbstractC1037h.d(a10, 0, a10.length);
                C9.h();
                h6.r.y((h6.r) C9.f16404b, d11);
                C1306v z10 = c1304t.z();
                C9.h();
                h6.r.x((h6.r) C9.f16404b, z10);
                ((h) h7).getClass();
                C9.h();
                h6.r.w((h6.r) C9.f16404b);
                return (h6.r) C9.c();
            case 2:
                C1307w A10 = C1308x.A();
                byte[] a11 = i6.n.a(((C1310z) abstractC1030a).x());
                C1036g d12 = AbstractC1037h.d(a11, 0, a11.length);
                A10.h();
                C1308x.x((C1308x) A10.f16404b, d12);
                ((h) h7).getClass();
                A10.h();
                C1308x.w((C1308x) A10.f16404b);
                return (C1308x) A10.c();
            case 3:
                C1285A A11 = B.A();
                byte[] a12 = i6.n.a(((D) abstractC1030a).x());
                C1036g d13 = AbstractC1037h.d(a12, 0, a12.length);
                A11.h();
                B.x((B) A11.f16404b, d13);
                ((h) h7).getClass();
                A11.h();
                B.w((B) A11.f16404b);
                return (B) A11.c();
            case 4:
                I A12 = J.A();
                ((h) h7).getClass();
                A12.h();
                J.w((J) A12.f16404b);
                byte[] a13 = i6.n.a(32);
                C1036g d14 = AbstractC1037h.d(a13, 0, a13.length);
                A12.h();
                J.x((J) A12.f16404b, d14);
                return (J) A12.c();
            case 5:
                l0 A13 = m0.A();
                A13.h();
                m0.x((m0) A13.f16404b, (n0) abstractC1030a);
                ((h) h7).getClass();
                A13.h();
                m0.w((m0) A13.f16404b);
                return (m0) A13.c();
            case 6:
                o0 A14 = p0.A();
                A14.h();
                p0.x((p0) A14.f16404b, (q0) abstractC1030a);
                ((h) h7).getClass();
                A14.h();
                p0.w((p0) A14.f16404b);
                return (p0) A14.c();
            case 7:
                t0 A15 = u0.A();
                ((h) h7).getClass();
                A15.h();
                u0.w((u0) A15.f16404b);
                byte[] a14 = i6.n.a(32);
                C1036g d15 = AbstractC1037h.d(a14, 0, a14.length);
                A15.h();
                u0.x((u0) A15.f16404b, d15);
                return (u0) A15.c();
            case 8:
                E A16 = F.A();
                byte[] a15 = i6.n.a(((h6.H) abstractC1030a).x());
                C1036g d16 = AbstractC1037h.d(a15, 0, a15.length);
                A16.h();
                F.x((F) A16.f16404b, d16);
                ((h) h7).getClass();
                A16.h();
                F.w((F) A16.f16404b);
                return (F) A16.c();
            default:
                T t7 = (T) abstractC1030a;
                P D10 = Q.D();
                ((c6.c) h7).getClass();
                D10.h();
                Q.w((Q) D10.f16404b);
                V A17 = t7.A();
                D10.h();
                Q.x((Q) D10.f16404b, A17);
                byte[] a16 = i6.n.a(t7.z());
                C1036g d17 = AbstractC1037h.d(a16, 0, a16.length);
                D10.h();
                Q.y((Q) D10.f16404b, d17);
                return (Q) D10.c();
        }
    }

    @Override // D.n
    public Map e0() {
        switch (this.f7742b) {
            case 0:
                HashMap hashMap = new HashMap();
                hashMap.put("AES128_CTR_HMAC_SHA256", h.l(16, 16, 1));
                hashMap.put("AES128_CTR_HMAC_SHA256_RAW", h.l(16, 16, 3));
                hashMap.put("AES256_CTR_HMAC_SHA256", h.l(32, 32, 1));
                hashMap.put("AES256_CTR_HMAC_SHA256_RAW", h.l(32, 32, 3));
                return Collections.unmodifiableMap(hashMap);
            case 1:
                HashMap hashMap2 = new HashMap();
                hashMap2.put("AES128_EAX", h.k(16, 1));
                hashMap2.put("AES128_EAX_RAW", h.k(16, 3));
                hashMap2.put("AES256_EAX", h.k(32, 1));
                hashMap2.put("AES256_EAX_RAW", h.k(32, 3));
                return Collections.unmodifiableMap(hashMap2);
            case 2:
                HashMap hashMap3 = new HashMap();
                hashMap3.put("AES128_GCM", h.m(16, 1));
                hashMap3.put("AES128_GCM_RAW", h.m(16, 3));
                hashMap3.put("AES256_GCM", h.m(32, 1));
                hashMap3.put("AES256_GCM_RAW", h.m(32, 3));
                return Collections.unmodifiableMap(hashMap3);
            case 3:
                HashMap hashMap4 = new HashMap();
                hashMap4.put("AES128_GCM_SIV", h.n(16, 1));
                hashMap4.put("AES128_GCM_SIV_RAW", h.n(16, 3));
                hashMap4.put("AES256_GCM_SIV", h.n(32, 1));
                hashMap4.put("AES256_GCM_SIV_RAW", h.n(32, 3));
                return Collections.unmodifiableMap(hashMap4);
            case 4:
                HashMap hashMap5 = new HashMap();
                hashMap5.put("CHACHA20_POLY1305", new C0682d(L.w(), 1));
                hashMap5.put("CHACHA20_POLY1305_RAW", new C0682d(L.w(), 3));
                return Collections.unmodifiableMap(hashMap5);
            case 5:
            case 6:
            default:
                return super.e0();
            case 7:
                HashMap hashMap6 = new HashMap();
                hashMap6.put("XCHACHA20_POLY1305", new C0682d(v0.w(), 1));
                hashMap6.put("XCHACHA20_POLY1305_RAW", new C0682d(v0.w(), 3));
                return Collections.unmodifiableMap(hashMap6);
            case 8:
                HashMap hashMap7 = new HashMap();
                G y9 = h6.H.y();
                y9.h();
                h6.H.w((h6.H) y9.f16404b);
                hashMap7.put("AES256_SIV", new C0682d((h6.H) y9.c(), 1));
                G y10 = h6.H.y();
                y10.h();
                h6.H.w((h6.H) y10.f16404b);
                hashMap7.put("AES256_SIV_RAW", new C0682d((h6.H) y10.c(), 3));
                return Collections.unmodifiableMap(hashMap7);
            case 9:
                HashMap hashMap8 = new HashMap();
                O o9 = O.SHA256;
                hashMap8.put("HMAC_SHA256_128BITTAG", c6.c.k(32, 16, o9, 1));
                hashMap8.put("HMAC_SHA256_128BITTAG_RAW", c6.c.k(32, 16, o9, 3));
                hashMap8.put("HMAC_SHA256_256BITTAG", c6.c.k(32, 32, o9, 1));
                hashMap8.put("HMAC_SHA256_256BITTAG_RAW", c6.c.k(32, 32, o9, 3));
                O o10 = O.SHA512;
                hashMap8.put("HMAC_SHA512_128BITTAG", c6.c.k(64, 16, o10, 1));
                hashMap8.put("HMAC_SHA512_128BITTAG_RAW", c6.c.k(64, 16, o10, 3));
                hashMap8.put("HMAC_SHA512_256BITTAG", c6.c.k(64, 32, o10, 1));
                hashMap8.put("HMAC_SHA512_256BITTAG_RAW", c6.c.k(64, 32, o10, 3));
                hashMap8.put("HMAC_SHA512_512BITTAG", c6.c.k(64, 64, o10, 1));
                hashMap8.put("HMAC_SHA512_512BITTAG_RAW", c6.c.k(64, 64, o10, 3));
                return Collections.unmodifiableMap(hashMap8);
        }
    }

    @Override // D.n
    public final AbstractC1030a f0(AbstractC1037h abstractC1037h) {
        switch (this.f7742b) {
            case 0:
                return C1295j.B(abstractC1037h, C1043n.a());
            case 1:
                return C1304t.B(abstractC1037h, C1043n.a());
            case 2:
                return C1310z.z(abstractC1037h, C1043n.a());
            case 3:
                return D.z(abstractC1037h, C1043n.a());
            case 4:
                return L.x(abstractC1037h, C1043n.a());
            case 5:
                return n0.y(abstractC1037h, C1043n.a());
            case 6:
                return q0.A(abstractC1037h, C1043n.a());
            case 7:
                return v0.x(abstractC1037h, C1043n.a());
            case 8:
                return h6.H.z(abstractC1037h, C1043n.a());
            default:
                return T.C(abstractC1037h, C1043n.a());
        }
    }

    @Override // D.n
    public final void k0(AbstractC1030a abstractC1030a) {
        switch (this.f7742b) {
            case 0:
                C1295j c1295j = (C1295j) abstractC1030a;
                f[] fVarArr = {new f(1, i6.k.class)};
                HashMap hashMap = new HashMap();
                for (f fVar : fVarArr) {
                    boolean containsKey = hashMap.containsKey(fVar.f7740a);
                    Class cls = fVar.f7740a;
                    if (!containsKey) {
                        hashMap.put(cls, fVar);
                    } else {
                        throw new IllegalArgumentException(AbstractC0953k1.l(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                    }
                }
                if (fVarArr.length > 0) {
                    Class cls2 = fVarArr[0].f7740a;
                }
                Collections.unmodifiableMap(hashMap);
                C1299n y9 = c1295j.y();
                i6.o.a(y9.z());
                C1301p A2 = y9.A();
                if (A2.y() >= 12 && A2.y() <= 16) {
                    f[] fVarArr2 = {new f(11, U5.j.class)};
                    HashMap hashMap2 = new HashMap();
                    for (f fVar2 : fVarArr2) {
                        boolean containsKey2 = hashMap2.containsKey(fVar2.f7740a);
                        Class cls3 = fVar2.f7740a;
                        if (!containsKey2) {
                            hashMap2.put(cls3, fVar2);
                        } else {
                            throw new IllegalArgumentException(AbstractC0953k1.l(cls3, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                        }
                    }
                    if (fVarArr2.length > 0) {
                        Class cls4 = fVarArr2[0].f7740a;
                    }
                    Collections.unmodifiableMap(hashMap2);
                    T z9 = c1295j.z();
                    if (z9.z() >= 16) {
                        c6.c.m(z9.A());
                        i6.o.a(c1295j.y().z());
                        return;
                    }
                    throw new GeneralSecurityException("key too short");
                }
                throw new GeneralSecurityException("invalid IV size");
            case 1:
                C1304t c1304t = (C1304t) abstractC1030a;
                i6.o.a(c1304t.y());
                if (c1304t.z().y() != 12 && c1304t.z().y() != 16) {
                    throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
                }
                return;
            case 2:
                i6.o.a(((C1310z) abstractC1030a).x());
                return;
            case 3:
                i6.o.a(((D) abstractC1030a).x());
                return;
            case 4:
                return;
            case 5:
                return;
            case 6:
                q0 q0Var = (q0) abstractC1030a;
                if (!q0Var.y().isEmpty() && q0Var.z()) {
                    return;
                } else {
                    throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
                }
            case 7:
                return;
            case 8:
                h6.H h7 = (h6.H) abstractC1030a;
                if (h7.x() == 64) {
                    return;
                }
                throw new InvalidAlgorithmParameterException("invalid key size: " + h7.x() + ". Valid keys must have 64 bytes.");
            default:
                T t7 = (T) abstractC1030a;
                if (t7.z() >= 16) {
                    c6.c.m(t7.A());
                    return;
                }
                throw new GeneralSecurityException("key too short");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, byte b9, byte b10) {
        super(q0.class);
        this.f7743c = hVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, char c3) {
        super(C1310z.class);
        this.f7743c = hVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, byte b9) {
        super(C1304t.class);
        this.f7743c = hVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, int i9) {
        super(D.class);
        this.f7743c = hVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, short s9) {
        super(L.class);
        this.f7743c = hVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, byte b9, char c3) {
        super(v0.class);
        this.f7743c = hVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, byte b9, int i9) {
        super(h6.H.class);
        this.f7743c = hVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar) {
        super(C1295j.class);
        this.f7743c = hVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(c6.c cVar) {
        super(T.class);
        this.f7743c = cVar;
    }
}
