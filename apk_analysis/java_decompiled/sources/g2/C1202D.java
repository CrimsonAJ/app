package g2;

import J1.AbstractC0165c;
import Q2.InterfaceC0362e;
import co.notix.R;
import com.anilab.android.ui.player.PlayerActivity;

/* renamed from: g2.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1202D implements InterfaceC0362e {

    /* renamed from: a, reason: collision with root package name */
    public final float f17563a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PlayerActivity f17564b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC0165c f17565c;

    public C1202D(PlayerActivity playerActivity, AbstractC0165c abstractC0165c) {
        this.f17564b = playerActivity;
        this.f17565c = abstractC0165c;
        this.f17563a = playerActivity.getResources().getDimension(R.dimen.dp_111);
    }
}
