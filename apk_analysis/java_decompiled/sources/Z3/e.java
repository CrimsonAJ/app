package Z3;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: A, reason: collision with root package name */
    public static final int[] f9004A;

    /* renamed from: B, reason: collision with root package name */
    public static final boolean[] f9005B;

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f9006C;

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f9007D;

    /* renamed from: E, reason: collision with root package name */
    public static final int[] f9008E;

    /* renamed from: F, reason: collision with root package name */
    public static final int[] f9009F;

    /* renamed from: w, reason: collision with root package name */
    public static final int f9010w = c(2, 2, 2, 0);

    /* renamed from: x, reason: collision with root package name */
    public static final int f9011x;

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f9012y;

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f9013z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f9014a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final SpannableStringBuilder f9015b = new SpannableStringBuilder();

    /* renamed from: c, reason: collision with root package name */
    public boolean f9016c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9017d;

    /* renamed from: e, reason: collision with root package name */
    public int f9018e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9019f;

    /* renamed from: g, reason: collision with root package name */
    public int f9020g;

    /* renamed from: h, reason: collision with root package name */
    public int f9021h;

    /* renamed from: i, reason: collision with root package name */
    public int f9022i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f9023k;

    /* renamed from: l, reason: collision with root package name */
    public int f9024l;

    /* renamed from: m, reason: collision with root package name */
    public int f9025m;

    /* renamed from: n, reason: collision with root package name */
    public int f9026n;

    /* renamed from: o, reason: collision with root package name */
    public int f9027o;

    /* renamed from: p, reason: collision with root package name */
    public int f9028p;

    /* renamed from: q, reason: collision with root package name */
    public int f9029q;

    /* renamed from: r, reason: collision with root package name */
    public int f9030r;

    /* renamed from: s, reason: collision with root package name */
    public int f9031s;

    /* renamed from: t, reason: collision with root package name */
    public int f9032t;

    /* renamed from: u, reason: collision with root package name */
    public int f9033u;

    /* renamed from: v, reason: collision with root package name */
    public int f9034v;

    static {
        int c3 = c(0, 0, 0, 0);
        f9011x = c3;
        int c9 = c(0, 0, 0, 3);
        f9012y = new int[]{0, 0, 0, 0, 0, 2, 0};
        f9013z = new int[]{0, 0, 0, 0, 0, 0, 2};
        f9004A = new int[]{3, 3, 3, 3, 3, 3, 1};
        f9005B = new boolean[]{false, false, false, true, true, true, false};
        f9006C = new int[]{c3, c9, c3, c3, c9, c3, c3};
        f9007D = new int[]{0, 1, 2, 3, 4, 3, 4};
        f9008E = new int[]{0, 0, 0, 0, 0, 3, 3};
        f9009F = new int[]{c3, c3, c3, c3, c3, c9, c9};
    }

    public e() {
        d();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(int r4, int r5, int r6, int r7) {
        /*
            r0 = 4
            l4.AbstractC1566a.k(r4, r0)
            l4.AbstractC1566a.k(r5, r0)
            l4.AbstractC1566a.k(r6, r0)
            l4.AbstractC1566a.k(r7, r0)
            r0 = 0
            r1 = 1
            r2 = 255(0xff, float:3.57E-43)
            if (r7 == 0) goto L1b
            if (r7 == r1) goto L1b
            r3 = 2
            if (r7 == r3) goto L1f
            r3 = 3
            if (r7 == r3) goto L1d
        L1b:
            r7 = r2
            goto L21
        L1d:
            r7 = r0
            goto L21
        L1f:
            r7 = 127(0x7f, float:1.78E-43)
        L21:
            if (r4 <= r1) goto L25
            r4 = r2
            goto L26
        L25:
            r4 = r0
        L26:
            if (r5 <= r1) goto L2a
            r5 = r2
            goto L2b
        L2a:
            r5 = r0
        L2b:
            if (r6 <= r1) goto L2e
            r0 = r2
        L2e:
            int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Z3.e.c(int, int, int, int):int");
    }

    public final void a(char c3) {
        SpannableStringBuilder spannableStringBuilder = this.f9015b;
        if (c3 == '\n') {
            ArrayList arrayList = this.f9014a;
            arrayList.add(b());
            spannableStringBuilder.clear();
            if (this.f9028p != -1) {
                this.f9028p = 0;
            }
            if (this.f9029q != -1) {
                this.f9029q = 0;
            }
            if (this.f9030r != -1) {
                this.f9030r = 0;
            }
            if (this.f9032t != -1) {
                this.f9032t = 0;
            }
            while (true) {
                if ((this.f9023k && arrayList.size() >= this.j) || arrayList.size() >= 15) {
                    arrayList.remove(0);
                } else {
                    return;
                }
            }
        } else {
            spannableStringBuilder.append(c3);
        }
    }

    public final SpannableString b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f9015b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f9028p != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f9028p, length, 33);
            }
            if (this.f9029q != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f9029q, length, 33);
            }
            if (this.f9030r != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f9031s), this.f9030r, length, 33);
            }
            if (this.f9032t != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f9033u), this.f9032t, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void d() {
        this.f9014a.clear();
        this.f9015b.clear();
        this.f9028p = -1;
        this.f9029q = -1;
        this.f9030r = -1;
        this.f9032t = -1;
        this.f9034v = 0;
        this.f9016c = false;
        this.f9017d = false;
        this.f9018e = 4;
        this.f9019f = false;
        this.f9020g = 0;
        this.f9021h = 0;
        this.f9022i = 0;
        this.j = 15;
        this.f9023k = true;
        this.f9024l = 0;
        this.f9025m = 0;
        this.f9026n = 0;
        int i9 = f9011x;
        this.f9027o = i9;
        this.f9031s = f9010w;
        this.f9033u = i9;
    }

    public final void e(boolean z9, boolean z10) {
        int i9 = this.f9028p;
        SpannableStringBuilder spannableStringBuilder = this.f9015b;
        if (i9 != -1) {
            if (!z9) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f9028p, spannableStringBuilder.length(), 33);
                this.f9028p = -1;
            }
        } else if (z9) {
            this.f9028p = spannableStringBuilder.length();
        }
        if (this.f9029q != -1) {
            if (!z10) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f9029q, spannableStringBuilder.length(), 33);
                this.f9029q = -1;
                return;
            }
            return;
        }
        if (z10) {
            this.f9029q = spannableStringBuilder.length();
        }
    }

    public final void f(int i9, int i10) {
        int i11 = this.f9030r;
        SpannableStringBuilder spannableStringBuilder = this.f9015b;
        if (i11 != -1 && this.f9031s != i9) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f9031s), this.f9030r, spannableStringBuilder.length(), 33);
        }
        if (i9 != f9010w) {
            this.f9030r = spannableStringBuilder.length();
            this.f9031s = i9;
        }
        if (this.f9032t != -1 && this.f9033u != i10) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f9033u), this.f9032t, spannableStringBuilder.length(), 33);
        }
        if (i10 != f9011x) {
            this.f9032t = spannableStringBuilder.length();
            this.f9033u = i10;
        }
    }
}
