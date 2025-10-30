package F4;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f2456a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f2457b;

    /* renamed from: c, reason: collision with root package name */
    public static int f2458c;

    public static void a(String str, boolean z9) {
        if (z9) {
        } else {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void b(boolean z9) {
        if (z9) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static void c(Handler handler) {
        String str;
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            if (myLooper != null) {
                str = myLooper.getThread().getName();
            } else {
                str = "null current looper";
            }
            throw new IllegalStateException("Must be called on " + handler.getLooper().getThread().getName() + " thread, but got " + str + ".");
        }
    }

    public static void d() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
        } else {
            throw new IllegalStateException("Must be called from the main thread.");
        }
    }

    public static void e(String str) {
        if (!TextUtils.isEmpty(str)) {
        } else {
            throw new IllegalArgumentException("Given String is empty or null");
        }
    }

    public static void f(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
        } else {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void g(String str) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
        } else {
            throw new IllegalStateException(str);
        }
    }

    public static void h(Object obj) {
        if (obj != null) {
        } else {
            throw new NullPointerException("null reference");
        }
    }

    public static void i(Object obj, String str) {
        if (obj != null) {
        } else {
            throw new NullPointerException(str);
        }
    }

    public static void j(String str, boolean z9) {
        if (z9) {
        } else {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static boolean k(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    public static C4.e l(Status status) {
        if (status.f14662c != null) {
            return new C4.e(status);
        }
        return new C4.e(status);
    }
}
