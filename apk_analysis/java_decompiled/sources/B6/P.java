package B6;

/* loaded from: classes.dex */
public final class P extends K0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f842a;

    /* renamed from: b, reason: collision with root package name */
    public final String f843b;

    /* renamed from: c, reason: collision with root package name */
    public final Q f844c;

    /* renamed from: d, reason: collision with root package name */
    public final C0015c0 f845d;

    /* renamed from: e, reason: collision with root package name */
    public final C0017d0 f846e;

    /* renamed from: f, reason: collision with root package name */
    public final C0025h0 f847f;

    public P(long j, String str, Q q9, C0015c0 c0015c0, C0017d0 c0017d0, C0025h0 c0025h0) {
        this.f842a = j;
        this.f843b = str;
        this.f844c = q9;
        this.f845d = c0015c0;
        this.f846e = c0017d0;
        this.f847f = c0025h0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, B6.O] */
    public final O a() {
        ?? obj = new Object();
        obj.f834a = this.f842a;
        obj.f835b = this.f843b;
        obj.f836c = this.f844c;
        obj.f837d = this.f845d;
        obj.f838e = this.f846e;
        obj.f839f = this.f847f;
        obj.f840g = (byte) 1;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof K0) {
                P p9 = (P) ((K0) obj);
                if (this.f842a == p9.f842a) {
                    if (this.f843b.equals(p9.f843b) && this.f844c.equals(p9.f844c) && this.f845d.equals(p9.f845d)) {
                        C0017d0 c0017d0 = p9.f846e;
                        C0017d0 c0017d02 = this.f846e;
                        if (c0017d02 == null) {
                            if (c0017d0 != null) {
                                return false;
                            }
                        } else if (!c0017d02.equals(c0017d0)) {
                            return false;
                        }
                        C0025h0 c0025h0 = p9.f847f;
                        C0025h0 c0025h02 = this.f847f;
                        if (c0025h02 == null) {
                            if (c0025h0 == null) {
                                return true;
                            }
                            return false;
                        }
                        if (c0025h02.equals(c0025h0)) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        long j = this.f842a;
        int hashCode2 = (((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f843b.hashCode()) * 1000003) ^ this.f844c.hashCode()) * 1000003) ^ this.f845d.hashCode()) * 1000003;
        int i9 = 0;
        C0017d0 c0017d0 = this.f846e;
        if (c0017d0 == null) {
            hashCode = 0;
        } else {
            hashCode = c0017d0.hashCode();
        }
        int i10 = (hashCode2 ^ hashCode) * 1000003;
        C0025h0 c0025h0 = this.f847f;
        if (c0025h0 != null) {
            i9 = c0025h0.hashCode();
        }
        return i10 ^ i9;
    }

    public final String toString() {
        return "Event{timestamp=" + this.f842a + ", type=" + this.f843b + ", app=" + this.f844c + ", device=" + this.f845d + ", log=" + this.f846e + ", rollouts=" + this.f847f + "}";
    }
}
