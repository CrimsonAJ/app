package L1;

import com.anilab.android.ui.activity.MainActivity;
import com.anilab.android.ui.player.PlayerActivity;
import e.InterfaceC1132a;
import g2.InterfaceC1208J;
import i.AbstractActivityC1322h;

/* renamed from: L1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0219a implements InterfaceC1132a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4513a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC1322h f4514b;

    public /* synthetic */ C0219a(AbstractActivityC1322h abstractActivityC1322h, int i9) {
        this.f4513a = i9;
        this.f4514b = abstractActivityC1322h;
    }

    @Override // e.InterfaceC1132a
    public final void a() {
        switch (this.f4513a) {
            case 0:
                MainActivity mainActivity = (MainActivity) this.f4514b;
                if (!mainActivity.f13729X) {
                    mainActivity.f13729X = true;
                    ((InterfaceC0234p) mainActivity.e()).getClass();
                    return;
                }
                return;
            case 1:
                PlayerActivity playerActivity = (PlayerActivity) this.f4514b;
                if (!playerActivity.f17657C) {
                    playerActivity.f17657C = true;
                    ((InterfaceC1208J) playerActivity.e()).getClass();
                    return;
                }
                return;
            default:
                AbstractActivityC1322h abstractActivityC1322h = this.f4514b;
                i.l R2 = abstractActivityC1322h.R();
                R2.a();
                ((N0.f) abstractActivityC1322h.f16589e.f15188c).c("androidx:appcompat");
                R2.c();
                return;
        }
    }
}
