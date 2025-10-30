package D4;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: D4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C0085d implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: e, reason: collision with root package name */
    public static final ComponentCallbacks2C0085d f1834e = new ComponentCallbacks2C0085d();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f1835a = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f1836b = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1837c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public boolean f1838d = false;

    public static void b(Application application) {
        ComponentCallbacks2C0085d componentCallbacks2C0085d = f1834e;
        synchronized (componentCallbacks2C0085d) {
            try {
                if (!componentCallbacks2C0085d.f1838d) {
                    application.registerActivityLifecycleCallbacks(componentCallbacks2C0085d);
                    application.registerComponentCallbacks(componentCallbacks2C0085d);
                    componentCallbacks2C0085d.f1838d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(InterfaceC0084c interfaceC0084c) {
        synchronized (f1834e) {
            this.f1837c.add(interfaceC0084c);
        }
    }

    public final void c(boolean z9) {
        synchronized (f1834e) {
            try {
                ArrayList arrayList = this.f1837c;
                int size = arrayList.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    ((InterfaceC0084c) obj).a(z9);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f1836b;
        boolean compareAndSet = this.f1835a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            c(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.f1836b;
        boolean compareAndSet = this.f1835a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            c(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i9) {
        if (i9 == 20 && this.f1835a.compareAndSet(false, true)) {
            this.f1836b.set(true);
            c(true);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
