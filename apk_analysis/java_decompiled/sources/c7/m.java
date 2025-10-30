package c7;

import D4.InterfaceC0084c;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class m implements InterfaceC0084c {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReference f11726a = new AtomicReference();

    @Override // D4.InterfaceC0084c
    public final void a(boolean z9) {
        Random random = n.j;
        synchronized (n.class) {
            Iterator it = n.f11727k.values().iterator();
            while (it.hasNext()) {
                ((C0785e) it.next()).b(z9);
            }
        }
    }
}
