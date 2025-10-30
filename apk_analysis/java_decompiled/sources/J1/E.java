package J1;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public abstract class E extends W.g {

    /* renamed from: A, reason: collision with root package name */
    public final FrameLayout f3645A;

    /* renamed from: B, reason: collision with root package name */
    public final RelativeLayout f3646B;

    /* renamed from: C, reason: collision with root package name */
    public final E1 f3647C;

    /* renamed from: D, reason: collision with root package name */
    public final FrameLayout f3648D;

    /* renamed from: E, reason: collision with root package name */
    public final RecyclerView f3649E;

    /* renamed from: F, reason: collision with root package name */
    public final SwipeRefreshLayout f3650F;

    /* renamed from: G, reason: collision with root package name */
    public final AppCompatTextView f3651G;

    /* renamed from: H, reason: collision with root package name */
    public final View f3652H;

    /* renamed from: v, reason: collision with root package name */
    public final AppCompatImageView f3653v;

    /* renamed from: w, reason: collision with root package name */
    public final AppCompatImageView f3654w;

    /* renamed from: x, reason: collision with root package name */
    public final MaterialButton f3655x;

    /* renamed from: y, reason: collision with root package name */
    public final MaterialButton f3656y;

    /* renamed from: z, reason: collision with root package name */
    public final AppCompatEditText f3657z;

    public E(W.b bVar, View view, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, MaterialButton materialButton, MaterialButton materialButton2, AppCompatEditText appCompatEditText, FrameLayout frameLayout, RelativeLayout relativeLayout, E1 e12, FrameLayout frameLayout2, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, AppCompatTextView appCompatTextView, View view2) {
        super(bVar, view, 1);
        this.f3653v = appCompatImageView;
        this.f3654w = appCompatImageView2;
        this.f3655x = materialButton;
        this.f3656y = materialButton2;
        this.f3657z = appCompatEditText;
        this.f3645A = frameLayout;
        this.f3646B = relativeLayout;
        this.f3647C = e12;
        this.f3648D = frameLayout2;
        this.f3649E = recyclerView;
        this.f3650F = swipeRefreshLayout;
        this.f3651G = appCompatTextView;
        this.f3652H = view2;
    }
}
