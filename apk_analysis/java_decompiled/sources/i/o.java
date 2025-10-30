package i;

import P.Q;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.google.android.gms.internal.measurement.D1;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class o extends D1 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f18085g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f18086h;

    public /* synthetic */ o(int i9, Object obj) {
        this.f18085g = i9;
        this.f18086h = obj;
    }

    @Override // P.Y
    public final void a() {
        Object obj = this.f18086h;
        switch (this.f18085g) {
            case 0:
                w wVar = ((m) obj).f18083b;
                wVar.f18151v.setAlpha(1.0f);
                wVar.f18157y.d(null);
                wVar.f18157y = null;
                return;
            case 1:
                w wVar2 = (w) obj;
                wVar2.f18151v.setAlpha(1.0f);
                wVar2.f18157y.d(null);
                wVar2.f18157y = null;
                return;
            default:
                O0.c cVar = (O0.c) obj;
                ((w) cVar.f5264c).f18151v.setVisibility(8);
                w wVar3 = (w) cVar.f5264c;
                PopupWindow popupWindow = wVar3.f18153w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (wVar3.f18151v.getParent() instanceof View) {
                    View view = (View) wVar3.f18151v.getParent();
                    WeakHashMap weakHashMap = Q.f5546a;
                    P.F.c(view);
                }
                wVar3.f18151v.e();
                wVar3.f18157y.d(null);
                wVar3.f18157y = null;
                ViewGroup viewGroup = wVar3.f18114A;
                WeakHashMap weakHashMap2 = Q.f5546a;
                P.F.c(viewGroup);
                return;
        }
    }

    @Override // com.google.android.gms.internal.measurement.D1, P.Y
    public void c() {
        Object obj = this.f18086h;
        switch (this.f18085g) {
            case 0:
                ((m) obj).f18083b.f18151v.setVisibility(0);
                return;
            case 1:
                w wVar = (w) obj;
                wVar.f18151v.setVisibility(0);
                if (wVar.f18151v.getParent() instanceof View) {
                    View view = (View) wVar.f18151v.getParent();
                    WeakHashMap weakHashMap = Q.f5546a;
                    P.F.c(view);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
