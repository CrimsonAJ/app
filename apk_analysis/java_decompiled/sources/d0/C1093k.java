package d0;

import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: d0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1093k extends Z0.a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Z0.a f16654i;
    public final /* synthetic */ ThreadPoolExecutor j;

    public C1093k(Z0.a aVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f16654i = aVar;
        this.j = threadPoolExecutor;
    }

    @Override // Z0.a
    public final void s(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.j;
        try {
            this.f16654i.s(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // Z0.a
    public final void t(com.google.firebase.messaging.s sVar) {
        ThreadPoolExecutor threadPoolExecutor = this.j;
        try {
            this.f16654i.t(sVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
