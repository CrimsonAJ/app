package y6;

import android.util.Log;
import f5.C1183o;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
import v6.C2110a;
import v6.C2112c;

/* loaded from: classes.dex */
public final class r implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final C1183o f25107a;

    /* renamed from: b, reason: collision with root package name */
    public final G6.e f25108b;

    /* renamed from: c, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f25109c;

    /* renamed from: d, reason: collision with root package name */
    public final C2110a f25110d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f25111e = new AtomicBoolean(false);

    public r(C1183o c1183o, G6.e eVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C2110a c2110a) {
        this.f25107a = c1183o;
        this.f25108b = eVar;
        this.f25109c = uncaughtExceptionHandler;
        this.f25110d = c2110a;
    }

    public final boolean a(Thread thread, Throwable th) {
        if (thread == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null thread", null);
            return false;
        }
        if (th == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null throwable", null);
            return false;
        }
        if (this.f25110d.b()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; native crash exists for session.", null);
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f25109c;
        AtomicBoolean atomicBoolean = this.f25111e;
        atomicBoolean.set(true);
        try {
            try {
                if (a(thread, th)) {
                    this.f25107a.D(this.f25108b, thread, th);
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Uncaught exception will not be recorded by Crashlytics.", null);
                }
                if (uncaughtExceptionHandler != null) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Completed exception processing. Invoking default exception handler.", null);
                    }
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Completed exception processing, but no default exception handler.", null);
                    }
                    System.exit(1);
                }
                atomicBoolean.set(false);
            } catch (Exception e8) {
                C2112c c2112c = C2112c.f23900a;
                if (c2112c.b(6)) {
                    Log.e("FirebaseCrashlytics", "An error occurred in the uncaught exception handler", e8);
                }
                if (uncaughtExceptionHandler != null) {
                    c2112c.c("Completed exception processing. Invoking default exception handler.");
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                } else {
                    c2112c.c("Completed exception processing, but no default exception handler.");
                    System.exit(1);
                }
                atomicBoolean.set(false);
            }
        } catch (Throwable th2) {
            if (uncaughtExceptionHandler != null) {
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Completed exception processing. Invoking default exception handler.", null);
                }
                uncaughtExceptionHandler.uncaughtException(thread, th);
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Completed exception processing, but no default exception handler.", null);
                }
                System.exit(1);
            }
            atomicBoolean.set(false);
            throw th2;
        }
    }
}
