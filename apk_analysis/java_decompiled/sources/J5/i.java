package J5;

import com.google.android.material.tabs.TabLayout;
import d1.AbstractC1103i;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class i extends AbstractC1103i {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f4218a;

    /* renamed from: c, reason: collision with root package name */
    public int f4220c = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f4219b = 0;

    public i(TabLayout tabLayout) {
        this.f4218a = new WeakReference(tabLayout);
    }

    @Override // d1.AbstractC1103i
    public final void a(int i9) {
        this.f4219b = this.f4220c;
        this.f4220c = i9;
        TabLayout tabLayout = (TabLayout) this.f4218a.get();
        if (tabLayout != null) {
            tabLayout.f16154o0 = this.f4220c;
        }
    }

    @Override // d1.AbstractC1103i
    public final void b(int i9, float f9, int i10) {
        boolean z9;
        TabLayout tabLayout = (TabLayout) this.f4218a.get();
        if (tabLayout != null) {
            int i11 = this.f4220c;
            boolean z10 = true;
            if (i11 == 2 && this.f4219b != 1) {
                z9 = true;
                z10 = false;
            } else {
                z9 = true;
            }
            if (i11 == 2 && this.f4219b == 0) {
                z9 = false;
            }
            tabLayout.l(i9, f9, z10, z9, false);
        }
    }

    @Override // d1.AbstractC1103i
    public final void c(int i9) {
        boolean z9;
        TabLayout tabLayout = (TabLayout) this.f4218a.get();
        if (tabLayout != null && tabLayout.getSelectedTabPosition() != i9 && i9 < tabLayout.getTabCount()) {
            int i10 = this.f4220c;
            if (i10 != 0 && (i10 != 2 || this.f4219b != 0)) {
                z9 = false;
            } else {
                z9 = true;
            }
            tabLayout.k(tabLayout.h(i9), z9);
        }
    }
}
