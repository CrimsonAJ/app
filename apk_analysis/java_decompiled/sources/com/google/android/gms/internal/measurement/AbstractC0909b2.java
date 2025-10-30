package com.google.android.gms.internal.measurement;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.measurement.b2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0909b2 extends N1 {
    private static final Map zzb = new ConcurrentHashMap();
    protected D2 zzc;
    private int zzd;

    public AbstractC0909b2() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = D2.f15200f;
    }

    public static AbstractC0909b2 g(Class cls) {
        Map map = zzb;
        AbstractC0909b2 abstractC0909b2 = (AbstractC0909b2) map.get(cls);
        if (abstractC0909b2 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0909b2 = (AbstractC0909b2) map.get(cls);
            } catch (ClassNotFoundException e8) {
                throw new IllegalStateException("Class initialization cannot fail.", e8);
            }
        }
        if (abstractC0909b2 == null) {
            AbstractC0909b2 abstractC0909b22 = (AbstractC0909b2) ((AbstractC0909b2) I2.f(cls)).m(6);
            if (abstractC0909b22 != null) {
                map.put(cls, abstractC0909b22);
                return abstractC0909b22;
            }
            throw new IllegalStateException();
        }
        return abstractC0909b2;
    }

    public static Object h(Method method, N1 n12, Object... objArr) {
        try {
            return method.invoke(n12, objArr);
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

    public static void j(Class cls, AbstractC0909b2 abstractC0909b2) {
        abstractC0909b2.i();
        zzb.put(cls, abstractC0909b2);
    }

    @Override // com.google.android.gms.internal.measurement.N1
    public final int a(B2 b22) {
        if (l()) {
            int f9 = b22.f(this);
            if (f9 >= 0) {
                return f9;
            }
            throw new IllegalStateException(AbstractC0953k1.j(f9, "serialized size must be non-negative, was "));
        }
        int i9 = this.zzd & Integer.MAX_VALUE;
        if (i9 == Integer.MAX_VALUE) {
            int f10 = b22.f(this);
            if (f10 >= 0) {
                this.zzd = (this.zzd & Integer.MIN_VALUE) | f10;
                return f10;
            }
            throw new IllegalStateException(AbstractC0953k1.j(f10, "serialized size must be non-negative, was "));
        }
        return i9;
    }

    public final int d() {
        if (l()) {
            int f9 = C1023y2.f15696c.a(getClass()).f(this);
            if (f9 >= 0) {
                return f9;
            }
            throw new IllegalStateException(AbstractC0953k1.j(f9, "serialized size must be non-negative, was "));
        }
        int i9 = this.zzd & Integer.MAX_VALUE;
        if (i9 != Integer.MAX_VALUE) {
            return i9;
        }
        int f10 = C1023y2.f15696c.a(getClass()).f(this);
        if (f10 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | f10;
            return f10;
        }
        throw new IllegalStateException(AbstractC0953k1.j(f10, "serialized size must be non-negative, was "));
    }

    public final AbstractC0904a2 e() {
        return (AbstractC0904a2) m(5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C1023y2.f15696c.a(getClass()).h(this, (AbstractC0909b2) obj);
    }

    public final AbstractC0904a2 f() {
        AbstractC0904a2 abstractC0904a2 = (AbstractC0904a2) m(5);
        abstractC0904a2.e(this);
        return abstractC0904a2;
    }

    public final int hashCode() {
        if (!l()) {
            int i9 = this.zza;
            if (i9 == 0) {
                int d9 = C1023y2.f15696c.a(getClass()).d(this);
                this.zza = d9;
                return d9;
            }
            return i9;
        }
        return C1023y2.f15696c.a(getClass()).d(this);
    }

    public final void i() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final void k() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean l() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public abstract Object m(int i9);

    public final String toString() {
        String obj = super.toString();
        char[] cArr = AbstractC0998t2.f15598a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        AbstractC0998t2.c(this, sb, 0);
        return sb.toString();
    }
}
