package P1;

import android.view.View;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import com.anilab.android.ui.comment.CommentListFragment;

/* loaded from: classes.dex */
public final class q implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5746a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5747b;

    public /* synthetic */ q(int i9, Object obj) {
        this.f5746a = i9;
        this.f5747b = obj;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        switch (this.f5746a) {
            case 0:
                FrameLayout layoutActionComment = ((J1.E) ((CommentListFragment) this.f5747b).e0()).f3645A;
                kotlin.jvm.internal.h.d(layoutActionComment, "layoutActionComment");
                layoutActionComment.setVisibility(8);
                return;
            default:
                ((View) this.f5747b).setVisibility(4);
                return;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        int i9 = this.f5746a;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        switch (this.f5746a) {
            case 0:
                return;
            default:
                ((View) this.f5747b).setVisibility(0);
                return;
        }
    }

    private final void a(Animation animation) {
    }

    private final void b(Animation animation) {
    }

    private final void c(Animation animation) {
    }
}
