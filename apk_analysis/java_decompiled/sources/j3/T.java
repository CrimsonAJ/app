package j3;

/* loaded from: classes.dex */
public final class T implements InterfaceC1453f {

    /* renamed from: f, reason: collision with root package name */
    public static final T f19469f = new T(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f);

    /* renamed from: a, reason: collision with root package name */
    public final long f19470a;

    /* renamed from: b, reason: collision with root package name */
    public final long f19471b;

    /* renamed from: c, reason: collision with root package name */
    public final long f19472c;

    /* renamed from: d, reason: collision with root package name */
    public final float f19473d;

    /* renamed from: e, reason: collision with root package name */
    public final float f19474e;

    public T(long j, long j4, long j9, float f9, float f10) {
        this.f19470a = j;
        this.f19471b = j4;
        this.f19472c = j9;
        this.f19473d = f9;
        this.f19474e = f10;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [R3.t, java.lang.Object] */
    public final R3.t a() {
        ?? obj = new Object();
        obj.f6651a = this.f19470a;
        obj.f6652b = this.f19471b;
        obj.f6653c = this.f19472c;
        obj.f6654d = this.f19473d;
        obj.f6655e = this.f19474e;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T)) {
            return false;
        }
        T t7 = (T) obj;
        if (this.f19470a == t7.f19470a && this.f19471b == t7.f19471b && this.f19472c == t7.f19472c && this.f19473d == t7.f19473d && this.f19474e == t7.f19474e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        long j = this.f19470a;
        long j4 = this.f19471b;
        int i10 = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j9 = this.f19472c;
        int i11 = (i10 + ((int) ((j9 >>> 32) ^ j9))) * 31;
        float f9 = this.f19473d;
        int i12 = 0;
        if (f9 != 0.0f) {
            i9 = Float.floatToIntBits(f9);
        } else {
            i9 = 0;
        }
        int i13 = (i11 + i9) * 31;
        float f10 = this.f19474e;
        if (f10 != 0.0f) {
            i12 = Float.floatToIntBits(f10);
        }
        return i13 + i12;
    }
}
