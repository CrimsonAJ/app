package androidx.mediarouter.app;

import android.view.View;

/* loaded from: classes.dex */
public final class B implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9934a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N f9935b;

    public /* synthetic */ B(N n7, int i9) {
        this.f9934a = i9;
        this.f9935b = n7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f9934a) {
            case 0:
                this.f9935b.dismiss();
                return;
            default:
                N n7 = this.f9935b;
                if (n7.f10021i.g()) {
                    n7.f10015f.getClass();
                    t0.D.i(2);
                }
                n7.dismiss();
                return;
        }
    }
}
