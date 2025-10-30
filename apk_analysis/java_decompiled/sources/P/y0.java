package P;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import b7.C0701c;

/* loaded from: classes.dex */
public class y0 extends s8.e {

    /* renamed from: e, reason: collision with root package name */
    public final WindowInsetsController f5654e;

    /* renamed from: f, reason: collision with root package name */
    public final C0701c f5655f;

    /* renamed from: g, reason: collision with root package name */
    public final Window f5656g;

    public y0(Window window, C0701c c0701c) {
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        this.f5654e = insetsController;
        this.f5655f = c0701c;
        this.f5656g = window;
    }

    @Override // s8.e
    public final void I(int i9) {
        this.f5654e.hide(i9 & (-9));
    }

    @Override // s8.e
    public boolean J() {
        int systemBarsAppearance;
        this.f5654e.setSystemBarsAppearance(0, 0);
        systemBarsAppearance = this.f5654e.getSystemBarsAppearance();
        if ((systemBarsAppearance & 8) != 0) {
            return true;
        }
        return false;
    }

    @Override // s8.e
    public final void Y(boolean z9) {
        Window window = this.f5656g;
        if (z9) {
            if (window != null) {
                l0(16);
            }
            this.f5654e.setSystemBarsAppearance(16, 16);
        } else {
            if (window != null) {
                m0(16);
            }
            this.f5654e.setSystemBarsAppearance(0, 16);
        }
    }

    @Override // s8.e
    public final void Z(boolean z9) {
        Window window = this.f5656g;
        if (z9) {
            if (window != null) {
                l0(8192);
            }
            this.f5654e.setSystemBarsAppearance(8, 8);
        } else {
            if (window != null) {
                m0(8192);
            }
            this.f5654e.setSystemBarsAppearance(0, 8);
        }
    }

    @Override // s8.e
    public void b0() {
        Window window = this.f5656g;
        if (window == null) {
            this.f5654e.setSystemBarsBehavior(2);
            return;
        }
        window.getDecorView().setTag(356039078, 2);
        m0(2048);
        l0(4096);
    }

    @Override // s8.e
    public final void d0(int i9) {
        if ((i9 & 8) != 0) {
            ((C0320v) this.f5655f.f11404b).b();
        }
        this.f5654e.show(i9 & (-9));
    }

    public final void l0(int i9) {
        View decorView = this.f5656g.getDecorView();
        decorView.setSystemUiVisibility(i9 | decorView.getSystemUiVisibility());
    }

    public final void m0(int i9) {
        View decorView = this.f5656g.getDecorView();
        decorView.setSystemUiVisibility((~i9) & decorView.getSystemUiVisibility());
    }
}
