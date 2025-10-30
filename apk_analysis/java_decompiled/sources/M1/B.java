package M1;

import B6.u0;
import L1.S;
import M1.r;
import W.g;
import android.app.Application;
import androidx.lifecycle.Y;
import com.anilab.android.App;
import com.anilab.android.ui.player.PlayerActivity;
import g.C1188a;
import i0.AbstractActivityC1369y;
import i0.C1359o;

/* loaded from: classes.dex */
public abstract class B<V extends r, B extends W.g> extends n<V, B> {

    /* renamed from: y0, reason: collision with root package name */
    public final Y2.r f4701y0 = M4.a.i(this, kotlin.jvm.internal.p.a(S.class), new A(this, 0), new A(this, 1), new A(this, 2));

    /* renamed from: z0, reason: collision with root package name */
    public final C1359o f4702z0 = (C1359o) V(new C3.v(4, this), new C1188a(2));

    public static void s0(B b9, String str) {
        Application application;
        App app;
        AbstractActivityC1369y k5 = b9.k();
        if (k5 != null) {
            application = k5.getApplication();
        } else {
            application = null;
        }
        if (application instanceof App) {
            app = (App) application;
        } else {
            app = null;
        }
        if (app == null) {
            return;
        }
        Y7.B.r(app.f13721g, null, new I1.b(app, str, null), 3);
    }

    @Override // M1.n
    public void l0() {
        Y7.B.r(Y.f(t()), null, new z(null, this), 3);
    }

    public final S r0() {
        return (S) this.f4701y0.getValue();
    }

    public final void t0(H2.s sVar) {
        int i9;
        r0().f4491A = sVar;
        H2.o oVar = r0().f4510x;
        if (oVar != null) {
            i9 = oVar.f3039b;
        } else {
            i9 = 0;
        }
        if (oVar != null && oVar.f3038a) {
            T7.c N8 = u0.N(0, i9);
            int f9 = R7.d.f6666a.f(100);
            if (N8.f7237a <= f9 && f9 <= N8.f7238b) {
                u0();
                return;
            }
        }
        AbstractActivityC1369y k5 = k();
        if (k5 == null) {
            return;
        }
        int i10 = PlayerActivity.f13798w0;
        this.f4702z0.a(M4.a.s(k5, sVar.f3051a, sVar.f3052b, sVar.f3054d, sVar.f3053c, sVar.f3055e, sVar.f3056f));
    }

    public abstract void u0();

    public abstract void v0();
}
