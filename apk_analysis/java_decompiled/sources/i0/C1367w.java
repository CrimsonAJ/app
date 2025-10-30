package i0;

import com.anilab.android.ui.player.PlayerActivity;
import com.google.android.gms.cast.MediaTrack;
import u4.C2077b;
import u4.C2079d;

/* renamed from: i0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1367w implements O.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18424a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC1369y f18425b;

    public /* synthetic */ C1367w(AbstractActivityC1369y abstractActivityC1369y, int i9) {
        this.f18424a = i9;
        this.f18425b = abstractActivityC1369y;
    }

    @Override // O.a
    public final void a(Object obj) {
        long[] jArr;
        int i9 = 1;
        AbstractActivityC1369y abstractActivityC1369y = this.f18425b;
        switch (this.f18424a) {
            case 0:
                abstractActivityC1369y.f18431t.q();
                return;
            case 1:
                abstractActivityC1369y.f18431t.q();
                return;
            default:
                MediaTrack mediaTrack = (MediaTrack) obj;
                int i10 = PlayerActivity.f13798w0;
                PlayerActivity playerActivity = (PlayerActivity) abstractActivityC1369y;
                if (!playerActivity.d0().f17644u) {
                    if (mediaTrack == null) {
                        jArr = new long[0];
                    } else {
                        jArr = new long[]{mediaTrack.f14625a};
                    }
                    C2077b X8 = playerActivity.X();
                    X8.getClass();
                    F4.y.d();
                    C2079d c3 = X8.f23648c.c();
                    if (c3 != null) {
                        F4.y.d();
                        v4.h hVar = c3.j;
                        if (hVar != null) {
                            F4.y.d();
                            if (!hVar.w()) {
                                v4.h.r();
                                return;
                            } else {
                                v4.h.x(new v4.n(hVar, jArr, i9));
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
