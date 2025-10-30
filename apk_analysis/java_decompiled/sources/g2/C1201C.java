package g2;

import com.anilab.android.ui.comment.CommentListFragment;
import com.anilab.android.ui.player.PlayerActivity;
import d.AbstractC1073n;
import i0.AbstractC1336M;
import i0.C1334K;
import i0.C1337N;
import java.util.ArrayList;
import java.util.List;

/* renamed from: g2.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1201C extends AbstractC1073n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17561d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f17562e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1201C(int i9, Object obj) {
        super(false);
        this.f17561d = i9;
        this.f17562e = obj;
    }

    @Override // d.AbstractC1073n
    public final void a() {
        switch (this.f17561d) {
            case 0:
                PlayerActivity playerActivity = (PlayerActivity) this.f17562e;
                if (playerActivity.getResources().getConfiguration().orientation == 2) {
                    playerActivity.setRequestedOrientation(1);
                    return;
                }
                List q9 = playerActivity.P().f18198c.q();
                kotlin.jvm.internal.h.d(q9, "getFragments(...)");
                ArrayList arrayList = new ArrayList();
                for (Object obj : q9) {
                    if (obj instanceof CommentListFragment) {
                        arrayList.add(obj);
                    }
                }
                if (!arrayList.isEmpty()) {
                    C1337N P8 = playerActivity.P();
                    P8.getClass();
                    P8.v(new C1334K(P8, null, -1, 0), false);
                    return;
                }
                PlayerActivity.T(playerActivity);
                return;
            case 1:
                AbstractC1336M abstractC1336M = (AbstractC1336M) this.f17562e;
                abstractC1336M.x(true);
                if (abstractC1336M.f18203h.f16606a) {
                    abstractC1336M.P();
                    return;
                } else {
                    abstractC1336M.f18202g.c();
                    return;
                }
            default:
                ((u0.H) this.f17562e).m();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1201C(PlayerActivity playerActivity) {
        super(true);
        this.f17561d = 0;
        this.f17562e = playerActivity;
    }
}
