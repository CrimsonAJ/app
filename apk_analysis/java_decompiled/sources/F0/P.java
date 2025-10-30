package F0;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f2053a;

    public /* synthetic */ P(RecyclerView recyclerView) {
        this.f2053a = recyclerView;
    }

    public void a(C0094a c0094a) {
        int i9 = c0094a.f2066a;
        RecyclerView recyclerView = this.f2053a;
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 4) {
                    if (i9 != 8) {
                        return;
                    }
                    recyclerView.f10291n.f0(c0094a.f2067b, c0094a.f2069d);
                    return;
                }
                recyclerView.f10291n.i0(recyclerView, c0094a.f2067b, c0094a.f2069d);
                return;
            }
            recyclerView.f10291n.g0(c0094a.f2067b, c0094a.f2069d);
            return;
        }
        recyclerView.f10291n.d0(c0094a.f2067b, c0094a.f2069d);
    }

    public r0 b(int i9) {
        RecyclerView recyclerView = this.f2053a;
        int l9 = recyclerView.f10276f.l();
        int i10 = 0;
        r0 r0Var = null;
        while (true) {
            if (i10 >= l9) {
                break;
            }
            r0 N8 = RecyclerView.N(recyclerView.f10276f.k(i10));
            if (N8 != null && !N8.i() && N8.f2212c == i9) {
                if (((ArrayList) recyclerView.f10276f.f53e).contains(N8.f2210a)) {
                    r0Var = N8;
                } else {
                    r0Var = N8;
                    break;
                }
            }
            i10++;
        }
        if (r0Var != null) {
            if (((ArrayList) recyclerView.f10276f.f53e).contains(r0Var.f2210a)) {
                if (RecyclerView.f10233b1) {
                    Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
                }
            } else {
                return r0Var;
            }
        }
        return null;
    }

    public void c(int i9, int i10, Object obj) {
        int i11;
        int i12;
        RecyclerView recyclerView = this.f2053a;
        int l9 = recyclerView.f10276f.l();
        int i13 = i10 + i9;
        for (int i14 = 0; i14 < l9; i14++) {
            View k5 = recyclerView.f10276f.k(i14);
            r0 N8 = RecyclerView.N(k5);
            if (N8 != null && !N8.p() && (i12 = N8.f2212c) >= i9 && i12 < i13) {
                N8.a(2);
                if (obj == null) {
                    N8.a(1024);
                } else if ((1024 & N8.j) == 0) {
                    if (N8.f2219k == null) {
                        ArrayList arrayList = new ArrayList();
                        N8.f2219k = arrayList;
                        N8.f2220l = Collections.unmodifiableList(arrayList);
                    }
                    N8.f2219k.add(obj);
                }
                ((C0099c0) k5.getLayoutParams()).f2085c = true;
            }
        }
        h0 h0Var = recyclerView.f10273c;
        ArrayList arrayList2 = h0Var.f2118c;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            r0 r0Var = (r0) arrayList2.get(size);
            if (r0Var != null && (i11 = r0Var.f2212c) >= i9 && i11 < i13) {
                r0Var.a(2);
                h0Var.g(size);
            }
        }
        recyclerView.f10254J0 = true;
    }

    public void d(int i9, int i10) {
        RecyclerView recyclerView = this.f2053a;
        int l9 = recyclerView.f10276f.l();
        for (int i11 = 0; i11 < l9; i11++) {
            r0 N8 = RecyclerView.N(recyclerView.f10276f.k(i11));
            if (N8 != null && !N8.p() && N8.f2212c >= i9) {
                if (RecyclerView.f10233b1) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + i11 + " holder " + N8 + " now at position " + (N8.f2212c + i10));
                }
                N8.m(i10, false);
                recyclerView.f10250F0.f2169f = true;
            }
        }
        ArrayList arrayList = recyclerView.f10273c.f2118c;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            r0 r0Var = (r0) arrayList.get(i12);
            if (r0Var != null && r0Var.f2212c >= i9) {
                if (RecyclerView.f10233b1) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i12 + " holder " + r0Var + " now at position " + (r0Var.f2212c + i10));
                }
                r0Var.m(i10, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f10253I0 = true;
    }

    public void e(int i9, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        RecyclerView recyclerView = this.f2053a;
        int l9 = recyclerView.f10276f.l();
        if (i9 < i10) {
            i12 = i9;
            i11 = i10;
            i13 = -1;
        } else {
            i11 = i9;
            i12 = i10;
            i13 = 1;
        }
        boolean z9 = false;
        for (int i19 = 0; i19 < l9; i19++) {
            r0 N8 = RecyclerView.N(recyclerView.f10276f.k(i19));
            if (N8 != null && (i18 = N8.f2212c) >= i12 && i18 <= i11) {
                if (RecyclerView.f10233b1) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i19 + " holder " + N8);
                }
                if (N8.f2212c == i9) {
                    N8.m(i10 - i9, false);
                } else {
                    N8.m(i13, false);
                }
                recyclerView.f10250F0.f2169f = true;
            }
        }
        h0 h0Var = recyclerView.f10273c;
        h0Var.getClass();
        if (i9 < i10) {
            i15 = i9;
            i14 = i10;
            i16 = -1;
        } else {
            i14 = i9;
            i15 = i10;
            i16 = 1;
        }
        ArrayList arrayList = h0Var.f2118c;
        int size = arrayList.size();
        int i20 = 0;
        while (i20 < size) {
            r0 r0Var = (r0) arrayList.get(i20);
            if (r0Var != null && (i17 = r0Var.f2212c) >= i15 && i17 <= i14) {
                if (i17 == i9) {
                    r0Var.m(i10 - i9, z9);
                } else {
                    r0Var.m(i16, z9);
                }
                if (RecyclerView.f10233b1) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i20 + " holder " + r0Var);
                }
            }
            i20++;
            z9 = false;
        }
        recyclerView.requestLayout();
        recyclerView.f10253I0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(F0.r0 r9, F0.Y r10, F0.Y r11) {
        /*
            r8 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r8.f2053a
            r0.getClass()
            r1 = 0
            r9.o(r1)
            F0.Z r1 = r0.f10292n0
            r2 = r1
            F0.o r2 = (F0.C0111o) r2
            if (r10 == 0) goto L20
            r2.getClass()
            int r4 = r10.f2058a
            int r6 = r11.f2058a
            if (r4 != r6) goto L22
            int r1 = r10.f2059b
            int r3 = r11.f2059b
            if (r1 == r3) goto L20
            goto L22
        L20:
            r3 = r9
            goto L2c
        L22:
            int r5 = r10.f2059b
            int r7 = r11.f2059b
            r3 = r9
            boolean r9 = r2.g(r3, r4, r5, r6, r7)
            goto L3b
        L2c:
            r2.l(r3)
            android.view.View r9 = r3.f2210a
            r10 = 0
            r9.setAlpha(r10)
            java.util.ArrayList r9 = r2.f2180i
            r9.add(r3)
            r9 = 1
        L3b:
            if (r9 == 0) goto L40
            r0.X()
        L40:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: F0.P.f(F0.r0, F0.Y, F0.Y):void");
    }

    public void g(r0 r0Var, Y y9, Y y10) {
        int i9;
        int i10;
        boolean z9;
        RecyclerView recyclerView = this.f2053a;
        recyclerView.f10273c.l(r0Var);
        recyclerView.h(r0Var);
        r0Var.o(false);
        C0111o c0111o = (C0111o) recyclerView.f10292n0;
        c0111o.getClass();
        int i11 = y9.f2058a;
        int i12 = y9.f2059b;
        View view = r0Var.f2210a;
        if (y10 == null) {
            i9 = view.getLeft();
        } else {
            i9 = y10.f2058a;
        }
        int i13 = i9;
        if (y10 == null) {
            i10 = view.getTop();
        } else {
            i10 = y10.f2059b;
        }
        int i14 = i10;
        if (!r0Var.i() && (i11 != i13 || i12 != i14)) {
            view.layout(i13, i14, view.getWidth() + i13, view.getHeight() + i14);
            z9 = c0111o.g(r0Var, i11, i12, i13, i14);
        } else {
            c0111o.l(r0Var);
            c0111o.f2179h.add(r0Var);
            z9 = true;
        }
        if (z9) {
            recyclerView.X();
        }
    }
}
