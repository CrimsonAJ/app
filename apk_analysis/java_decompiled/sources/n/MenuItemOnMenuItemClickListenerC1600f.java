package n;

import android.view.MenuItem;
import java.lang.reflect.Method;

/* renamed from: n.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC1600f implements MenuItem.OnMenuItemClickListener {

    /* renamed from: c, reason: collision with root package name */
    public static final Class[] f20953c = {MenuItem.class};

    /* renamed from: a, reason: collision with root package name */
    public Object f20954a;

    /* renamed from: b, reason: collision with root package name */
    public Method f20955b;

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Method method = this.f20955b;
        try {
            Class<?> returnType = method.getReturnType();
            Class<?> cls = Boolean.TYPE;
            Object obj = this.f20954a;
            if (returnType == cls) {
                return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
            }
            method.invoke(obj, menuItem);
            return true;
        } catch (Exception e8) {
            throw new RuntimeException(e8);
        }
    }
}
