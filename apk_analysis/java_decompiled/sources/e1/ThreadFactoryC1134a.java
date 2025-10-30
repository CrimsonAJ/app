package e1;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: e1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC1134a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f17020a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f17021b;

    public ThreadFactoryC1134a(boolean z9) {
        this.f17021b = z9;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str;
        if (this.f17021b) {
            str = "WM.task-";
        } else {
            str = "androidx.work-";
        }
        return new Thread(runnable, str + this.f17020a.incrementAndGet());
    }
}
