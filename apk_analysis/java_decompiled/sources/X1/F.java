package X1;

import F0.S;
import F0.r0;
import J1.Z0;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import co.notix.R;
import com.anilab.android.ui.home.HomeFragment;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class F extends S {

    /* renamed from: d, reason: collision with root package name */
    public final HomeFragment f8241d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f8242e = new ArrayList();

    public F(HomeFragment homeFragment) {
        this.f8241d = homeFragment;
    }

    @Override // F0.S
    public final int a() {
        return this.f8242e.size();
    }

    @Override // F0.S
    public final int c(int i9) {
        return !(B7.k.r0(this.f8242e, i9) instanceof H2.k) ? 1 : 0;
    }

    @Override // F0.S
    public final void g(r0 r0Var, int i9) {
        H2.n nVar = (H2.n) B7.k.r0(this.f8242e, i9);
        if ((r0Var instanceof E) && (nVar instanceof H2.l)) {
            E e8 = (E) r0Var;
            H2.l item = (H2.l) nVar;
            kotlin.jvm.internal.h.e(item, "item");
            final Z0 z02 = e8.f8238u;
            z02.f3821w.setText(item.f3035a.f14440b);
            RecyclerView recyclerView = z02.f3822x;
            recyclerView.setHasFixedSize(true);
            A7.l lVar = e8.f8239v;
            recyclerView.setAdapter((r) lVar.getValue());
            r rVar = (r) lVar.getValue();
            final int i10 = 1;
            rVar.f2039d.b(item.f3036b, new Runnable() { // from class: X1.z
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            z02.f3822x.h0(0);
                            return;
                        default:
                            z02.f3822x.h0(0);
                            return;
                    }
                }
            });
            AppCompatTextView buttonSeeAll = z02.f3820v;
            kotlin.jvm.internal.h.d(buttonSeeAll, "buttonSeeAll");
            buttonSeeAll.setVisibility(0);
            buttonSeeAll.setOnClickListener(new I5.k(e8.f8240w, 9, item));
            return;
        }
        if ((r0Var instanceof D) && (nVar instanceof H2.k)) {
            D d9 = (D) r0Var;
            H2.k item2 = (H2.k) nVar;
            kotlin.jvm.internal.h.e(item2, "item");
            final Z0 z03 = d9.f8236u;
            AppCompatTextView buttonSeeAll2 = z03.f3820v;
            kotlin.jvm.internal.h.d(buttonSeeAll2, "buttonSeeAll");
            buttonSeeAll2.setVisibility(8);
            z03.f3821w.setText(item2.f3033a.f14440b);
            RecyclerView recyclerView2 = z03.f3822x;
            recyclerView2.setHasFixedSize(true);
            A7.l lVar2 = d9.f8237v;
            recyclerView2.setAdapter((C0434c) lVar2.getValue());
            C0434c c0434c = (C0434c) lVar2.getValue();
            final int i11 = 0;
            c0434c.f2039d.b(item2.f3034b, new Runnable() { // from class: X1.z
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            z03.f3822x.h0(0);
                            return;
                        default:
                            z03.f3822x.h0(0);
                            return;
                    }
                }
            });
        }
    }

    @Override // F0.S
    public final r0 h(ViewGroup parent, int i9) {
        kotlin.jvm.internal.h.e(parent, "parent");
        if (i9 == 0) {
            LayoutInflater from = LayoutInflater.from(parent.getContext());
            int i10 = Z0.f3819y;
            Z0 z02 = (Z0) W.c.b(from, R.layout.item_home, parent, false);
            kotlin.jvm.internal.h.d(z02, "inflate(...)");
            return new D(this, z02);
        }
        LayoutInflater from2 = LayoutInflater.from(parent.getContext());
        int i11 = Z0.f3819y;
        Z0 z03 = (Z0) W.c.b(from2, R.layout.item_home, parent, false);
        kotlin.jvm.internal.h.d(z03, "inflate(...)");
        return new E(this, z03);
    }
}
