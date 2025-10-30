package t6;

import A6.r;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: t6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC2016a implements ThreadFactory {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadFactory f23286e = Executors.defaultThreadFactory();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicLong f23287a = new AtomicLong();

    /* renamed from: b, reason: collision with root package name */
    public final String f23288b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23289c;

    /* renamed from: d, reason: collision with root package name */
    public final StrictMode.ThreadPolicy f23290d;

    public ThreadFactoryC2016a(String str, int i9, StrictMode.ThreadPolicy threadPolicy) {
        this.f23288b = str;
        this.f23289c = i9;
        this.f23290d = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = f23286e.newThread(new r(this, 26, runnable));
        Locale locale = Locale.ROOT;
        newThread.setName(this.f23288b + " Thread #" + this.f23287a.getAndIncrement());
        return newThread;
    }
}
