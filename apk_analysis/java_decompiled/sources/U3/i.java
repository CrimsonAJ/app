package U3;

import com.google.android.gms.internal.measurement.D1;
import java.util.Locale;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f7385g = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7386a;

    /* renamed from: b, reason: collision with root package name */
    public final byte f7387b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7388c;

    /* renamed from: d, reason: collision with root package name */
    public final long f7389d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7390e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f7391f;

    public i(h hVar) {
        this.f7386a = hVar.f7379a;
        this.f7387b = hVar.f7380b;
        this.f7388c = hVar.f7381c;
        this.f7389d = hVar.f7382d;
        this.f7390e = hVar.f7383e;
        this.f7391f = hVar.f7384f;
    }

    public static int a(int i9) {
        return D1.F(i9 + 1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.f7387b == iVar.f7387b && this.f7388c == iVar.f7388c && this.f7386a == iVar.f7386a && this.f7389d == iVar.f7389d && this.f7390e == iVar.f7390e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9 = (((((527 + this.f7387b) * 31) + this.f7388c) * 31) + (this.f7386a ? 1 : 0)) * 31;
        long j = this.f7389d;
        return ((i9 + ((int) (j ^ (j >>> 32)))) * 31) + this.f7390e;
    }

    public final String toString() {
        Object[] objArr = {Byte.valueOf(this.f7387b), Integer.valueOf(this.f7388c), Long.valueOf(this.f7389d), Integer.valueOf(this.f7390e), Boolean.valueOf(this.f7386a)};
        int i9 = l4.y.f20553a;
        return String.format(Locale.US, "RtpPacket(payloadType=%d, seq=%d, timestamp=%d, ssrc=%x, marker=%b)", objArr);
    }
}
