package P;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class g0 extends k0 {

    /* renamed from: e, reason: collision with root package name */
    public static Field f5604e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f5605f = false;

    /* renamed from: g, reason: collision with root package name */
    public static Constructor f5606g = null;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f5607h = false;

    /* renamed from: c, reason: collision with root package name */
    public WindowInsets f5608c;

    /* renamed from: d, reason: collision with root package name */
    public H.c f5609d;

    public g0() {
        this.f5608c = i();
    }

    private static WindowInsets i() {
        if (!f5605f) {
            try {
                f5604e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e8) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e8);
            }
            f5605f = true;
        }
        Field field = f5604e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e9) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e9);
            }
        }
        if (!f5607h) {
            try {
                f5606g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e10) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e10);
            }
            f5607h = true;
        }
        Constructor constructor = f5606g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e11) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e11);
            }
        }
        return null;
    }

    @Override // P.k0
    public u0 b() {
        a();
        u0 g9 = u0.g(null, this.f5608c);
        H.c[] cVarArr = this.f5613b;
        r0 r0Var = g9.f5645a;
        r0Var.p(cVarArr);
        r0Var.r(this.f5609d);
        return g9;
    }

    @Override // P.k0
    public void e(H.c cVar) {
        this.f5609d = cVar;
    }

    @Override // P.k0
    public void g(H.c cVar) {
        WindowInsets windowInsets = this.f5608c;
        if (windowInsets != null) {
            this.f5608c = windowInsets.replaceSystemWindowInsets(cVar.f2914a, cVar.f2915b, cVar.f2916c, cVar.f2917d);
        }
    }

    public g0(u0 u0Var) {
        super(u0Var);
        this.f5608c = u0Var.f();
    }
}
