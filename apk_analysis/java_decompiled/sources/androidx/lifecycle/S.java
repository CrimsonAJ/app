package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import o1.C1671f;

/* loaded from: classes.dex */
public class S extends Fragment {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f9836b = 0;

    /* renamed from: a, reason: collision with root package name */
    public C1671f f9837a;

    /* loaded from: classes.dex */
    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final Q Companion = new Object();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            kotlin.jvm.internal.h.e(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.h.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            kotlin.jvm.internal.h.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            kotlin.jvm.internal.h.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.h.e(activity, "activity");
            int i9 = S.f9836b;
            P.a(activity, EnumC0554o.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            kotlin.jvm.internal.h.e(activity, "activity");
            int i9 = S.f9836b;
            P.a(activity, EnumC0554o.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            kotlin.jvm.internal.h.e(activity, "activity");
            int i9 = S.f9836b;
            P.a(activity, EnumC0554o.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            kotlin.jvm.internal.h.e(activity, "activity");
            int i9 = S.f9836b;
            P.a(activity, EnumC0554o.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            kotlin.jvm.internal.h.e(activity, "activity");
            int i9 = S.f9836b;
            P.a(activity, EnumC0554o.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            kotlin.jvm.internal.h.e(activity, "activity");
            int i9 = S.f9836b;
            P.a(activity, EnumC0554o.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            kotlin.jvm.internal.h.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.h.e(activity, "activity");
            kotlin.jvm.internal.h.e(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            kotlin.jvm.internal.h.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            kotlin.jvm.internal.h.e(activity, "activity");
        }
    }

    public final void a(EnumC0554o enumC0554o) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            kotlin.jvm.internal.h.d(activity, "activity");
            P.a(activity, enumC0554o);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(EnumC0554o.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(EnumC0554o.ON_DESTROY);
        this.f9837a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(EnumC0554o.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        C1671f c1671f = this.f9837a;
        if (c1671f != null) {
            ((J) c1671f.f21473b).a();
        }
        a(EnumC0554o.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        C1671f c1671f = this.f9837a;
        if (c1671f != null) {
            J j = (J) c1671f.f21473b;
            int i9 = j.f9801a + 1;
            j.f9801a = i9;
            if (i9 == 1 && j.f9804d) {
                j.f9806f.o0(EnumC0554o.ON_START);
                j.f9804d = false;
            }
        }
        a(EnumC0554o.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(EnumC0554o.ON_STOP);
    }
}
