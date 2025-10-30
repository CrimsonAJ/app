package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f9880a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f9881b = new LinkedHashSet();

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f9882c = false;

    public static void a(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e8) {
                throw new RuntimeException(e8);
            }
        }
    }

    public void b() {
    }

    public final Object c(Object obj, String str) {
        Object obj2;
        synchronized (this.f9880a) {
            try {
                obj2 = this.f9880a.get(str);
                if (obj2 == null) {
                    this.f9880a.put(str, obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj2 != null) {
            obj = obj2;
        }
        if (this.f9882c) {
            a(obj);
        }
        return obj;
    }
}
