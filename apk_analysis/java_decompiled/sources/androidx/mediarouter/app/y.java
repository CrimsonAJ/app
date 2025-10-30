package androidx.mediarouter.app;

import F0.r0;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import co.notix.R;

/* loaded from: classes.dex */
public final class y extends r0 {

    /* renamed from: u, reason: collision with root package name */
    public final View f10191u;

    /* renamed from: v, reason: collision with root package name */
    public final ImageView f10192v;

    /* renamed from: w, reason: collision with root package name */
    public final ProgressBar f10193w;

    /* renamed from: x, reason: collision with root package name */
    public final TextView f10194x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ z f10195y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, View view) {
        super(view);
        this.f10195y = zVar;
        this.f10191u = view;
        this.f10192v = (ImageView) view.findViewById(R.id.mr_picker_route_icon);
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.mr_picker_route_progress_bar);
        this.f10193w = progressBar;
        this.f10194x = (TextView) view.findViewById(R.id.mr_picker_route_name);
        s8.e.a0(zVar.j.f9925h, progressBar);
    }
}
