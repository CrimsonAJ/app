package g2;

import com.anilab.android.ui.player.PlayerActivity;

/* renamed from: g2.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1207I extends kotlin.jvm.internal.i implements O7.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17574d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ PlayerActivity f17575e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1207I(PlayerActivity playerActivity, int i9) {
        super(0);
        this.f17574d = i9;
        this.f17575e = playerActivity;
    }

    @Override // O7.a
    public final Object invoke() {
        switch (this.f17574d) {
            case 0:
                return this.f17575e.j();
            case 1:
                return this.f17575e.u();
            default:
                return this.f17575e.p();
        }
    }
}
