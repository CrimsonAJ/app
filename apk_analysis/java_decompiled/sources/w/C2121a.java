package w;

import com.google.android.gms.internal.measurement.AbstractC0953k1;
import com.google.firebase.messaging.s;
import java.util.Arrays;

/* renamed from: w.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2121a implements InterfaceC2122b {

    /* renamed from: b, reason: collision with root package name */
    public final C2123c f23916b;

    /* renamed from: c, reason: collision with root package name */
    public final s f23917c;

    /* renamed from: a, reason: collision with root package name */
    public int f23915a = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f23918d = 8;

    /* renamed from: e, reason: collision with root package name */
    public int[] f23919e = new int[8];

    /* renamed from: f, reason: collision with root package name */
    public int[] f23920f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    public float[] f23921g = new float[8];

    /* renamed from: h, reason: collision with root package name */
    public int f23922h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f23923i = -1;
    public boolean j = false;

    public C2121a(C2123c c2123c, s sVar) {
        this.f23916b = c2123c;
        this.f23917c = sVar;
    }

    @Override // w.InterfaceC2122b
    public final float a(int i9) {
        int i10 = this.f23922h;
        for (int i11 = 0; i10 != -1 && i11 < this.f23915a; i11++) {
            if (i11 == i9) {
                return this.f23921g[i10];
            }
            i10 = this.f23920f[i10];
        }
        return 0.0f;
    }

    @Override // w.InterfaceC2122b
    public final void b(i iVar, float f9) {
        if (f9 == 0.0f) {
            d(iVar, true);
            return;
        }
        int i9 = this.f23922h;
        C2123c c2123c = this.f23916b;
        if (i9 == -1) {
            this.f23922h = 0;
            this.f23921g[0] = f9;
            this.f23919e[0] = iVar.f23952b;
            this.f23920f[0] = -1;
            iVar.f23960k++;
            iVar.a(c2123c);
            this.f23915a++;
            if (!this.j) {
                int i10 = this.f23923i + 1;
                this.f23923i = i10;
                int[] iArr = this.f23919e;
                if (i10 >= iArr.length) {
                    this.j = true;
                    this.f23923i = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i11 = -1;
        for (int i12 = 0; i9 != -1 && i12 < this.f23915a; i12++) {
            int i13 = this.f23919e[i9];
            int i14 = iVar.f23952b;
            if (i13 == i14) {
                this.f23921g[i9] = f9;
                return;
            }
            if (i13 < i14) {
                i11 = i9;
            }
            i9 = this.f23920f[i9];
        }
        int i15 = this.f23923i;
        int i16 = i15 + 1;
        if (this.j) {
            int[] iArr2 = this.f23919e;
            if (iArr2[i15] != -1) {
                i15 = iArr2.length;
            }
        } else {
            i15 = i16;
        }
        int[] iArr3 = this.f23919e;
        if (i15 >= iArr3.length && this.f23915a < iArr3.length) {
            int i17 = 0;
            while (true) {
                int[] iArr4 = this.f23919e;
                if (i17 >= iArr4.length) {
                    break;
                }
                if (iArr4[i17] == -1) {
                    i15 = i17;
                    break;
                }
                i17++;
            }
        }
        int[] iArr5 = this.f23919e;
        if (i15 >= iArr5.length) {
            i15 = iArr5.length;
            int i18 = this.f23918d * 2;
            this.f23918d = i18;
            this.j = false;
            this.f23923i = i15 - 1;
            this.f23921g = Arrays.copyOf(this.f23921g, i18);
            this.f23919e = Arrays.copyOf(this.f23919e, this.f23918d);
            this.f23920f = Arrays.copyOf(this.f23920f, this.f23918d);
        }
        this.f23919e[i15] = iVar.f23952b;
        this.f23921g[i15] = f9;
        if (i11 != -1) {
            int[] iArr6 = this.f23920f;
            iArr6[i15] = iArr6[i11];
            iArr6[i11] = i15;
        } else {
            this.f23920f[i15] = this.f23922h;
            this.f23922h = i15;
        }
        iVar.f23960k++;
        iVar.a(c2123c);
        int i19 = this.f23915a + 1;
        this.f23915a = i19;
        if (!this.j) {
            this.f23923i++;
        }
        int[] iArr7 = this.f23919e;
        if (i19 >= iArr7.length) {
            this.j = true;
        }
        if (this.f23923i >= iArr7.length) {
            this.j = true;
            this.f23923i = iArr7.length - 1;
        }
    }

    @Override // w.InterfaceC2122b
    public final float c(i iVar) {
        int i9 = this.f23922h;
        for (int i10 = 0; i9 != -1 && i10 < this.f23915a; i10++) {
            if (this.f23919e[i9] == iVar.f23952b) {
                return this.f23921g[i9];
            }
            i9 = this.f23920f[i9];
        }
        return 0.0f;
    }

    @Override // w.InterfaceC2122b
    public final void clear() {
        int i9 = this.f23922h;
        for (int i10 = 0; i9 != -1 && i10 < this.f23915a; i10++) {
            i iVar = ((i[]) this.f23917c.f16507e)[this.f23919e[i9]];
            if (iVar != null) {
                iVar.b(this.f23916b);
            }
            i9 = this.f23920f[i9];
        }
        this.f23922h = -1;
        this.f23923i = -1;
        this.j = false;
        this.f23915a = 0;
    }

    @Override // w.InterfaceC2122b
    public final float d(i iVar, boolean z9) {
        int i9 = this.f23922h;
        if (i9 != -1) {
            int i10 = 0;
            int i11 = -1;
            while (i9 != -1 && i10 < this.f23915a) {
                if (this.f23919e[i9] == iVar.f23952b) {
                    if (i9 == this.f23922h) {
                        this.f23922h = this.f23920f[i9];
                    } else {
                        int[] iArr = this.f23920f;
                        iArr[i11] = iArr[i9];
                    }
                    if (z9) {
                        iVar.b(this.f23916b);
                    }
                    iVar.f23960k--;
                    this.f23915a--;
                    this.f23919e[i9] = -1;
                    if (this.j) {
                        this.f23923i = i9;
                    }
                    return this.f23921g[i9];
                }
                i10++;
                i11 = i9;
                i9 = this.f23920f[i9];
            }
            return 0.0f;
        }
        return 0.0f;
    }

    @Override // w.InterfaceC2122b
    public final void e(i iVar, float f9, boolean z9) {
        if (f9 <= -0.001f || f9 >= 0.001f) {
            int i9 = this.f23922h;
            C2123c c2123c = this.f23916b;
            if (i9 == -1) {
                this.f23922h = 0;
                this.f23921g[0] = f9;
                this.f23919e[0] = iVar.f23952b;
                this.f23920f[0] = -1;
                iVar.f23960k++;
                iVar.a(c2123c);
                this.f23915a++;
                if (!this.j) {
                    int i10 = this.f23923i + 1;
                    this.f23923i = i10;
                    int[] iArr = this.f23919e;
                    if (i10 >= iArr.length) {
                        this.j = true;
                        this.f23923i = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i11 = -1;
            for (int i12 = 0; i9 != -1 && i12 < this.f23915a; i12++) {
                int i13 = this.f23919e[i9];
                int i14 = iVar.f23952b;
                if (i13 == i14) {
                    float[] fArr = this.f23921g;
                    float f10 = fArr[i9] + f9;
                    if (f10 > -0.001f && f10 < 0.001f) {
                        f10 = 0.0f;
                    }
                    fArr[i9] = f10;
                    if (f10 == 0.0f) {
                        if (i9 == this.f23922h) {
                            this.f23922h = this.f23920f[i9];
                        } else {
                            int[] iArr2 = this.f23920f;
                            iArr2[i11] = iArr2[i9];
                        }
                        if (z9) {
                            iVar.b(c2123c);
                        }
                        if (this.j) {
                            this.f23923i = i9;
                        }
                        iVar.f23960k--;
                        this.f23915a--;
                        return;
                    }
                    return;
                }
                if (i13 < i14) {
                    i11 = i9;
                }
                i9 = this.f23920f[i9];
            }
            int i15 = this.f23923i;
            int i16 = i15 + 1;
            if (this.j) {
                int[] iArr3 = this.f23919e;
                if (iArr3[i15] != -1) {
                    i15 = iArr3.length;
                }
            } else {
                i15 = i16;
            }
            int[] iArr4 = this.f23919e;
            if (i15 >= iArr4.length && this.f23915a < iArr4.length) {
                int i17 = 0;
                while (true) {
                    int[] iArr5 = this.f23919e;
                    if (i17 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i17] == -1) {
                        i15 = i17;
                        break;
                    }
                    i17++;
                }
            }
            int[] iArr6 = this.f23919e;
            if (i15 >= iArr6.length) {
                i15 = iArr6.length;
                int i18 = this.f23918d * 2;
                this.f23918d = i18;
                this.j = false;
                this.f23923i = i15 - 1;
                this.f23921g = Arrays.copyOf(this.f23921g, i18);
                this.f23919e = Arrays.copyOf(this.f23919e, this.f23918d);
                this.f23920f = Arrays.copyOf(this.f23920f, this.f23918d);
            }
            this.f23919e[i15] = iVar.f23952b;
            this.f23921g[i15] = f9;
            if (i11 != -1) {
                int[] iArr7 = this.f23920f;
                iArr7[i15] = iArr7[i11];
                iArr7[i11] = i15;
            } else {
                this.f23920f[i15] = this.f23922h;
                this.f23922h = i15;
            }
            iVar.f23960k++;
            iVar.a(c2123c);
            this.f23915a++;
            if (!this.j) {
                this.f23923i++;
            }
            int i19 = this.f23923i;
            int[] iArr8 = this.f23919e;
            if (i19 >= iArr8.length) {
                this.j = true;
                this.f23923i = iArr8.length - 1;
            }
        }
    }

    @Override // w.InterfaceC2122b
    public final boolean f(i iVar) {
        int i9 = this.f23922h;
        if (i9 != -1) {
            for (int i10 = 0; i9 != -1 && i10 < this.f23915a; i10++) {
                if (this.f23919e[i9] == iVar.f23952b) {
                    return true;
                }
                i9 = this.f23920f[i9];
            }
        }
        return false;
    }

    @Override // w.InterfaceC2122b
    public final int g() {
        return this.f23915a;
    }

    @Override // w.InterfaceC2122b
    public final float h(C2123c c2123c, boolean z9) {
        float c3 = c(c2123c.f23924a);
        d(c2123c.f23924a, z9);
        InterfaceC2122b interfaceC2122b = c2123c.f23927d;
        int g9 = interfaceC2122b.g();
        for (int i9 = 0; i9 < g9; i9++) {
            i i10 = interfaceC2122b.i(i9);
            e(i10, interfaceC2122b.c(i10) * c3, z9);
        }
        return c3;
    }

    @Override // w.InterfaceC2122b
    public final i i(int i9) {
        int i10 = this.f23922h;
        for (int i11 = 0; i10 != -1 && i11 < this.f23915a; i11++) {
            if (i11 == i9) {
                return ((i[]) this.f23917c.f16507e)[this.f23919e[i10]];
            }
            i10 = this.f23920f[i10];
        }
        return null;
    }

    @Override // w.InterfaceC2122b
    public final void j(float f9) {
        int i9 = this.f23922h;
        for (int i10 = 0; i9 != -1 && i10 < this.f23915a; i10++) {
            float[] fArr = this.f23921g;
            fArr[i9] = fArr[i9] / f9;
            i9 = this.f23920f[i9];
        }
    }

    @Override // w.InterfaceC2122b
    public final void k() {
        int i9 = this.f23922h;
        for (int i10 = 0; i9 != -1 && i10 < this.f23915a; i10++) {
            float[] fArr = this.f23921g;
            fArr[i9] = fArr[i9] * (-1.0f);
            i9 = this.f23920f[i9];
        }
    }

    public final String toString() {
        int i9 = this.f23922h;
        String str = "";
        for (int i10 = 0; i9 != -1 && i10 < this.f23915a; i10++) {
            str = (AbstractC0953k1.n(str, " -> ") + this.f23921g[i9] + " : ") + ((i[]) this.f23917c.f16507e)[this.f23919e[i9]];
            i9 = this.f23920f[i9];
        }
        return str;
    }
}
