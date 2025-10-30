package Y2;

import a3.InterfaceC0491b;
import e3.C1142b;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class o implements InterfaceC0491b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8642a;

    @Override // z7.InterfaceC2251a
    public final Object get() {
        switch (this.f8642a) {
            case 0:
                return new D4.q(1, Executors.newSingleThreadExecutor());
            default:
                d0.o oVar = new d0.o(3);
                HashMap hashMap = new HashMap();
                V2.d dVar = V2.d.f7660a;
                Set set = Collections.EMPTY_SET;
                if (set != null) {
                    hashMap.put(dVar, new e3.c(30000L, 86400000L, set));
                    V2.d dVar2 = V2.d.f7662c;
                    if (set != null) {
                        hashMap.put(dVar2, new e3.c(1000L, 86400000L, set));
                        V2.d dVar3 = V2.d.f7661b;
                        if (set != null) {
                            Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(e3.e.f17153b)));
                            if (unmodifiableSet != null) {
                                hashMap.put(dVar3, new e3.c(86400000L, 86400000L, unmodifiableSet));
                                if (hashMap.keySet().size() >= V2.d.values().length) {
                                    new HashMap();
                                    return new C1142b(oVar, hashMap);
                                }
                                throw new IllegalStateException("Not all priorities have been configured");
                            }
                            throw new NullPointerException("Null flags");
                        }
                        throw new NullPointerException("Null flags");
                    }
                    throw new NullPointerException("Null flags");
                }
                throw new NullPointerException("Null flags");
        }
    }
}
