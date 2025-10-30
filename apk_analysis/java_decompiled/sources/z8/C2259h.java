package z8;

import java.util.concurrent.CompletableFuture;

/* renamed from: z8.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2259h extends CompletableFuture {

    /* renamed from: a, reason: collision with root package name */
    public final y f25616a;

    public C2259h(y yVar) {
        this.f25616a = yVar;
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean z9) {
        if (z9) {
            this.f25616a.cancel();
        }
        return super.cancel(z9);
    }
}
