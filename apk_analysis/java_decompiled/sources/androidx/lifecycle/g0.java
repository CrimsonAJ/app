package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import m0.C1581d;

/* loaded from: classes.dex */
public final class g0 extends X {

    /* renamed from: d, reason: collision with root package name */
    public static g0 f9886d;

    /* renamed from: c, reason: collision with root package name */
    public final Application f9887c;

    public g0(Application application) {
        super(1);
        this.f9887c = application;
    }

    @Override // androidx.lifecycle.X, androidx.lifecycle.h0
    public final e0 a(Class cls) {
        Application application = this.f9887c;
        if (application != null) {
            return c(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // androidx.lifecycle.X, androidx.lifecycle.h0
    public final e0 b(Class cls, C1581d c1581d) {
        if (this.f9887c != null) {
            return a(cls);
        }
        Application application = (Application) c1581d.f20661a.get(f0.f9883a);
        if (application != null) {
            return c(cls, application);
        }
        if (!AbstractC0540a.class.isAssignableFrom(cls)) {
            return super.a(cls);
        }
        throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
    }

    public final e0 c(Class cls, Application application) {
        if (AbstractC0540a.class.isAssignableFrom(cls)) {
            try {
                e0 e0Var = (e0) cls.getConstructor(Application.class).newInstance(application);
                kotlin.jvm.internal.h.d(e0Var, "{\n                try {\n…          }\n            }");
                return e0Var;
            } catch (IllegalAccessException e8) {
                throw new RuntimeException("Cannot create an instance of " + cls, e8);
            } catch (InstantiationException e9) {
                throw new RuntimeException("Cannot create an instance of " + cls, e9);
            } catch (NoSuchMethodException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            }
        }
        return super.a(cls);
    }
}
