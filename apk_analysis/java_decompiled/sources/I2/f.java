package I2;

import A7.h;
import android.graphics.Color;
import u0.z;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f3472a;

    /* renamed from: b, reason: collision with root package name */
    public int f3473b;

    /* renamed from: c, reason: collision with root package name */
    public int f3474c;

    /* renamed from: d, reason: collision with root package name */
    public int f3475d;

    /* renamed from: e, reason: collision with root package name */
    public J2.d f3476e;

    /* renamed from: f, reason: collision with root package name */
    public final J2.c f3477f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3478g;

    /* renamed from: h, reason: collision with root package name */
    public String f3479h;

    /* renamed from: i, reason: collision with root package name */
    public float f3480i;
    public h j;

    public f(int i9, int i10, int i11, int i12, J2.d dVar, J2.c cVar, int i13, String langCode, float f9, int i14) {
        i9 = (i14 & 1) != 0 ? Color.argb(100, 0, 0, 0) : i9;
        i10 = (i14 & 2) != 0 ? -1 : i10;
        i11 = (i14 & 4) != 0 ? 18 : i11;
        i12 = (i14 & 8) != 0 ? 22 : i12;
        dVar = (i14 & 16) != 0 ? J2.d.f4170a : dVar;
        cVar = (i14 & 32) != 0 ? J2.c.f4162b : cVar;
        i13 = (i14 & 64) != 0 ? 0 : i13;
        langCode = (i14 & 128) != 0 ? "" : langCode;
        f9 = (i14 & 256) != 0 ? 0.0f : f9;
        h hVar = new h(0L, 0L);
        kotlin.jvm.internal.h.e(langCode, "langCode");
        this.f3472a = i9;
        this.f3473b = i10;
        this.f3474c = i11;
        this.f3475d = i12;
        this.f3476e = dVar;
        this.f3477f = cVar;
        this.f3478g = i13;
        this.f3479h = langCode;
        this.f3480i = f9;
        this.j = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f3472a == fVar.f3472a && this.f3473b == fVar.f3473b && this.f3474c == fVar.f3474c && this.f3475d == fVar.f3475d && this.f3476e == fVar.f3476e && this.f3477f == fVar.f3477f && this.f3478g == fVar.f3478g && kotlin.jvm.internal.h.a(this.f3479h, fVar.f3479h) && Float.compare(this.f3480i, fVar.f3480i) == 0 && kotlin.jvm.internal.h.a(this.j, fVar.j)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.j.hashCode() + ((Float.floatToIntBits(this.f3480i) + z.c(this.f3479h, (((this.f3477f.hashCode() + ((this.f3476e.hashCode() + (((((((this.f3472a * 31) + this.f3473b) * 31) + this.f3474c) * 31) + this.f3475d) * 31)) * 31)) * 31) + this.f3478g) * 31, 31)) * 31);
    }

    public final String toString() {
        return "PlayerConfig(backgroundColor=" + this.f3472a + ", textColor=" + this.f3473b + ", paddingBottom=" + this.f3474c + ", textSize=" + this.f3475d + ", typeFace=" + this.f3476e + ", defaultQuality=" + this.f3477f + ", defaultResizeMode=" + this.f3478g + ", langCode=" + this.f3479h + ", shadow=" + this.f3480i + ", langIdByEpId=" + this.j + ")";
    }
}
