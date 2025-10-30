package e3;

import h3.InterfaceC1276a;
import java.util.HashMap;

/* renamed from: e3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1142b {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1276a f17144a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f17145b;

    public C1142b(InterfaceC1276a interfaceC1276a, HashMap hashMap) {
        this.f17144a = interfaceC1276a;
        this.f17145b = hashMap;
    }

    public final long a(V2.d dVar, long j, int i9) {
        long j4;
        long l9 = j - this.f17144a.l();
        c cVar = (c) this.f17145b.get(dVar);
        long j9 = cVar.f17146a;
        int i10 = i9 - 1;
        if (j9 > 1) {
            j4 = j9;
        } else {
            j4 = 2;
        }
        return Math.min(Math.max((long) (Math.pow(3.0d, i10) * j9 * Math.max(1.0d, Math.log(10000.0d) / Math.log(j4 * i10))), l9), cVar.f17147b);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C1142b) {
                C1142b c1142b = (C1142b) obj;
                if (this.f17144a.equals(c1142b.f17144a) && this.f17145b.equals(c1142b.f17145b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f17144a.hashCode() ^ 1000003) * 1000003) ^ this.f17145b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f17144a + ", values=" + this.f17145b + "}";
    }
}
