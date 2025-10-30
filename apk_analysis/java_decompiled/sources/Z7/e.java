package Z7;

import A7.i;
import a.AbstractC0485a;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public abstract class e {
    private static volatile Choreographer choreographer;

    static {
        Object h7;
        try {
            h7 = new d(a(Looper.getMainLooper()), false);
        } catch (Throwable th) {
            h7 = AbstractC0485a.h(th);
        }
        if (h7 instanceof i) {
            h7 = null;
        }
    }

    public static final Handler a(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            h.c(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
