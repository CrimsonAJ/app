package d1;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes.dex */
public final class l extends RecyclerView {

    /* renamed from: j1, reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f16710j1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ViewPager2 viewPager2, Context context) {
        super(context, null);
        this.f16710j1 = viewPager2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        this.f16710j1.f10410t.getClass();
        return super.getAccessibilityClassName();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        ViewPager2 viewPager2 = this.f16710j1;
        accessibilityEvent.setFromIndex(viewPager2.f10395d);
        accessibilityEvent.setToIndex(viewPager2.f10395d);
        accessibilityEvent.setSource((ViewPager2) viewPager2.f10410t.f20185d);
        accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f16710j1.f10408r && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f16710j1.f10408r && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }
}
