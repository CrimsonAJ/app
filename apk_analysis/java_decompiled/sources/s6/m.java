package s6;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class m implements S6.b {

    /* renamed from: a, reason: collision with root package name */
    public volatile Set f22776a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Set f22777b;

    public final synchronized void a() {
        try {
            Iterator it = this.f22776a.iterator();
            while (it.hasNext()) {
                this.f22777b.add(((S6.b) it.next()).get());
            }
            this.f22776a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // S6.b
    public final Object get() {
        if (this.f22777b == null) {
            synchronized (this) {
                try {
                    if (this.f22777b == null) {
                        this.f22777b = Collections.newSetFromMap(new ConcurrentHashMap());
                        a();
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableSet(this.f22777b);
    }
}
