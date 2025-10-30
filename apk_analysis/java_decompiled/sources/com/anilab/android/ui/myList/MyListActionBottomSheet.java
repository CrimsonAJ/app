package com.anilab.android.ui.myList;

import A7.e;
import A7.f;
import G0.L;
import J1.AbstractC0184k;
import N1.t;
import O7.l;
import Z0.a;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.navigation.fragment.NavHostFragment;
import b5.G1;
import c2.C0762h;
import co.notix.R;
import com.anilab.android.ui.main.HostFragment;
import com.anilab.android.ui.myList.MyListActionBottomSheet;
import e2.AbstractC1137a;
import e2.C1140d;
import e2.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class MyListActionBottomSheet extends AbstractC1137a<AbstractC0184k, h> {

    /* renamed from: S0, reason: collision with root package name */
    public final G1 f13792S0;

    public MyListActionBottomSheet() {
        e p9 = a.p(f.f545a, new e2.e(0, new C1140d(this, 1)));
        M4.a.i(this, p.a(h.class), new C0762h(p9, 8), new C0762h(p9, 9), new t(this, p9, 19));
        this.f13792S0 = new G1(p.a(e2.f.class), new C1140d(this, 0));
    }

    @Override // M1.g
    public final int n0() {
        return R.layout.bottom_sheet_my_list_action;
    }

    @Override // M1.g
    public final void r0() {
        int i9;
        int i10;
        AbstractC0184k abstractC0184k = (AbstractC0184k) m0();
        G1 g12 = this.f13792S0;
        if (((e2.f) g12.getValue()).f17107a) {
            i9 = R.string.label_unpin_top;
        } else {
            i9 = R.string.label_pin_top;
        }
        AppCompatTextView appCompatTextView = abstractC0184k.f3971v;
        appCompatTextView.setText(i9);
        if (((e2.f) g12.getValue()).f17107a) {
            i10 = R.drawable.ic_unpin;
        } else {
            i10 = R.drawable.ic_pin_outline;
        }
        abstractC0184k.f3973x.setImageResource(i10);
        final int i11 = 0;
        appCompatTextView.setOnClickListener(new View.OnClickListener(this) { // from class: e2.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MyListActionBottomSheet f17102b;

            {
                this.f17102b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        L l9 = new L(5);
                        MyListActionBottomSheet myListActionBottomSheet = this.f17102b;
                        myListActionBottomSheet.t0(l9);
                        myListActionBottomSheet.l0();
                        return;
                    default:
                        L l10 = new L(6);
                        MyListActionBottomSheet myListActionBottomSheet2 = this.f17102b;
                        myListActionBottomSheet2.t0(l10);
                        myListActionBottomSheet2.l0();
                        return;
                }
            }
        });
        final int i12 = 1;
        abstractC0184k.f3972w.setOnClickListener(new View.OnClickListener(this) { // from class: e2.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MyListActionBottomSheet f17102b;

            {
                this.f17102b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        L l9 = new L(5);
                        MyListActionBottomSheet myListActionBottomSheet = this.f17102b;
                        myListActionBottomSheet.t0(l9);
                        myListActionBottomSheet.l0();
                        return;
                    default:
                        L l10 = new L(6);
                        MyListActionBottomSheet myListActionBottomSheet2 = this.f17102b;
                        myListActionBottomSheet2.t0(l10);
                        myListActionBottomSheet2.l0();
                        return;
                }
            }
        });
    }

    public final void t0(l lVar) {
        List q9 = o().f18198c.q();
        kotlin.jvm.internal.h.d(q9, "getFragments(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : q9) {
            if (obj instanceof HostFragment) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj2 = arrayList.get(i9);
            i9++;
            List q10 = ((HostFragment) obj2).l().f18198c.q();
            kotlin.jvm.internal.h.d(q10, "getFragments(...)");
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : q10) {
                if (obj3 instanceof NavHostFragment) {
                    arrayList2.add(obj3);
                }
            }
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj4 = arrayList2.get(i10);
                i10++;
                List q11 = ((NavHostFragment) obj4).l().f18198c.q();
                kotlin.jvm.internal.h.d(q11, "getFragments(...)");
                ArrayList arrayList3 = new ArrayList();
                for (Object obj5 : q11) {
                    if (obj5 instanceof MyListFragment) {
                        arrayList3.add(obj5);
                    }
                }
                int size3 = arrayList3.size();
                int i11 = 0;
                while (i11 < size3) {
                    Object obj6 = arrayList3.get(i11);
                    i11++;
                    lVar.invoke((MyListFragment) obj6);
                }
            }
        }
    }
}
