package w;

import java.util.Arrays;

/* renamed from: w.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2127g extends C2123c {

    /* renamed from: f, reason: collision with root package name */
    public i[] f23946f;

    /* renamed from: g, reason: collision with root package name */
    public i[] f23947g;

    /* renamed from: h, reason: collision with root package name */
    public int f23948h;

    /* renamed from: i, reason: collision with root package name */
    public C2126f f23949i;

    @Override // w.C2123c
    public final i d(boolean[] zArr) {
        int i9 = -1;
        for (int i10 = 0; i10 < this.f23948h; i10++) {
            i[] iVarArr = this.f23946f;
            i iVar = iVarArr[i10];
            if (!zArr[iVar.f23952b]) {
                C2126f c2126f = this.f23949i;
                c2126f.f23944a = iVar;
                int i11 = 8;
                if (i9 == -1) {
                    while (i11 >= 0) {
                        float f9 = c2126f.f23944a.f23958h[i11];
                        if (f9 <= 0.0f) {
                            if (f9 < 0.0f) {
                                i9 = i10;
                                break;
                            }
                            i11--;
                        }
                    }
                } else {
                    i iVar2 = iVarArr[i9];
                    while (true) {
                        if (i11 >= 0) {
                            float f10 = iVar2.f23958h[i11];
                            float f11 = c2126f.f23944a.f23958h[i11];
                            if (f11 == f10) {
                                i11--;
                            } else if (f11 >= f10) {
                            }
                        }
                    }
                }
            }
        }
        if (i9 == -1) {
            return null;
        }
        return this.f23946f[i9];
    }

    @Override // w.C2123c
    public final void h(C2123c c2123c, boolean z9) {
        i iVar = c2123c.f23924a;
        if (iVar == null) {
            return;
        }
        InterfaceC2122b interfaceC2122b = c2123c.f23927d;
        int g9 = interfaceC2122b.g();
        for (int i9 = 0; i9 < g9; i9++) {
            i i10 = interfaceC2122b.i(i9);
            float a5 = interfaceC2122b.a(i9);
            C2126f c2126f = this.f23949i;
            c2126f.f23944a = i10;
            boolean z10 = i10.f23951a;
            float[] fArr = iVar.f23958h;
            if (z10) {
                boolean z11 = true;
                for (int i11 = 0; i11 < 9; i11++) {
                    float[] fArr2 = c2126f.f23944a.f23958h;
                    float f9 = (fArr[i11] * a5) + fArr2[i11];
                    fArr2[i11] = f9;
                    if (Math.abs(f9) < 1.0E-4f) {
                        c2126f.f23944a.f23958h[i11] = 0.0f;
                    } else {
                        z11 = false;
                    }
                }
                if (z11) {
                    c2126f.f23945b.j(c2126f.f23944a);
                }
            } else {
                for (int i12 = 0; i12 < 9; i12++) {
                    float f10 = fArr[i12];
                    if (f10 != 0.0f) {
                        float f11 = f10 * a5;
                        if (Math.abs(f11) < 1.0E-4f) {
                            f11 = 0.0f;
                        }
                        c2126f.f23944a.f23958h[i12] = f11;
                    } else {
                        c2126f.f23944a.f23958h[i12] = 0.0f;
                    }
                }
                i(i10);
            }
            this.f23925b = (c2123c.f23925b * a5) + this.f23925b;
        }
        j(iVar);
    }

    public final void i(i iVar) {
        int i9;
        int i10 = this.f23948h + 1;
        i[] iVarArr = this.f23946f;
        if (i10 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f23946f = iVarArr2;
            this.f23947g = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.f23946f;
        int i11 = this.f23948h;
        iVarArr3[i11] = iVar;
        int i12 = i11 + 1;
        this.f23948h = i12;
        if (i12 > 1 && iVarArr3[i11].f23952b > iVar.f23952b) {
            int i13 = 0;
            while (true) {
                i9 = this.f23948h;
                if (i13 >= i9) {
                    break;
                }
                this.f23947g[i13] = this.f23946f[i13];
                i13++;
            }
            Arrays.sort(this.f23947g, 0, i9, new B.j(16));
            for (int i14 = 0; i14 < this.f23948h; i14++) {
                this.f23946f[i14] = this.f23947g[i14];
            }
        }
        iVar.f23951a = true;
        iVar.a(this);
    }

    public final void j(i iVar) {
        int i9 = 0;
        while (i9 < this.f23948h) {
            if (this.f23946f[i9] == iVar) {
                while (true) {
                    int i10 = this.f23948h;
                    if (i9 < i10 - 1) {
                        i[] iVarArr = this.f23946f;
                        int i11 = i9 + 1;
                        iVarArr[i9] = iVarArr[i11];
                        i9 = i11;
                    } else {
                        this.f23948h = i10 - 1;
                        iVar.f23951a = false;
                        return;
                    }
                }
            } else {
                i9++;
            }
        }
    }

    @Override // w.C2123c
    public final String toString() {
        String str = " goal -> (" + this.f23925b + ") : ";
        for (int i9 = 0; i9 < this.f23948h; i9++) {
            i iVar = this.f23946f[i9];
            C2126f c2126f = this.f23949i;
            c2126f.f23944a = iVar;
            str = str + c2126f + " ";
        }
        return str;
    }
}
