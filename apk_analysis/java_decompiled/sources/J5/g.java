package J5;

import android.view.View;

/* loaded from: classes.dex */
public final class g implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f4205a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f4206b;

    public g(h hVar, View view) {
        this.f4206b = hVar;
        this.f4205a = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        View view2 = this.f4205a;
        if (view2.getVisibility() == 0) {
            this.f4206b.c(view2);
        }
    }
}
