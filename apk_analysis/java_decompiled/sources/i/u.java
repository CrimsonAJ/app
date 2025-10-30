package i;

import a.AbstractC0485a;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;
import n.C1597c;

/* loaded from: classes.dex */
public final class u extends ContentFrameLayout {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ w f18095i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(w wVar, C1597c c1597c) {
        super(c1597c, null);
        this.f18095i = wVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f18095i.s(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x5 = (int) motionEvent.getX();
            int y9 = (int) motionEvent.getY();
            if (x5 < -5 || y9 < -5 || x5 > getWidth() + 5 || y9 > getHeight() + 5) {
                w wVar = this.f18095i;
                wVar.q(wVar.z(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i9) {
        setBackgroundDrawable(AbstractC0485a.q(getContext(), i9));
    }
}
