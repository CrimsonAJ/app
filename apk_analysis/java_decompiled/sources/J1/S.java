package J1;

import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.progressindicator.LinearProgressIndicator;

/* loaded from: classes.dex */
public abstract class S extends W.g {

    /* renamed from: A, reason: collision with root package name */
    public final AppCompatTextView f3767A;

    /* renamed from: v, reason: collision with root package name */
    public final BottomNavigationView f3768v;

    /* renamed from: w, reason: collision with root package name */
    public final FrameLayout f3769w;

    /* renamed from: x, reason: collision with root package name */
    public final ShapeableImageView f3770x;

    /* renamed from: y, reason: collision with root package name */
    public final ConstraintLayout f3771y;

    /* renamed from: z, reason: collision with root package name */
    public final LinearProgressIndicator f3772z;

    public S(W.b bVar, View view, BottomNavigationView bottomNavigationView, FrameLayout frameLayout, ShapeableImageView shapeableImageView, ConstraintLayout constraintLayout, LinearProgressIndicator linearProgressIndicator, AppCompatTextView appCompatTextView) {
        super(bVar, view, 0);
        this.f3768v = bottomNavigationView;
        this.f3769w = frameLayout;
        this.f3770x = shapeableImageView;
        this.f3771y = constraintLayout;
        this.f3772z = linearProgressIndicator;
        this.f3767A = appCompatTextView;
    }
}
