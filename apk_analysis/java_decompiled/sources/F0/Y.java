package F0;

import android.view.View;

/* loaded from: classes.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name */
    public int f2058a;

    /* renamed from: b, reason: collision with root package name */
    public int f2059b;

    public /* synthetic */ Y(int i9, int i10) {
        this.f2058a = i9;
        this.f2059b = i10;
    }

    public int a() {
        int i9 = this.f2059b;
        if (i9 != 2) {
            if (i9 != 5) {
                if (i9 != 29) {
                    if (i9 != 42) {
                        if (i9 != 22) {
                            if (i9 != 23) {
                                return 0;
                            }
                            return 15;
                        }
                        return 1073741824;
                    }
                    return 16;
                }
                return 12;
            }
            return 11;
        }
        return 10;
    }

    public void b(r0 r0Var) {
        View view = r0Var.f2210a;
        this.f2058a = view.getLeft();
        this.f2059b = view.getTop();
        view.getRight();
        view.getBottom();
    }
}
