package androidx.mediarouter.app;

import F0.r0;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import co.notix.R;

/* loaded from: classes.dex */
public final class G extends r0 {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ L f9948A;

    /* renamed from: u, reason: collision with root package name */
    public final View f9949u;

    /* renamed from: v, reason: collision with root package name */
    public final ImageView f9950v;

    /* renamed from: w, reason: collision with root package name */
    public final ProgressBar f9951w;

    /* renamed from: x, reason: collision with root package name */
    public final TextView f9952x;

    /* renamed from: y, reason: collision with root package name */
    public final float f9953y;

    /* renamed from: z, reason: collision with root package name */
    public t0.C f9954z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(L l9, View view) {
        super(view);
        this.f9948A = l9;
        this.f9949u = view;
        this.f9950v = (ImageView) view.findViewById(R.id.mr_cast_group_icon);
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.mr_cast_group_progress_bar);
        this.f9951w = progressBar;
        this.f9952x = (TextView) view.findViewById(R.id.mr_cast_group_name);
        this.f9953y = s8.e.B(l9.f9979m.f10030n);
        s8.e.a0(l9.f9979m.f10030n, progressBar);
    }
}
