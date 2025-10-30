package F0;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class u0 extends e0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2242a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ M f2243b;

    public u0(M m9) {
        this.f2243b = m9;
    }

    @Override // F0.e0
    public final void a(RecyclerView recyclerView, int i9) {
        if (i9 == 0 && this.f2242a) {
            this.f2242a = false;
            this.f2243b.h();
        }
    }

    @Override // F0.e0
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        if (i9 == 0 && i10 == 0) {
            return;
        }
        this.f2242a = true;
    }
}
