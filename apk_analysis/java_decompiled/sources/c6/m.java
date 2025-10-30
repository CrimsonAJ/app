package c6;

import b6.C0686h;
import b6.C0687i;
import b6.C0689k;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import h6.C1287b;
import h6.s0;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class m {
    static {
        V5.f[] fVarArr = {new V5.f(11, U5.j.class)};
        HashMap hashMap = new HashMap();
        V5.f fVar = fVarArr[0];
        boolean containsKey = hashMap.containsKey(fVar.f7740a);
        Class cls = fVar.f7740a;
        if (!containsKey) {
            hashMap.put(cls, fVar);
            Class cls2 = fVarArr[0].f7740a;
            Collections.unmodifiableMap(hashMap);
            int i9 = s0.CONFIG_NAME_FIELD_NUMBER;
            try {
                a();
                return;
            } catch (GeneralSecurityException e8) {
                throw new ExceptionInInitializerError(e8);
            }
        }
        throw new IllegalArgumentException(AbstractC0953k1.l(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
    }

    public static void a() {
        U5.n.g(p.f11703c);
        U5.n.g(i.f11687a);
        U5.n.e(new c(), true);
        C0689k c0689k = l.f11694a;
        C0687i c0687i = C0687i.f11372b;
        c0687i.e(l.f11694a);
        c0687i.d(l.f11695b);
        c0687i.c(l.f11696c);
        c0687i.b(l.f11697d);
        C0686h c0686h = C0686h.f11370b;
        c0686h.b(c.f11664f);
        if (Y5.a.a()) {
            return;
        }
        U5.n.e(new c(C1287b.class, new V5.f[]{new V5.f(10, U5.j.class)}), true);
        c0687i.e(f.f11683a);
        c0687i.d(f.f11684b);
        c0687i.c(f.f11685c);
        c0687i.b(f.f11686d);
        c0686h.b(c.f11663e);
    }
}
