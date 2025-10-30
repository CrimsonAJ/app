package J1;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public abstract class U extends W.g {

    /* renamed from: A, reason: collision with root package name */
    public final View f3781A;

    /* renamed from: v, reason: collision with root package name */
    public final AppCompatImageView f3782v;

    /* renamed from: w, reason: collision with root package name */
    public final MaterialButton f3783w;

    /* renamed from: x, reason: collision with root package name */
    public final MaterialButton f3784x;

    /* renamed from: y, reason: collision with root package name */
    public final E1 f3785y;

    /* renamed from: z, reason: collision with root package name */
    public final AppCompatTextView f3786z;

    public U(W.b bVar, View view, AppCompatImageView appCompatImageView, MaterialButton materialButton, MaterialButton materialButton2, E1 e12, AppCompatTextView appCompatTextView, View view2) {
        super(bVar, view, 1);
        this.f3782v = appCompatImageView;
        this.f3783w = materialButton;
        this.f3784x = materialButton2;
        this.f3785y = e12;
        this.f3786z = appCompatTextView;
        this.f3781A = view2;
    }
}
