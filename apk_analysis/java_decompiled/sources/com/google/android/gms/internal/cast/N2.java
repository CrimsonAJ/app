package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class N2 extends E2 {
    private static final Map zzb = new ConcurrentHashMap();
    protected j3 zzc;
    private int zzd;

    public N2() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = j3.f14893e;
    }

    public static Object c(Method method, E2 e22, Object... objArr) {
        try {
            return method.invoke(e22, objArr);
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

    public static void e(Class cls, N2 n22) {
        n22.d();
        zzb.put(cls, n22);
    }

    public static N2 k(Class cls) {
        Map map = zzb;
        N2 n22 = (N2) map.get(cls);
        if (n22 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                n22 = (N2) map.get(cls);
            } catch (ClassNotFoundException e8) {
                throw new IllegalStateException("Class initialization cannot fail.", e8);
            }
        }
        if (n22 == null) {
            N2 n23 = (N2) ((N2) o3.f(cls)).h(6, null);
            if (n23 != null) {
                map.put(cls, n23);
                return n23;
            }
            throw new IllegalStateException();
        }
        return n22;
    }

    @Override // com.google.android.gms.internal.cast.E2
    public final int a(g3 g3Var) {
        if (g()) {
            int c3 = g3Var.c(this);
            if (c3 >= 0) {
                return c3;
            }
            throw new IllegalStateException(AbstractC0953k1.j(c3, "serialized size must be non-negative, was "));
        }
        int i9 = this.zzd & Integer.MAX_VALUE;
        if (i9 == Integer.MAX_VALUE) {
            int c9 = g3Var.c(this);
            if (c9 >= 0) {
                this.zzd = (this.zzd & Integer.MIN_VALUE) | c9;
                return c9;
            }
            throw new IllegalStateException(AbstractC0953k1.j(c9, "serialized size must be non-negative, was "));
        }
        return i9;
    }

    public final void d() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return d3.f14823c.a(getClass()).e(this, (N2) obj);
    }

    public final void f() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean g() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public abstract Object h(int i9, N2 n22);

    public final int hashCode() {
        if (!g()) {
            int i9 = this.zza;
            if (i9 == 0) {
                int g9 = d3.f14823c.a(getClass()).g(this);
                this.zza = g9;
                return g9;
            }
            return i9;
        }
        return d3.f14823c.a(getClass()).g(this);
    }

    public final int i() {
        if (g()) {
            int c3 = d3.f14823c.a(getClass()).c(this);
            if (c3 >= 0) {
                return c3;
            }
            throw new IllegalStateException(AbstractC0953k1.j(c3, "serialized size must be non-negative, was "));
        }
        int i9 = this.zzd & Integer.MAX_VALUE;
        if (i9 != Integer.MAX_VALUE) {
            return i9;
        }
        int c9 = d3.f14823c.a(getClass()).c(this);
        if (c9 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | c9;
            return c9;
        }
        throw new IllegalStateException(AbstractC0953k1.j(c9, "serialized size must be non-negative, was "));
    }

    public final M2 j() {
        return (M2) h(5, null);
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = Z2.f14801a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        Z2.c(this, sb, 0);
        return sb.toString();
    }
}
