package H5;

import B6.u0;
import Q.g;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import co.notix.R;
import com.google.android.material.slider.Slider;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class b extends V.b {

    /* renamed from: q, reason: collision with root package name */
    public final Slider f3112q;

    /* renamed from: r, reason: collision with root package name */
    public final Rect f3113r;

    public b(Slider slider) {
        super(slider);
        this.f3113r = new Rect();
        this.f3112q = slider;
    }

    @Override // V.b
    public final int n(float f9, float f10) {
        int i9 = 0;
        while (true) {
            Slider slider = this.f3112q;
            if (i9 < slider.getValues().size()) {
                Rect rect = this.f3113r;
                slider.v(i9, rect);
                if (rect.contains((int) f9, (int) f10)) {
                    return i9;
                }
                i9++;
            } else {
                return -1;
            }
        }
    }

    @Override // V.b
    public final void o(ArrayList arrayList) {
        for (int i9 = 0; i9 < this.f3112q.getValues().size(); i9++) {
            arrayList.add(Integer.valueOf(i9));
        }
    }

    @Override // V.b
    public final boolean s(int i9, int i10, Bundle bundle) {
        Slider slider = this.f3112q;
        if (slider.isEnabled()) {
            if (i10 != 4096 && i10 != 8192) {
                if (i10 == 16908349 && bundle != null && bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE") && slider.t(i9, bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"))) {
                    slider.w();
                    slider.postInvalidate();
                    p(i9);
                    return true;
                }
                return false;
            }
            float f9 = slider.f3179w0;
            if (f9 == 0.0f) {
                f9 = 1.0f;
            }
            if ((slider.f3171s0 - slider.r0) / f9 > 20) {
                f9 *= Math.round(r1 / r4);
            }
            if (i10 == 8192) {
                f9 = -f9;
            }
            if (slider.l()) {
                f9 = -f9;
            }
            if (slider.t(i9, u0.j(slider.getValues().get(i9).floatValue() + f9, slider.getValueFrom(), slider.getValueTo()))) {
                slider.w();
                slider.postInvalidate();
                p(i9);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // V.b
    public final void u(int i9, g gVar) {
        String str;
        String str2;
        gVar.b(Q.e.f6028n);
        Slider slider = this.f3112q;
        List<Float> values = slider.getValues();
        Float f9 = values.get(i9);
        float floatValue = f9.floatValue();
        float valueFrom = slider.getValueFrom();
        float valueTo = slider.getValueTo();
        if (slider.isEnabled()) {
            if (floatValue > valueFrom) {
                gVar.a(8192);
            }
            if (floatValue < valueTo) {
                gVar.a(4096);
            }
        }
        AccessibilityNodeInfo.RangeInfo obtain = AccessibilityNodeInfo.RangeInfo.obtain(1, valueFrom, valueTo, floatValue);
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f6035a;
        accessibilityNodeInfo.setRangeInfo(obtain);
        gVar.i(SeekBar.class.getName());
        StringBuilder sb = new StringBuilder();
        if (slider.getContentDescription() != null) {
            sb.append(slider.getContentDescription());
            sb.append(",");
        }
        if (((int) floatValue) == floatValue) {
            str = "%.0f";
        } else {
            str = "%.2f";
        }
        String format = String.format(str, f9);
        String string = slider.getContext().getString(R.string.material_slider_value);
        if (values.size() > 1) {
            if (i9 == slider.getValues().size() - 1) {
                str2 = slider.getContext().getString(R.string.material_slider_range_end);
            } else if (i9 == 0) {
                str2 = slider.getContext().getString(R.string.material_slider_range_start);
            } else {
                str2 = "";
            }
            string = str2;
        }
        Locale locale = Locale.US;
        sb.append(string + ", " + format);
        accessibilityNodeInfo.setContentDescription(sb.toString());
        Rect rect = this.f3113r;
        slider.v(i9, rect);
        accessibilityNodeInfo.setBoundsInParent(rect);
    }
}
