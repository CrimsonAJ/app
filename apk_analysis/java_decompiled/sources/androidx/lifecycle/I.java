package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* loaded from: classes.dex */
public final class I extends AbstractC0548i {
    final /* synthetic */ J this$0;

    /* loaded from: classes.dex */
    public static final class a extends AbstractC0548i {
        final /* synthetic */ J this$0;

        public a(J j) {
            this.this$0 = j;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            kotlin.jvm.internal.h.e(activity, "activity");
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            kotlin.jvm.internal.h.e(activity, "activity");
            J j = this.this$0;
            int i9 = j.f9801a + 1;
            j.f9801a = i9;
            if (i9 == 1 && j.f9804d) {
                j.f9806f.o0(EnumC0554o.ON_START);
                j.f9804d = false;
            }
        }
    }

    public I(J j) {
        this.this$0 = j;
    }

    @Override // androidx.lifecycle.AbstractC0548i, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.h.e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i9 = S.f9836b;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            kotlin.jvm.internal.h.c(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((S) findFragmentByTag).f9837a = this.this$0.f9808h;
        }
    }

    @Override // androidx.lifecycle.AbstractC0548i, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.h.e(activity, "activity");
        J j = this.this$0;
        int i9 = j.f9802b - 1;
        j.f9802b = i9;
        if (i9 == 0) {
            Handler handler = j.f9805e;
            kotlin.jvm.internal.h.b(handler);
            handler.postDelayed(j.f9807g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.h.e(activity, "activity");
        H.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC0548i, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.h.e(activity, "activity");
        J j = this.this$0;
        int i9 = j.f9801a - 1;
        j.f9801a = i9;
        if (i9 == 0 && j.f9803c) {
            j.f9806f.o0(EnumC0554o.ON_STOP);
            j.f9804d = true;
        }
    }
}
