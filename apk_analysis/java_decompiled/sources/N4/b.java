package N4;

import F4.y;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class b extends S4.c implements a {

    /* renamed from: f, reason: collision with root package name */
    public final Object f5212f;

    public b(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper", 1);
        this.f5212f = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [S4.a, N4.a] */
    public static a h1(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        if (queryLocalInterface instanceof a) {
            return (a) queryLocalInterface;
        }
        return new S4.a(iBinder, "com.google.android.gms.dynamic.IObjectWrapper", 2);
    }

    public static Object i1(a aVar) {
        if (aVar instanceof b) {
            return ((b) aVar).f5212f;
        }
        IBinder asBinder = aVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i9 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i9++;
                field = field2;
            }
        }
        if (i9 == 1) {
            y.h(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (IllegalAccessException e8) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e8);
                } catch (NullPointerException e9) {
                    throw new IllegalArgumentException("Binder object is null.", e9);
                }
            }
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        throw new IllegalArgumentException(AbstractC0953k1.j(declaredFields.length, "Unexpected number of IObjectWrapper declared fields: "));
    }
}
