package w5;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.ChipGroup;
import com.google.firebase.messaging.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: w5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2141a {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f24210a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f24211b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public u f24212c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f24213d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f24214e;

    public final boolean a(h hVar) {
        int id = hVar.getId();
        HashSet hashSet = this.f24211b;
        if (hashSet.contains(Integer.valueOf(id))) {
            return false;
        }
        h hVar2 = (h) this.f24210a.get(Integer.valueOf(c()));
        if (hVar2 != null) {
            e(hVar2, false);
        }
        boolean add = hashSet.add(Integer.valueOf(id));
        if (!hVar.isChecked()) {
            hVar.setChecked(true);
        }
        return add;
    }

    public final ArrayList b(ViewGroup viewGroup) {
        HashSet hashSet = new HashSet(this.f24211b);
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
            View childAt = viewGroup.getChildAt(i9);
            if ((childAt instanceof h) && hashSet.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    public final int c() {
        if (this.f24213d) {
            HashSet hashSet = this.f24211b;
            if (!hashSet.isEmpty()) {
                return ((Integer) hashSet.iterator().next()).intValue();
            }
            return -1;
        }
        return -1;
    }

    public final void d() {
        u uVar = this.f24212c;
        if (uVar != null) {
            new HashSet(this.f24211b);
            ChipGroup chipGroup = (ChipGroup) uVar.f16512a;
            q5.h hVar = chipGroup.f15966g;
            if (hVar != null) {
                hVar.f(chipGroup, chipGroup.f15967h.b(chipGroup));
            }
        }
    }

    public final boolean e(h hVar, boolean z9) {
        int id = hVar.getId();
        HashSet hashSet = this.f24211b;
        if (!hashSet.contains(Integer.valueOf(id))) {
            return false;
        }
        if (z9 && hashSet.size() == 1 && hashSet.contains(Integer.valueOf(id))) {
            hVar.setChecked(true);
            return false;
        }
        boolean remove = hashSet.remove(Integer.valueOf(id));
        if (hVar.isChecked()) {
            hVar.setChecked(false);
        }
        return remove;
    }
}
