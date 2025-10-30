package F0;

import P.InterfaceC0307h;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class Q implements InterfaceC0307h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f2054a;

    public /* synthetic */ Q(RecyclerView recyclerView) {
        this.f2054a = recyclerView;
    }

    @Override // P.InterfaceC0307h
    public float D() {
        float f9;
        RecyclerView recyclerView = this.f2054a;
        if (recyclerView.f10291n.f()) {
            f9 = recyclerView.f10242A0;
        } else if (recyclerView.f10291n.e()) {
            f9 = recyclerView.f10315z0;
        } else {
            return 0.0f;
        }
        return -f9;
    }

    @Override // P.InterfaceC0307h
    public void I() {
        this.f2054a.p0();
    }

    @Override // P.InterfaceC0307h
    public boolean p(float f9) {
        int i9;
        int i10;
        RecyclerView recyclerView = this.f2054a;
        if (recyclerView.f10291n.f()) {
            i10 = (int) f9;
            i9 = 0;
        } else if (recyclerView.f10291n.e()) {
            i9 = (int) f9;
            i10 = 0;
        } else {
            i9 = 0;
            i10 = 0;
        }
        if (i9 == 0 && i10 == 0) {
            return false;
        }
        recyclerView.p0();
        return recyclerView.J(i9, i10, 0, Integer.MAX_VALUE);
    }
}
