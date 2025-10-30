package J1;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.button.MaterialButton;

/* renamed from: J1.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0177g0 extends W.g {

    /* renamed from: A, reason: collision with root package name */
    public final SwipeRefreshLayout f3938A;

    /* renamed from: B, reason: collision with root package name */
    public final View f3939B;

    /* renamed from: v, reason: collision with root package name */
    public final MaterialButton f3940v;

    /* renamed from: w, reason: collision with root package name */
    public final AppCompatImageView f3941w;

    /* renamed from: x, reason: collision with root package name */
    public final Group f3942x;

    /* renamed from: y, reason: collision with root package name */
    public final LinearLayoutCompat f3943y;

    /* renamed from: z, reason: collision with root package name */
    public final RecyclerView f3944z;

    public AbstractC0177g0(W.b bVar, View view, MaterialButton materialButton, AppCompatImageView appCompatImageView, Group group, LinearLayoutCompat linearLayoutCompat, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, View view2) {
        super(bVar, view, 0);
        this.f3940v = materialButton;
        this.f3941w = appCompatImageView;
        this.f3942x = group;
        this.f3943y = linearLayoutCompat;
        this.f3944z = recyclerView;
        this.f3938A = swipeRefreshLayout;
        this.f3939B = view2;
    }
}
