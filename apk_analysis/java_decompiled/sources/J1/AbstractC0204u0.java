package J1;

import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.LinearProgressIndicator;

/* renamed from: J1.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0204u0 extends W.g {

    /* renamed from: A, reason: collision with root package name */
    public final LinearProgressIndicator f4097A;

    /* renamed from: B, reason: collision with root package name */
    public final RecyclerView f4098B;

    /* renamed from: C, reason: collision with root package name */
    public final RecyclerView f4099C;

    /* renamed from: D, reason: collision with root package name */
    public final AppCompatEditText f4100D;

    /* renamed from: v, reason: collision with root package name */
    public final AppCompatImageView f4101v;

    /* renamed from: w, reason: collision with root package name */
    public final AppCompatImageView f4102w;

    /* renamed from: x, reason: collision with root package name */
    public final MaterialButton f4103x;

    /* renamed from: y, reason: collision with root package name */
    public final LinearLayoutCompat f4104y;

    /* renamed from: z, reason: collision with root package name */
    public final E1 f4105z;

    public AbstractC0204u0(W.b bVar, View view, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, MaterialButton materialButton, LinearLayoutCompat linearLayoutCompat, E1 e12, LinearProgressIndicator linearProgressIndicator, RecyclerView recyclerView, RecyclerView recyclerView2, AppCompatEditText appCompatEditText) {
        super(bVar, view, 1);
        this.f4101v = appCompatImageView;
        this.f4102w = appCompatImageView2;
        this.f4103x = materialButton;
        this.f4104y = linearLayoutCompat;
        this.f4105z = e12;
        this.f4097A = linearProgressIndicator;
        this.f4098B = recyclerView;
        this.f4099C = recyclerView2;
        this.f4100D = appCompatEditText;
    }
}
