package J1;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.tabs.TabLayout;

/* renamed from: J1.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0212y0 extends W.g {

    /* renamed from: A, reason: collision with root package name */
    public final RecyclerView f4134A;

    /* renamed from: B, reason: collision with root package name */
    public final HorizontalScrollView f4135B;

    /* renamed from: C, reason: collision with root package name */
    public final TabLayout f4136C;

    /* renamed from: v, reason: collision with root package name */
    public final MaterialButton f4137v;

    /* renamed from: w, reason: collision with root package name */
    public final MaterialButton f4138w;

    /* renamed from: x, reason: collision with root package name */
    public final ChipGroup f4139x;

    /* renamed from: y, reason: collision with root package name */
    public final View f4140y;

    /* renamed from: z, reason: collision with root package name */
    public final FrameLayout f4141z;

    public AbstractC0212y0(W.b bVar, View view, MaterialButton materialButton, MaterialButton materialButton2, ChipGroup chipGroup, View view2, FrameLayout frameLayout, RecyclerView recyclerView, HorizontalScrollView horizontalScrollView, TabLayout tabLayout) {
        super(bVar, view, 0);
        this.f4137v = materialButton;
        this.f4138w = materialButton2;
        this.f4139x = chipGroup;
        this.f4140y = view2;
        this.f4141z = frameLayout;
        this.f4134A = recyclerView;
        this.f4135B = horizontalScrollView;
        this.f4136C = tabLayout;
    }
}
