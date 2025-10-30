package R1;

import F0.C0102f;
import F0.I;
import android.widget.Filter;
import d2.C1108b;
import g2.C1225b;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class B extends Filter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6505a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f6506b;

    public /* synthetic */ B(I i9, int i10) {
        this.f6505a = i10;
        this.f6506b = i9;
    }

    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        switch (this.f6505a) {
            case 0:
                Filter.FilterResults filterResults = new Filter.FilterResults();
                C c3 = (C) this.f6506b;
                if (charSequence != null && !W7.d.U(charSequence)) {
                    ArrayList arrayList4 = c3.f6511i;
                    arrayList = new ArrayList();
                    int size = arrayList4.size();
                    int i9 = 0;
                    while (i9 < size) {
                        Object obj = arrayList4.get(i9);
                        i9++;
                        if (W7.d.c0(charSequence, String.valueOf(((H2.i) obj).f3028c))) {
                            arrayList.add(obj);
                        }
                    }
                } else {
                    arrayList = c3.f6511i;
                }
                filterResults.values = arrayList;
                return filterResults;
            case 1:
                Filter.FilterResults filterResults2 = new Filter.FilterResults();
                C1108b c1108b = (C1108b) this.f6506b;
                if (charSequence != null && !W7.d.U(charSequence)) {
                    ArrayList arrayList5 = c1108b.f16775g;
                    arrayList2 = new ArrayList();
                    int size2 = arrayList5.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        Object obj2 = arrayList5.get(i10);
                        i10++;
                        if (W7.d.c0(charSequence, String.valueOf(((H2.i) obj2).f3028c))) {
                            arrayList2.add(obj2);
                        }
                    }
                } else {
                    arrayList2 = c1108b.f16775g;
                }
                filterResults2.values = arrayList2;
                return filterResults2;
            default:
                Filter.FilterResults filterResults3 = new Filter.FilterResults();
                C1225b c1225b = (C1225b) this.f6506b;
                if (charSequence != null && !W7.d.U(charSequence)) {
                    ArrayList arrayList6 = c1225b.f17651f;
                    arrayList3 = new ArrayList();
                    int size3 = arrayList6.size();
                    int i11 = 0;
                    while (i11 < size3) {
                        Object obj3 = arrayList6.get(i11);
                        i11++;
                        if (W7.d.c0(charSequence, String.valueOf(((I2.a) obj3).f3445b))) {
                            arrayList3.add(obj3);
                        }
                    }
                } else {
                    arrayList3 = c1225b.f17652g;
                }
                filterResults3.values = arrayList3;
                return filterResults3;
        }
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Object obj;
        List list;
        Object obj2;
        List list2;
        Object obj3;
        List list3;
        switch (this.f6505a) {
            case 0:
                C c3 = (C) this.f6506b;
                int i9 = c3.f6510h;
                C0102f c0102f = c3.f2039d;
                if (i9 < c0102f.f2100f.size()) {
                    List list4 = c0102f.f2100f;
                    kotlin.jvm.internal.h.d(list4, "getCurrentList(...)");
                    if (!list4.isEmpty()) {
                        c3.e(c3.f6510h);
                    }
                }
                c3.f6510h = 0;
                ArrayList arrayList = null;
                if (filterResults != null) {
                    obj = filterResults.values;
                } else {
                    obj = null;
                }
                if (obj instanceof List) {
                    list = (List) obj;
                } else {
                    list = null;
                }
                if (list != null) {
                    arrayList = new ArrayList();
                    for (Object obj4 : list) {
                        if (obj4 instanceof H2.i) {
                            arrayList.add(obj4);
                        }
                    }
                }
                c0102f.b(arrayList, new A6.s(9, c3));
                return;
            case 1:
                ArrayList arrayList2 = null;
                if (filterResults != null) {
                    obj2 = filterResults.values;
                } else {
                    obj2 = null;
                }
                if (obj2 instanceof List) {
                    list2 = (List) obj2;
                } else {
                    list2 = null;
                }
                if (list2 != null) {
                    arrayList2 = new ArrayList();
                    for (Object obj5 : list2) {
                        if (obj5 instanceof H2.i) {
                            arrayList2.add(obj5);
                        }
                    }
                }
                ((C1108b) this.f6506b).o(arrayList2);
                return;
            default:
                ArrayList arrayList3 = null;
                if (filterResults != null) {
                    obj3 = filterResults.values;
                } else {
                    obj3 = null;
                }
                if (obj3 instanceof List) {
                    list3 = (List) obj3;
                } else {
                    list3 = null;
                }
                if (list3 != null) {
                    arrayList3 = new ArrayList();
                    for (Object obj6 : list3) {
                        if (obj6 instanceof I2.a) {
                            arrayList3.add(obj6);
                        }
                    }
                }
                ((C1225b) this.f6506b).o(arrayList3);
                return;
        }
    }
}
