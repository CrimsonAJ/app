package P;

import android.view.View;
import android.view.Window;
import b7.C0701c;

/* loaded from: classes.dex */
public class v0 extends s8.e {

    /* renamed from: e, reason: collision with root package name */
    public final Window f5647e;

    /* renamed from: f, reason: collision with root package name */
    public final C0701c f5648f;

    public v0(Window window, C0701c c0701c) {
        this.f5647e = window;
        this.f5648f = c0701c;
    }

    @Override // s8.e
    public final void I(int i9) {
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((i9 & i10) != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 8) {
                            ((C0320v) this.f5648f.f11404b).a();
                        }
                    } else {
                        l0(2);
                    }
                } else {
                    l0(4);
                }
            }
        }
    }

    @Override // s8.e
    public final boolean J() {
        if ((this.f5647e.getDecorView().getSystemUiVisibility() & 8192) != 0) {
            return true;
        }
        return false;
    }

    @Override // s8.e
    public final void Z(boolean z9) {
        if (z9) {
            Window window = this.f5647e;
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            l0(8192);
            return;
        }
        m0(8192);
    }

    @Override // s8.e
    public final void b0() {
        this.f5647e.getDecorView().setTag(356039078, 2);
        m0(2048);
        l0(4096);
    }

    @Override // s8.e
    public final void d0(int i9) {
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((i9 & i10) != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 8) {
                            ((C0320v) this.f5648f.f11404b).b();
                        }
                    } else {
                        m0(2);
                    }
                } else {
                    m0(4);
                    this.f5647e.clearFlags(1024);
                }
            }
        }
    }

    public final void l0(int i9) {
        View decorView = this.f5647e.getDecorView();
        decorView.setSystemUiVisibility(i9 | decorView.getSystemUiVisibility());
    }

    public final void m0(int i9) {
        View decorView = this.f5647e.getDecorView();
        decorView.setSystemUiVisibility((~i9) & decorView.getSystemUiVisibility());
    }
}
