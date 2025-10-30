package androidx.lifecycle;

import java.io.Closeable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f9891a = new LinkedHashMap();

    public final void a() {
        for (e0 e0Var : this.f9891a.values()) {
            e0Var.f9882c = true;
            HashMap hashMap = e0Var.f9880a;
            if (hashMap != null) {
                synchronized (hashMap) {
                    try {
                        Iterator it = e0Var.f9880a.values().iterator();
                        while (it.hasNext()) {
                            e0.a(it.next());
                        }
                    } finally {
                    }
                }
            }
            LinkedHashSet linkedHashSet = e0Var.f9881b;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    try {
                        Iterator it2 = e0Var.f9881b.iterator();
                        while (it2.hasNext()) {
                            e0.a((Closeable) it2.next());
                        }
                    } finally {
                    }
                }
                e0Var.f9881b.clear();
            }
            e0Var.b();
        }
        this.f9891a.clear();
    }
}
