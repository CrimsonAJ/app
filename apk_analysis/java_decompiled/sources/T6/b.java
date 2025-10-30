package T6;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;
import l6.C1574f;
import u0.z;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements S6.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7212a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7213b;

    public /* synthetic */ b(int i9, Object obj) {
        this.f7212a = i9;
        this.f7213b = obj;
    }

    @Override // S6.b
    public final Object get() {
        switch (this.f7212a) {
            case 0:
                return new U6.c((C1574f) this.f7213b);
            case 1:
                String str = (String) this.f7213b;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new RuntimeException("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e8) {
                    throw new RuntimeException(A0.a.n("Could not instantiate ", str, "."), e8);
                } catch (InstantiationException e9) {
                    throw new RuntimeException(A0.a.n("Could not instantiate ", str, "."), e9);
                } catch (NoSuchMethodException e10) {
                    throw new RuntimeException(z.e("Could not instantiate ", str), e10);
                } catch (InvocationTargetException e11) {
                    throw new RuntimeException(z.e("Could not instantiate ", str), e11);
                }
            default:
                return (ComponentRegistrar) this.f7213b;
        }
    }
}
