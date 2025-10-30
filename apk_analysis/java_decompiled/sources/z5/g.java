package z5;

import X0.C0426a;
import X0.q;
import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;
import i5.C1380a;
import i5.C1382c;
import o.SubMenuC1659D;
import o.l;
import o.n;
import o.x;

/* loaded from: classes.dex */
public final class g implements x {

    /* renamed from: a, reason: collision with root package name */
    public l5.b f25491a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f25492b;

    /* renamed from: c, reason: collision with root package name */
    public int f25493c;

    @Override // o.x
    public final void b(Parcelable parcelable) {
        SparseArray sparseArray;
        C1380a c1380a;
        if (parcelable instanceof f) {
            l5.b bVar = this.f25491a;
            f fVar = (f) parcelable;
            int i9 = fVar.f25489a;
            int size = bVar.f25469f0.f21380f.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                MenuItem item = bVar.f25469f0.getItem(i10);
                if (i9 == item.getItemId()) {
                    bVar.f25470g = i9;
                    bVar.f25471h = i10;
                    item.setChecked(true);
                    break;
                }
                i10++;
            }
            Context context = this.f25491a.getContext();
            w5.i iVar = fVar.f25490b;
            SparseArray sparseArray2 = new SparseArray(iVar.size());
            for (int i11 = 0; i11 < iVar.size(); i11++) {
                int keyAt = iVar.keyAt(i11);
                C1382c c1382c = (C1382c) iVar.valueAt(i11);
                if (c1382c != null) {
                    c1380a = new C1380a(context, c1382c);
                } else {
                    c1380a = null;
                }
                sparseArray2.put(keyAt, c1380a);
            }
            l5.b bVar2 = this.f25491a;
            bVar2.getClass();
            int i12 = 0;
            while (true) {
                int size2 = sparseArray2.size();
                sparseArray = bVar2.f25481s;
                if (i12 >= size2) {
                    break;
                }
                int keyAt2 = sparseArray2.keyAt(i12);
                if (sparseArray.indexOfKey(keyAt2) < 0) {
                    sparseArray.append(keyAt2, (C1380a) sparseArray2.get(keyAt2));
                }
                i12++;
            }
            AbstractC2250c[] abstractC2250cArr = bVar2.f25468f;
            if (abstractC2250cArr != null) {
                for (AbstractC2250c abstractC2250c : abstractC2250cArr) {
                    C1380a c1380a2 = (C1380a) sparseArray.get(abstractC2250c.getId());
                    if (c1380a2 != null) {
                        abstractC2250c.setBadge(c1380a2);
                    }
                }
            }
        }
    }

    @Override // o.x
    public final void f(boolean z9) {
        boolean z10;
        C0426a c0426a;
        if (!this.f25492b) {
            if (z9) {
                this.f25491a.a();
                return;
            }
            l5.b bVar = this.f25491a;
            l lVar = bVar.f25469f0;
            if (lVar != null && bVar.f25468f != null) {
                int size = lVar.f21380f.size();
                if (size != bVar.f25468f.length) {
                    bVar.a();
                    return;
                }
                int i9 = bVar.f25470g;
                for (int i10 = 0; i10 < size; i10++) {
                    MenuItem item = bVar.f25469f0.getItem(i10);
                    if (item.isChecked()) {
                        bVar.f25470g = item.getItemId();
                        bVar.f25471h = i10;
                    }
                }
                if (i9 != bVar.f25470g && (c0426a = bVar.f25463a) != null) {
                    q.a(bVar, c0426a);
                }
                int i11 = bVar.f25467e;
                int size2 = bVar.f25469f0.l().size();
                if (i11 != -1 ? i11 == 0 : size2 > 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                for (int i12 = 0; i12 < size; i12++) {
                    bVar.f25462D.f25492b = true;
                    bVar.f25468f[i12].setLabelVisibilityMode(bVar.f25467e);
                    bVar.f25468f[i12].setShifting(z10);
                    bVar.f25468f[i12].a((n) bVar.f25469f0.getItem(i12));
                    bVar.f25462D.f25492b = false;
                }
            }
        }
    }

    @Override // o.x
    public final boolean g(n nVar) {
        return false;
    }

    @Override // o.x
    public final int getId() {
        return this.f25493c;
    }

    @Override // o.x
    public final void i(Context context, l lVar) {
        this.f25491a.f25469f0 = lVar;
    }

    @Override // o.x
    public final boolean j() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, java.lang.Object, z5.f] */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.util.SparseArray, w5.i] */
    @Override // o.x
    public final Parcelable k() {
        C1382c c1382c;
        ?? obj = new Object();
        obj.f25489a = this.f25491a.getSelectedItemId();
        SparseArray<C1380a> badgeDrawables = this.f25491a.getBadgeDrawables();
        ?? sparseArray = new SparseArray();
        for (int i9 = 0; i9 < badgeDrawables.size(); i9++) {
            int keyAt = badgeDrawables.keyAt(i9);
            C1380a valueAt = badgeDrawables.valueAt(i9);
            if (valueAt != null) {
                c1382c = valueAt.f18659e.f18697a;
            } else {
                c1382c = null;
            }
            sparseArray.put(keyAt, c1382c);
        }
        obj.f25490b = sparseArray;
        return obj;
    }

    @Override // o.x
    public final boolean l(SubMenuC1659D subMenuC1659D) {
        return false;
    }

    @Override // o.x
    public final boolean m(n nVar) {
        return false;
    }

    @Override // o.x
    public final void c(l lVar, boolean z9) {
    }
}
