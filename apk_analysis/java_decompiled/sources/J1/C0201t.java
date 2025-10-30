package J1;

import android.util.SparseIntArray;
import co.notix.R;

/* renamed from: J1.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0201t extends AbstractC0199s {

    /* renamed from: B, reason: collision with root package name */
    public static final SparseIntArray f4087B;

    /* renamed from: A, reason: collision with root package name */
    public long f4088A;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4087B = sparseIntArray;
        sparseIntArray.put(R.id.textTitle, 1);
        sparseIntArray.put(R.id.textMessage, 2);
        sparseIntArray.put(R.id.buttonPositive, 3);
        sparseIntArray.put(R.id.buttonNegative, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0201t(android.view.View r11) {
        /*
            r10 = this;
            android.util.SparseIntArray r0 = J1.C0201t.f4087B
            r1 = 5
            r2 = 0
            java.lang.Object[] r0 = W.g.g0(r11, r1, r2, r0)
            r1 = 4
            r1 = r0[r1]
            r6 = r1
            com.google.android.material.button.MaterialButton r6 = (com.google.android.material.button.MaterialButton) r6
            r1 = 3
            r1 = r0[r1]
            r7 = r1
            com.google.android.material.button.MaterialButton r7 = (com.google.android.material.button.MaterialButton) r7
            r1 = 2
            r1 = r0[r1]
            r8 = r1
            androidx.appcompat.widget.AppCompatTextView r8 = (androidx.appcompat.widget.AppCompatTextView) r8
            r1 = 1
            r1 = r0[r1]
            r9 = r1
            androidx.appcompat.widget.AppCompatTextView r9 = (androidx.appcompat.widget.AppCompatTextView) r9
            r4 = 0
            r3 = r10
            r5 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r6 = -1
            r3.f4088A = r6
            r11 = 0
            r11 = r0[r11]
            android.widget.FrameLayout r11 = (android.widget.FrameLayout) r11
            r11.setTag(r2)
            r10.j0(r5)
            r10.e0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.C0201t.<init>(android.view.View):void");
    }

    @Override // W.g
    public final void a0() {
        synchronized (this) {
            this.f4088A = 0L;
        }
    }

    @Override // W.g
    public final boolean d0() {
        synchronized (this) {
            try {
                if (this.f4088A != 0) {
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
            this.f4088A = 1L;
        }
        h0();
    }
}
