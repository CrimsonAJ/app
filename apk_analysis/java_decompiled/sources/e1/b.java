package e1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f17022a = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ThreadFactoryC1134a(false));

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f17023b = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ThreadFactoryC1134a(true));

    /* renamed from: c, reason: collision with root package name */
    public final y f17024c;

    /* renamed from: d, reason: collision with root package name */
    public final d0.w f17025d;

    /* renamed from: e, reason: collision with root package name */
    public final com.google.firebase.messaging.u f17026e;

    /* renamed from: f, reason: collision with root package name */
    public final int f17027f;

    /* renamed from: g, reason: collision with root package name */
    public final int f17028g;

    /* renamed from: h, reason: collision with root package name */
    public final int f17029h;

    /* JADX WARN: Type inference failed for: r0v13, types: [e1.y, java.lang.Object] */
    public b(d0.o oVar) {
        String str = z.f17078a;
        this.f17024c = new Object();
        this.f17025d = new d0.w(1);
        this.f17026e = new com.google.firebase.messaging.u(3);
        this.f17027f = 4;
        this.f17028g = Integer.MAX_VALUE;
        this.f17029h = 20;
    }
}
