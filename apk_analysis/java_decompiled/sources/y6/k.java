package y6;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class k implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f25058a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f25059b;

    public k(l lVar, long j) {
        this.f25059b = lVar;
        this.f25058a = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.f25058a);
        this.f25059b.f25071k.j(bundle);
        return null;
    }
}
