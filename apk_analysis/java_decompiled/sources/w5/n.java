package w5;

import F0.C0118w;
import X0.u;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class n extends X0.m {
    @Override // X0.m
    public final void e(u uVar) {
        View view = uVar.f8227b;
        if (view instanceof TextView) {
            uVar.f8226a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // X0.m
    public final void i(u uVar) {
        View view = uVar.f8227b;
        if (view instanceof TextView) {
            uVar.f8226a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // X0.m
    public final Animator m(ViewGroup viewGroup, u uVar, u uVar2) {
        float f9;
        if (uVar != null && uVar2 != null && (uVar.f8227b instanceof TextView)) {
            View view = uVar2.f8227b;
            if (view instanceof TextView) {
                TextView textView = (TextView) view;
                HashMap hashMap = uVar.f8226a;
                HashMap hashMap2 = uVar2.f8226a;
                float f10 = 1.0f;
                if (hashMap.get("android:textscale:scale") != null) {
                    f9 = ((Float) hashMap.get("android:textscale:scale")).floatValue();
                } else {
                    f9 = 1.0f;
                }
                if (hashMap2.get("android:textscale:scale") != null) {
                    f10 = ((Float) hashMap2.get("android:textscale:scale")).floatValue();
                }
                if (f9 != f10) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f9, f10);
                    ofFloat.addUpdateListener(new C0118w(7, textView));
                    return ofFloat;
                }
                return null;
            }
            return null;
        }
        return null;
    }
}
