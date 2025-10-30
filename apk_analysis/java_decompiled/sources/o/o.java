package o;

import android.view.ActionProvider;

/* loaded from: classes.dex */
public final class o implements ActionProvider.VisibilityListener {

    /* renamed from: a, reason: collision with root package name */
    public com.google.firebase.messaging.u f21429a;

    /* renamed from: b, reason: collision with root package name */
    public final ActionProvider f21430b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f21431c;

    public o(s sVar, ActionProvider actionProvider) {
        this.f21431c = sVar;
        this.f21430b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z9) {
        com.google.firebase.messaging.u uVar = this.f21429a;
        if (uVar != null) {
            l lVar = ((n) uVar.f16512a).f21416n;
            lVar.f21382h = true;
            lVar.p(true);
        }
    }
}
