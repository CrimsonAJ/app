package V5;

import b6.C0687i;
import b6.C0689k;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import h6.B;
import h6.C1293h;
import h6.C1308x;
import h6.J;
import h6.m0;
import h6.p0;
import h6.s0;
import h6.u0;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* loaded from: classes.dex */
public abstract class a {
    static {
        f[] fVarArr = {new f(0, U5.a.class)};
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
        f[] fVarArr2 = {new f(3, U5.a.class)};
        HashMap hashMap2 = new HashMap();
        f fVar2 = fVarArr2[0];
        boolean containsKey2 = hashMap2.containsKey(fVar2.f7740a);
        Class cls3 = fVar2.f7740a;
        if (!containsKey2) {
            hashMap2.put(cls3, fVar2);
            Class cls4 = fVarArr2[0].f7740a;
            Collections.unmodifiableMap(hashMap2);
            f[] fVarArr3 = {new f(4, U5.a.class)};
            HashMap hashMap3 = new HashMap();
            f fVar3 = fVarArr3[0];
            boolean containsKey3 = hashMap3.containsKey(fVar3.f7740a);
            Class cls5 = fVar3.f7740a;
            if (!containsKey3) {
                hashMap3.put(cls5, fVar3);
                Class cls6 = fVarArr3[0].f7740a;
                Collections.unmodifiableMap(hashMap3);
                f[] fVarArr4 = {new f(2, U5.a.class)};
                HashMap hashMap4 = new HashMap();
                f fVar4 = fVarArr4[0];
                boolean containsKey4 = hashMap4.containsKey(fVar4.f7740a);
                Class cls7 = fVar4.f7740a;
                if (!containsKey4) {
                    hashMap4.put(cls7, fVar4);
                    Class cls8 = fVarArr4[0].f7740a;
                    Collections.unmodifiableMap(hashMap4);
                    f[] fVarArr5 = {new f(6, U5.a.class)};
                    HashMap hashMap5 = new HashMap();
                    f fVar5 = fVarArr5[0];
                    boolean containsKey5 = hashMap5.containsKey(fVar5.f7740a);
                    Class cls9 = fVar5.f7740a;
                    if (!containsKey5) {
                        hashMap5.put(cls9, fVar5);
                        Class cls10 = fVarArr5[0].f7740a;
                        Collections.unmodifiableMap(hashMap5);
                        f[] fVarArr6 = {new f(7, U5.a.class)};
                        HashMap hashMap6 = new HashMap();
                        f fVar6 = fVarArr6[0];
                        boolean containsKey6 = hashMap6.containsKey(fVar6.f7740a);
                        Class cls11 = fVar6.f7740a;
                        if (!containsKey6) {
                            hashMap6.put(cls11, fVar6);
                            Class cls12 = fVarArr6[0].f7740a;
                            Collections.unmodifiableMap(hashMap6);
                            f[] fVarArr7 = {new f(5, U5.a.class)};
                            HashMap hashMap7 = new HashMap();
                            f fVar7 = fVarArr7[0];
                            boolean containsKey7 = hashMap7.containsKey(fVar7.f7740a);
                            Class cls13 = fVar7.f7740a;
                            if (!containsKey7) {
                                hashMap7.put(cls13, fVar7);
                                Class cls14 = fVarArr7[0].f7740a;
                                Collections.unmodifiableMap(hashMap7);
                                f[] fVarArr8 = {new f(8, U5.a.class)};
                                HashMap hashMap8 = new HashMap();
                                f fVar8 = fVarArr8[0];
                                boolean containsKey8 = hashMap8.containsKey(fVar8.f7740a);
                                Class cls15 = fVar8.f7740a;
                                if (!containsKey8) {
                                    hashMap8.put(cls15, fVar8);
                                    Class cls16 = fVarArr8[0].f7740a;
                                    Collections.unmodifiableMap(hashMap8);
                                    int i10 = s0.CONFIG_NAME_FIELD_NUMBER;
                                    try {
                                        a();
                                        return;
                                    } catch (GeneralSecurityException e8) {
                                        throw new ExceptionInInitializerError(e8);
                                    }
                                }
                                throw new IllegalArgumentException(AbstractC0953k1.l(cls15, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                            }
                            throw new IllegalArgumentException(AbstractC0953k1.l(cls13, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                        }
                        throw new IllegalArgumentException(AbstractC0953k1.l(cls11, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                    }
                    throw new IllegalArgumentException(AbstractC0953k1.l(cls9, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                }
                throw new IllegalArgumentException(AbstractC0953k1.l(cls7, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            }
            throw new IllegalArgumentException(AbstractC0953k1.l(cls5, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        throw new IllegalArgumentException(AbstractC0953k1.l(cls3, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
    }

    public static void a() {
        int i9 = 7;
        int i10 = 6;
        int i11 = 5;
        int i12 = 4;
        int i13 = 3;
        int i14 = 1;
        U5.n.g(e.f7739b);
        c6.m.a();
        U5.n.e(new h(C1293h.class, new f[]{new f(0, U5.a.class)}, 0), true);
        U5.n.e(new h(C1308x.class, new f[]{new f(3, U5.a.class)}, 2), true);
        C0689k c0689k = o.f7773a;
        C0687i c0687i = C0687i.f11372b;
        c0687i.e(o.f7773a);
        c0687i.d(o.f7774b);
        c0687i.c(o.f7775c);
        c0687i.b(o.f7776d);
        if (!Y5.a.a()) {
            U5.n.e(new h(h6.r.class, new f[]{new f(2, U5.a.class)}, i14), true);
            c0687i.e(l.f7765a);
            c0687i.d(l.f7766b);
            c0687i.c(l.f7767c);
            c0687i.b(l.f7768d);
            try {
                Cipher.getInstance("AES/GCM-SIV/NoPadding");
                U5.n.e(new h(B.class, new f[]{new f(4, U5.a.class)}, i13), true);
                c0687i.e(r.f7779a);
                c0687i.d(r.f7780b);
                c0687i.c(r.f7781c);
                c0687i.b(r.f7782d);
            } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            }
            U5.n.e(new h(J.class, new f[]{new f(5, U5.a.class)}, i12), true);
            C0689k c0689k2 = u.f7783a;
            C0687i c0687i2 = C0687i.f11372b;
            c0687i2.e(u.f7783a);
            c0687i2.d(u.f7784b);
            c0687i2.c(u.f7785c);
            c0687i2.b(u.f7786d);
            U5.n.e(new h(m0.class, new f[]{new f(6, U5.a.class)}, i11), true);
            U5.n.e(new h(p0.class, new f[]{new f(7, U5.a.class)}, i10), true);
            U5.n.e(new h(u0.class, new f[]{new f(8, U5.a.class)}, i9), true);
            c0687i2.e(y.f7790a);
            c0687i2.d(y.f7791b);
            c0687i2.c(y.f7792c);
            c0687i2.b(y.f7793d);
        }
    }
}
