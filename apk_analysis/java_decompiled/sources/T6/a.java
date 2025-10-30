package T6;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f7209a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7210b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7211c;

    public a(long j, String str, long j4) {
        this.f7209a = str;
        this.f7210b = j;
        this.f7211c = j4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f7209a.equals(aVar.f7209a) && this.f7210b == aVar.f7210b && this.f7211c == aVar.f7211c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f7209a.hashCode() ^ 1000003) * 1000003;
        long j = this.f7210b;
        long j4 = this.f7211c;
        return ((hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j4 ^ (j4 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationTokenResult{token=");
        sb.append(this.f7209a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.f7210b);
        sb.append(", tokenCreationTimestamp=");
        return A0.a.o(sb, this.f7211c, "}");
    }
}
