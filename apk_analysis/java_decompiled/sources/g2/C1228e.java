package g2;

import co.notix.R;
import com.anilab.android.ui.player.PlayerActivity;
import com.google.android.material.chip.ChipGroup;
import java.util.ArrayList;

/* renamed from: g2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1228e implements Q2.M, q5.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PlayerActivity f17663a;

    public /* synthetic */ C1228e(PlayerActivity playerActivity) {
        this.f17663a = playerActivity;
    }

    @Override // q5.h
    public void f(ChipGroup chipGroup, ArrayList arrayList) {
        int i9 = PlayerActivity.f13798w0;
        Integer num = (Integer) B7.k.q0(arrayList);
        if (num != null) {
            int intValue = num.intValue();
            PlayerActivity playerActivity = this.f17663a;
            if (!playerActivity.d0().g(playerActivity.Z().T(), intValue)) {
                playerActivity.f0(new M1.D(R.string.msg_server_error));
            }
        }
    }
}
