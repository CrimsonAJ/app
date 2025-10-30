package M1;

import F0.I;
import F0.r0;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/* renamed from: M1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0249e extends I {
    @Override // F0.S
    public final r0 h(ViewGroup parent, int i9) {
        kotlin.jvm.internal.h.e(parent, "parent");
        LayoutInflater from = LayoutInflater.from(parent.getContext());
        kotlin.jvm.internal.h.d(from, "from(...)");
        return p(from, parent);
    }

    public abstract o p(LayoutInflater layoutInflater, ViewGroup viewGroup);

    @Override // F0.S
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public void g(o oVar, int i9) {
        Object n7 = n(i9);
        kotlin.jvm.internal.h.d(n7, "getItem(...)");
        oVar.r(n7);
    }
}
