package X0;

import android.animation.ObjectAnimator;
import android.view.View;
import co.notix.R;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class g extends m {

    /* renamed from: B, reason: collision with root package name */
    public static final String[] f8178B = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: A, reason: collision with root package name */
    public final int f8179A;

    public g(int i9) {
        this();
        this.f8179A = i9;
    }

    public static void L(u uVar) {
        int visibility = uVar.f8227b.getVisibility();
        HashMap hashMap = uVar.f8226a;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        View view = uVar.f8227b;
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    public static float N(u uVar, float f9) {
        Float f10;
        if (uVar != null && (f10 = (Float) uVar.f8226a.get("android:fade:transitionAlpha")) != null) {
            return f10.floatValue();
        }
        return f9;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /* JADX WARN: Type inference failed for: r0v0, types: [X0.F, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X0.F O(X0.u r8, X0.u r9) {
        /*
            X0.F r0 = new X0.F
            r0.<init>()
            r1 = 0
            r0.f8151a = r1
            r0.f8152b = r1
            r2 = 0
            r3 = -1
            java.lang.String r4 = "android:visibility:parent"
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.f8226a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.f8153c = r7
            java.lang.Object r6 = r6.get(r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f8155e = r6
            goto L33
        L2f:
            r0.f8153c = r3
            r0.f8155e = r2
        L33:
            if (r9 == 0) goto L52
            java.util.HashMap r6 = r9.f8226a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r2 = r6.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.f8154d = r2
            java.lang.Object r2 = r6.get(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f8156f = r2
            goto L56
        L52:
            r0.f8154d = r3
            r0.f8156f = r2
        L56:
            r2 = 1
            if (r8 == 0) goto L8a
            if (r9 == 0) goto L8a
            int r8 = r0.f8153c
            int r9 = r0.f8154d
            if (r8 != r9) goto L68
            android.view.ViewGroup r3 = r0.f8155e
            android.view.ViewGroup r4 = r0.f8156f
            if (r3 != r4) goto L68
            goto L9f
        L68:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L71
            r0.f8152b = r1
            r0.f8151a = r2
            return r0
        L71:
            if (r9 != 0) goto L9f
            r0.f8152b = r2
            r0.f8151a = r2
            return r0
        L78:
            android.view.ViewGroup r8 = r0.f8156f
            if (r8 != 0) goto L81
            r0.f8152b = r1
            r0.f8151a = r2
            return r0
        L81:
            android.view.ViewGroup r8 = r0.f8155e
            if (r8 != 0) goto L9f
            r0.f8152b = r2
            r0.f8151a = r2
            return r0
        L8a:
            if (r8 != 0) goto L95
            int r8 = r0.f8154d
            if (r8 != 0) goto L95
            r0.f8152b = r2
            r0.f8151a = r2
            return r0
        L95:
            if (r9 != 0) goto L9f
            int r8 = r0.f8153c
            if (r8 != 0) goto L9f
            r0.f8152b = r1
            r0.f8151a = r2
        L9f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X0.g.O(X0.u, X0.u):X0.F");
    }

    public final ObjectAnimator M(View view, float f9, float f10) {
        if (f9 == f10) {
            return null;
        }
        w.f8229a.I(view, f9);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, w.f8230b, f10);
        C0431f c0431f = new C0431f(view);
        ofFloat.addListener(c0431f);
        q().b(c0431f);
        return ofFloat;
    }

    @Override // X0.m
    public final void e(u uVar) {
        L(uVar);
    }

    @Override // X0.m
    public final void i(u uVar) {
        L(uVar);
        View view = uVar.f8227b;
        Float f9 = (Float) view.getTag(R.id.transition_pause_alpha);
        if (f9 == null) {
            if (view.getVisibility() == 0) {
                f9 = Float.valueOf(w.f8229a.z(view));
            } else {
                f9 = Float.valueOf(0.0f);
            }
        }
        uVar.f8226a.put("android:fade:transitionAlpha", f9);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        if (O(p(r3, false), u(r3, false)).f8151a != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e0  */
    @Override // X0.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator m(android.view.ViewGroup r24, X0.u r25, X0.u r26) {
        /*
            Method dump skipped, instructions count: 728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X0.g.m(android.view.ViewGroup, X0.u, X0.u):android.animation.Animator");
    }

    @Override // X0.m
    public final String[] t() {
        return f8178B;
    }

    @Override // X0.m
    public final boolean v(u uVar, u uVar2) {
        if (uVar != null || uVar2 != null) {
            if (uVar == null || uVar2 == null || uVar2.f8226a.containsKey("android:visibility:visibility") == uVar.f8226a.containsKey("android:visibility:visibility")) {
                F O8 = O(uVar, uVar2);
                if (O8.f8151a) {
                    if (O8.f8153c == 0 || O8.f8154d == 0) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public g() {
        this.f8179A = 3;
    }
}
