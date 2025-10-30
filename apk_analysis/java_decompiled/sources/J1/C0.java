package J1;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.slider.Slider;

/* loaded from: classes.dex */
public abstract class C0 extends W.g {

    /* renamed from: A, reason: collision with root package name */
    public final Slider f3626A;

    /* renamed from: B, reason: collision with root package name */
    public final Slider f3627B;

    /* renamed from: C, reason: collision with root package name */
    public final Slider f3628C;

    /* renamed from: D, reason: collision with root package name */
    public final TextView f3629D;

    /* renamed from: v, reason: collision with root package name */
    public final AppCompatImageView f3630v;

    /* renamed from: w, reason: collision with root package name */
    public final MaterialButton f3631w;

    /* renamed from: x, reason: collision with root package name */
    public final Slider f3632x;

    /* renamed from: y, reason: collision with root package name */
    public final Slider f3633y;

    /* renamed from: z, reason: collision with root package name */
    public final Slider f3634z;

    public C0(W.b bVar, View view, AppCompatImageView appCompatImageView, MaterialButton materialButton, Slider slider, Slider slider2, Slider slider3, Slider slider4, Slider slider5, Slider slider6, TextView textView) {
        super(bVar, view, 0);
        this.f3630v = appCompatImageView;
        this.f3631w = materialButton;
        this.f3632x = slider;
        this.f3633y = slider2;
        this.f3634z = slider3;
        this.f3626A = slider4;
        this.f3627B = slider5;
        this.f3628C = slider6;
        this.f3629D = textView;
    }
}
