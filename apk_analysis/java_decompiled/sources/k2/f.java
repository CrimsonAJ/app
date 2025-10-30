package k2;

import F0.S;
import F0.r0;
import G0.C0142h;
import H2.v;
import J1.o1;
import J1.q1;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import co.notix.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f extends S {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f19890d;

    /* renamed from: e, reason: collision with root package name */
    public final C0142h f19891e;

    /* renamed from: f, reason: collision with root package name */
    public final N1.i f19892f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f19893g = new ArrayList();

    public f(boolean z9, C0142h c0142h, N1.i iVar) {
        this.f19890d = z9;
        this.f19891e = c0142h;
        this.f19892f = iVar;
    }

    @Override // F0.S
    public final int a() {
        return this.f19893g.size();
    }

    @Override // F0.S
    public final int c(int i9) {
        if (((v) this.f19893g.get(i9)).f3073a > 0) {
            return 0;
        }
        return 1;
    }

    @Override // F0.S
    public final void g(r0 r0Var, int i9) {
        boolean z9 = r0Var instanceof e;
        ArrayList arrayList = this.f19893g;
        if (z9) {
            ((e) r0Var).r((v) arrayList.get(i9));
        }
        if (r0Var instanceof d) {
            ((d) r0Var).r((v) arrayList.get(i9));
        }
    }

    @Override // F0.S
    public final r0 h(ViewGroup parent, int i9) {
        kotlin.jvm.internal.h.e(parent, "parent");
        if (i9 == 0) {
            LayoutInflater from = LayoutInflater.from(parent.getContext());
            int i10 = o1.f4030C;
            o1 o1Var = (o1) W.c.b(from, R.layout.item_release_calendar, parent, false);
            kotlin.jvm.internal.h.d(o1Var, "inflate(...)");
            return new e(this, o1Var);
        }
        LayoutInflater from2 = LayoutInflater.from(parent.getContext());
        int i11 = q1.f4059x;
        q1 q1Var = (q1) W.c.b(from2, R.layout.item_release_calendar_current, parent, false);
        kotlin.jvm.internal.h.d(q1Var, "inflate(...)");
        return new d(q1Var);
    }
}
