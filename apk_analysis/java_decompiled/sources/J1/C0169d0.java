package J1;

import android.util.SparseIntArray;
import androidx.lifecycle.InterfaceC0561w;
import co.notix.R;

/* renamed from: J1.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0169d0 extends AbstractC0166c0 {

    /* renamed from: A, reason: collision with root package name */
    public static final android.support.v4.media.session.y f3883A;

    /* renamed from: B, reason: collision with root package name */
    public static final SparseIntArray f3884B;

    /* renamed from: z, reason: collision with root package name */
    public long f3885z;

    static {
        android.support.v4.media.session.y yVar = new android.support.v4.media.session.y(6);
        f3883A = yVar;
        yVar.X(0, new int[]{1}, new int[]{R.layout.layout_loading}, new String[]{"layout_loading"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3884B = sparseIntArray;
        sparseIntArray.put(R.id.buttonBack, 2);
        sparseIntArray.put(R.id.textTitleManSync, 3);
        sparseIntArray.put(R.id.tabLayoutMalSync, 4);
        sparseIntArray.put(R.id.pager, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0169d0(android.view.View r10) {
        /*
            r9 = this;
            android.support.v4.media.session.y r0 = J1.C0169d0.f3883A
            android.util.SparseIntArray r1 = J1.C0169d0.f3884B
            r2 = 6
            java.lang.Object[] r0 = W.g.g0(r10, r2, r0, r1)
            r1 = 2
            r1 = r0[r1]
            r5 = r1
            androidx.appcompat.widget.AppCompatImageView r5 = (androidx.appcompat.widget.AppCompatImageView) r5
            r1 = 1
            r1 = r0[r1]
            r6 = r1
            J1.E1 r6 = (J1.E1) r6
            r1 = 5
            r1 = r0[r1]
            r7 = r1
            androidx.viewpager2.widget.ViewPager2 r7 = (androidx.viewpager2.widget.ViewPager2) r7
            r1 = 4
            r1 = r0[r1]
            r8 = r1
            com.google.android.material.tabs.TabLayout r8 = (com.google.android.material.tabs.TabLayout) r8
            r1 = 3
            r1 = r0[r1]
            androidx.appcompat.widget.AppCompatTextView r1 = (androidx.appcompat.widget.AppCompatTextView) r1
            r3 = 0
            r2 = r9
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r5 = -1
            r2.f3885z = r5
            J1.E1 r10 = r2.f3876w
            if (r10 == 0) goto L36
            r10.f7858p = r2
        L36:
            r10 = 0
            r10 = r0[r10]
            androidx.constraintlayout.widget.ConstraintLayout r10 = (androidx.constraintlayout.widget.ConstraintLayout) r10
            r0 = 0
            r10.setTag(r0)
            r9.j0(r4)
            r9.e0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.C0169d0.<init>(android.view.View):void");
    }

    @Override // W.g
    public final void a0() {
        synchronized (this) {
            this.f3885z = 0L;
        }
        this.f3876w.b0();
    }

    @Override // W.g
    public final boolean d0() {
        synchronized (this) {
            try {
                if (this.f3885z != 0) {
                    return true;
                }
                if (this.f3876w.d0()) {
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
            this.f3885z = 2L;
        }
        this.f3876w.e0();
        h0();
    }

    @Override // W.g
    public final void i0(InterfaceC0561w interfaceC0561w) {
        super.i0(interfaceC0561w);
        this.f3876w.i0(interfaceC0561w);
    }
}
