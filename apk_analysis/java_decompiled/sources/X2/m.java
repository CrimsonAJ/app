package X2;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class m extends w {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f8384a;

    public m(ArrayList arrayList) {
        this.f8384a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w) {
            return this.f8384a.equals(((m) ((w) obj)).f8384a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8384a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f8384a + "}";
    }
}
