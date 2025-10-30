package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import androidx.lifecycle.S;

/* loaded from: classes.dex */
public abstract class P {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, EnumC0554o event) {
        kotlin.jvm.internal.h.e(event, "event");
        if (activity instanceof InterfaceC0561w) {
            D.n x5 = ((InterfaceC0561w) activity).x();
            if (x5 instanceof C0563y) {
                ((C0563y) x5).o0(event);
            }
        }
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            S.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new S.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new Fragment(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
