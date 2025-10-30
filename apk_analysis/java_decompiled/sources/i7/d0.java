package i7;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class d0 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public static final d0 f18848a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f18849b;

    /* renamed from: c, reason: collision with root package name */
    public static com.google.firebase.messaging.s f18850c;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.h.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        kotlin.jvm.internal.h.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.h.e(activity, "activity");
        com.google.firebase.messaging.s sVar = f18850c;
        if (sVar != null) {
            sVar.v(2);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        A7.n nVar;
        kotlin.jvm.internal.h.e(activity, "activity");
        com.google.firebase.messaging.s sVar = f18850c;
        if (sVar != null) {
            sVar.v(1);
            nVar = A7.n.f558a;
        } else {
            nVar = null;
        }
        if (nVar == null) {
            f18849b = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        kotlin.jvm.internal.h.e(activity, "activity");
        kotlin.jvm.internal.h.e(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        kotlin.jvm.internal.h.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.h.e(activity, "activity");
    }
}
