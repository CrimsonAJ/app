package g2;

import J1.AbstractC0165c;
import Y7.y0;
import android.media.AudioManager;
import android.text.Editable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentContainerView;
import androidx.recyclerview.widget.RecyclerView;
import co.notix.R;
import com.anilab.android.ui.comment.CommentListFragment;
import com.anilab.android.ui.player.PlayerActivity;
import com.anilab.android.ui.views.FreakToggleGroup;
import com.google.android.gms.internal.measurement.Y1;
import com.google.android.material.slider.Slider;
import i0.C1337N;
import i0.C1345a;

/* renamed from: g2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC1232i implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17669a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PlayerActivity f17670b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC0165c f17671c;

    public /* synthetic */ ViewOnClickListenerC1232i(AbstractC0165c abstractC0165c, PlayerActivity playerActivity, int i9) {
        this.f17669a = i9;
        this.f17671c = abstractC0165c;
        this.f17670b = playerActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PlayerActivity playerActivity = this.f17670b;
        AbstractC0165c abstractC0165c = this.f17671c;
        switch (this.f17669a) {
            case 0:
                int i9 = PlayerActivity.f13798w0;
                Slider sliderVolume = abstractC0165c.f3858S;
                kotlin.jvm.internal.h.d(sliderVolume, "sliderVolume");
                y0 y0Var = playerActivity.f13813q0;
                if (y0Var != null) {
                    y0Var.d(null);
                }
                playerActivity.f13813q0 = Y7.B.r(androidx.lifecycle.Y.f(playerActivity), null, new C1206H(sliderVolume, null), 3);
                abstractC0165c.f3858S.setValue(((AudioManager) playerActivity.f13807k0.getValue()).getStreamVolume(3));
                return;
            case 1:
                y0 y0Var2 = playerActivity.f13814s0;
                if (y0Var2 != null) {
                    y0Var2.d(null);
                }
                FrameLayout layoutSettings = abstractC0165c.f3851L;
                kotlin.jvm.internal.h.d(layoutSettings, "layoutSettings");
                layoutSettings.setVisibility(0);
                TextView textLabelQuality = abstractC0165c.f3864Z;
                kotlin.jvm.internal.h.d(textLabelQuality, "textLabelQuality");
                textLabelQuality.setVisibility(0);
                FreakToggleGroup toggleQuality = abstractC0165c.f3868d0;
                kotlin.jvm.internal.h.d(toggleQuality, "toggleQuality");
                toggleQuality.setVisibility(0);
                return;
            case 2:
                y0 y0Var3 = playerActivity.f13814s0;
                if (y0Var3 != null) {
                    y0Var3.d(null);
                }
                FrameLayout layoutSettings2 = abstractC0165c.f3851L;
                kotlin.jvm.internal.h.d(layoutSettings2, "layoutSettings");
                layoutSettings2.setVisibility(0);
                RecyclerView recyclerChooseEpisode = abstractC0165c.f3854O;
                kotlin.jvm.internal.h.d(recyclerChooseEpisode, "recyclerChooseEpisode");
                recyclerChooseEpisode.setVisibility(0);
                C1225b a02 = playerActivity.a0();
                a02.getClass();
                new R1.B(a02, 2).filter("");
                abstractC0165c.f3848H.setText("");
                return;
            case 3:
                y0 y0Var4 = playerActivity.f13814s0;
                if (y0Var4 != null) {
                    y0Var4.d(null);
                }
                FrameLayout layoutSettings3 = abstractC0165c.f3851L;
                kotlin.jvm.internal.h.d(layoutSettings3, "layoutSettings");
                layoutSettings3.setVisibility(0);
                RecyclerView recyclerChooseServer = abstractC0165c.f3855P;
                kotlin.jvm.internal.h.d(recyclerChooseServer, "recyclerChooseServer");
                recyclerChooseServer.setVisibility(0);
                TextView textLabelServer = abstractC0165c.f3865a0;
                kotlin.jvm.internal.h.d(textLabelServer, "textLabelServer");
                textLabelServer.setVisibility(0);
                return;
            case 4:
                int i10 = PlayerActivity.f13798w0;
                abstractC0165c.Y.setText(playerActivity.getString(R.string.format_subtitle_delay, Float.valueOf(((float) Q2.O.f6195a.addAndGet(-100000L)) / 1000000.0f)));
                return;
            case 5:
                int i11 = PlayerActivity.f13798w0;
                abstractC0165c.Y.setText(playerActivity.getString(R.string.format_subtitle_delay, Float.valueOf(((float) Q2.O.f6195a.addAndGet(100000L)) / 1000000.0f)));
                return;
            case 6:
                int i12 = PlayerActivity.f13798w0;
                FragmentContainerView containerComment = abstractC0165c.f3844D;
                kotlin.jvm.internal.h.d(containerComment, "containerComment");
                containerComment.setVisibility(0);
                C1337N P8 = playerActivity.P();
                kotlin.jvm.internal.h.d(P8, "getSupportFragmentManager(...)");
                C1345a c1345a = new C1345a(P8);
                long j = playerActivity.d0().f17638o.f3466a;
                CommentListFragment commentListFragment = new CommentListFragment();
                commentListFragment.c0(Z0.a.c(new A7.h("EXTRA_MOVIE_ID", Long.valueOf(j)), new A7.h("EXTRA_FROM_PLAYER", Boolean.TRUE), new A7.h("EXTRA_PARENT_ID", null), new A7.h("EXTRA_CHILD_ID", null)));
                c1345a.g(R.id.containerComment, commentListFragment, null, 2);
                c1345a.c(kotlin.jvm.internal.p.a(CommentListFragment.class).b());
                c1345a.e(false);
                return;
            default:
                int i13 = PlayerActivity.f13798w0;
                Editable text = abstractC0165c.f3848H.getText();
                if (text != null && !W7.d.U(text)) {
                    abstractC0165c.f3848H.setText("");
                    Y1.p(playerActivity);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ ViewOnClickListenerC1232i(PlayerActivity playerActivity, AbstractC0165c abstractC0165c, int i9) {
        this.f17669a = i9;
        this.f17670b = playerActivity;
        this.f17671c = abstractC0165c;
    }
}
