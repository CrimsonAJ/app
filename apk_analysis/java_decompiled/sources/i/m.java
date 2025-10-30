package i;

import P.Q;
import P.X;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18082a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f18083b;

    public /* synthetic */ m(w wVar, int i9) {
        this.f18082a = i9;
        this.f18083b = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z9;
        ViewGroup viewGroup;
        switch (this.f18082a) {
            case 0:
                w wVar = this.f18083b;
                if ((wVar.f18156x0 & 1) != 0) {
                    wVar.t(0);
                }
                if ((wVar.f18156x0 & 4096) != 0) {
                    wVar.t(108);
                }
                wVar.f18154w0 = false;
                wVar.f18156x0 = 0;
                return;
            default:
                w wVar2 = this.f18083b;
                wVar2.f18153w.showAtLocation(wVar2.f18151v, 55, 0, 0);
                X x5 = wVar2.f18157y;
                if (x5 != null) {
                    x5.b();
                }
                if (wVar2.f18159z && (viewGroup = wVar2.f18114A) != null && viewGroup.isLaidOut()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    wVar2.f18151v.setAlpha(0.0f);
                    X a5 = Q.a(wVar2.f18151v);
                    a5.a(1.0f);
                    wVar2.f18157y = a5;
                    a5.d(new o(0, this));
                    return;
                }
                wVar2.f18151v.setAlpha(1.0f);
                wVar2.f18151v.setVisibility(0);
                return;
        }
    }
}
