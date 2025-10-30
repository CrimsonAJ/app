package n2;

import F0.C0102f;
import J1.z1;
import M1.AbstractC0249e;
import M1.o;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import co.notix.R;
import java.util.List;

/* loaded from: classes.dex */
public final class h extends AbstractC0249e {

    /* renamed from: f, reason: collision with root package name */
    public static final N1.b f21063f = new N1.b(15);

    /* renamed from: e, reason: collision with root package name */
    public int f21064e;

    public h() {
        super(f21063f);
    }

    @Override // M1.AbstractC0249e
    public final o p(LayoutInflater layoutInflater, ViewGroup parent) {
        kotlin.jvm.internal.h.e(parent, "parent");
        int i9 = z1.f4149y;
        z1 z1Var = (z1) W.c.b(layoutInflater, R.layout.item_subtitle, parent, false);
        kotlin.jvm.internal.h.d(z1Var, "inflate(...)");
        return new N1.d(this, z1Var, 13);
    }

    public final I2.c r() {
        C0102f c0102f = this.f2039d;
        List list = c0102f.f2100f;
        kotlin.jvm.internal.h.d(list, "getCurrentList(...)");
        if (!list.isEmpty()) {
            return (I2.c) c0102f.f2100f.get(this.f21064e);
        }
        return null;
    }
}
