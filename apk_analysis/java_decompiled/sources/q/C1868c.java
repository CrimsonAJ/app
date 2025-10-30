package q;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import s8.n;

/* renamed from: q.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1868c extends n {

    /* renamed from: m, reason: collision with root package name */
    public final Object f22231m = new Object();

    /* renamed from: n, reason: collision with root package name */
    public final ExecutorService f22232n = Executors.newFixedThreadPool(4, new ThreadFactoryC1867b());

    /* renamed from: o, reason: collision with root package name */
    public volatile Handler f22233o;

    public static Handler f0(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return F.a.b(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
