package J1;

import android.util.SparseIntArray;
import co.notix.R;

/* renamed from: J1.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0187l0 extends AbstractC0185k0 {

    /* renamed from: y, reason: collision with root package name */
    public static final SparseIntArray f3986y;

    /* renamed from: x, reason: collision with root package name */
    public long f3987x;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3986y = sparseIntArray;
        sparseIntArray.put(R.id.buttonBack, 1);
        sparseIntArray.put(R.id.textTitleManSync, 2);
        sparseIntArray.put(R.id.labelShowSkipIntro, 3);
        sparseIntArray.put(R.id.switchShowIntro, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0187l0(android.view.View r6) {
        /*
            r5 = this;
            android.util.SparseIntArray r0 = J1.C0187l0.f3986y
            r1 = 5
            r2 = 0
            java.lang.Object[] r0 = W.g.g0(r6, r1, r2, r0)
            r1 = 1
            r1 = r0[r1]
            androidx.appcompat.widget.AppCompatImageView r1 = (androidx.appcompat.widget.AppCompatImageView) r1
            r3 = 3
            r3 = r0[r3]
            android.widget.TextView r3 = (android.widget.TextView) r3
            r3 = 4
            r3 = r0[r3]
            com.google.android.material.switchmaterial.SwitchMaterial r3 = (com.google.android.material.switchmaterial.SwitchMaterial) r3
            r4 = 2
            r4 = r0[r4]
            androidx.appcompat.widget.AppCompatTextView r4 = (androidx.appcompat.widget.AppCompatTextView) r4
            r5.<init>(r2, r6, r1, r3)
            r3 = -1
            r5.f3987x = r3
            r1 = 0
            r0 = r0[r1]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r2)
            r5.j0(r6)
            r5.e0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.C0187l0.<init>(android.view.View):void");
    }

    @Override // W.g
    public final void a0() {
        synchronized (this) {
            this.f3987x = 0L;
        }
    }

    @Override // W.g
    public final boolean d0() {
        synchronized (this) {
            try {
                if (this.f3987x != 0) {
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
            this.f3987x = 1L;
        }
        h0();
    }
}
