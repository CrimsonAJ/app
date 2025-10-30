package J1;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.LinearProgressIndicator;

/* loaded from: classes.dex */
public abstract class L extends W.g {

    /* renamed from: A, reason: collision with root package name */
    public final SwipeRefreshLayout f3709A;

    /* renamed from: v, reason: collision with root package name */
    public final AppCompatImageView f3710v;

    /* renamed from: w, reason: collision with root package name */
    public final MaterialButton f3711w;

    /* renamed from: x, reason: collision with root package name */
    public final LinearProgressIndicator f3712x;

    /* renamed from: y, reason: collision with root package name */
    public final RecyclerView f3713y;

    /* renamed from: z, reason: collision with root package name */
    public final RecyclerView f3714z;

    public L(W.b bVar, View view, AppCompatImageView appCompatImageView, MaterialButton materialButton, LinearProgressIndicator linearProgressIndicator, RecyclerView recyclerView, RecyclerView recyclerView2, SwipeRefreshLayout swipeRefreshLayout) {
        super(bVar, view, 0);
        this.f3710v = appCompatImageView;
        this.f3711w = materialButton;
        this.f3712x = linearProgressIndicator;
        this.f3713y = recyclerView;
        this.f3714z = recyclerView2;
        this.f3709A = swipeRefreshLayout;
    }
}
