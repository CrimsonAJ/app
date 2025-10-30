package e2;

import J1.h1;
import M1.AbstractC0249e;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import co.notix.R;
import d2.C1107a;

/* loaded from: classes.dex */
public final class j extends AbstractC0249e {

    /* renamed from: f, reason: collision with root package name */
    public static final N1.b f17110f = new N1.b(10);

    /* renamed from: e, reason: collision with root package name */
    public final com.google.firebase.messaging.u f17111e;

    public j(com.google.firebase.messaging.u uVar) {
        super(f17110f);
        this.f17111e = uVar;
    }

    @Override // M1.AbstractC0249e
    public final M1.o p(LayoutInflater layoutInflater, ViewGroup parent) {
        kotlin.jvm.internal.h.e(parent, "parent");
        int i9 = h1.f3951B;
        h1 h1Var = (h1) W.c.b(layoutInflater, R.layout.item_my_list, parent, false);
        kotlin.jvm.internal.h.d(h1Var, "inflate(...)");
        return new C1107a(h1Var, this.f17111e);
    }
}
