package o2;

import androidx.lifecycle.InterfaceC0550k;
import androidx.lifecycle.h0;
import androidx.lifecycle.k0;
import com.anilab.android.ui.settings.SubtitleSettingsFragment;
import com.anilab.android.ui.splash.SplashFragment;
import com.anilab.android.ui.update.CommonErrorDialogFragment;
import com.anilab.android.ui.update.UpdateFragment;
import com.anilab.android.ui.welcome.WelcomeFragment;
import i0.AbstractComponentCallbacksC1366v;
import u0.C2042m;
import u0.C2044o;

/* renamed from: o2.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1689p extends kotlin.jvm.internal.i implements O7.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f21544d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f21545e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f21546f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1689p(AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v, A7.e eVar, int i9) {
        super(0);
        this.f21544d = i9;
        this.f21546f = abstractComponentCallbacksC1366v;
        this.f21545e = eVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [A7.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [A7.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [A7.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [A7.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v41, types: [A7.e, java.lang.Object] */
    @Override // O7.a
    public final Object invoke() {
        InterfaceC0550k interfaceC0550k;
        h0 j;
        InterfaceC0550k interfaceC0550k2;
        h0 j4;
        InterfaceC0550k interfaceC0550k3;
        h0 j9;
        InterfaceC0550k interfaceC0550k4;
        h0 j10;
        InterfaceC0550k interfaceC0550k5;
        h0 j11;
        switch (this.f21544d) {
            case 0:
                k0 k0Var = (k0) this.f21545e.getValue();
                if (k0Var instanceof InterfaceC0550k) {
                    interfaceC0550k = (InterfaceC0550k) k0Var;
                } else {
                    interfaceC0550k = null;
                }
                if (interfaceC0550k == null || (j = interfaceC0550k.j()) == null) {
                    return ((SubtitleSettingsFragment) this.f21546f).j();
                }
                return j;
            case 1:
                k0 k0Var2 = (k0) this.f21545e.getValue();
                if (k0Var2 instanceof InterfaceC0550k) {
                    interfaceC0550k2 = (InterfaceC0550k) k0Var2;
                } else {
                    interfaceC0550k2 = null;
                }
                if (interfaceC0550k2 == null || (j4 = interfaceC0550k2.j()) == null) {
                    return ((SplashFragment) this.f21546f).j();
                }
                return j4;
            case 2:
                k0 k0Var3 = (k0) this.f21545e.getValue();
                if (k0Var3 instanceof InterfaceC0550k) {
                    interfaceC0550k3 = (InterfaceC0550k) k0Var3;
                } else {
                    interfaceC0550k3 = null;
                }
                if (interfaceC0550k3 == null || (j9 = interfaceC0550k3.j()) == null) {
                    return ((CommonErrorDialogFragment) this.f21546f).j();
                }
                return j9;
            case 3:
                k0 k0Var4 = (k0) this.f21545e.getValue();
                if (k0Var4 instanceof InterfaceC0550k) {
                    interfaceC0550k4 = (InterfaceC0550k) k0Var4;
                } else {
                    interfaceC0550k4 = null;
                }
                if (interfaceC0550k4 == null || (j10 = interfaceC0550k4.j()) == null) {
                    return ((UpdateFragment) this.f21546f).j();
                }
                return j10;
            case 4:
                k0 k0Var5 = (k0) this.f21545e.getValue();
                if (k0Var5 instanceof InterfaceC0550k) {
                    interfaceC0550k5 = (InterfaceC0550k) k0Var5;
                } else {
                    interfaceC0550k5 = null;
                }
                if (interfaceC0550k5 == null || (j11 = interfaceC0550k5.j()) == null) {
                    return ((WelcomeFragment) this.f21546f).j();
                }
                return j11;
            default:
                ((C2044o) this.f21546f).e((C2042m) this.f21545e);
                return A7.n.f558a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1689p(C2044o c2044o, C2042m c2042m, boolean z9) {
        super(0);
        this.f21544d = 5;
        this.f21546f = c2044o;
        this.f21545e = c2042m;
    }
}
