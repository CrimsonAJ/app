package J1;

import android.util.SparseIntArray;
import co.notix.R;

/* renamed from: J1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0178h extends AbstractC0176g {

    /* renamed from: H, reason: collision with root package name */
    public static final SparseIntArray f3947H;

    /* renamed from: G, reason: collision with root package name */
    public long f3948G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3947H = sparseIntArray;
        sparseIntArray.put(R.id.textTitleDownload, 1);
        sparseIntArray.put(R.id.indicator, 2);
        sparseIntArray.put(R.id.tabLayoutDub, 3);
        sparseIntArray.put(R.id.tabSub, 4);
        sparseIntArray.put(R.id.tabDub, 5);
        sparseIntArray.put(R.id.inputSearchEpisode, 6);
        sparseIntArray.put(R.id.imageSearchEpisode, 7);
        sparseIntArray.put(R.id.spinnerQuality, 8);
        sparseIntArray.put(R.id.loadingQuality, 9);
        sparseIntArray.put(R.id.recyclerEpisodes, 10);
        sparseIntArray.put(R.id.loadingEpisode, 11);
        sparseIntArray.put(R.id.view1, 12);
        sparseIntArray.put(R.id.buttonCancel, 13);
        sparseIntArray.put(R.id.buttonDownload, 14);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0178h(android.view.View r18) {
        /*
            r17 = this;
            android.util.SparseIntArray r0 = J1.C0178h.f3947H
            r1 = 15
            r2 = 0
            r5 = r18
            java.lang.Object[] r0 = W.g.g0(r5, r1, r2, r0)
            r1 = 13
            r1 = r0[r1]
            r6 = r1
            com.google.android.material.button.MaterialButton r6 = (com.google.android.material.button.MaterialButton) r6
            r1 = 14
            r1 = r0[r1]
            r7 = r1
            com.google.android.material.button.MaterialButton r7 = (com.google.android.material.button.MaterialButton) r7
            r1 = 7
            r1 = r0[r1]
            r8 = r1
            androidx.appcompat.widget.AppCompatImageView r8 = (androidx.appcompat.widget.AppCompatImageView) r8
            r1 = 2
            r1 = r0[r1]
            r9 = r1
            android.view.View r9 = (android.view.View) r9
            r1 = 6
            r1 = r0[r1]
            r10 = r1
            androidx.appcompat.widget.AppCompatEditText r10 = (androidx.appcompat.widget.AppCompatEditText) r10
            r1 = 11
            r1 = r0[r1]
            r11 = r1
            android.widget.FrameLayout r11 = (android.widget.FrameLayout) r11
            r1 = 9
            r1 = r0[r1]
            r12 = r1
            com.google.android.material.progressindicator.CircularProgressIndicator r12 = (com.google.android.material.progressindicator.CircularProgressIndicator) r12
            r1 = 10
            r1 = r0[r1]
            r13 = r1
            androidx.recyclerview.widget.RecyclerView r13 = (androidx.recyclerview.widget.RecyclerView) r13
            r1 = 8
            r1 = r0[r1]
            r14 = r1
            com.anilab.android.ui.views.FreakSpinner r14 = (com.anilab.android.ui.views.FreakSpinner) r14
            r1 = 5
            r1 = r0[r1]
            com.google.android.material.tabs.TabItem r1 = (com.google.android.material.tabs.TabItem) r1
            r1 = 3
            r1 = r0[r1]
            r15 = r1
            com.google.android.material.tabs.TabLayout r15 = (com.google.android.material.tabs.TabLayout) r15
            r1 = 4
            r1 = r0[r1]
            com.google.android.material.tabs.TabItem r1 = (com.google.android.material.tabs.TabItem) r1
            r1 = 1
            r1 = r0[r1]
            androidx.appcompat.widget.AppCompatTextView r1 = (androidx.appcompat.widget.AppCompatTextView) r1
            r1 = 12
            r1 = r0[r1]
            r16 = r1
            android.view.View r16 = (android.view.View) r16
            r4 = 0
            r3 = r17
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r3 = -1
            r1 = r17
            r1.f3948G = r3
            r3 = 0
            r0 = r0[r3]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r2)
            r17.j0(r18)
            r1.e0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.C0178h.<init>(android.view.View):void");
    }

    @Override // W.g
    public final void a0() {
        synchronized (this) {
            this.f3948G = 0L;
        }
    }

    @Override // W.g
    public final boolean d0() {
        synchronized (this) {
            try {
                if (this.f3948G != 0) {
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
            this.f3948G = 1L;
        }
        h0();
    }
}
