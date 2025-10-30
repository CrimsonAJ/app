package d;

import androidx.lifecycle.EnumC0554o;
import androidx.lifecycle.InterfaceC0559u;
import androidx.lifecycle.InterfaceC0561w;

/* renamed from: d.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1080u implements InterfaceC0559u, InterfaceC1062c {

    /* renamed from: a, reason: collision with root package name */
    public final D.n f16621a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1073n f16622b;

    /* renamed from: c, reason: collision with root package name */
    public C1081v f16623c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1082w f16624d;

    public C1080u(C1082w c1082w, D.n nVar, AbstractC1073n onBackPressedCallback) {
        kotlin.jvm.internal.h.e(onBackPressedCallback, "onBackPressedCallback");
        this.f16624d = c1082w;
        this.f16621a = nVar;
        this.f16622b = onBackPressedCallback;
        nVar.V(this);
    }

    @Override // d.InterfaceC1062c
    public final void cancel() {
        this.f16621a.g0(this);
        this.f16622b.f16607b.remove(this);
        C1081v c1081v = this.f16623c;
        if (c1081v != null) {
            c1081v.cancel();
        }
        this.f16623c = null;
    }

    @Override // androidx.lifecycle.InterfaceC0559u
    public final void d(InterfaceC0561w interfaceC0561w, EnumC0554o enumC0554o) {
        if (enumC0554o == EnumC0554o.ON_START) {
            this.f16623c = this.f16624d.b(this.f16622b);
            return;
        }
        if (enumC0554o == EnumC0554o.ON_STOP) {
            C1081v c1081v = this.f16623c;
            if (c1081v != null) {
                c1081v.cancel();
                return;
            }
            return;
        }
        if (enumC0554o == EnumC0554o.ON_DESTROY) {
            cancel();
        }
    }
}
