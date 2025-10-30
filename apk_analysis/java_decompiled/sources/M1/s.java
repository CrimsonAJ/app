package M1;

import F0.e0;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class s extends e0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4742a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4743b;

    /* renamed from: c, reason: collision with root package name */
    public int f4744c;

    /* renamed from: d, reason: collision with root package name */
    public int f4745d;

    /* renamed from: e, reason: collision with root package name */
    public int f4746e;

    /* renamed from: f, reason: collision with root package name */
    public int f4747f;

    /* renamed from: g, reason: collision with root package name */
    public int f4748g;

    /* renamed from: h, reason: collision with root package name */
    public int f4749h;

    /* renamed from: i, reason: collision with root package name */
    public androidx.recyclerview.widget.a f4750i;

    public s(androidx.recyclerview.widget.a layoutManager) {
        kotlin.jvm.internal.h.e(layoutManager, "layoutManager");
        this.f4743b = true;
        this.f4744c = 1;
        this.f4750i = layoutManager;
    }

    @Override // F0.e0
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        int i11;
        int i12;
        int i13;
        kotlin.jvm.internal.h.e(recyclerView, "recyclerView");
        if (i10 >= 0) {
            this.f4747f = recyclerView.getChildCount();
            this.f4746e = this.f4750i.G();
            androidx.recyclerview.widget.a aVar = this.f4750i;
            int i14 = -1;
            if (aVar instanceof GridLayoutManager) {
                GridLayoutManager gridLayoutManager = (GridLayoutManager) aVar;
                this.f4748g = gridLayoutManager.U0();
                View X02 = gridLayoutManager.X0(gridLayoutManager.w() - 1, -1, true, false);
                if (X02 != null) {
                    i14 = androidx.recyclerview.widget.a.L(X02);
                }
                this.f4749h = i14;
            } else if (aVar instanceof LinearLayoutManager) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) aVar;
                this.f4748g = linearLayoutManager.U0();
                View X03 = linearLayoutManager.X0(linearLayoutManager.w() - 1, -1, true, false);
                if (X03 != null) {
                    i14 = androidx.recyclerview.widget.a.L(X03);
                }
                this.f4749h = i14;
            }
            if (this.f4743b && (i13 = this.f4746e) > this.f4745d) {
                this.f4743b = false;
                this.f4745d = i13;
            }
            if (!this.f4743b && (i11 = this.f4746e) > (i12 = this.f4747f) && i11 - i12 <= this.f4748g + 5) {
                int i15 = this.f4744c + 1;
                this.f4744c = i15;
                c(i15);
                this.f4743b = true;
            }
            if (this.f4742a && this.f4749h == this.f4746e - 1) {
                this.f4742a = false;
                c(this.f4744c);
                this.f4743b = true;
            }
        }
    }

    public abstract void c(int i9);

    public final void d() {
        this.f4742a = false;
        this.f4743b = true;
        this.f4744c = 1;
        this.f4745d = 0;
        this.f4746e = 0;
        this.f4748g = 0;
        this.f4747f = 0;
    }
}
