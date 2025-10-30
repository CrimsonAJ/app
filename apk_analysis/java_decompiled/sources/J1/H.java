package J1;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

/* loaded from: classes.dex */
public abstract class H extends W.g {

    /* renamed from: A, reason: collision with root package name */
    public final E1 f3679A;

    /* renamed from: B, reason: collision with root package name */
    public final RecyclerView f3680B;

    /* renamed from: C, reason: collision with root package name */
    public final AppCompatTextView f3681C;

    /* renamed from: D, reason: collision with root package name */
    public final View f3682D;

    /* renamed from: v, reason: collision with root package name */
    public final AppCompatImageView f3683v;

    /* renamed from: w, reason: collision with root package name */
    public final MaterialButton f3684w;

    /* renamed from: x, reason: collision with root package name */
    public final TextInputEditText f3685x;

    /* renamed from: y, reason: collision with root package name */
    public final Group f3686y;

    /* renamed from: z, reason: collision with root package name */
    public final AppCompatImageView f3687z;

    public H(W.b bVar, View view, AppCompatImageView appCompatImageView, MaterialButton materialButton, TextInputEditText textInputEditText, Group group, AppCompatImageView appCompatImageView2, E1 e12, RecyclerView recyclerView, AppCompatTextView appCompatTextView, View view2) {
        super(bVar, view, 1);
        this.f3683v = appCompatImageView;
        this.f3684w = materialButton;
        this.f3685x = textInputEditText;
        this.f3686y = group;
        this.f3687z = appCompatImageView2;
        this.f3679A = e12;
        this.f3680B = recyclerView;
        this.f3681C = appCompatTextView;
        this.f3682D = view2;
    }
}
