package d1;

import androidx.viewpager2.widget.ViewPager2;

/* renamed from: d1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1100f extends AbstractC1103i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16706a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f16707b;

    public /* synthetic */ C1100f(ViewPager2 viewPager2, int i9) {
        this.f16706a = i9;
        this.f16707b = viewPager2;
    }

    @Override // d1.AbstractC1103i
    public void a(int i9) {
        switch (this.f16706a) {
            case 0:
                if (i9 == 0) {
                    this.f16707b.d();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // d1.AbstractC1103i
    public final void c(int i9) {
        switch (this.f16706a) {
            case 0:
                ViewPager2 viewPager2 = this.f16707b;
                if (viewPager2.f10395d != i9) {
                    viewPager2.f10395d = i9;
                    viewPager2.f10410t.J();
                    return;
                }
                return;
            default:
                ViewPager2 viewPager22 = this.f16707b;
                viewPager22.clearFocus();
                if (viewPager22.hasFocus()) {
                    viewPager22.j.requestFocus(2);
                    return;
                }
                return;
        }
    }
}
