package I5;

import P.C0301b;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import b7.C0701c;
import co.notix.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;

/* loaded from: classes.dex */
public final class e extends C0301b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3530d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3531e;

    public /* synthetic */ e(int i9, Object obj) {
        this.f3530d = i9;
        this.f3531e = obj;
    }

    @Override // P.C0301b
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f3530d) {
            case 4:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f3531e).f16074d);
                return;
            default:
                super.c(view, accessibilityEvent);
                return;
        }
    }

    @Override // P.C0301b
    public final void d(View view, Q.g gVar) {
        String r5;
        int i9;
        Object obj = this.f3531e;
        View.AccessibilityDelegate accessibilityDelegate = this.f5573a;
        switch (this.f3530d) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = gVar.f6035a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                gVar.a(1048576);
                accessibilityNodeInfo.setDismissable(true);
                return;
            case 1:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, gVar.f6035a);
                com.google.android.material.datepicker.j jVar = (com.google.android.material.datepicker.j) obj;
                if (jVar.f16001G0.getVisibility() == 0) {
                    r5 = jVar.r(R.string.mtrl_picker_toggle_to_year_selection);
                } else {
                    r5 = jVar.r(R.string.mtrl_picker_toggle_to_day_selection);
                }
                gVar.k(r5);
                return;
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo2 = gVar.f6035a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                if (((m5.f) obj).j) {
                    gVar.a(1048576);
                    accessibilityNodeInfo2.setDismissable(true);
                    return;
                } else {
                    accessibilityNodeInfo2.setDismissable(false);
                    return;
                }
            case 3:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, gVar.f6035a);
                int i10 = MaterialButtonToggleGroup.f15907k;
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                if (view instanceof MaterialButton) {
                    i9 = 0;
                    for (int i11 = 0; i11 < materialButtonToggleGroup.getChildCount(); i11++) {
                        if (materialButtonToggleGroup.getChildAt(i11) != view) {
                            if ((materialButtonToggleGroup.getChildAt(i11) instanceof MaterialButton) && materialButtonToggleGroup.c(i11)) {
                                i9++;
                            }
                        } else {
                            gVar.j(C0701c.I(((MaterialButton) view).f15904o, 0, 1, i9, 1));
                            return;
                        }
                    }
                }
                i9 = -1;
                gVar.j(C0701c.I(((MaterialButton) view).f15904o, 0, 1, i9, 1));
                return;
            case 4:
                AccessibilityNodeInfo accessibilityNodeInfo3 = gVar.f6035a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo3.setCheckable(checkableImageButton.f16075e);
                accessibilityNodeInfo3.setChecked(checkableImageButton.f16074d);
                return;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo4 = gVar.f6035a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo4);
                accessibilityNodeInfo4.setCheckable(((NavigationMenuItemView) obj).f16086x);
                return;
        }
    }

    @Override // P.C0301b
    public boolean g(View view, int i9, Bundle bundle) {
        switch (this.f3530d) {
            case 0:
                if (i9 == 1048576) {
                    ((l) ((j) this.f3531e)).a(3);
                    return true;
                }
                return super.g(view, i9, bundle);
            case 1:
            default:
                return super.g(view, i9, bundle);
            case 2:
                if (i9 == 1048576) {
                    m5.f fVar = (m5.f) this.f3531e;
                    if (fVar.j) {
                        fVar.cancel();
                        return true;
                    }
                }
                return super.g(view, i9, bundle);
        }
    }
}
