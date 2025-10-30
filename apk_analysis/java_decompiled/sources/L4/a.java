package L4;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final String f4640a;

    /* renamed from: b, reason: collision with root package name */
    public final ThreadFactory f4641b = Executors.defaultThreadFactory();

    public a(String str) {
        this.f4640a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f4641b.newThread(new b(runnable, 0));
        newThread.setName(this.f4640a);
        return newThread;
    }
}
