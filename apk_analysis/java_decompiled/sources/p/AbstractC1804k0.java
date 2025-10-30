package p;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* renamed from: p.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1804k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f22003a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f22004b;

    /* renamed from: c, reason: collision with root package name */
    public static final Method f22005c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f22006d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
            f22003a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f22004b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f22005c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f22006d = true;
        } catch (NoSuchMethodException e8) {
            e8.printStackTrace();
        }
    }
}
