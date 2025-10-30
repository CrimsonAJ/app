package L1;

/* loaded from: classes.dex */
public final class C implements E {

    /* renamed from: a, reason: collision with root package name */
    public final long f4456a;

    public C(long j) {
        this.f4456a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C) && this.f4456a == ((C) obj).f4456a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f4456a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "SelectedPlayer(playerId=" + this.f4456a + ")";
    }
}
