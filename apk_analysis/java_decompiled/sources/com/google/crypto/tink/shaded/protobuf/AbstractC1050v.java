package com.google.crypto.tink.shaded.protobuf;

import F0.C0120y;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.crypto.tink.shaded.protobuf.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1050v extends AbstractC1030a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC1050v> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected e0 unknownFields;

    public AbstractC1050v() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = e0.f16346f;
    }

    public static void g(AbstractC1050v abstractC1050v) {
        if (m(abstractC1050v, true)) {
        } else {
            throw new IOException(new d0().getMessage());
        }
    }

    public static AbstractC1050v j(Class cls) {
        AbstractC1050v abstractC1050v = defaultInstanceMap.get(cls);
        if (abstractC1050v == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC1050v = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e8) {
                throw new IllegalStateException("Class initialization cannot fail.", e8);
            }
        }
        if (abstractC1050v == null) {
            AbstractC1050v b9 = ((AbstractC1050v) n0.b(cls)).b();
            if (b9 != null) {
                defaultInstanceMap.put(cls, b9);
                return b9;
            }
            throw new IllegalStateException();
        }
        return abstractC1050v;
    }

    public static Object l(Method method, AbstractC1030a abstractC1030a, Object... objArr) {
        try {
            return method.invoke(abstractC1030a, objArr);
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

    public static final boolean m(AbstractC1050v abstractC1050v, boolean z9) {
        byte byteValue = ((Byte) abstractC1050v.i(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        Y y9 = Y.f16328c;
        y9.getClass();
        boolean c3 = y9.a(abstractC1050v.getClass()).c(abstractC1050v);
        if (z9) {
            abstractC1050v.i(2);
        }
        return c3;
    }

    public static AbstractC1050v r(AbstractC1050v abstractC1050v, AbstractC1037h abstractC1037h, C1043n c1043n) {
        C1036g c1036g = (C1036g) abstractC1037h;
        C1038i h7 = W5.d.h(c1036g.f16354d, c1036g.g(), c1036g.size(), true);
        AbstractC1050v s9 = s(abstractC1050v, h7, c1043n);
        h7.b(0);
        g(s9);
        return s9;
    }

    public static AbstractC1050v s(AbstractC1050v abstractC1050v, W5.d dVar, C1043n c1043n) {
        AbstractC1050v q9 = abstractC1050v.q();
        try {
            Y y9 = Y.f16328c;
            y9.getClass();
            b0 a5 = y9.a(q9.getClass());
            C0120y c0120y = (C0120y) dVar.f7932b;
            if (c0120y == null) {
                c0120y = new C0120y(dVar, (byte) 0);
            }
            a5.f(q9, c0120y, c1043n);
            a5.b(q9);
            return q9;
        } catch (B e8) {
            if (e8.f16285a) {
                throw new IOException(e8.getMessage(), e8);
            }
            throw e8;
        } catch (d0 e9) {
            throw new IOException(e9.getMessage());
        } catch (IOException e10) {
            if (e10.getCause() instanceof B) {
                throw ((B) e10.getCause());
            }
            throw new IOException(e10.getMessage(), e10);
        } catch (RuntimeException e11) {
            if (e11.getCause() instanceof B) {
                throw ((B) e11.getCause());
            }
            throw e11;
        }
    }

    public static void t(Class cls, AbstractC1050v abstractC1050v) {
        abstractC1050v.o();
        defaultInstanceMap.put(cls, abstractC1050v);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1030a
    public final int a(b0 b0Var) {
        int e8;
        int e9;
        if (n()) {
            if (b0Var == null) {
                Y y9 = Y.f16328c;
                y9.getClass();
                e9 = y9.a(getClass()).e(this);
            } else {
                e9 = b0Var.e(this);
            }
            if (e9 >= 0) {
                return e9;
            }
            throw new IllegalStateException(AbstractC0953k1.j(e9, "serialized size must be non-negative, was "));
        }
        int i9 = this.memoizedSerializedSize;
        if ((i9 & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i9 & Integer.MAX_VALUE;
        }
        if (b0Var == null) {
            Y y10 = Y.f16328c;
            y10.getClass();
            e8 = y10.a(getClass()).e(this);
        } else {
            e8 = b0Var.e(this);
        }
        u(e8);
        return e8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Y y9 = Y.f16328c;
        y9.getClass();
        return y9.a(getClass()).g(this, (AbstractC1050v) obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1030a
    public final void f(C1040k c1040k) {
        Y y9 = Y.f16328c;
        y9.getClass();
        b0 a5 = y9.a(getClass());
        K k5 = c1040k.f16377g;
        if (k5 == null) {
            k5 = new K(c1040k);
        }
        a5.i(this, k5);
    }

    public final AbstractC1048t h() {
        return (AbstractC1048t) i(5);
    }

    public final int hashCode() {
        if (n()) {
            Y y9 = Y.f16328c;
            y9.getClass();
            return y9.a(getClass()).j(this);
        }
        if (this.memoizedHashCode == 0) {
            Y y10 = Y.f16328c;
            y10.getClass();
            this.memoizedHashCode = y10.a(getClass()).j(this);
        }
        return this.memoizedHashCode;
    }

    public abstract Object i(int i9);

    @Override // com.google.crypto.tink.shaded.protobuf.P
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final AbstractC1050v b() {
        return (AbstractC1050v) i(6);
    }

    public final boolean n() {
        if ((this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0) {
            return true;
        }
        return false;
    }

    public final void o() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1030a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final AbstractC1048t d() {
        return (AbstractC1048t) i(5);
    }

    public final AbstractC1050v q() {
        return (AbstractC1050v) i(4);
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = Q.f16307a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        Q.c(this, sb, 0);
        return sb.toString();
    }

    public final void u(int i9) {
        if (i9 >= 0) {
            this.memoizedSerializedSize = (i9 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
            return;
        }
        throw new IllegalStateException(AbstractC0953k1.j(i9, "serialized size must be non-negative, was "));
    }

    public final AbstractC1048t v() {
        AbstractC1048t abstractC1048t = (AbstractC1048t) i(5);
        if (!abstractC1048t.f16403a.equals(this)) {
            abstractC1048t.h();
            AbstractC1048t.i(abstractC1048t.f16404b, this);
        }
        return abstractC1048t;
    }
}
