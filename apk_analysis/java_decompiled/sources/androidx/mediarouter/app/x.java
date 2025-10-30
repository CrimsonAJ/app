package androidx.mediarouter.app;

import android.view.View;

/* loaded from: classes.dex */
public final class x implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t0.C f10189a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f10190b;

    public x(y yVar, t0.C c3) {
        this.f10190b = yVar;
        this.f10189a = c3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        y yVar = this.f10190b;
        A a5 = yVar.f10195y.j;
        t0.C c3 = this.f10189a;
        a5.f9930n = c3;
        c3.l(true);
        yVar.f10192v.setVisibility(4);
        yVar.f10193w.setVisibility(0);
    }
}
