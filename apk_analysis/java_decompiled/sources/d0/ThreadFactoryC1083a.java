package d0;

import java.util.concurrent.ThreadFactory;

/* renamed from: d0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC1083a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16634a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f16635b;

    public /* synthetic */ ThreadFactoryC1083a(String str, int i9) {
        this.f16634a = i9;
        this.f16635b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f16634a) {
            case 0:
                Thread thread = new Thread(runnable, this.f16635b);
                thread.setPriority(10);
                return thread;
            default:
                return new Thread(runnable, this.f16635b);
        }
    }
}
