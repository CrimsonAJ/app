package J5;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
import h5.AbstractC1281a;

/* loaded from: classes.dex */
public final class a extends Q6.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4191b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i9) {
        super(8);
        this.f4191b = i9;
    }

    @Override // Q6.f
    public final void v(TabLayout tabLayout, View view, View view2, float f9, Drawable drawable) {
        float cos;
        float f10;
        float b9;
        switch (this.f4191b) {
            case 0:
                RectF j = Q6.f.j(tabLayout, view);
                RectF j4 = Q6.f.j(tabLayout, view2);
                if (j.left < j4.left) {
                    double d9 = (f9 * 3.141592653589793d) / 2.0d;
                    f10 = (float) (1.0d - Math.cos(d9));
                    cos = (float) Math.sin(d9);
                } else {
                    double d10 = (f9 * 3.141592653589793d) / 2.0d;
                    float sin = (float) Math.sin(d10);
                    cos = (float) (1.0d - Math.cos(d10));
                    f10 = sin;
                }
                drawable.setBounds(AbstractC1281a.c((int) j.left, f10, (int) j4.left), drawable.getBounds().top, AbstractC1281a.c((int) j.right, cos, (int) j4.right), drawable.getBounds().bottom);
                return;
            default:
                if (f9 >= 0.5f) {
                    view = view2;
                }
                RectF j9 = Q6.f.j(tabLayout, view);
                if (f9 < 0.5f) {
                    b9 = AbstractC1281a.b(1.0f, 0.0f, 0.0f, 0.5f, f9);
                } else {
                    b9 = AbstractC1281a.b(0.0f, 1.0f, 0.5f, 1.0f, f9);
                }
                drawable.setBounds((int) j9.left, drawable.getBounds().top, (int) j9.right, drawable.getBounds().bottom);
                drawable.setAlpha((int) (b9 * 255.0f));
                return;
        }
    }
}
