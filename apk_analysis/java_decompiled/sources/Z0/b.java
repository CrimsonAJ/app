package Z0;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import s.C1935e;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final C1935e f8914a;

    /* renamed from: b, reason: collision with root package name */
    public final C1935e f8915b;

    /* renamed from: c, reason: collision with root package name */
    public final C1935e f8916c;

    public b(C1935e c1935e, C1935e c1935e2, C1935e c1935e3) {
        this.f8914a = c1935e;
        this.f8915b = c1935e2;
        this.f8916c = c1935e3;
    }

    public abstract c a();

    public final Class b(Class cls) {
        String name = cls.getName();
        C1935e c1935e = this.f8916c;
        Class cls2 = (Class) c1935e.get(name);
        if (cls2 == null) {
            Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
            c1935e.put(cls.getName(), cls3);
            return cls3;
        }
        return cls2;
    }

    public final Method c(String str) {
        C1935e c1935e = this.f8914a;
        Method method = (Method) c1935e.get(str);
        if (method == null) {
            System.currentTimeMillis();
            Method declaredMethod = Class.forName(str, true, b.class.getClassLoader()).getDeclaredMethod("read", b.class);
            c1935e.put(str, declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Method d(Class cls) {
        String name = cls.getName();
        C1935e c1935e = this.f8915b;
        Method method = (Method) c1935e.get(name);
        if (method == null) {
            Class b9 = b(cls);
            System.currentTimeMillis();
            Method declaredMethod = b9.getDeclaredMethod("write", cls, b.class);
            c1935e.put(cls.getName(), declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public abstract boolean e(int i9);

    public final int f(int i9, int i10) {
        if (!e(i10)) {
            return i9;
        }
        return ((c) this).f8918e.readInt();
    }

    public final Parcelable g(Parcelable parcelable, int i9) {
        if (!e(i9)) {
            return parcelable;
        }
        return ((c) this).f8918e.readParcelable(c.class.getClassLoader());
    }

    public final d h() {
        String readString = ((c) this).f8918e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (d) c(readString).invoke(null, a());
        } catch (ClassNotFoundException e8) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e8);
        } catch (IllegalAccessException e9) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e9);
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e10);
        } catch (InvocationTargetException e11) {
            if (e11.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e11.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e11);
        }
    }

    public abstract void i(int i9);

    public final void j(int i9, int i10) {
        i(i10);
        ((c) this).f8918e.writeInt(i9);
    }

    public final void k(Parcelable parcelable, int i9) {
        i(i9);
        ((c) this).f8918e.writeParcelable(parcelable, 0);
    }

    public final void l(d dVar) {
        if (dVar == null) {
            ((c) this).f8918e.writeString(null);
            return;
        }
        try {
            ((c) this).f8918e.writeString(b(dVar.getClass()).getName());
            c a5 = a();
            try {
                d(dVar.getClass()).invoke(null, dVar, a5);
                int i9 = a5.f8922i;
                if (i9 >= 0) {
                    int i10 = a5.f8917d.get(i9);
                    Parcel parcel = a5.f8918e;
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i10);
                    parcel.writeInt(dataPosition - i10);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e8) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e8);
            } catch (IllegalAccessException e9) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e9);
            } catch (NoSuchMethodException e10) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e10);
            } catch (InvocationTargetException e11) {
                if (e11.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e11.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e11);
            }
        } catch (ClassNotFoundException e12) {
            throw new RuntimeException(dVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e12);
        }
    }
}
