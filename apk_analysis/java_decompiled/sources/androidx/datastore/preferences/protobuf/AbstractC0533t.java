package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: androidx.datastore.preferences.protobuf.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0533t extends AbstractC0515a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC0533t> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected a0 unknownFields;

    public AbstractC0533t() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = a0.f9682f;
    }

    public static AbstractC0533t d(Class cls) {
        AbstractC0533t abstractC0533t = defaultInstanceMap.get(cls);
        if (abstractC0533t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0533t = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e8) {
                throw new IllegalStateException("Class initialization cannot fail.", e8);
            }
        }
        if (abstractC0533t == null) {
            AbstractC0533t abstractC0533t2 = (AbstractC0533t) ((AbstractC0533t) g0.d(cls)).c(6);
            if (abstractC0533t2 != null) {
                defaultInstanceMap.put(cls, abstractC0533t2);
                return abstractC0533t2;
            }
            throw new IllegalStateException();
        }
        return abstractC0533t;
    }

    public static Object e(Method method, AbstractC0515a abstractC0515a, Object... objArr) {
        try {
            return method.invoke(abstractC0515a, objArr);
        } catch (IllegalAccessException e8) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e8);
        } catch (InvocationTargetException e9) {
            Throwable cause = e9.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static final boolean f(AbstractC0533t abstractC0533t, boolean z9) {
        byte byteValue = ((Byte) abstractC0533t.c(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        P p9 = P.f9654c;
        p9.getClass();
        boolean c3 = p9.a(abstractC0533t.getClass()).c(abstractC0533t);
        if (z9) {
            abstractC0533t.c(2);
        }
        return c3;
    }

    public static void j(Class cls, AbstractC0533t abstractC0533t) {
        abstractC0533t.h();
        defaultInstanceMap.put(cls, abstractC0533t);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0515a
    public final int a(T t7) {
        int i9;
        int i10;
        if (g()) {
            if (t7 == null) {
                P p9 = P.f9654c;
                p9.getClass();
                i10 = p9.a(getClass()).i(this);
            } else {
                i10 = t7.i(this);
            }
            if (i10 >= 0) {
                return i10;
            }
            throw new IllegalStateException(AbstractC0953k1.j(i10, "serialized size must be non-negative, was "));
        }
        int i11 = this.memoizedSerializedSize;
        if ((i11 & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i11 & Integer.MAX_VALUE;
        }
        if (t7 == null) {
            P p10 = P.f9654c;
            p10.getClass();
            i9 = p10.a(getClass()).i(this);
        } else {
            i9 = t7.i(this);
        }
        k(i9);
        return i9;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0515a
    public final void b(C0524j c0524j) {
        P p9 = P.f9654c;
        p9.getClass();
        T a5 = p9.a(getClass());
        C c3 = c0524j.f9728i;
        if (c3 == null) {
            c3 = new C(c0524j);
        }
        a5.f(this, c3);
    }

    public abstract Object c(int i9);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        P p9 = P.f9654c;
        p9.getClass();
        return p9.a(getClass()).h(this, (AbstractC0533t) obj);
    }

    public final boolean g() {
        if ((this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0) {
            return true;
        }
        return false;
    }

    public final void h() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (g()) {
            P p9 = P.f9654c;
            p9.getClass();
            return p9.a(getClass()).g(this);
        }
        if (this.memoizedHashCode == 0) {
            P p10 = P.f9654c;
            p10.getClass();
            this.memoizedHashCode = p10.a(getClass()).g(this);
        }
        return this.memoizedHashCode;
    }

    public final AbstractC0533t i() {
        return (AbstractC0533t) c(4);
    }

    public final void k(int i9) {
        if (i9 >= 0) {
            this.memoizedSerializedSize = (i9 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
            return;
        }
        throw new IllegalStateException(AbstractC0953k1.j(i9, "serialized size must be non-negative, was "));
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = J.f9634a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        J.c(this, sb, 0);
        return sb.toString();
    }
}
