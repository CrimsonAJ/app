package co.notix;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class lo extends mo {

    /* renamed from: a, reason: collision with root package name */
    public final long f12735a;

    public /* synthetic */ lo() {
        this(TimeUnit.HOURS.toMillis(12L));
    }

    @Override // co.notix.mo
    public final long a(int i9) {
        long j = i9 * 2000;
        long j4 = this.f12735a;
        return j > j4 ? j4 : j;
    }

    public lo(long j) {
        super(0);
        this.f12735a = j;
    }
}
