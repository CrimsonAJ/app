package T0;

import B6.u0;
import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import co.notix.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile a f6967d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f6968e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f6971c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f6970b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f6969a = new HashMap();

    public a(Context context) {
        this.f6971c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f6967d == null) {
            synchronized (f6968e) {
                try {
                    if (f6967d == null) {
                        f6967d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f6967d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f6971c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f6970b;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e8) {
                throw new RuntimeException(e8);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object obj;
        if (u0.C()) {
            try {
                u0.d(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (!hashSet.contains(cls)) {
            HashMap hashMap = this.f6969a;
            if (!hashMap.containsKey(cls)) {
                hashSet.add(cls);
                try {
                    b bVar = (b) cls.getDeclaredConstructor(null).newInstance(null);
                    List<Class> dependencies = bVar.dependencies();
                    if (!dependencies.isEmpty()) {
                        for (Class cls2 : dependencies) {
                            if (!hashMap.containsKey(cls2)) {
                                b(cls2, hashSet);
                            }
                        }
                    }
                    obj = bVar.create(this.f6971c);
                    hashSet.remove(cls);
                    hashMap.put(cls, obj);
                } catch (Throwable th2) {
                    throw new RuntimeException(th2);
                }
            } else {
                obj = hashMap.get(cls);
            }
            Trace.endSection();
            return obj;
        }
        throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
    }
}
