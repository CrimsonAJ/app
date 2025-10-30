package w;

import com.google.android.gms.internal.measurement.AbstractC0953k1;
import com.google.firebase.messaging.s;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class j implements InterfaceC2122b {

    /* renamed from: a, reason: collision with root package name */
    public int f23962a = 16;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f23963b = new int[16];

    /* renamed from: c, reason: collision with root package name */
    public int[] f23964c = new int[16];

    /* renamed from: d, reason: collision with root package name */
    public int[] f23965d = new int[16];

    /* renamed from: e, reason: collision with root package name */
    public float[] f23966e = new float[16];

    /* renamed from: f, reason: collision with root package name */
    public int[] f23967f = new int[16];

    /* renamed from: g, reason: collision with root package name */
    public int[] f23968g = new int[16];

    /* renamed from: h, reason: collision with root package name */
    public int f23969h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f23970i = -1;
    public final C2124d j;

    /* renamed from: k, reason: collision with root package name */
    public final s f23971k;

    public j(C2124d c2124d, s sVar) {
        this.j = c2124d;
        this.f23971k = sVar;
        clear();
    }

    @Override // w.InterfaceC2122b
    public final float a(int i9) {
        int i10 = this.f23969h;
        int i11 = this.f23970i;
        for (int i12 = 0; i12 < i10; i12++) {
            if (i12 == i9) {
                return this.f23966e[i11];
            }
            i11 = this.f23968g[i11];
            if (i11 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // w.InterfaceC2122b
    public final void b(i iVar, float f9) {
        if (f9 > -0.001f && f9 < 0.001f) {
            d(iVar, true);
            return;
        }
        int i9 = 0;
        if (this.f23969h == 0) {
            m(0, iVar, f9);
            l(iVar, 0);
            this.f23970i = 0;
            return;
        }
        int n7 = n(iVar);
        if (n7 != -1) {
            this.f23966e[n7] = f9;
            return;
        }
        int i10 = this.f23969h + 1;
        int i11 = this.f23962a;
        if (i10 >= i11) {
            int i12 = i11 * 2;
            this.f23965d = Arrays.copyOf(this.f23965d, i12);
            this.f23966e = Arrays.copyOf(this.f23966e, i12);
            this.f23967f = Arrays.copyOf(this.f23967f, i12);
            this.f23968g = Arrays.copyOf(this.f23968g, i12);
            this.f23964c = Arrays.copyOf(this.f23964c, i12);
            for (int i13 = this.f23962a; i13 < i12; i13++) {
                this.f23965d[i13] = -1;
                this.f23964c[i13] = -1;
            }
            this.f23962a = i12;
        }
        int i14 = this.f23969h;
        int i15 = this.f23970i;
        int i16 = -1;
        for (int i17 = 0; i17 < i14; i17++) {
            int i18 = this.f23965d[i15];
            int i19 = iVar.f23952b;
            if (i18 == i19) {
                this.f23966e[i15] = f9;
                return;
            }
            if (i18 < i19) {
                i16 = i15;
            }
            i15 = this.f23968g[i15];
            if (i15 == -1) {
                break;
            }
        }
        while (true) {
            if (i9 < this.f23962a) {
                if (this.f23965d[i9] == -1) {
                    break;
                } else {
                    i9++;
                }
            } else {
                i9 = -1;
                break;
            }
        }
        m(i9, iVar, f9);
        if (i16 != -1) {
            this.f23967f[i9] = i16;
            int[] iArr = this.f23968g;
            iArr[i9] = iArr[i16];
            iArr[i16] = i9;
        } else {
            this.f23967f[i9] = -1;
            if (this.f23969h > 0) {
                this.f23968g[i9] = this.f23970i;
                this.f23970i = i9;
            } else {
                this.f23968g[i9] = -1;
            }
        }
        int i20 = this.f23968g[i9];
        if (i20 != -1) {
            this.f23967f[i20] = i9;
        }
        l(iVar, i9);
    }

    @Override // w.InterfaceC2122b
    public final float c(i iVar) {
        int n7 = n(iVar);
        if (n7 != -1) {
            return this.f23966e[n7];
        }
        return 0.0f;
    }

    @Override // w.InterfaceC2122b
    public final void clear() {
        int i9 = this.f23969h;
        for (int i10 = 0; i10 < i9; i10++) {
            i i11 = i(i10);
            if (i11 != null) {
                i11.b(this.j);
            }
        }
        for (int i12 = 0; i12 < this.f23962a; i12++) {
            this.f23965d[i12] = -1;
            this.f23964c[i12] = -1;
        }
        for (int i13 = 0; i13 < 16; i13++) {
            this.f23963b[i13] = -1;
        }
        this.f23969h = 0;
        this.f23970i = -1;
    }

    @Override // w.InterfaceC2122b
    public final float d(i iVar, boolean z9) {
        int[] iArr;
        int i9;
        int n7 = n(iVar);
        if (n7 == -1) {
            return 0.0f;
        }
        int i10 = iVar.f23952b;
        int i11 = i10 % 16;
        int[] iArr2 = this.f23963b;
        int i12 = iArr2[i11];
        if (i12 != -1) {
            if (this.f23965d[i12] == i10) {
                int[] iArr3 = this.f23964c;
                iArr2[i11] = iArr3[i12];
                iArr3[i12] = -1;
            } else {
                while (true) {
                    iArr = this.f23964c;
                    i9 = iArr[i12];
                    if (i9 == -1 || this.f23965d[i9] == i10) {
                        break;
                    }
                    i12 = i9;
                }
                if (i9 != -1 && this.f23965d[i9] == i10) {
                    iArr[i12] = iArr[i9];
                    iArr[i9] = -1;
                }
            }
        }
        float f9 = this.f23966e[n7];
        if (this.f23970i == n7) {
            this.f23970i = this.f23968g[n7];
        }
        this.f23965d[n7] = -1;
        int[] iArr4 = this.f23967f;
        int i13 = iArr4[n7];
        if (i13 != -1) {
            int[] iArr5 = this.f23968g;
            iArr5[i13] = iArr5[n7];
        }
        int i14 = this.f23968g[n7];
        if (i14 != -1) {
            iArr4[i14] = iArr4[n7];
        }
        this.f23969h--;
        iVar.f23960k--;
        if (z9) {
            iVar.b(this.j);
        }
        return f9;
    }

    @Override // w.InterfaceC2122b
    public final void e(i iVar, float f9, boolean z9) {
        if (f9 <= -0.001f || f9 >= 0.001f) {
            int n7 = n(iVar);
            if (n7 == -1) {
                b(iVar, f9);
                return;
            }
            float[] fArr = this.f23966e;
            float f10 = fArr[n7] + f9;
            fArr[n7] = f10;
            if (f10 > -0.001f && f10 < 0.001f) {
                fArr[n7] = 0.0f;
                d(iVar, z9);
            }
        }
    }

    @Override // w.InterfaceC2122b
    public final boolean f(i iVar) {
        if (n(iVar) != -1) {
            return true;
        }
        return false;
    }

    @Override // w.InterfaceC2122b
    public final int g() {
        return this.f23969h;
    }

    @Override // w.InterfaceC2122b
    public final float h(C2123c c2123c, boolean z9) {
        float c3 = c(c2123c.f23924a);
        d(c2123c.f23924a, z9);
        j jVar = (j) c2123c.f23927d;
        int i9 = jVar.f23969h;
        int i10 = 0;
        int i11 = 0;
        while (i10 < i9) {
            int i12 = jVar.f23965d[i11];
            if (i12 != -1) {
                e(((i[]) this.f23971k.f16507e)[i12], jVar.f23966e[i11] * c3, z9);
                i10++;
            }
            i11++;
        }
        return c3;
    }

    @Override // w.InterfaceC2122b
    public final i i(int i9) {
        int i10 = this.f23969h;
        if (i10 == 0) {
            return null;
        }
        int i11 = this.f23970i;
        for (int i12 = 0; i12 < i10; i12++) {
            if (i12 == i9 && i11 != -1) {
                return ((i[]) this.f23971k.f16507e)[this.f23965d[i11]];
            }
            i11 = this.f23968g[i11];
            if (i11 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // w.InterfaceC2122b
    public final void j(float f9) {
        int i9 = this.f23969h;
        int i10 = this.f23970i;
        for (int i11 = 0; i11 < i9; i11++) {
            float[] fArr = this.f23966e;
            fArr[i10] = fArr[i10] / f9;
            i10 = this.f23968g[i10];
            if (i10 == -1) {
                return;
            }
        }
    }

    @Override // w.InterfaceC2122b
    public final void k() {
        int i9 = this.f23969h;
        int i10 = this.f23970i;
        for (int i11 = 0; i11 < i9; i11++) {
            float[] fArr = this.f23966e;
            fArr[i10] = fArr[i10] * (-1.0f);
            i10 = this.f23968g[i10];
            if (i10 == -1) {
                return;
            }
        }
    }

    public final void l(i iVar, int i9) {
        int[] iArr;
        int i10 = iVar.f23952b % 16;
        int[] iArr2 = this.f23963b;
        int i11 = iArr2[i10];
        if (i11 == -1) {
            iArr2[i10] = i9;
        } else {
            while (true) {
                iArr = this.f23964c;
                int i12 = iArr[i11];
                if (i12 == -1) {
                    break;
                } else {
                    i11 = i12;
                }
            }
            iArr[i11] = i9;
        }
        this.f23964c[i9] = -1;
    }

    public final void m(int i9, i iVar, float f9) {
        this.f23965d[i9] = iVar.f23952b;
        this.f23966e[i9] = f9;
        this.f23967f[i9] = -1;
        this.f23968g[i9] = -1;
        iVar.a(this.j);
        iVar.f23960k++;
        this.f23969h++;
    }

    public final int n(i iVar) {
        if (this.f23969h == 0) {
            return -1;
        }
        int i9 = iVar.f23952b;
        int i10 = this.f23963b[i9 % 16];
        if (i10 == -1) {
            return -1;
        }
        if (this.f23965d[i10] == i9) {
            return i10;
        }
        do {
            i10 = this.f23964c[i10];
            if (i10 == -1) {
                break;
            }
        } while (this.f23965d[i10] != i9);
        if (i10 == -1 || this.f23965d[i10] != i9) {
            return -1;
        }
        return i10;
    }

    public final String toString() {
        String n7;
        String n9;
        String str = hashCode() + " { ";
        int i9 = this.f23969h;
        for (int i10 = 0; i10 < i9; i10++) {
            i i11 = i(i10);
            if (i11 != null) {
                String str2 = str + i11 + " = " + a(i10) + " ";
                int n10 = n(i11);
                String n11 = AbstractC0953k1.n(str2, "[p: ");
                int i12 = this.f23967f[n10];
                s sVar = this.f23971k;
                if (i12 != -1) {
                    n7 = n11 + ((i[]) sVar.f16507e)[this.f23965d[this.f23967f[n10]]];
                } else {
                    n7 = AbstractC0953k1.n(n11, "none");
                }
                String n12 = AbstractC0953k1.n(n7, ", n: ");
                if (this.f23968g[n10] != -1) {
                    n9 = n12 + ((i[]) sVar.f16507e)[this.f23965d[this.f23968g[n10]]];
                } else {
                    n9 = AbstractC0953k1.n(n12, "none");
                }
                str = AbstractC0953k1.n(n9, "]");
            }
        }
        return AbstractC0953k1.n(str, " }");
    }
}
