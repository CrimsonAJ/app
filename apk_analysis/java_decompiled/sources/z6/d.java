package z6;

import G0.D;
import android.util.Log;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.h;
import s8.n;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final c f25504d = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final b f25505a;

    /* renamed from: b, reason: collision with root package name */
    public final b f25506b;

    /* renamed from: c, reason: collision with root package name */
    public final b f25507c;

    public d(ExecutorService backgroundExecutorService, ExecutorService blockingExecutorService) {
        h.e(backgroundExecutorService, "backgroundExecutorService");
        h.e(blockingExecutorService, "blockingExecutorService");
        this.f25505a = new b(backgroundExecutorService);
        this.f25506b = new b(backgroundExecutorService);
        n.p(null);
        this.f25507c = new b(blockingExecutorService);
    }

    public static final void a() {
        if (!((Boolean) new D(0, f25504d, c.class, "isBackgroundThread", "isBackgroundThread()Z", 0, 3).invoke()).booleanValue()) {
            String str = "Must be called on a background thread, was called on " + Thread.currentThread().getName() + '.';
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
        }
    }

    public static final void b() {
        if (!((Boolean) new D(0, f25504d, c.class, "isBlockingThread", "isBlockingThread()Z", 0, 4).invoke()).booleanValue()) {
            String str = "Must be called on a blocking thread, was called on " + Thread.currentThread().getName() + '.';
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
        }
    }
}
