package z8;

import F0.ExecutorC0101e;
import android.os.Build;

/* loaded from: classes.dex */
public abstract class J {

    /* renamed from: a, reason: collision with root package name */
    public static final ExecutorC0101e f25535a;

    /* renamed from: b, reason: collision with root package name */
    public static final C2252a f25536b;

    /* renamed from: c, reason: collision with root package name */
    public static final C2252a f25537c;

    static {
        String property = System.getProperty("java.vm.name");
        property.getClass();
        if (!property.equals("RoboVM")) {
            if (!property.equals("Dalvik")) {
                f25535a = null;
                f25536b = new K(1);
                f25537c = new C2252a(6);
                return;
            }
            f25535a = new ExecutorC0101e(3);
            if (Build.VERSION.SDK_INT >= 24) {
                f25536b = new K(0);
                f25537c = new C2252a(6);
                return;
            } else {
                f25536b = new C2252a(7);
                f25537c = new C2252a(6);
                return;
            }
        }
        f25535a = null;
        f25536b = new C2252a(7);
        f25537c = new C2252a(6);
    }
}
