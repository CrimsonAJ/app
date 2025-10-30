package P;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class G implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public u0 f5539a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f5540b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0314o f5541c;

    public G(View view, InterfaceC0314o interfaceC0314o) {
        this.f5540b = view;
        this.f5541c = interfaceC0314o;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        u0 g9 = u0.g(view, windowInsets);
        int i9 = Build.VERSION.SDK_INT;
        InterfaceC0314o interfaceC0314o = this.f5541c;
        if (i9 < 30) {
            H.a(windowInsets, this.f5540b);
            if (g9.equals(this.f5539a)) {
                return interfaceC0314o.t(view, g9).f();
            }
        }
        this.f5539a = g9;
        u0 t7 = interfaceC0314o.t(view, g9);
        if (i9 >= 30) {
            return t7.f();
        }
        WeakHashMap weakHashMap = Q.f5546a;
        F.c(view);
        return t7.f();
    }
}
