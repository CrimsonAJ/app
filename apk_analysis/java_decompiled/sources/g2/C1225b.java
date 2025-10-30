package g2;

import F0.C0102f;
import F0.r0;
import J1.V0;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import co.notix.R;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import java.util.List;

/* renamed from: g2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1225b extends F0.I implements Filterable {

    /* renamed from: i, reason: collision with root package name */
    public static final N1.b f17649i = new N1.b(11);

    /* renamed from: e, reason: collision with root package name */
    public final O7.l f17650e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f17651f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f17652g;

    /* renamed from: h, reason: collision with root package name */
    public int f17653h;

    public C1225b(O7.l lVar) {
        super(f17649i);
        this.f17650e = lVar;
        this.f17651f = new ArrayList();
        this.f17652g = new ArrayList();
    }

    @Override // F0.S
    public final void g(r0 r0Var, int i9) {
        ColorStateList valueOf;
        C1224a c1224a = (C1224a) r0Var;
        V0 v02 = c1224a.f17629u;
        v02.f7853k.setOnClickListener(new I5.k(this, 17, c1224a));
        Object n7 = n(i9);
        kotlin.jvm.internal.h.d(n7, "getItem(...)");
        I2.a aVar = (I2.a) n7;
        String valueOf2 = String.valueOf(aVar.f3445b);
        MaterialButton materialButton = v02.f3793v;
        materialButton.setText(valueOf2);
        boolean z9 = aVar.j;
        View view = v02.f7853k;
        if (z9) {
            valueOf = ColorStateList.valueOf(view.getContext().getColor(R.color.colorAccent));
        } else if (aVar.f3455m) {
            valueOf = ColorStateList.valueOf(view.getContext().getColor(R.color.colorFiller));
        } else {
            valueOf = ColorStateList.valueOf(view.getContext().getColor(R.color.colorButtonInactive));
        }
        materialButton.setBackgroundTintList(valueOf);
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        return new R1.B(this, 2);
    }

    @Override // F0.S
    public final r0 h(ViewGroup parent, int i9) {
        kotlin.jvm.internal.h.e(parent, "parent");
        LayoutInflater from = LayoutInflater.from(parent.getContext());
        int i10 = V0.f3792x;
        V0 v02 = (V0) W.c.b(from, R.layout.item_episode_number, parent, false);
        kotlin.jvm.internal.h.d(v02, "inflate(...)");
        return new C1224a(v02);
    }

    public final void p(long j) {
        if (this.f17653h < a()) {
            e(this.f17653h);
        }
        C0102f c0102f = this.f2039d;
        List list = c0102f.f2100f;
        kotlin.jvm.internal.h.d(list, "getCurrentList(...)");
        int i9 = 0;
        for (Object obj : list) {
            int i10 = i9 + 1;
            if (i9 >= 0) {
                if (((I2.a) obj).f3444a == j) {
                    e(i9);
                    this.f17653h = i9;
                    if (i9 > 0) {
                        e(i9 - 1);
                    }
                    List list2 = c0102f.f2100f;
                    kotlin.jvm.internal.h.d(list2, "getCurrentList(...)");
                    if (i9 < B7.l.a0(list2)) {
                        e(i10);
                    }
                }
                i9 = i10;
            } else {
                B7.l.e0();
                throw null;
            }
        }
    }

    public final void q(List list, List subList) {
        kotlin.jvm.internal.h.e(list, "list");
        kotlin.jvm.internal.h.e(subList, "subList");
        ArrayList arrayList = this.f17652g;
        arrayList.clear();
        arrayList.addAll(subList);
        ArrayList arrayList2 = this.f17651f;
        arrayList2.clear();
        arrayList2.addAll(list);
        o(subList);
    }
}
