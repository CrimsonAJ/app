package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;
import m0.C1581d;

/* loaded from: classes.dex */
public final class b0 extends i0 implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public final Application f9863a;

    /* renamed from: b, reason: collision with root package name */
    public final g0 f9864b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f9865c;

    /* renamed from: d, reason: collision with root package name */
    public final D.n f9866d;

    /* renamed from: e, reason: collision with root package name */
    public final N0.f f9867e;

    public b0(Application application, N0.g owner, Bundle bundle) {
        g0 g0Var;
        kotlin.jvm.internal.h.e(owner, "owner");
        this.f9867e = owner.c();
        this.f9866d = owner.x();
        this.f9865c = bundle;
        this.f9863a = application;
        if (application != null) {
            if (g0.f9886d == null) {
                g0.f9886d = new g0(application);
            }
            g0Var = g0.f9886d;
            kotlin.jvm.internal.h.b(g0Var);
        } else {
            g0Var = new g0(null);
        }
        this.f9864b = g0Var;
    }

    @Override // androidx.lifecycle.h0
    public final e0 a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.h0
    public final e0 b(Class cls, C1581d c1581d) {
        Constructor a5;
        f0 f0Var = f0.f9884b;
        LinkedHashMap linkedHashMap = c1581d.f20661a;
        String str = (String) linkedHashMap.get(f0Var);
        if (str != null) {
            if (linkedHashMap.get(Y.f9853a) != null && linkedHashMap.get(Y.f9854b) != null) {
                Application application = (Application) linkedHashMap.get(f0.f9883a);
                boolean isAssignableFrom = AbstractC0540a.class.isAssignableFrom(cls);
                if (isAssignableFrom && application != null) {
                    a5 = c0.a(cls, c0.f9870a);
                } else {
                    a5 = c0.a(cls, c0.f9871b);
                }
                if (a5 == null) {
                    return this.f9864b.b(cls, c1581d);
                }
                if (isAssignableFrom && application != null) {
                    return c0.b(cls, a5, application, Y.d(c1581d));
                }
                return c0.b(cls, a5, Y.d(c1581d));
            }
            if (this.f9866d != null) {
                return d(cls, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @Override // androidx.lifecycle.i0
    public final void c(e0 e0Var) {
        D.n nVar = this.f9866d;
        if (nVar != null) {
            N0.f fVar = this.f9867e;
            kotlin.jvm.internal.h.b(fVar);
            Y.a(e0Var, fVar, nVar);
        }
    }

    public final e0 d(Class cls, String str) {
        Constructor a5;
        e0 b9;
        D.n nVar = this.f9866d;
        if (nVar != null) {
            boolean isAssignableFrom = AbstractC0540a.class.isAssignableFrom(cls);
            Application application = this.f9863a;
            if (isAssignableFrom && application != null) {
                a5 = c0.a(cls, c0.f9870a);
            } else {
                a5 = c0.a(cls, c0.f9871b);
            }
            if (a5 == null) {
                if (application != null) {
                    return this.f9864b.a(cls);
                }
                if (X.f9851b == null) {
                    X.f9851b = new X(1);
                }
                X x5 = X.f9851b;
                kotlin.jvm.internal.h.b(x5);
                return x5.a(cls);
            }
            N0.f fVar = this.f9867e;
            kotlin.jvm.internal.h.b(fVar);
            W b10 = Y.b(fVar, nVar, str, this.f9865c);
            V v8 = b10.f9849b;
            if (isAssignableFrom && application != null) {
                b9 = c0.b(cls, a5, application, v8);
            } else {
                b9 = c0.b(cls, a5, v8);
            }
            b9.c(b10, "androidx.lifecycle.savedstate.vm.tag");
            return b9;
        }
        throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }
}
