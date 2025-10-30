package z8;

import android.os.Build;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/* loaded from: classes.dex */
public final class K extends C2252a {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f25538h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ K(int i9) {
        super(7);
        this.f25538h = i9;
    }

    @Override // z8.C2252a
    public String d(Method method, int i9) {
        Parameter[] parameters;
        boolean isNamePresent;
        String name;
        switch (this.f25538h) {
            case 1:
                parameters = method.getParameters();
                Parameter parameter = parameters[i9];
                isNamePresent = parameter.isNamePresent();
                if (isNamePresent) {
                    StringBuilder sb = new StringBuilder("parameter '");
                    name = parameter.getName();
                    sb.append(name);
                    sb.append('\'');
                    return sb.toString();
                }
                return super.d(method, i9);
            default:
                return super.d(method, i9);
        }
    }

    @Override // z8.C2252a
    public final Object e(Method method, Class cls, Object obj, Object[] objArr) {
        switch (this.f25538h) {
            case 0:
                if (Build.VERSION.SDK_INT >= 26) {
                    return X.k(method, cls, obj, objArr);
                }
                throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
            default:
                return X.k(method, cls, obj, objArr);
        }
    }

    @Override // z8.C2252a
    public final boolean f(Method method) {
        boolean isDefault;
        boolean isDefault2;
        switch (this.f25538h) {
            case 0:
                isDefault = method.isDefault();
                return isDefault;
            default:
                isDefault2 = method.isDefault();
                return isDefault2;
        }
    }
}
