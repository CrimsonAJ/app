package k8;

import java.util.concurrent.ThreadFactory;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f20139a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f20140b;

    public /* synthetic */ b(String str, boolean z9) {
        this.f20139a = str;
        this.f20140b = z9;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String name = this.f20139a;
        h.e(name, "$name");
        Thread thread = new Thread(runnable, name);
        thread.setDaemon(this.f20140b);
        return thread;
    }
}
