package J5;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public Drawable f4198a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f4199b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f4200c;

    /* renamed from: d, reason: collision with root package name */
    public int f4201d;

    /* renamed from: e, reason: collision with root package name */
    public View f4202e;

    /* renamed from: f, reason: collision with root package name */
    public TabLayout f4203f;

    /* renamed from: g, reason: collision with root package name */
    public h f4204g;

    public final boolean a() {
        TabLayout tabLayout = this.f4203f;
        if (tabLayout != null) {
            int selectedTabPosition = tabLayout.getSelectedTabPosition();
            if (selectedTabPosition != -1 && selectedTabPosition == this.f4201d) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("Tab not attached to a TabLayout");
    }
}
