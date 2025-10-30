package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import s.C1934d;
import s.C1935e;
import s.C1939i;

/* loaded from: classes.dex */
public abstract class K1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1935e f15246a = new C1939i(0);

    public static synchronized void a() {
        synchronized (K1.class) {
            C1935e c1935e = f15246a;
            Iterator it = ((C1934d) c1935e.values()).iterator();
            if (!it.hasNext()) {
                c1935e.clear();
            } else {
                ((K1) it.next()).getClass();
                throw null;
            }
        }
    }
}
