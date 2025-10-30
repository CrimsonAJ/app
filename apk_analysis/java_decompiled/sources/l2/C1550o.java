package l2;

import G0.C0142h;
import J1.C1;
import M1.AbstractC0249e;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import co.notix.R;

/* renamed from: l2.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1550o extends AbstractC0249e {

    /* renamed from: f, reason: collision with root package name */
    public static final N1.b f20223f = new N1.b(14);

    /* renamed from: e, reason: collision with root package name */
    public final C0142h f20224e;

    public C1550o(C0142h c0142h) {
        super(f20223f);
        this.f20224e = c0142h;
    }

    @Override // M1.AbstractC0249e
    public final M1.o p(LayoutInflater layoutInflater, ViewGroup parent) {
        kotlin.jvm.internal.h.e(parent, "parent");
        int i9 = C1.f3635x;
        C1 c12 = (C1) W.c.b(layoutInflater, R.layout.item_top_search, parent, false);
        kotlin.jvm.internal.h.d(c12, "inflate(...)");
        return new N1.d(this, c12, 12);
    }
}
