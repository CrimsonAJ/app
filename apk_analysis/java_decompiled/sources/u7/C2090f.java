package u7;

import a.AbstractC0485a;
import android.os.Looper;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: u7.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2090f {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f23714a = new HashSet();

    public final void a() {
        if (AbstractC0485a.j == null) {
            AbstractC0485a.j = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() == AbstractC0485a.j) {
            Iterator it = this.f23714a.iterator();
            if (!it.hasNext()) {
                return;
            } else {
                throw A0.a.h(it);
            }
        }
        throw new IllegalStateException("Must be called on the Main thread.");
    }
}
