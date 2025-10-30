package U3;

import P5.X;
import android.os.Handler;
import java.io.Closeable;

/* loaded from: classes.dex */
public final class m implements Runnable, Closeable, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f7403a = l4.y.l(null);

    /* renamed from: b, reason: collision with root package name */
    public boolean f7404b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f7405c;

    public m(n nVar) {
        this.f7405c = nVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f7404b = false;
        this.f7403a.removeCallbacks(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        n nVar = this.f7405c;
        A3.E e8 = nVar.f7412g;
        e8.r(e8.j(4, nVar.f7415k, X.f5938g, nVar.f7413h));
        this.f7403a.postDelayed(this, 30000L);
    }
}
