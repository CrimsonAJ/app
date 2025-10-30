package H0;

import A1.g;
import F5.e;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final e f2937c = new e(7);

    /* renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f2938d = new LinkedHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f2939a;

    /* renamed from: b, reason: collision with root package name */
    public final g f2940b;

    public a(String str, boolean z9) {
        ReentrantLock reentrantLock;
        g gVar;
        synchronized (f2937c) {
            try {
                LinkedHashMap linkedHashMap = f2938d;
                Object obj = linkedHashMap.get(str);
                if (obj == null) {
                    obj = new ReentrantLock();
                    linkedHashMap.put(str, obj);
                }
                reentrantLock = (ReentrantLock) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f2939a = reentrantLock;
        if (z9) {
            gVar = new g(str);
        } else {
            gVar = null;
        }
        this.f2940b = gVar;
    }
}
