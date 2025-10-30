package P;

import android.os.Build;
import androidx.core.widget.NestedScrollView;
import z2.C2235a;

/* renamed from: P.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0318t {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0317s f5641a;

    public C0318t(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f5641a = new r(nestedScrollView);
        } else {
            this.f5641a = new C2235a(10);
        }
    }
}
