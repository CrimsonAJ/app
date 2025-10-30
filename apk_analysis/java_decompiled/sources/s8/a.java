package s8;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import z8.C2259h;
import z8.O;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* bridge */ /* synthetic */ Class b() {
        return CompletableFuture.class;
    }

    public static /* bridge */ /* synthetic */ void e(C2259h c2259h, Throwable th) {
        c2259h.completeExceptionally(th);
    }

    public static /* bridge */ /* synthetic */ void g(C2259h c2259h, O o9) {
        c2259h.complete(o9);
    }

    public static /* bridge */ /* synthetic */ Class j() {
        return Optional.class;
    }
}
