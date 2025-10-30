package K4;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f4303a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f4304b;

    /* renamed from: c, reason: collision with root package name */
    public static Boolean f4305c;

    static {
        Method method;
        Method method2;
        boolean z9;
        Class<?> cls = Integer.TYPE;
        Process.myUid();
        try {
            method = WorkSource.class.getMethod("add", cls);
        } catch (Exception unused) {
            method = null;
        }
        f4303a = method;
        try {
            method2 = WorkSource.class.getMethod("add", cls, String.class);
        } catch (Exception unused2) {
            method2 = null;
        }
        f4304b = method2;
        try {
            WorkSource.class.getMethod("size", null);
        } catch (Exception unused3) {
        }
        try {
            WorkSource.class.getMethod("get", cls);
        } catch (Exception unused4) {
        }
        try {
            WorkSource.class.getMethod("getName", cls);
        } catch (Exception unused5) {
        }
        if (Build.VERSION.SDK_INT >= 28) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            try {
                WorkSource.class.getMethod("createWorkChain", null);
            } catch (Exception e8) {
                Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e8);
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", cls, String.class);
            } catch (Exception e9) {
                Log.w("WorkSourceUtil", "Missing WorkChain class", e9);
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                WorkSource.class.getMethod("isEmpty", null).setAccessible(true);
            } catch (Exception unused6) {
            }
        }
        f4305c = null;
    }

    public static synchronized boolean a(Context context) {
        synchronized (e.class) {
            Boolean bool = f4305c;
            if (bool != null) {
                return bool.booleanValue();
            }
            boolean z9 = false;
            if (context == null) {
                return false;
            }
            if (E.d.a(context, "android.permission.UPDATE_DEVICE_STATS") == 0) {
                z9 = true;
            }
            f4305c = Boolean.valueOf(z9);
            return z9;
        }
    }
}
