package J1;

import android.util.SparseIntArray;
import co.notix.R;

/* renamed from: J1.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0163b0 extends AbstractC0160a0 {

    /* renamed from: E, reason: collision with root package name */
    public static final SparseIntArray f3835E;

    /* renamed from: D, reason: collision with root package name */
    public long f3836D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3835E = sparseIntArray;
        sparseIntArray.put(R.id.textMsgMal, 1);
        sparseIntArray.put(R.id.textWaitImport, 2);
        sparseIntArray.put(R.id.textLabelMalUsername, 3);
        sparseIntArray.put(R.id.layoutInputMalUsername, 4);
        sparseIntArray.put(R.id.inputMalUsername, 5);
        sparseIntArray.put(R.id.labelErase, 6);
        sparseIntArray.put(R.id.switchErase, 7);
        sparseIntArray.put(R.id.textMsgMalErase, 8);
        sparseIntArray.put(R.id.labelMalStats, 9);
        sparseIntArray.put(R.id.checkWatching, 10);
        sparseIntArray.put(R.id.checkCompleted, 11);
        sparseIntArray.put(R.id.checkOnHold, 12);
        sparseIntArray.put(R.id.checkPlanToWatch, 13);
        sparseIntArray.put(R.id.checkDropped, 14);
        sparseIntArray.put(R.id.buttonImport, 15);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0163b0(android.view.View r15) {
        /*
            r14 = this;
            android.util.SparseIntArray r0 = J1.C0163b0.f3835E
            r1 = 16
            r2 = 0
            java.lang.Object[] r0 = W.g.g0(r15, r1, r2, r0)
            r1 = 15
            r1 = r0[r1]
            r6 = r1
            com.google.android.material.button.MaterialButton r6 = (com.google.android.material.button.MaterialButton) r6
            r1 = 11
            r1 = r0[r1]
            r7 = r1
            com.google.android.material.checkbox.MaterialCheckBox r7 = (com.google.android.material.checkbox.MaterialCheckBox) r7
            r1 = 14
            r1 = r0[r1]
            r8 = r1
            com.google.android.material.checkbox.MaterialCheckBox r8 = (com.google.android.material.checkbox.MaterialCheckBox) r8
            r1 = 12
            r1 = r0[r1]
            r9 = r1
            com.google.android.material.checkbox.MaterialCheckBox r9 = (com.google.android.material.checkbox.MaterialCheckBox) r9
            r1 = 13
            r1 = r0[r1]
            r10 = r1
            com.google.android.material.checkbox.MaterialCheckBox r10 = (com.google.android.material.checkbox.MaterialCheckBox) r10
            r1 = 10
            r1 = r0[r1]
            r11 = r1
            com.google.android.material.checkbox.MaterialCheckBox r11 = (com.google.android.material.checkbox.MaterialCheckBox) r11
            r1 = 5
            r1 = r0[r1]
            r12 = r1
            com.google.android.material.textfield.TextInputEditText r12 = (com.google.android.material.textfield.TextInputEditText) r12
            r1 = 6
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 9
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 4
            r1 = r0[r1]
            com.google.android.material.textfield.TextInputLayout r1 = (com.google.android.material.textfield.TextInputLayout) r1
            r1 = 7
            r1 = r0[r1]
            r13 = r1
            com.google.android.material.switchmaterial.SwitchMaterial r13 = (com.google.android.material.switchmaterial.SwitchMaterial) r13
            r1 = 3
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 1
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 8
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 2
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r4 = 0
            r3 = r14
            r5 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r6 = -1
            r3.f3836D = r6
            r15 = 0
            r15 = r0[r15]
            android.widget.FrameLayout r15 = (android.widget.FrameLayout) r15
            r15.setTag(r2)
            r14.j0(r5)
            r14.e0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.C0163b0.<init>(android.view.View):void");
    }

    @Override // W.g
    public final void a0() {
        synchronized (this) {
            this.f3836D = 0L;
        }
    }

    @Override // W.g
    public final boolean d0() {
        synchronized (this) {
            try {
                if (this.f3836D != 0) {
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // W.g
    public final void e0() {
        synchronized (this) {
            this.f3836D = 1L;
        }
        h0();
    }
}
