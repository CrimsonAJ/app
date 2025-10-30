package d;

import android.os.Build;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0554o;
import androidx.lifecycle.InterfaceC0559u;
import androidx.lifecycle.InterfaceC0561w;
import java.lang.reflect.Field;

/* renamed from: d.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1067h implements InterfaceC0559u {

    /* renamed from: c, reason: collision with root package name */
    public static int f16575c;

    /* renamed from: d, reason: collision with root package name */
    public static Field f16576d;

    /* renamed from: e, reason: collision with root package name */
    public static Field f16577e;

    /* renamed from: f, reason: collision with root package name */
    public static Field f16578f;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16579a = 1;

    /* renamed from: b, reason: collision with root package name */
    public AbstractActivityC1071l f16580b;

    public /* synthetic */ C1067h() {
    }

    @Override // androidx.lifecycle.InterfaceC0559u
    public final void d(InterfaceC0561w interfaceC0561w, EnumC0554o enumC0554o) {
        switch (this.f16579a) {
            case 0:
                if (enumC0554o == EnumC0554o.ON_CREATE && Build.VERSION.SDK_INT >= 33) {
                    C1082w c1082w = this.f16580b.f16592h;
                    OnBackInvokedDispatcher invoker = AbstractC1068i.a((AbstractActivityC1071l) interfaceC0561w);
                    c1082w.getClass();
                    kotlin.jvm.internal.h.e(invoker, "invoker");
                    c1082w.f16631e = invoker;
                    c1082w.d(c1082w.f16633g);
                    return;
                }
                return;
            default:
                if (enumC0554o == EnumC0554o.ON_DESTROY) {
                    if (f16575c == 0) {
                        try {
                            f16575c = 2;
                            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                            f16577e = declaredField;
                            declaredField.setAccessible(true);
                            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                            f16578f = declaredField2;
                            declaredField2.setAccessible(true);
                            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                            f16576d = declaredField3;
                            declaredField3.setAccessible(true);
                            f16575c = 1;
                        } catch (NoSuchFieldException unused) {
                        }
                    }
                    if (f16575c == 1) {
                        InputMethodManager inputMethodManager = (InputMethodManager) this.f16580b.getSystemService("input_method");
                        try {
                            Object obj = f16576d.get(inputMethodManager);
                            if (obj != null) {
                                synchronized (obj) {
                                    try {
                                        View view = (View) f16577e.get(inputMethodManager);
                                        if (view != null) {
                                            if (!view.isAttachedToWindow()) {
                                                f16578f.set(inputMethodManager, null);
                                                inputMethodManager.isActive();
                                            }
                                        }
                                    } catch (IllegalAccessException unused2) {
                                    } catch (ClassCastException unused3) {
                                    } catch (IllegalAccessException unused4) {
                                    } finally {
                                    }
                                }
                                return;
                            }
                            return;
                        } catch (IllegalAccessException unused5) {
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    public C1067h(AbstractActivityC1071l abstractActivityC1071l) {
        this.f16580b = abstractActivityC1071l;
    }
}
