package S5;

import O5.r;
import com.google.android.gms.internal.measurement.AbstractC1002u1;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class l extends AbstractC1002u1 {

    /* renamed from: g, reason: collision with root package name */
    public static final Unsafe f6948g;

    /* renamed from: h, reason: collision with root package name */
    public static final long f6949h;

    /* renamed from: i, reason: collision with root package name */
    public static final long f6950i;
    public static final long j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f6951k;

    /* renamed from: l, reason: collision with root package name */
    public static final long f6952l;

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.security.PrivilegedExceptionAction] */
    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e8) {
                throw new RuntimeException("Could not initialize intrinsics", e8.getCause());
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged((PrivilegedExceptionAction) new Object());
        }
        try {
            f6950i = unsafe.objectFieldOffset(n.class.getDeclaredField("c"));
            f6949h = unsafe.objectFieldOffset(n.class.getDeclaredField("b"));
            j = unsafe.objectFieldOffset(n.class.getDeclaredField("a"));
            f6951k = unsafe.objectFieldOffset(m.class.getDeclaredField("a"));
            f6952l = unsafe.objectFieldOffset(m.class.getDeclaredField("b"));
            f6948g = unsafe;
        } catch (Exception e9) {
            Object obj = r.f5512a;
            if (!(e9 instanceof RuntimeException)) {
                throw new RuntimeException(e9);
            }
            throw ((RuntimeException) e9);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1002u1
    public final d C(n nVar) {
        d dVar;
        d dVar2 = d.f6940d;
        do {
            dVar = nVar.f6961b;
            if (dVar2 == dVar) {
                break;
            }
        } while (!b(nVar, dVar, dVar2));
        return dVar;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1002u1
    public final m D(n nVar) {
        m mVar;
        m mVar2 = m.f6953c;
        do {
            mVar = nVar.f6962c;
            if (mVar2 == mVar) {
                break;
            }
        } while (!f(nVar, mVar, mVar2));
        return mVar;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1002u1
    public final void S(m mVar, m mVar2) {
        f6948g.putObject(mVar, f6952l, mVar2);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1002u1
    public final void U(m mVar, Thread thread) {
        f6948g.putObject(mVar, f6951k, thread);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1002u1
    public final boolean b(n nVar, d dVar, d dVar2) {
        return i.a(f6948g, nVar, f6949h, dVar, dVar2);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1002u1
    public final boolean d(n nVar, Object obj, Object obj2) {
        return j.a(f6948g, nVar, j, obj, obj2);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1002u1
    public final boolean f(n nVar, m mVar, m mVar2) {
        return h.a(f6948g, nVar, f6950i, mVar, mVar2);
    }
}
