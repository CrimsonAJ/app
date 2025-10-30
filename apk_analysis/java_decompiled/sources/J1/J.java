package J1;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public abstract class J extends W.g {

    /* renamed from: A, reason: collision with root package name */
    public final RecyclerView f3695A;

    /* renamed from: B, reason: collision with root package name */
    public final RecyclerView f3696B;

    /* renamed from: v, reason: collision with root package name */
    public final MaterialButton f3697v;

    /* renamed from: w, reason: collision with root package name */
    public final AppCompatImageView f3698w;

    /* renamed from: x, reason: collision with root package name */
    public final MaterialButton f3699x;

    /* renamed from: y, reason: collision with root package name */
    public final RecyclerView f3700y;

    /* renamed from: z, reason: collision with root package name */
    public final RecyclerView f3701z;

    public J(W.b bVar, View view, MaterialButton materialButton, AppCompatImageView appCompatImageView, MaterialButton materialButton2, RecyclerView recyclerView, RecyclerView recyclerView2, RecyclerView recyclerView3, RecyclerView recyclerView4) {
        super(bVar, view, 0);
        this.f3697v = materialButton;
        this.f3698w = appCompatImageView;
        this.f3699x = materialButton2;
        this.f3700y = recyclerView;
        this.f3701z = recyclerView2;
        this.f3695A = recyclerView3;
        this.f3696B = recyclerView4;
    }
}
