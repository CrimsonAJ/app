package q5;

import P.Q;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import i.G;
import java.util.WeakHashMap;
import w5.C2141a;

/* loaded from: classes.dex */
public final class i implements ViewGroup.OnHierarchyChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f22427a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChipGroup f22428b;

    public i(ChipGroup chipGroup) {
        this.f22428b = chipGroup;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        ChipGroup chipGroup = this.f22428b;
        if (view == chipGroup && (view2 instanceof Chip)) {
            if (view2.getId() == -1) {
                WeakHashMap weakHashMap = Q.f5546a;
                view2.setId(View.generateViewId());
            }
            Chip chip = (Chip) view2;
            C2141a c2141a = chipGroup.f15967h;
            c2141a.f24210a.put(Integer.valueOf(chip.getId()), chip);
            if (chip.isChecked()) {
                c2141a.a(chip);
            }
            chip.setInternalOnCheckedChangeListener(new G(20, c2141a));
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f22427a;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        ChipGroup chipGroup = this.f22428b;
        if (view == chipGroup && (view2 instanceof Chip)) {
            Chip chip = (Chip) view2;
            C2141a c2141a = chipGroup.f15967h;
            c2141a.getClass();
            chip.setInternalOnCheckedChangeListener(null);
            c2141a.f24210a.remove(Integer.valueOf(chip.getId()));
            c2141a.f24211b.remove(Integer.valueOf(chip.getId()));
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f22427a;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
