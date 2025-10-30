package o7;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* renamed from: o7.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1711c extends AbstractC1708D {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f21668k = 0;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Class f21669l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AccessibleObject f21670m;

    public C1711c(Constructor constructor, Class cls) {
        this.f21670m = constructor;
        this.f21669l = cls;
    }

    @Override // o7.AbstractC1708D
    public final Object e() {
        AccessibleObject accessibleObject = this.f21670m;
        switch (this.f21668k) {
            case 0:
                return ((Constructor) accessibleObject).newInstance(null);
            default:
                return ((Method) accessibleObject).invoke(null, this.f21669l, Object.class);
        }
    }

    public final String toString() {
        switch (this.f21668k) {
            case 0:
                return this.f21669l.getName();
            default:
                return this.f21669l.getName();
        }
    }

    public C1711c(Method method, Class cls) {
        this.f21670m = method;
        this.f21669l = cls;
    }
}
