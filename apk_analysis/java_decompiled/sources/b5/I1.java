package b5;

/* loaded from: classes.dex */
public final class I1 {

    /* renamed from: a, reason: collision with root package name */
    public final J1 f10728a;

    /* renamed from: b, reason: collision with root package name */
    public int f10729b = 1;

    /* renamed from: c, reason: collision with root package name */
    public long f10730c = a();

    public I1(J1 j12) {
        this.f10728a = j12;
    }

    public final long a() {
        J1 j12 = this.f10728a;
        F4.y.h(j12);
        long longValue = ((Long) E.f10692v.a(null)).longValue();
        long longValue2 = ((Long) E.f10694w.a(null)).longValue();
        for (int i9 = 1; i9 < this.f10729b; i9++) {
            longValue += longValue;
            if (longValue >= longValue2) {
                break;
            }
        }
        j12.S().getClass();
        return Math.min(longValue, longValue2) + System.currentTimeMillis();
    }
}
