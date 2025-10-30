package J1;

import android.util.SparseIntArray;
import co.notix.R;

/* renamed from: J1.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0210x0 extends AbstractC0208w0 {

    /* renamed from: y, reason: collision with root package name */
    public static final SparseIntArray f4129y;

    /* renamed from: x, reason: collision with root package name */
    public long f4130x;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4129y = sparseIntArray;
        sparseIntArray.put(R.id.buttonBack, 1);
        sparseIntArray.put(R.id.textTitleSecurity, 2);
        sparseIntArray.put(R.id.textTitleSubSecurity, 3);
        sparseIntArray.put(R.id.textRememberMe, 4);
        sparseIntArray.put(R.id.switchRememberMe, 5);
        sparseIntArray.put(R.id.buttonChangePassword, 6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0210x0(android.view.View r6) {
        /*
            r5 = this;
            android.util.SparseIntArray r0 = J1.C0210x0.f4129y
            r1 = 7
            r2 = 0
            java.lang.Object[] r0 = W.g.g0(r6, r1, r2, r0)
            r1 = 1
            r1 = r0[r1]
            androidx.appcompat.widget.AppCompatImageView r1 = (androidx.appcompat.widget.AppCompatImageView) r1
            r3 = 6
            r3 = r0[r3]
            com.google.android.material.button.MaterialButton r3 = (com.google.android.material.button.MaterialButton) r3
            r4 = 5
            r4 = r0[r4]
            com.google.android.material.switchmaterial.SwitchMaterial r4 = (com.google.android.material.switchmaterial.SwitchMaterial) r4
            r4 = 4
            r4 = r0[r4]
            androidx.appcompat.widget.AppCompatTextView r4 = (androidx.appcompat.widget.AppCompatTextView) r4
            r4 = 2
            r4 = r0[r4]
            androidx.appcompat.widget.AppCompatTextView r4 = (androidx.appcompat.widget.AppCompatTextView) r4
            r4 = 3
            r4 = r0[r4]
            androidx.appcompat.widget.AppCompatTextView r4 = (androidx.appcompat.widget.AppCompatTextView) r4
            r5.<init>(r2, r6, r1, r3)
            r3 = -1
            r5.f4130x = r3
            r1 = 0
            r0 = r0[r1]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r2)
            r5.j0(r6)
            r5.e0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.C0210x0.<init>(android.view.View):void");
    }

    @Override // W.g
    public final void a0() {
        synchronized (this) {
            this.f4130x = 0L;
        }
    }

    @Override // W.g
    public final boolean d0() {
        synchronized (this) {
            try {
                if (this.f4130x != 0) {
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
            this.f4130x = 1L;
        }
        h0();
    }
}
