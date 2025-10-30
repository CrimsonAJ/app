package x0;

import android.view.Menu;
import android.view.MenuItem;
import com.google.android.gms.internal.measurement.Y1;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.h;
import u0.C;
import u0.H;
import u0.InterfaceC2034e;
import z5.k;

/* renamed from: x0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2156a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WeakReference f24471a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ H f24472b;

    public C2156a(WeakReference weakReference, H h7) {
        this.f24471a = weakReference;
        this.f24472b = h7;
    }

    public final void a(H controller, C destination) {
        h.e(controller, "controller");
        h.e(destination, "destination");
        k kVar = (k) this.f24471a.get();
        if (kVar == null) {
            this.f24472b.f23408p.remove(this);
            return;
        }
        if (!(destination instanceof InterfaceC2034e)) {
            Menu menu = kVar.getMenu();
            h.d(menu, "view.menu");
            int size = menu.size();
            for (int i9 = 0; i9 < size; i9++) {
                MenuItem item = menu.getItem(i9);
                if (item != null) {
                    if (Y1.v(item.getItemId(), destination)) {
                        item.setChecked(true);
                    }
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException("getItem(index)".concat(" must not be null"));
                    h.g(illegalStateException, h.class.getName());
                    throw illegalStateException;
                }
            }
        }
    }
}
