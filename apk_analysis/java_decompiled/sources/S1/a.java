package S1;

import G0.C0142h;
import J1.I0;
import M1.AbstractC0249e;
import M1.o;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import co.notix.R;

/* loaded from: classes.dex */
public final class a extends AbstractC0249e {

    /* renamed from: f, reason: collision with root package name */
    public static final N1.b f6706f = new N1.b(3);

    /* renamed from: e, reason: collision with root package name */
    public final C0142h f6707e;

    public a(C0142h c0142h) {
        super(f6706f);
        this.f6707e = c0142h;
    }

    @Override // M1.AbstractC0249e
    public final o p(LayoutInflater layoutInflater, ViewGroup parent) {
        kotlin.jvm.internal.h.e(parent, "parent");
        int i9 = I0.f3693w;
        I0 i02 = (I0) W.c.b(layoutInflater, R.layout.item_avatar, parent, false);
        kotlin.jvm.internal.h.d(i02, "inflate(...)");
        return new N1.d(this, i02, 3);
    }
}
