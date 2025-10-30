package V5;

import b5.G1;
import co.notix.R;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import com.google.crypto.tink.shaded.protobuf.AbstractC1030a;
import h6.B;
import h6.C1287b;
import h6.C1293h;
import h6.C1297l;
import h6.C1308x;
import h6.F;
import h6.J;
import h6.O;
import h6.Q;
import h6.m0;
import h6.p0;
import h6.u0;
import i6.C1384a;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Class f7740a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7741b;

    public f(int i9, Class cls) {
        this.f7741b = i9;
        this.f7740a = cls;
    }

    public final Object a(AbstractC1030a abstractC1030a) {
        boolean z9 = false;
        switch (this.f7741b) {
            case 0:
                C1293h c1293h = (C1293h) abstractC1030a;
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
                Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
                C1297l z10 = c1293h.z();
                f fVar2 = (f) unmodifiableMap.get(i6.k.class);
                if (fVar2 != null) {
                    i6.k kVar = (i6.k) fVar2.a(z10);
                    f[] fVarArr2 = {new f(11, U5.j.class)};
                    HashMap hashMap2 = new HashMap();
                    int length = fVarArr2.length;
                    int i9 = 0;
                    while (i9 < length) {
                        f fVar3 = fVarArr2[i9];
                        boolean containsKey2 = hashMap2.containsKey(fVar3.f7740a);
                        boolean z11 = z9;
                        Class cls3 = fVar3.f7740a;
                        if (!containsKey2) {
                            hashMap2.put(cls3, fVar3);
                            i9++;
                            z9 = z11;
                        } else {
                            throw new IllegalArgumentException(AbstractC0953k1.l(cls3, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                        }
                    }
                    boolean z12 = z9;
                    if (fVarArr2.length > 0) {
                        Class cls4 = fVarArr2[z12 ? 1 : 0].f7740a;
                    }
                    Map unmodifiableMap2 = Collections.unmodifiableMap(hashMap2);
                    Q A2 = c1293h.A();
                    f fVar4 = (f) unmodifiableMap2.get(U5.j.class);
                    if (fVar4 != null) {
                        return new i6.g(kVar, (U5.j) fVar4.a(A2), c1293h.A().B().A());
                    }
                    throw new IllegalArgumentException("Requested primitive class " + U5.j.class.getCanonicalName() + " not supported.");
                }
                throw new IllegalArgumentException("Requested primitive class " + i6.k.class.getCanonicalName() + " not supported.");
            case 1:
                C1297l c1297l = (C1297l) abstractC1030a;
                return new C1384a(c1297l.B().y(), c1297l.A().f());
            case 2:
                h6.r rVar = (h6.r) abstractC1030a;
                return new i6.b(rVar.A().y(), rVar.z().f());
            case 3:
                return new i6.c(0, ((C1308x) abstractC1030a).y().f());
            case 4:
                return new X5.a(((B) abstractC1030a).y().f());
            case 5:
                return new i6.c(1, ((J) abstractC1030a).y().f());
            case 6:
                String x5 = ((m0) abstractC1030a).y().x();
                return U5.i.a(x5).c(x5);
            case 7:
                p0 p0Var = (p0) abstractC1030a;
                String y9 = p0Var.y().y();
                return new v(p0Var.y().x(), U5.i.a(y9).c(y9));
            case 8:
                return new i6.c(2, ((u0) abstractC1030a).y().f());
            case 9:
                return new i6.d(((F) abstractC1030a).y().f());
            case R.styleable.GradientColor_android_endX /* 10 */:
                C1287b c1287b = (C1287b) abstractC1030a;
                return new i6.m(new G1(c1287b.z().f()), c1287b.A().y());
            default:
                Q q9 = (Q) abstractC1030a;
                O z13 = q9.B().z();
                SecretKeySpec secretKeySpec = new SecretKeySpec(q9.A().f(), "HMAC");
                int A9 = q9.B().A();
                int ordinal = z13.ordinal();
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                if (ordinal == 5) {
                                    return new i6.m(new l4.s("HMACSHA224", secretKeySpec), A9);
                                }
                                throw new GeneralSecurityException("unknown hash");
                            }
                            return new i6.m(new l4.s("HMACSHA512", secretKeySpec), A9);
                        }
                        return new i6.m(new l4.s("HMACSHA256", secretKeySpec), A9);
                    }
                    return new i6.m(new l4.s("HMACSHA384", secretKeySpec), A9);
                }
                return new i6.m(new l4.s("HMACSHA1", secretKeySpec), A9);
        }
    }
}
