package K5;

import android.view.View;

/* renamed from: K5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC0216b implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4314a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f4315b;

    public /* synthetic */ ViewOnFocusChangeListenerC0216b(r rVar, int i9) {
        this.f4314a = i9;
        this.f4315b = rVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z9) {
        switch (this.f4314a) {
            case 0:
                e eVar = (e) this.f4315b;
                eVar.t(eVar.u());
                return;
            default:
                l lVar = (l) this.f4315b;
                lVar.f4342l = z9;
                lVar.q();
                if (!z9) {
                    lVar.t(false);
                    lVar.f4343m = false;
                    return;
                }
                return;
        }
    }
}
