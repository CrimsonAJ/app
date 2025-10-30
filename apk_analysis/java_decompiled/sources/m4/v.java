package m4;

import j3.InterfaceC1453f;

/* loaded from: classes.dex */
public final class v implements InterfaceC1453f {

    /* renamed from: e, reason: collision with root package name */
    public static final v f20829e = new v(1.0f, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f20830a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20831b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20832c;

    /* renamed from: d, reason: collision with root package name */
    public final float f20833d;

    public v(float f9, int i9, int i10, int i11) {
        this.f20830a = i9;
        this.f20831b = i10;
        this.f20832c = i11;
        this.f20833d = f9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            if (this.f20830a == vVar.f20830a && this.f20831b == vVar.f20831b && this.f20832c == vVar.f20832c && this.f20833d == vVar.f20833d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f20833d) + ((((((217 + this.f20830a) * 31) + this.f20831b) * 31) + this.f20832c) * 31);
    }
}
