package J1;

import android.util.SparseIntArray;
import co.notix.R;

/* loaded from: classes.dex */
public final class Z extends Y {

    /* renamed from: A, reason: collision with root package name */
    public static final SparseIntArray f3817A;

    /* renamed from: z, reason: collision with root package name */
    public long f3818z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3817A = sparseIntArray;
        sparseIntArray.put(R.id.textMsgMal, 1);
        sparseIntArray.put(R.id.labelExportFormat, 2);
        sparseIntArray.put(R.id.radioGroup, 3);
        sparseIntArray.put(R.id.buttonImportText, 4);
        sparseIntArray.put(R.id.buttonImportXML, 5);
        sparseIntArray.put(R.id.buttonImportJSON, 6);
        sparseIntArray.put(R.id.labelSavedTo, 7);
        sparseIntArray.put(R.id.textPath, 8);
        sparseIntArray.put(R.id.buttonExport, 9);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Z(android.view.View r11) {
        /*
            r10 = this;
            android.util.SparseIntArray r0 = J1.Z.f3817A
            r1 = 10
            r2 = 0
            java.lang.Object[] r0 = W.g.g0(r11, r1, r2, r0)
            r1 = 9
            r1 = r0[r1]
            r6 = r1
            com.google.android.material.button.MaterialButton r6 = (com.google.android.material.button.MaterialButton) r6
            r1 = 6
            r1 = r0[r1]
            android.widget.RadioButton r1 = (android.widget.RadioButton) r1
            r1 = 4
            r1 = r0[r1]
            android.widget.RadioButton r1 = (android.widget.RadioButton) r1
            r1 = 5
            r1 = r0[r1]
            android.widget.RadioButton r1 = (android.widget.RadioButton) r1
            r1 = 2
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 7
            r1 = r0[r1]
            r7 = r1
            android.widget.TextView r7 = (android.widget.TextView) r7
            r1 = 3
            r1 = r0[r1]
            r8 = r1
            android.widget.RadioGroup r8 = (android.widget.RadioGroup) r8
            r1 = 1
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 8
            r1 = r0[r1]
            r9 = r1
            android.widget.TextView r9 = (android.widget.TextView) r9
            r4 = 0
            r3 = r10
            r5 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r6 = -1
            r3.f3818z = r6
            r11 = 0
            r11 = r0[r11]
            androidx.constraintlayout.widget.ConstraintLayout r11 = (androidx.constraintlayout.widget.ConstraintLayout) r11
            r11.setTag(r2)
            r10.j0(r5)
            r10.e0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.Z.<init>(android.view.View):void");
    }

    @Override // W.g
    public final void a0() {
        synchronized (this) {
            this.f3818z = 0L;
        }
    }

    @Override // W.g
    public final boolean d0() {
        synchronized (this) {
            try {
                if (this.f3818z != 0) {
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
            this.f3818z = 1L;
        }
        h0();
    }
}
