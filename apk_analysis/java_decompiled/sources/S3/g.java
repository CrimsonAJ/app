package S3;

import android.os.SystemClock;
import java.util.List;

/* loaded from: classes.dex */
public final class g extends i4.c {

    /* renamed from: g, reason: collision with root package name */
    public int f6763g;

    @Override // i4.q
    public final void a(long j, long j4, long j9, List list, P3.l[] lVarArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!h(elapsedRealtime, this.f6763g)) {
            return;
        }
        for (int i9 = this.f18505b - 1; i9 >= 0; i9--) {
            if (!h(elapsedRealtime, i9)) {
                this.f6763g = i9;
                return;
            }
        }
        throw new IllegalStateException();
    }

    @Override // i4.q
    public final int o() {
        return 0;
    }

    @Override // i4.q
    public final int p() {
        return this.f6763g;
    }

    @Override // i4.q
    public final Object r() {
        return null;
    }
}
