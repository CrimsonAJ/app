package o2;

import J1.C0;
import android.content.Context;
import android.media.AudioManager;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.anilab.android.ui.player.PlayerActivity;
import com.anilab.android.ui.settings.SubtitleSettingsFragment;

/* renamed from: o2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1686m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21535a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21536b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f21537c;

    public /* synthetic */ C1686m(Object obj, int i9, Object obj2) {
        this.f21535a = i9;
        this.f21536b = obj;
        this.f21537c = obj2;
    }

    public final void a(H5.d dVar, float f9) {
        int i9 = 0;
        Object obj = this.f21537c;
        Object obj2 = this.f21536b;
        switch (this.f21535a) {
            case 0:
                int i10 = (int) f9;
                Integer valueOf = Integer.valueOf(i10);
                H7.a aVar = EnumC1687n.f21540d;
                if (i10 < 0 || i10 >= aVar.b()) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    i9 = valueOf.intValue();
                }
                int i11 = ((EnumC1687n) aVar.get(i9)).f21541a;
                ((SubtitleSettingsFragment) obj2).h0().f21549g.f3473b = i11;
                ((C0) obj).f3629D.setTextColor(i11);
                return;
            case 1:
                ((SubtitleSettingsFragment) obj2).h0().f21549g.f3475d = (int) f9;
                ((C0) obj).f3629D.setTextSize(2, f9 * 0.6542056f);
                return;
            case 2:
                int i12 = (int) f9;
                if (i12 >= 0) {
                    H7.a aVar2 = J2.d.f4172c;
                    if (i12 < aVar2.b()) {
                        J2.d dVar2 = (J2.d) aVar2.get(i12);
                        I2.f fVar = ((SubtitleSettingsFragment) obj2).h0().f21549g;
                        fVar.getClass();
                        kotlin.jvm.internal.h.e(dVar2, "<set-?>");
                        fVar.f3476e = dVar2;
                        ((C0) obj).f3629D.setTypeface(SubtitleSettingsFragment.s0(dVar2));
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ((SubtitleSettingsFragment) obj2).h0().f21549g.f3474c = (int) f9;
                C0 c02 = (C0) obj;
                TextView textSubtitle = c02.f3629D;
                kotlin.jvm.internal.h.d(textSubtitle, "textSubtitle");
                ViewGroup.LayoutParams layoutParams = textSubtitle.getLayoutParams();
                if (layoutParams != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    Context context = c02.f7853k.getContext();
                    kotlin.jvm.internal.h.d(context, "getContext(...)");
                    layoutParams2.bottomMargin = M4.a.j(context, (int) (f9 * 0.6542056f));
                    textSubtitle.setLayoutParams(layoutParams2);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            case 4:
                ((SubtitleSettingsFragment) obj2).h0().f21549g.f3480i = f9;
                ((C0) obj).f3629D.setShadowLayer(f9, 0.0f, 0.0f, -16777216);
                return;
            case 5:
                SubtitleSettingsFragment subtitleSettingsFragment = (SubtitleSettingsFragment) obj2;
                int i13 = subtitleSettingsFragment.h0().f21549g.f3472a;
                if (!Float.isNaN(f9)) {
                    int round = Math.round(f9);
                    if (round >= 0 && round < 256) {
                        int h7 = H.a.h(i13, round);
                        subtitleSettingsFragment.h0().f21549g.f3472a = h7;
                        ((C0) obj).f3629D.setBackgroundColor(h7);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Cannot round NaN value.");
            default:
                int i14 = PlayerActivity.f13798w0;
                kotlin.jvm.internal.l lVar = (kotlin.jvm.internal.l) obj2;
                if (Math.abs(f9 - lVar.f20156a) >= 1.0f) {
                    lVar.f20156a = f9;
                    ((AudioManager) ((PlayerActivity) obj).f13807k0.getValue()).setStreamVolume(3, (int) f9, 0);
                    return;
                }
                return;
        }
    }
}
