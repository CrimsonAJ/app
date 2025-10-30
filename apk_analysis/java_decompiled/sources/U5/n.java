package U5;

import G0.H;
import b6.C0682d;
import b6.C0686h;
import b6.C0690l;
import b6.C0691m;
import b6.C0692n;
import com.google.crypto.tink.shaded.protobuf.AbstractC1030a;
import com.google.crypto.tink.shaded.protobuf.AbstractC1037h;
import com.google.crypto.tink.shaded.protobuf.B;
import com.google.crypto.tink.shaded.protobuf.C1036g;
import h6.Y;
import h6.a0;
import h6.b0;
import h6.r0;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import w.AbstractC2128h;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReference f7516a;

    /* renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f7517b;

    /* renamed from: c, reason: collision with root package name */
    public static final ConcurrentHashMap f7518c;

    /* renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap f7519d;

    static {
        Logger.getLogger(n.class.getName());
        f7516a = new AtomicReference(new e());
        f7517b = new ConcurrentHashMap();
        f7518c = new ConcurrentHashMap();
        new ConcurrentHashMap();
        f7519d = new ConcurrentHashMap();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0051, code lost:
    
        r6 = (java.util.Map.Entry) r5.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0061, code lost:
    
        if (U5.n.f7519d.containsKey(r6.getKey()) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0088, code lost:
    
        throw new java.security.GeneralSecurityException("Attempted to register a new key template " + ((java.lang.String) r6.getKey()) + " from an existing key manager of type " + r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0089, code lost:
    
        r4 = r5.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0095, code lost:
    
        if (r4.hasNext() == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0097, code lost:
    
        r5 = (java.util.Map.Entry) r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a7, code lost:
    
        if (U5.n.f7519d.containsKey(r5.getKey()) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c6, code lost:
    
        throw new java.security.GeneralSecurityException("Attempted overwrite of a registered key template " + ((java.lang.String) r5.getKey()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0041, code lost:
    
        if (((U5.e) U5.n.f7516a.get()).f7498a.containsKey(r4) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0043, code lost:
    
        r5 = r5.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004f, code lost:
    
        if (r5.hasNext() == false) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized void a(java.lang.String r4, java.util.Map r5, boolean r6) {
        /*
            java.lang.String r0 = "New keys are already disallowed for key type "
            java.lang.Class<U5.n> r1 = U5.n.class
            monitor-enter(r1)
            if (r6 == 0) goto L31
            java.util.concurrent.ConcurrentHashMap r2 = U5.n.f7518c     // Catch: java.lang.Throwable -> L2e
            boolean r3 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L2e
            if (r3 == 0) goto L31
            java.lang.Object r2 = r2.get(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L2e
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L2e
            if (r2 == 0) goto L1c
            goto L31
        L1c:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L2e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L2e
            r6.append(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> L2e
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L2e
            throw r5     // Catch: java.lang.Throwable -> L2e
        L2e:
            r4 = move-exception
            goto Lc7
        L31:
            if (r6 == 0) goto Lc9
            java.util.concurrent.atomic.AtomicReference r6 = U5.n.f7516a     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r6 = r6.get()     // Catch: java.lang.Throwable -> L2e
            U5.e r6 = (U5.e) r6     // Catch: java.lang.Throwable -> L2e
            java.util.concurrent.ConcurrentHashMap r6 = r6.f7498a     // Catch: java.lang.Throwable -> L2e
            boolean r6 = r6.containsKey(r4)     // Catch: java.lang.Throwable -> L2e
            if (r6 == 0) goto L89
            java.util.Set r5 = r5.entrySet()     // Catch: java.lang.Throwable -> L2e
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L2e
        L4b:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L2e
            if (r6 == 0) goto Lc9
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L2e
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch: java.lang.Throwable -> L2e
            java.util.concurrent.ConcurrentHashMap r0 = U5.n.f7519d     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r2 = r6.getKey()     // Catch: java.lang.Throwable -> L2e
            boolean r0 = r0.containsKey(r2)     // Catch: java.lang.Throwable -> L2e
            if (r0 == 0) goto L64
            goto L4b
        L64:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L2e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r0.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = "Attempted to register a new key template "
            r0.append(r2)     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r6 = r6.getKey()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L2e
            r0.append(r6)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r6 = " from an existing key manager of type "
            r0.append(r6)     // Catch: java.lang.Throwable -> L2e
            r0.append(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r4 = r0.toString()     // Catch: java.lang.Throwable -> L2e
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L2e
            throw r5     // Catch: java.lang.Throwable -> L2e
        L89:
            java.util.Set r4 = r5.entrySet()     // Catch: java.lang.Throwable -> L2e
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L2e
        L91:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L2e
            if (r5 == 0) goto Lc9
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L2e
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch: java.lang.Throwable -> L2e
            java.util.concurrent.ConcurrentHashMap r6 = U5.n.f7519d     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r0 = r5.getKey()     // Catch: java.lang.Throwable -> L2e
            boolean r6 = r6.containsKey(r0)     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto Laa
            goto L91
        Laa:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L2e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r6.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r0 = "Attempted overwrite of a registered key template "
            r6.append(r0)     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r5 = r5.getKey()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L2e
            r6.append(r5)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Throwable -> L2e
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L2e
            throw r4     // Catch: java.lang.Throwable -> L2e
        Lc7:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2e
            throw r4
        Lc9:
            monitor-exit(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: U5.n.a(java.lang.String, java.util.Map, boolean):void");
    }

    public static Object b(b bVar, Class cls) {
        Object obj;
        C0692n c0692n = (C0692n) C0686h.f11370b.f11371a.get();
        c0692n.getClass();
        C0691m c0691m = new C0691m(bVar.getClass(), cls);
        HashMap hashMap = c0692n.f11380a;
        if (hashMap.containsKey(c0691m)) {
            switch (((C0690l) hashMap.get(c0691m)).f11377b.f8186a) {
                case 6:
                    obj = new Object();
                    if (!A0.a.c(1)) {
                        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
                    }
                    return obj;
                default:
                    obj = new Object();
                    if (!A0.a.d(2)) {
                        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
                    }
                    return obj;
            }
        }
        throw new GeneralSecurityException("No PrimitiveConstructor for " + c0691m + " available");
    }

    public static Object c(String str, AbstractC1037h abstractC1037h, Class cls) {
        e eVar = (e) f7516a.get();
        eVar.getClass();
        d a5 = eVar.a(str);
        boolean contains = ((Map) a5.f7496a.f2664b).keySet().contains(cls);
        H h7 = a5.f7496a;
        if (contains) {
            try {
                if (!((Map) h7.f2664b).keySet().contains(cls) && !Void.class.equals(cls)) {
                    throw new IllegalArgumentException("Given internalKeyMananger " + h7.toString() + " does not support primitive class " + cls.getName());
                }
                try {
                    AbstractC1030a h9 = h7.h(abstractC1037h);
                    if (!Void.class.equals(cls)) {
                        h7.j(h9);
                        return h7.e(h9, cls);
                    }
                    throw new GeneralSecurityException("Cannot create a primitive for Void");
                } catch (B e8) {
                    throw new GeneralSecurityException("Failures parsing proto of type ".concat(((Class) h7.f2663a).getName()), e8);
                }
            } catch (IllegalArgumentException e9) {
                throw new GeneralSecurityException("Primitive type not supported", e9);
            }
        }
        StringBuilder sb = new StringBuilder("Primitive type ");
        sb.append(cls.getName());
        sb.append(" not supported by key manager of type ");
        sb.append(h7.getClass());
        sb.append(", supported primitives: ");
        Set<Class> keySet = ((Map) h7.f2664b).keySet();
        StringBuilder sb2 = new StringBuilder();
        boolean z9 = true;
        for (Class cls2 : keySet) {
            if (!z9) {
                sb2.append(", ");
            }
            sb2.append(cls2.getCanonicalName());
            z9 = false;
        }
        sb.append(sb2.toString());
        throw new GeneralSecurityException(sb.toString());
    }

    public static synchronized Y d(b0 b0Var) {
        Y f9;
        synchronized (n.class) {
            H h7 = ((e) f7516a.get()).a(b0Var.B()).f7496a;
            f fVar = new f(h7, (Class) h7.f2665c);
            if (((Boolean) f7518c.get(b0Var.B())).booleanValue()) {
                f9 = fVar.f(b0Var.C());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + b0Var.B());
            }
        }
        return f9;
    }

    public static synchronized void e(H h7, boolean z9) {
        Map map;
        synchronized (n.class) {
            try {
                AtomicReference atomicReference = f7516a;
                e eVar = new e((e) atomicReference.get());
                eVar.b(h7);
                String d9 = h7.d();
                if (z9) {
                    map = h7.f().e0();
                } else {
                    map = Collections.EMPTY_MAP;
                }
                a(d9, map, z9);
                if (!((e) atomicReference.get()).f7498a.containsKey(d9)) {
                    f7517b.put(d9, new F5.e(14));
                    if (z9) {
                        f(d9, h7.f().e0());
                    }
                }
                f7518c.put(d9, Boolean.valueOf(z9));
                atomicReference.set(eVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void f(String str, Map map) {
        r0 r0Var;
        for (Map.Entry entry : map.entrySet()) {
            ConcurrentHashMap concurrentHashMap = f7519d;
            String str2 = (String) entry.getKey();
            byte[] e8 = ((C0682d) entry.getValue()).f11365a.e();
            int i9 = ((C0682d) entry.getValue()).f11366b;
            a0 D8 = b0.D();
            D8.h();
            b0.w((b0) D8.f16404b, str);
            C1036g d9 = AbstractC1037h.d(e8, 0, e8.length);
            D8.h();
            b0.x((b0) D8.f16404b, d9);
            int b9 = AbstractC2128h.b(i9);
            if (b9 != 0) {
                if (b9 != 1) {
                    if (b9 != 2) {
                        if (b9 == 3) {
                            r0Var = r0.CRUNCHY;
                        } else {
                            throw new IllegalArgumentException("Unknown output prefix type");
                        }
                    } else {
                        r0Var = r0.RAW;
                    }
                } else {
                    r0Var = r0.LEGACY;
                }
            } else {
                r0Var = r0.TINK;
            }
            D8.h();
            b0.y((b0) D8.f16404b, r0Var);
            concurrentHashMap.put(str2, new g((b0) D8.c()));
        }
    }

    public static synchronized void g(m mVar) {
        synchronized (n.class) {
            C0686h.f11370b.c(mVar);
        }
    }
}
