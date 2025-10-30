package w;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public boolean f23951a;

    /* renamed from: e, reason: collision with root package name */
    public float f23955e;

    /* renamed from: l, reason: collision with root package name */
    public int f23961l;

    /* renamed from: b, reason: collision with root package name */
    public int f23952b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f23953c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f23954d = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f23956f = false;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f23957g = new float[9];

    /* renamed from: h, reason: collision with root package name */
    public final float[] f23958h = new float[9];

    /* renamed from: i, reason: collision with root package name */
    public C2123c[] f23959i = new C2123c[16];
    public int j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f23960k = 0;

    public i(int i9) {
        this.f23961l = i9;
    }

    public final void a(C2123c c2123c) {
        int i9 = 0;
        while (true) {
            int i10 = this.j;
            if (i9 < i10) {
                if (this.f23959i[i9] == c2123c) {
                    return;
                } else {
                    i9++;
                }
            } else {
                C2123c[] c2123cArr = this.f23959i;
                if (i10 >= c2123cArr.length) {
                    this.f23959i = (C2123c[]) Arrays.copyOf(c2123cArr, c2123cArr.length * 2);
                }
                C2123c[] c2123cArr2 = this.f23959i;
                int i11 = this.j;
                c2123cArr2[i11] = c2123c;
                this.j = i11 + 1;
                return;
            }
        }
    }

    public final void b(C2123c c2123c) {
        int i9 = this.j;
        int i10 = 0;
        while (i10 < i9) {
            if (this.f23959i[i10] == c2123c) {
                while (i10 < i9 - 1) {
                    C2123c[] c2123cArr = this.f23959i;
                    int i11 = i10 + 1;
                    c2123cArr[i10] = c2123cArr[i11];
                    i10 = i11;
                }
                this.j--;
                return;
            }
            i10++;
        }
    }

    public final void c() {
        this.f23961l = 5;
        this.f23954d = 0;
        this.f23952b = -1;
        this.f23953c = -1;
        this.f23955e = 0.0f;
        this.f23956f = false;
        int i9 = this.j;
        for (int i10 = 0; i10 < i9; i10++) {
            this.f23959i[i10] = null;
        }
        this.j = 0;
        this.f23960k = 0;
        this.f23951a = false;
        Arrays.fill(this.f23958h, 0.0f);
    }

    public final void d(C2123c c2123c) {
        int i9 = this.j;
        for (int i10 = 0; i10 < i9; i10++) {
            this.f23959i[i10].h(c2123c, false);
        }
        this.j = 0;
    }

    public final String toString() {
        return "" + this.f23952b;
    }
}
