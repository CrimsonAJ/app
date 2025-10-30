package q5;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import co.notix.R;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c extends V.b {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Chip f22366q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Chip chip, Chip chip2) {
        super(chip2);
        this.f22366q = chip;
    }

    @Override // V.b
    public final int n(float f9, float f10) {
        RectF closeIconTouchBounds;
        Rect rect = Chip.f15943x;
        Chip chip = this.f22366q;
        if (chip.d()) {
            closeIconTouchBounds = chip.getCloseIconTouchBounds();
            if (closeIconTouchBounds.contains(f9, f10)) {
                return 1;
            }
            return 0;
        }
        return 0;
    }

    @Override // V.b
    public final void o(ArrayList arrayList) {
        e eVar;
        arrayList.add(0);
        Rect rect = Chip.f15943x;
        Chip chip = this.f22366q;
        if (chip.d() && (eVar = chip.f15946e) != null && eVar.f22409j0 && chip.f15949h != null) {
            arrayList.add(1);
        }
    }

    @Override // V.b
    public final boolean s(int i9, int i10, Bundle bundle) {
        boolean z9 = false;
        if (i10 == 16) {
            Chip chip = this.f22366q;
            if (i9 == 0) {
                return chip.performClick();
            }
            if (i9 == 1) {
                chip.playSoundEffect(0);
                View.OnClickListener onClickListener = chip.f15949h;
                if (onClickListener != null) {
                    onClickListener.onClick(chip);
                    z9 = true;
                }
                if (chip.f15960t) {
                    chip.f15959s.x(1, 1);
                }
            }
        }
        return z9;
    }

    @Override // V.b
    public final void t(Q.g gVar) {
        boolean z9;
        Chip chip = this.f22366q;
        e eVar = chip.f15946e;
        if (eVar != null && eVar.f22415p0) {
            z9 = true;
        } else {
            z9 = false;
        }
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f6035a;
        accessibilityNodeInfo.setCheckable(z9);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        gVar.i(chip.getAccessibilityClassName());
        gVar.m(chip.getText());
    }

    @Override // V.b
    public final void u(int i9, Q.g gVar) {
        Rect closeIconTouchBoundsInt;
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f6035a;
        CharSequence charSequence = "";
        if (i9 == 1) {
            Chip chip = this.f22366q;
            CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
            } else {
                CharSequence text = chip.getText();
                Context context = chip.getContext();
                if (!TextUtils.isEmpty(text)) {
                    charSequence = text;
                }
                accessibilityNodeInfo.setContentDescription(context.getString(R.string.mtrl_chip_close_icon_content_description, charSequence).trim());
            }
            closeIconTouchBoundsInt = chip.getCloseIconTouchBoundsInt();
            accessibilityNodeInfo.setBoundsInParent(closeIconTouchBoundsInt);
            gVar.b(Q.e.f6020e);
            accessibilityNodeInfo.setEnabled(chip.isEnabled());
            return;
        }
        accessibilityNodeInfo.setContentDescription("");
        accessibilityNodeInfo.setBoundsInParent(Chip.f15943x);
    }

    @Override // V.b
    public final void v(int i9, boolean z9) {
        if (i9 == 1) {
            Chip chip = this.f22366q;
            chip.f15954n = z9;
            chip.refreshDrawableState();
        }
    }
}
