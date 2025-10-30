package co.notix;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final int f12844a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12845b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12846c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12847d;

    /* renamed from: e, reason: collision with root package name */
    public final int f12848e;

    /* renamed from: f, reason: collision with root package name */
    public final int f12849f;

    /* renamed from: g, reason: collision with root package name */
    public final int f12850g;

    /* renamed from: h, reason: collision with root package name */
    public final int f12851h;

    /* renamed from: i, reason: collision with root package name */
    public final int f12852i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final int f12853k;

    /* renamed from: l, reason: collision with root package name */
    public final int f12854l;

    public o(int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20) {
        this.f12844a = i9;
        this.f12845b = i10;
        this.f12846c = i11;
        this.f12847d = i12;
        this.f12848e = i13;
        this.f12849f = i14;
        this.f12850g = i15;
        this.f12851h = i16;
        this.f12852i = i17;
        this.j = i18;
        this.f12853k = i19;
        this.f12854l = i20;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f12844a == oVar.f12844a && this.f12845b == oVar.f12845b && this.f12846c == oVar.f12846c && this.f12847d == oVar.f12847d && this.f12848e == oVar.f12848e && this.f12849f == oVar.f12849f && this.f12850g == oVar.f12850g && this.f12851h == oVar.f12851h && this.f12852i == oVar.f12852i && this.j == oVar.j && this.f12853k == oVar.f12853k && this.f12854l == oVar.f12854l;
    }

    public final int hashCode() {
        return this.f12854l + ((this.f12853k + ((this.j + ((this.f12852i + ((this.f12851h + ((this.f12850g + ((this.f12849f + ((this.f12848e + ((this.f12847d + ((this.f12846c + ((this.f12845b + (this.f12844a * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Cnt(pnt=" + this.f12844a + ", pnd=" + this.f12845b + ", lnt=" + this.f12846c + ", lnd=" + this.f12847d + ", rnt=" + this.f12848e + ", rnd=" + this.f12849f + ", rst=" + this.f12850g + ", rsd=" + this.f12851h + ", int=" + this.f12852i + ", ind=" + this.j + ", ist=" + this.f12853k + ", isd=" + this.f12854l + ')';
    }
}
