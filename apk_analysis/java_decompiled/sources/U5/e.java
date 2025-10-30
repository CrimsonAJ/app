package U5;

import G0.H;
import java.security.GeneralSecurityException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f7497b = Logger.getLogger(e.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f7498a;

    public e(e eVar) {
        this.f7498a = new ConcurrentHashMap(eVar.f7498a);
    }

    public final synchronized d a(String str) {
        if (this.f7498a.containsKey(str)) {
        } else {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return (d) this.f7498a.get(str);
    }

    public final synchronized void b(H h7) {
        boolean c3;
        int c9 = h7.c();
        if (c9 != 1) {
            c3 = A0.a.d(c9);
        } else {
            c3 = A0.a.c(c9);
        }
        if (c3) {
            c(new d(h7));
        } else {
            throw new GeneralSecurityException("failed to register key manager " + h7.getClass() + " as it is not FIPS compatible.");
        }
    }

    public final synchronized void c(d dVar) {
        try {
            H h7 = dVar.f7496a;
            Class cls = (Class) h7.f2665c;
            if (!((Map) h7.f2664b).keySet().contains(cls) && !Void.class.equals(cls)) {
                throw new IllegalArgumentException("Given internalKeyMananger " + h7.toString() + " does not support primitive class " + cls.getName());
            }
            String d9 = h7.d();
            d dVar2 = (d) this.f7498a.get(d9);
            if (dVar2 != null && !dVar2.f7496a.getClass().equals(dVar.f7496a.getClass())) {
                f7497b.warning("Attempted overwrite of a registered key manager for key type ".concat(d9));
                throw new GeneralSecurityException("typeUrl (" + d9 + ") is already registered with " + dVar2.f7496a.getClass().getName() + ", cannot be re-registered with " + dVar.f7496a.getClass().getName());
            }
            this.f7498a.putIfAbsent(d9, dVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public e() {
        this.f7498a = new ConcurrentHashMap();
    }
}
