package l6;

import D4.InterfaceC0084c;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: l6.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1572d implements InterfaceC0084c {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReference f20582a = new AtomicReference();

    @Override // D4.InterfaceC0084c
    public final void a(boolean z9) {
        synchronized (C1574f.f20585k) {
            try {
                ArrayList arrayList = new ArrayList(C1574f.f20586l.values());
                int size = arrayList.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    C1574f c1574f = (C1574f) obj;
                    if (c1574f.f20591e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it = c1574f.f20595i.iterator();
                        while (it.hasNext()) {
                            C1574f c1574f2 = ((C1571c) it.next()).f20581a;
                            if (!z9) {
                                ((Q6.e) c1574f2.f20594h.get()).c();
                            } else {
                                c1574f2.getClass();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
