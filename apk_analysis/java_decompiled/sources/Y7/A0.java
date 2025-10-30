package Y7;

/* loaded from: classes.dex */
public abstract class A0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f8745a = new ThreadLocal();

    public static V a() {
        ThreadLocal threadLocal = f8745a;
        V v8 = (V) threadLocal.get();
        if (v8 == null) {
            C0458e c0458e = new C0458e(Thread.currentThread());
            threadLocal.set(c0458e);
            return c0458e;
        }
        return v8;
    }
}
