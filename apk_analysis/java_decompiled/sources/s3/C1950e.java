package s3;

import l4.AbstractC1566a;
import l4.y;
import q3.q;
import q3.s;
import q3.u;

/* renamed from: s3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1950e {

    /* renamed from: a, reason: collision with root package name */
    public final u f22694a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22695b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22696c;

    /* renamed from: d, reason: collision with root package name */
    public final long f22697d;

    /* renamed from: e, reason: collision with root package name */
    public final int f22698e;

    /* renamed from: f, reason: collision with root package name */
    public int f22699f;

    /* renamed from: g, reason: collision with root package name */
    public int f22700g;

    /* renamed from: h, reason: collision with root package name */
    public int f22701h;

    /* renamed from: i, reason: collision with root package name */
    public int f22702i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public long[] f22703k;

    /* renamed from: l, reason: collision with root package name */
    public int[] f22704l;

    public C1950e(int i9, int i10, long j, int i11, u uVar) {
        int i12;
        int i13;
        boolean z9 = true;
        if (i10 != 1 && i10 != 2) {
            z9 = false;
        }
        AbstractC1566a.h(z9);
        this.f22697d = j;
        this.f22698e = i11;
        this.f22694a = uVar;
        if (i10 == 2) {
            i12 = 1667497984;
        } else {
            i12 = 1651965952;
        }
        int i14 = (((i9 % 10) + 48) << 8) | ((i9 / 10) + 48);
        this.f22695b = i12 | i14;
        if (i10 == 2) {
            i13 = i14 | 1650720768;
        } else {
            i13 = -1;
        }
        this.f22696c = i13;
        this.f22703k = new long[512];
        this.f22704l = new int[512];
    }

    public final s a(int i9) {
        return new s(((this.f22697d * 1) / this.f22698e) * this.f22704l[i9], this.f22703k[i9]);
    }

    public final q b(long j) {
        int i9 = (int) (j / ((this.f22697d * 1) / this.f22698e));
        int d9 = y.d(this.f22704l, i9, true, true);
        if (this.f22704l[d9] == i9) {
            s a5 = a(d9);
            return new q(a5, a5);
        }
        s a9 = a(d9);
        int i10 = d9 + 1;
        if (i10 < this.f22703k.length) {
            return new q(a9, a(i10));
        }
        return new q(a9, a9);
    }
}
