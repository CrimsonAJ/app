package androidx.emoji2.text;

import D.n;
import F0.K;
import T0.a;
import T0.b;
import android.content.Context;
import androidx.lifecycle.InterfaceC0561w;
import androidx.lifecycle.ProcessLifecycleInitializer;
import d0.C1091i;
import d0.C1092j;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements b {
    public final void a(Context context) {
        Object obj;
        a c3 = a.c(context);
        c3.getClass();
        synchronized (a.f6968e) {
            try {
                obj = c3.f6969a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = c3.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        n x5 = ((InterfaceC0561w) obj).x();
        x5.V(new C1092j(this, x5));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [d0.q, F0.K] */
    @Override // T0.b
    public final Object create(Context context) {
        ?? k5 = new K(new M4.b(context));
        k5.f2041a = 1;
        if (C1091i.f16642k == null) {
            synchronized (C1091i.j) {
                try {
                    if (C1091i.f16642k == null) {
                        C1091i.f16642k = new C1091i(k5);
                    }
                } finally {
                }
            }
        }
        a(context);
        return Boolean.TRUE;
    }

    @Override // T0.b
    public final List dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
