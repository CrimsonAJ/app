package d;

import android.view.View;
import android.view.Window;
import androidx.lifecycle.EnumC0554o;
import androidx.lifecycle.InterfaceC0559u;
import androidx.lifecycle.InterfaceC0561w;
import androidx.lifecycle.j0;
import i0.AbstractActivityC1369y;

/* renamed from: d.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1066g implements InterfaceC0559u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16573a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC1369y f16574b;

    public /* synthetic */ C1066g(AbstractActivityC1369y abstractActivityC1369y, int i9) {
        this.f16573a = i9;
        this.f16574b = abstractActivityC1369y;
    }

    @Override // androidx.lifecycle.InterfaceC0559u
    public final void d(InterfaceC0561w interfaceC0561w, EnumC0554o enumC0554o) {
        View view;
        switch (this.f16573a) {
            case 0:
                if (enumC0554o == EnumC0554o.ON_STOP) {
                    Window window = this.f16574b.getWindow();
                    if (window != null) {
                        view = window.peekDecorView();
                    } else {
                        view = null;
                    }
                    if (view != null) {
                        view.cancelPendingInputEvents();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (enumC0554o == EnumC0554o.ON_DESTROY) {
                    this.f16574b.f16586b.f705b = null;
                    if (!this.f16574b.isChangingConfigurations()) {
                        this.f16574b.u().a();
                    }
                    ExecutorC1070k executorC1070k = this.f16574b.f16593i;
                    AbstractActivityC1369y abstractActivityC1369y = executorC1070k.f16585d;
                    abstractActivityC1369y.getWindow().getDecorView().removeCallbacks(executorC1070k);
                    abstractActivityC1369y.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(executorC1070k);
                    return;
                }
                return;
            default:
                AbstractActivityC1369y abstractActivityC1369y2 = this.f16574b;
                if (abstractActivityC1369y2.f16590f == null) {
                    C1069j c1069j = (C1069j) abstractActivityC1369y2.getLastNonConfigurationInstance();
                    if (c1069j != null) {
                        abstractActivityC1369y2.f16590f = c1069j.f16581a;
                    }
                    if (abstractActivityC1369y2.f16590f == null) {
                        abstractActivityC1369y2.f16590f = new j0();
                    }
                }
                abstractActivityC1369y2.f16588d.g0(this);
                return;
        }
    }
}
