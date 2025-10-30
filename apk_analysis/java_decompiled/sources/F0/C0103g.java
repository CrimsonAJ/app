package F0;

/* renamed from: F0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0103g {

    /* renamed from: a, reason: collision with root package name */
    public final s4.i f2106a;

    /* renamed from: b, reason: collision with root package name */
    public int f2107b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f2108c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f2109d = -1;

    public C0103g(s4.i iVar) {
        this.f2106a = iVar;
    }

    public final void a() {
        int i9 = this.f2107b;
        if (i9 == 0) {
            return;
        }
        s4.i iVar = this.f2106a;
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 == 3) {
                    ((I) iVar.f22734a).f2055a.d(this.f2108c, this.f2109d, null);
                }
            } else {
                iVar.Q(this.f2108c, this.f2109d);
            }
        } else {
            iVar.N(this.f2108c, this.f2109d);
        }
        this.f2107b = 0;
    }

    public final void b(int i9, int i10) {
        int i11;
        int i12;
        int i13;
        if (this.f2107b == 3 && i9 <= (i12 = this.f2109d + (i11 = this.f2108c)) && (i13 = i9 + i10) >= i11) {
            this.f2108c = Math.min(i9, i11);
            this.f2109d = Math.max(i12, i13) - this.f2108c;
        } else {
            a();
            this.f2108c = i9;
            this.f2109d = i10;
            this.f2107b = 3;
        }
    }

    public final void c(int i9, int i10) {
        a();
        ((I) this.f2106a.f22734a).f2055a.c(i9, i10);
    }
}
