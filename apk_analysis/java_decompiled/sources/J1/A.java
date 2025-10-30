package J1;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.progressindicator.LinearProgressIndicator;

/* loaded from: classes.dex */
public abstract class A extends W.g {

    /* renamed from: A, reason: collision with root package name */
    public final SwipeRefreshLayout f3601A;

    /* renamed from: B, reason: collision with root package name */
    public final AppCompatTextView f3602B;

    /* renamed from: v, reason: collision with root package name */
    public final AppCompatImageView f3603v;

    /* renamed from: w, reason: collision with root package name */
    public final AppCompatImageView f3604w;

    /* renamed from: x, reason: collision with root package name */
    public final E1 f3605x;

    /* renamed from: y, reason: collision with root package name */
    public final LinearProgressIndicator f3606y;

    /* renamed from: z, reason: collision with root package name */
    public final RecyclerView f3607z;

    public A(W.b bVar, View view, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, E1 e12, LinearProgressIndicator linearProgressIndicator, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, AppCompatTextView appCompatTextView) {
        super(bVar, view, 1);
        this.f3603v = appCompatImageView;
        this.f3604w = appCompatImageView2;
        this.f3605x = e12;
        this.f3606y = linearProgressIndicator;
        this.f3607z = recyclerView;
        this.f3601A = swipeRefreshLayout;
        this.f3602B = appCompatTextView;
    }
}
