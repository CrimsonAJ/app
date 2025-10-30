package s6;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import l6.AbstractC1570b;
import t6.EnumC2026k;

/* loaded from: classes.dex */
public final class j implements P6.c, P6.b {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f22770a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayDeque f22771b;

    /* renamed from: c, reason: collision with root package name */
    public final EnumC2026k f22772c;

    public j() {
        EnumC2026k enumC2026k = EnumC2026k.f23318a;
        this.f22770a = new HashMap();
        this.f22771b = new ArrayDeque();
        this.f22772c = enumC2026k;
    }

    public final synchronized void a(Executor executor, P6.a aVar) {
        try {
            executor.getClass();
            if (!this.f22770a.containsKey(AbstractC1570b.class)) {
                this.f22770a.put(AbstractC1570b.class, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f22770a.get(AbstractC1570b.class)).put(aVar, executor);
        } catch (Throwable th) {
            throw th;
        }
    }
}
