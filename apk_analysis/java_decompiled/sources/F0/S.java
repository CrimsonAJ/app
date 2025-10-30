package F0;

import android.database.Observable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class S {

    /* renamed from: a, reason: collision with root package name */
    public final T f2055a = new Observable();

    /* renamed from: b, reason: collision with root package name */
    public boolean f2056b = false;

    /* renamed from: c, reason: collision with root package name */
    public final int f2057c = 1;

    public abstract int a();

    public long b(int i9) {
        return -1L;
    }

    public int c(int i9) {
        return 0;
    }

    public final void d() {
        this.f2055a.b();
    }

    public final void e(int i9) {
        this.f2055a.d(i9, 1, null);
    }

    public abstract void g(r0 r0Var, int i9);

    public abstract r0 h(ViewGroup viewGroup, int i9);

    public boolean j(r0 r0Var) {
        return false;
    }

    public final void m(U u9) {
        this.f2055a.registerObserver(u9);
    }

    public void f(RecyclerView recyclerView) {
    }

    public void i(RecyclerView recyclerView) {
    }

    public void k(r0 r0Var) {
    }

    public void l(r0 r0Var) {
    }
}
