package Q2;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.anilab.exoplayer.StyledPlayerView;
import j3.r0;

/* loaded from: classes.dex */
public final class J extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ StyledPlayerView f6156a;

    public J(StyledPlayerView styledPlayerView) {
        this.f6156a = styledPlayerView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        StyledPlayerView styledPlayerView = this.f6156a;
        r0 r0Var = styledPlayerView.f14464o;
        if (r0Var != null && ((D.n) r0Var).d0()) {
            if (motionEvent.getX() > styledPlayerView.getPivotX()) {
                View view = styledPlayerView.f14462m;
                if (view != null) {
                    StyledPlayerView.a(styledPlayerView, view);
                }
                D.n nVar = (D.n) styledPlayerView.f14464o;
                long T8 = nVar.T() + nVar.i();
                long H8 = nVar.H();
                if (H8 != -9223372036854775807L) {
                    T8 = Math.min(T8, H8);
                }
                nVar.Q(Math.max(T8, 0L), nVar.z());
                return true;
            }
            View view2 = styledPlayerView.f14463n;
            if (view2 != null) {
                StyledPlayerView.a(styledPlayerView, view2);
            }
            D.n nVar2 = (D.n) styledPlayerView.f14464o;
            long T9 = nVar2.T() + (-nVar2.U());
            long H9 = nVar2.H();
            if (H9 != -9223372036854775807L) {
                T9 = Math.min(T9, H9);
            }
            nVar2.Q(Math.max(T9, 0L), nVar2.z());
            return true;
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        int i9 = StyledPlayerView.f14447D;
        StyledPlayerView styledPlayerView = this.f6156a;
        if (styledPlayerView.m() && styledPlayerView.f14464o != null) {
            D d9 = styledPlayerView.j;
            if (!d9.f()) {
                styledPlayerView.d(true);
            } else if (styledPlayerView.f14448A) {
                d9.e();
            }
        }
        return true;
    }
}
