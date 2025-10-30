package k2;

import B7.x;
import F0.S;
import F0.r0;
import G0.C0142h;
import J1.K0;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import co.notix.R;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: k2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1484b extends S {

    /* renamed from: d, reason: collision with root package name */
    public final C0142h f19879d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f19880e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public int f19881f;

    public C1484b(C0142h c0142h) {
        this.f19879d = c0142h;
        this.f19881f = -1;
        Calendar calendar = Calendar.getInstance();
        int i9 = calendar.get(2);
        int i10 = calendar.get(1);
        this.f19881f = calendar.get(5) - 1;
        T7.a aVar = new T7.a(1, calendar.getActualMaximum(5), 1);
        ArrayList arrayList = new ArrayList(B7.m.f0(aVar, 10));
        Iterator it = aVar.iterator();
        while (((T7.b) it).f7242c) {
            int a5 = ((x) it).a();
            calendar.set(5, a5);
            String displayName = calendar.getDisplayName(7, 1, Locale.ENGLISH);
            if (displayName == null) {
                displayName = "";
            }
            arrayList.add(new H2.b(a5, i9, i10, displayName));
        }
        this.f19880e.clear();
        this.f19880e.addAll(arrayList);
    }

    @Override // F0.S
    public final int a() {
        return this.f19880e.size();
    }

    @Override // F0.S
    public final void g(r0 r0Var, int i9) {
        ((C1483a) r0Var).r((H2.b) this.f19880e.get(i9));
    }

    @Override // F0.S
    public final r0 h(ViewGroup parent, int i9) {
        kotlin.jvm.internal.h.e(parent, "parent");
        LayoutInflater from = LayoutInflater.from(parent.getContext());
        int i10 = K0.f3706x;
        K0 k02 = (K0) W.c.b(from, R.layout.item_calendar, parent, false);
        kotlin.jvm.internal.h.d(k02, "inflate(...)");
        return new C1483a(this, k02);
    }
}
