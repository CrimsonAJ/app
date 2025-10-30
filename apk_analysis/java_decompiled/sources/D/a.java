package D;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* loaded from: classes.dex */
public final class a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public Object f1656a;

    /* renamed from: b, reason: collision with root package name */
    public Activity f1657b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1658c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1659d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1660e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1661f = false;

    public a(Activity activity) {
        this.f1657b = activity;
        this.f1658c = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f1657b == activity) {
            this.f1657b = null;
            this.f1660e = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (this.f1660e && !this.f1661f && !this.f1659d) {
            Object obj = this.f1656a;
            try {
                Object obj2 = b.f1664c.get(activity);
                if (obj2 == obj && activity.hashCode() == this.f1658c) {
                    b.f1668g.postAtFrontOfQueue(new S5.o(b.f1663b.get(activity), 5, obj2));
                    this.f1661f = true;
                    this.f1656a = null;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f1657b == activity) {
            this.f1659d = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
