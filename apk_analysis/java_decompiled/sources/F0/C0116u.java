package F0;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: F0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0116u extends e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0119x f2241a;

    public C0116u(C0119x c0119x) {
        this.f2241a = c0119x;
    }

    @Override // F0.e0
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        boolean z9;
        boolean z10;
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        C0119x c0119x = this.f2241a;
        int computeVerticalScrollRange = c0119x.f2277s.computeVerticalScrollRange();
        int i11 = c0119x.f2276r;
        int i12 = computeVerticalScrollRange - i11;
        int i13 = c0119x.f2260a;
        if (i12 > 0 && i11 >= i13) {
            z9 = true;
        } else {
            z9 = false;
        }
        c0119x.f2278t = z9;
        int computeHorizontalScrollRange = c0119x.f2277s.computeHorizontalScrollRange();
        int i14 = c0119x.f2275q;
        if (computeHorizontalScrollRange - i14 > 0 && i14 >= i13) {
            z10 = true;
        } else {
            z10 = false;
        }
        c0119x.f2279u = z10;
        boolean z11 = c0119x.f2278t;
        if (!z11 && !z10) {
            if (c0119x.f2280v != 0) {
                c0119x.f(0);
                return;
            }
            return;
        }
        if (z11) {
            float f9 = i11;
            c0119x.f2270l = (int) ((((f9 / 2.0f) + computeVerticalScrollOffset) * f9) / computeVerticalScrollRange);
            c0119x.f2269k = Math.min(i11, (i11 * i11) / computeVerticalScrollRange);
        }
        if (c0119x.f2279u) {
            float f10 = computeHorizontalScrollOffset;
            float f11 = i14;
            c0119x.f2273o = (int) ((((f11 / 2.0f) + f10) * f11) / computeHorizontalScrollRange);
            c0119x.f2272n = Math.min(i14, (i14 * i14) / computeHorizontalScrollRange);
        }
        int i15 = c0119x.f2280v;
        if (i15 != 0 && i15 != 1) {
            return;
        }
        c0119x.f(1);
    }
}
