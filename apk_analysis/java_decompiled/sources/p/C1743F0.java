package p;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import f5.C1183o;
import java.lang.reflect.Method;

/* renamed from: p.F0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1743F0 extends C1733A0 implements InterfaceC1735B0 {

    /* renamed from: X, reason: collision with root package name */
    public static final Method f21811X;

    /* renamed from: D, reason: collision with root package name */
    public C1183o f21812D;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f21811X = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // p.InterfaceC1735B0
    public final void h(o.l lVar, o.n nVar) {
        C1183o c1183o = this.f21812D;
        if (c1183o != null) {
            c1183o.h(lVar, nVar);
        }
    }

    @Override // p.InterfaceC1735B0
    public final void n(o.l lVar, o.n nVar) {
        C1183o c1183o = this.f21812D;
        if (c1183o != null) {
            c1183o.n(lVar, nVar);
        }
    }

    @Override // p.C1733A0
    public final C1812o0 q(Context context, boolean z9) {
        C1741E0 c1741e0 = new C1741E0(context, z9);
        c1741e0.setHoverListener(this);
        return c1741e0;
    }
}
