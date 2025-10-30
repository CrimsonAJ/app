package p;

import androidx.appcompat.widget.ActionBarContextView;

/* renamed from: p.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1783a implements P.Y {

    /* renamed from: a, reason: collision with root package name */
    public boolean f21942a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f21943b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActionBarContextView f21944c;

    public C1783a(ActionBarContextView actionBarContextView) {
        this.f21944c = actionBarContextView;
    }

    @Override // P.Y
    public final void a() {
        if (this.f21942a) {
            return;
        }
        ActionBarContextView actionBarContextView = this.f21944c;
        actionBarContextView.f9378f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.f21943b);
    }

    @Override // P.Y
    public final void b() {
        this.f21942a = true;
    }

    @Override // P.Y
    public final void c() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.f21942a = false;
    }
}
