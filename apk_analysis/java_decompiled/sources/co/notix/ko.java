package co.notix;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class ko extends mo {

    /* renamed from: a, reason: collision with root package name */
    public final long f12636a;

    /* renamed from: b, reason: collision with root package name */
    public final long f12637b;

    public /* synthetic */ ko(long j) {
        this(j, TimeUnit.HOURS.toMillis(12L));
    }

    @Override // co.notix.mo
    public final long a(int i9) {
        if (i9 == 0) {
            return 0L;
        }
        long pow = (long) (Math.pow(2.0d, i9 - 1) * this.f12636a);
        long j = this.f12637b;
        return pow > j ? j : pow;
    }

    public ko(long j, long j4) {
        super(0);
        this.f12636a = j;
        this.f12637b = j4;
    }
}
