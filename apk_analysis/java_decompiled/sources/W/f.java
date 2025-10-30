package W;

import androidx.lifecycle.EnumC0554o;
import androidx.lifecycle.G;
import androidx.lifecycle.InterfaceC0560v;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class f implements InterfaceC0560v {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f7847a;

    public f(g gVar) {
        this.f7847a = new WeakReference(gVar);
    }

    @G(EnumC0554o.ON_START)
    public void onStart() {
        g gVar = (g) this.f7847a.get();
        if (gVar != null) {
            gVar.c0();
        }
    }
}
