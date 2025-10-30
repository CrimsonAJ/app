package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.o2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0857o2 extends J {
    @Override // com.google.android.gms.internal.cast.J
    public final C0845l2 d(AbstractC0849m2 abstractC0849m2) {
        C0845l2 c0845l2;
        C0845l2 c0845l22 = C0845l2.f14910d;
        synchronized (abstractC0849m2) {
            try {
                c0845l2 = abstractC0849m2.f14966e;
                if (c0845l2 != c0845l22) {
                    abstractC0849m2.f14966e = c0845l22;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0845l2;
    }

    @Override // com.google.android.gms.internal.cast.J
    public final C0865q2 k(AbstractC0849m2 abstractC0849m2) {
        C0865q2 c0865q2;
        C0865q2 c0865q22 = C0865q2.f14957c;
        synchronized (abstractC0849m2) {
            try {
                c0865q2 = abstractC0849m2.f14967f;
                if (c0865q2 != c0865q22) {
                    abstractC0849m2.f14967f = c0865q22;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0865q2;
    }

    @Override // com.google.android.gms.internal.cast.J
    public final void m(C0865q2 c0865q2, C0865q2 c0865q22) {
        c0865q2.f14959b = c0865q22;
    }

    @Override // com.google.android.gms.internal.cast.J
    public final void o(C0865q2 c0865q2, Thread thread) {
        c0865q2.f14958a = thread;
    }

    @Override // com.google.android.gms.internal.cast.J
    public final boolean q(AbstractC0849m2 abstractC0849m2, C0845l2 c0845l2, C0845l2 c0845l22) {
        synchronized (abstractC0849m2) {
            try {
                if (abstractC0849m2.f14966e == c0845l2) {
                    abstractC0849m2.f14966e = c0845l22;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.cast.J
    public final boolean r(AbstractC0868r2 abstractC0868r2, Object obj, Object obj2) {
        synchronized (abstractC0868r2) {
            try {
                if (abstractC0868r2.f14965d == obj) {
                    abstractC0868r2.f14965d = obj2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.cast.J
    public final boolean s(AbstractC0868r2 abstractC0868r2, C0865q2 c0865q2, C0865q2 c0865q22) {
        synchronized (abstractC0868r2) {
            try {
                if (abstractC0868r2.f14967f == c0865q2) {
                    abstractC0868r2.f14967f = c0865q22;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
