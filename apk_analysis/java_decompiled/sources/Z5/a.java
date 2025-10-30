package Z5;

import U5.n;
import V5.f;
import V5.h;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import h6.F;
import h6.s0;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f9060a = 0;

    static {
        f[] fVarArr = {new f(9, U5.c.class)};
        HashMap hashMap = new HashMap();
        f fVar = fVarArr[0];
        boolean containsKey = hashMap.containsKey(fVar.f7740a);
        Class cls = fVar.f7740a;
        if (!containsKey) {
            hashMap.put(cls, fVar);
            Class cls2 = fVarArr[0].f7740a;
            Collections.unmodifiableMap(hashMap);
            int i9 = s0.CONFIG_NAME_FIELD_NUMBER;
            try {
                n.g(c.f9065b);
                if (Y5.a.a()) {
                    return;
                }
                n.e(new h(F.class, new f[]{new f(9, U5.c.class)}, 8), true);
                return;
            } catch (GeneralSecurityException e8) {
                throw new ExceptionInInitializerError(e8);
            }
        }
        throw new IllegalArgumentException(AbstractC0953k1.l(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
    }
}
