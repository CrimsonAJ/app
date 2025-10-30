package co.notix;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final O7.p f11970a;

    public c(c9 onUpdate) {
        kotlin.jvm.internal.h.e(onUpdate, "onUpdate");
        this.f11970a = onUpdate;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.h.e(activity, "activity");
        this.f11970a.invoke(activity, f.CREATED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        kotlin.jvm.internal.h.e(activity, "activity");
        this.f11970a.invoke(activity, f.NONE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.h.e(activity, "activity");
        this.f11970a.invoke(activity, f.STARTED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        kotlin.jvm.internal.h.e(activity, "activity");
        this.f11970a.invoke(activity, f.RESUMED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.h.e(activity, "activity");
        kotlin.jvm.internal.h.e(bundle, "bundle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        kotlin.jvm.internal.h.e(activity, "activity");
        this.f11970a.invoke(activity, f.STARTED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.h.e(activity, "activity");
        this.f11970a.invoke(activity, f.CREATED);
    }
}
