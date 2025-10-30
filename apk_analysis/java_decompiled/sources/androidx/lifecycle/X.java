package androidx.lifecycle;

import m0.C1581d;

/* loaded from: classes.dex */
public class X implements h0 {

    /* renamed from: b, reason: collision with root package name */
    public static X f9851b;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9852a;

    @Override // androidx.lifecycle.h0
    public e0 a(Class cls) {
        switch (this.f9852a) {
            case 0:
                throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
            default:
                try {
                    Object newInstance = cls.getDeclaredConstructor(null).newInstance(null);
                    kotlin.jvm.internal.h.d(newInstance, "{\n                modelC…wInstance()\n            }");
                    return (e0) newInstance;
                } catch (IllegalAccessException e8) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e8);
                } catch (InstantiationException e9) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e9);
                } catch (NoSuchMethodException e10) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e10);
                }
        }
    }

    @Override // androidx.lifecycle.h0
    public e0 b(Class cls, C1581d c1581d) {
        switch (this.f9852a) {
            case 0:
                return new a0();
            default:
                return a(cls);
        }
    }
}
