package J1;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public abstract class P extends W.g {

    /* renamed from: A, reason: collision with root package name */
    public final SwipeRefreshLayout f3746A;

    /* renamed from: B, reason: collision with root package name */
    public final ViewPager2 f3747B;

    /* renamed from: C, reason: collision with root package name */
    public final AppCompatTextView f3748C;

    /* renamed from: D, reason: collision with root package name */
    public final AppCompatTextView f3749D;

    /* renamed from: v, reason: collision with root package name */
    public final MaterialButton f3750v;

    /* renamed from: w, reason: collision with root package name */
    public final MaterialButton f3751w;

    /* renamed from: x, reason: collision with root package name */
    public final AppCompatImageView f3752x;

    /* renamed from: y, reason: collision with root package name */
    public final AppCompatImageView f3753y;

    /* renamed from: z, reason: collision with root package name */
    public final RecyclerView f3754z;

    public P(W.b bVar, View view, MaterialButton materialButton, MaterialButton materialButton2, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, ViewPager2 viewPager2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        super(bVar, view, 0);
        this.f3750v = materialButton;
        this.f3751w = materialButton2;
        this.f3752x = appCompatImageView;
        this.f3753y = appCompatImageView2;
        this.f3754z = recyclerView;
        this.f3746A = swipeRefreshLayout;
        this.f3747B = viewPager2;
        this.f3748C = appCompatTextView;
        this.f3749D = appCompatTextView2;
    }
}
