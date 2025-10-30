package I5;

import P.Q;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import b7.C0701c;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class c implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        int i9 = 0;
        int i10 = message.what;
        if (i10 != 0) {
            if (i10 != 1) {
                return false;
            }
            j jVar = (j) message.obj;
            int i11 = message.arg1;
            AccessibilityManager accessibilityManager = jVar.f3571t;
            if (accessibilityManager == null || ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) != null && enabledAccessibilityServiceList.isEmpty())) {
                i iVar = jVar.f3561i;
                if (iVar.getVisibility() == 0) {
                    if (iVar.getAnimationMode() == 1) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                        ofFloat.setInterpolator(jVar.f3556d);
                        ofFloat.addUpdateListener(new b(jVar, 0, (byte) 0));
                        ofFloat.setDuration(jVar.f3554b);
                        ofFloat.addListener(new a(jVar, i11, 0));
                        ofFloat.start();
                        return true;
                    }
                    ValueAnimator valueAnimator = new ValueAnimator();
                    int height = iVar.getHeight();
                    ViewGroup.LayoutParams layoutParams = iVar.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        height += ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    }
                    valueAnimator.setIntValues(0, height);
                    valueAnimator.setInterpolator(jVar.f3557e);
                    valueAnimator.setDuration(jVar.f3555c);
                    valueAnimator.addListener(new a(jVar, i11, 2));
                    valueAnimator.addUpdateListener(new b(jVar, 3, (byte) 0));
                    valueAnimator.start();
                    return true;
                }
            }
            jVar.c();
            return true;
        }
        j jVar2 = (j) message.obj;
        i iVar2 = jVar2.f3561i;
        if (iVar2.getParent() == null) {
            ViewGroup.LayoutParams layoutParams2 = iVar2.getLayoutParams();
            if (layoutParams2 instanceof B.f) {
                B.f fVar = (B.f) layoutParams2;
                BaseTransientBottomBar$Behavior baseTransientBottomBar$Behavior = new BaseTransientBottomBar$Behavior();
                C0701c c0701c = baseTransientBottomBar$Behavior.f16113i;
                c0701c.getClass();
                c0701c.f11404b = jVar2.f3572u;
                baseTransientBottomBar$Behavior.f15831b = new s4.i(jVar2);
                fVar.b(baseTransientBottomBar$Behavior);
                if (jVar2.b() == null) {
                    fVar.f573g = 80;
                }
            }
            iVar2.f3546k = true;
            ViewGroup viewGroup = jVar2.f3559g;
            viewGroup.addView(iVar2);
            iVar2.f3546k = false;
            if (jVar2.b() != null) {
                int[] iArr = new int[2];
                jVar2.b().getLocationOnScreen(iArr);
                int i12 = iArr[1];
                int[] iArr2 = new int[2];
                viewGroup.getLocationOnScreen(iArr2);
                i9 = (viewGroup.getHeight() + iArr2[1]) - i12;
            }
            jVar2.f3567p = i9;
            jVar2.f();
            iVar2.setVisibility(4);
        }
        WeakHashMap weakHashMap = Q.f5546a;
        if (iVar2.isLaidOut()) {
            jVar2.e();
            return true;
        }
        jVar2.f3570s = true;
        return true;
    }
}
