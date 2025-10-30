package J5;

import J1.AbstractC0165c;
import R1.A;
import R1.y;
import T1.F;
import T1.G;
import androidx.viewpager2.widget.ViewPager2;
import com.anilab.android.ui.download.DownloadFragment;
import com.anilab.android.ui.external_player.SelectSubtitleForPlayerFragment;
import com.anilab.android.ui.player.PlayerActivity;
import com.google.android.gms.internal.measurement.Y1;
import com.google.android.material.chip.ChipGroup;
import g2.C1223Z;
import g2.a0;

/* loaded from: classes.dex */
public final class j implements c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4221a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4222b;

    public /* synthetic */ j(int i9, Object obj) {
        this.f4221a = i9;
        this.f4222b = obj;
    }

    @Override // J5.b
    public final void a(f fVar) {
        boolean z9;
        boolean z10 = false;
        Object obj = this.f4222b;
        switch (this.f4221a) {
            case 0:
                ((ViewPager2) obj).b(fVar.f4201d, true);
                return;
            case 1:
                A t02 = ((DownloadFragment) obj).t0();
                if (fVar.f4201d == 0) {
                    z10 = true;
                }
                t02.f6504p = !z10;
                t02.d(true, new y(t02, t02.f6501m.f3444a, true, null));
                return;
            case 2:
                G u02 = ((SelectSubtitleForPlayerFragment) obj).u0();
                if (fVar.f4201d == 0) {
                    z10 = true;
                }
                u02.getClass();
                u02.d(true, new F(u02, !z10, null));
                return;
            default:
                PlayerActivity playerActivity = (PlayerActivity) obj;
                Y1.p(playerActivity);
                int i9 = PlayerActivity.f13798w0;
                a0 d02 = playerActivity.d0();
                if (fVar.f4201d == 1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                long T8 = playerActivity.Z().T();
                d02.getClass();
                d02.d(false, new C1223Z(z9, d02, T8, null));
                AbstractC0165c abstractC0165c = playerActivity.f13799D;
                if (abstractC0165c != null) {
                    ChipGroup chipGroupServer = abstractC0165c.f3843C;
                    kotlin.jvm.internal.h.d(chipGroupServer, "chipGroupServer");
                    playerActivity.m0(chipGroupServer);
                    playerActivity.n0();
                    return;
                }
                kotlin.jvm.internal.h.h("binding");
                throw null;
        }
    }
}
