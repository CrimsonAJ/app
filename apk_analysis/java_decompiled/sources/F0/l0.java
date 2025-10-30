package F0;

import android.util.Log;
import android.view.animation.BaseInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public int f2146a;

    /* renamed from: b, reason: collision with root package name */
    public int f2147b;

    /* renamed from: c, reason: collision with root package name */
    public int f2148c;

    /* renamed from: d, reason: collision with root package name */
    public int f2149d;

    /* renamed from: e, reason: collision with root package name */
    public BaseInterpolator f2150e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2151f;

    /* renamed from: g, reason: collision with root package name */
    public int f2152g;

    public final void a(RecyclerView recyclerView) {
        int i9 = this.f2149d;
        if (i9 >= 0) {
            this.f2149d = -1;
            recyclerView.R(i9);
            this.f2151f = false;
            return;
        }
        if (this.f2151f) {
            BaseInterpolator baseInterpolator = this.f2150e;
            if (baseInterpolator != null && this.f2148c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i10 = this.f2148c;
            if (i10 >= 1) {
                recyclerView.f10246C0.c(this.f2146a, this.f2147b, i10, baseInterpolator);
                int i11 = this.f2152g + 1;
                this.f2152g = i11;
                if (i11 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f2151f = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        this.f2152g = 0;
    }
}
