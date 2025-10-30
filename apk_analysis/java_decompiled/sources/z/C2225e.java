package z;

import android.view.ViewGroup;
import x.C2149d;
import x.C2153h;

/* renamed from: z.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2225e extends ViewGroup.MarginLayoutParams {

    /* renamed from: A, reason: collision with root package name */
    public float f25195A;

    /* renamed from: B, reason: collision with root package name */
    public String f25196B;

    /* renamed from: C, reason: collision with root package name */
    public int f25197C;

    /* renamed from: D, reason: collision with root package name */
    public float f25198D;

    /* renamed from: E, reason: collision with root package name */
    public float f25199E;

    /* renamed from: F, reason: collision with root package name */
    public int f25200F;

    /* renamed from: G, reason: collision with root package name */
    public int f25201G;

    /* renamed from: H, reason: collision with root package name */
    public int f25202H;

    /* renamed from: I, reason: collision with root package name */
    public int f25203I;

    /* renamed from: J, reason: collision with root package name */
    public int f25204J;
    public int K;

    /* renamed from: L, reason: collision with root package name */
    public int f25205L;

    /* renamed from: M, reason: collision with root package name */
    public int f25206M;

    /* renamed from: N, reason: collision with root package name */
    public float f25207N;

    /* renamed from: O, reason: collision with root package name */
    public float f25208O;

    /* renamed from: P, reason: collision with root package name */
    public int f25209P;

    /* renamed from: Q, reason: collision with root package name */
    public int f25210Q;

    /* renamed from: R, reason: collision with root package name */
    public int f25211R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f25212S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f25213T;

    /* renamed from: U, reason: collision with root package name */
    public String f25214U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f25215V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f25216W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f25217X;
    public boolean Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f25218Z;

    /* renamed from: a, reason: collision with root package name */
    public int f25219a;

    /* renamed from: a0, reason: collision with root package name */
    public int f25220a0;

    /* renamed from: b, reason: collision with root package name */
    public int f25221b;

    /* renamed from: b0, reason: collision with root package name */
    public int f25222b0;

    /* renamed from: c, reason: collision with root package name */
    public float f25223c;

    /* renamed from: c0, reason: collision with root package name */
    public int f25224c0;

    /* renamed from: d, reason: collision with root package name */
    public int f25225d;

    /* renamed from: d0, reason: collision with root package name */
    public int f25226d0;

    /* renamed from: e, reason: collision with root package name */
    public int f25227e;

    /* renamed from: e0, reason: collision with root package name */
    public int f25228e0;

    /* renamed from: f, reason: collision with root package name */
    public int f25229f;

    /* renamed from: f0, reason: collision with root package name */
    public int f25230f0;

    /* renamed from: g, reason: collision with root package name */
    public int f25231g;

    /* renamed from: g0, reason: collision with root package name */
    public float f25232g0;

    /* renamed from: h, reason: collision with root package name */
    public int f25233h;

    /* renamed from: h0, reason: collision with root package name */
    public int f25234h0;

    /* renamed from: i, reason: collision with root package name */
    public int f25235i;

    /* renamed from: i0, reason: collision with root package name */
    public int f25236i0;
    public int j;

    /* renamed from: j0, reason: collision with root package name */
    public float f25237j0;

    /* renamed from: k, reason: collision with root package name */
    public int f25238k;

    /* renamed from: k0, reason: collision with root package name */
    public C2149d f25239k0;

    /* renamed from: l, reason: collision with root package name */
    public int f25240l;

    /* renamed from: m, reason: collision with root package name */
    public int f25241m;

    /* renamed from: n, reason: collision with root package name */
    public int f25242n;

    /* renamed from: o, reason: collision with root package name */
    public float f25243o;

    /* renamed from: p, reason: collision with root package name */
    public int f25244p;

    /* renamed from: q, reason: collision with root package name */
    public int f25245q;

    /* renamed from: r, reason: collision with root package name */
    public int f25246r;

    /* renamed from: s, reason: collision with root package name */
    public int f25247s;

    /* renamed from: t, reason: collision with root package name */
    public int f25248t;

    /* renamed from: u, reason: collision with root package name */
    public int f25249u;

    /* renamed from: v, reason: collision with root package name */
    public int f25250v;

    /* renamed from: w, reason: collision with root package name */
    public int f25251w;

    /* renamed from: x, reason: collision with root package name */
    public int f25252x;

    /* renamed from: y, reason: collision with root package name */
    public int f25253y;

    /* renamed from: z, reason: collision with root package name */
    public float f25254z;

    public final void a() {
        this.Y = false;
        this.f25215V = true;
        this.f25216W = true;
        int i9 = ((ViewGroup.MarginLayoutParams) this).width;
        if (i9 == -2 && this.f25212S) {
            this.f25215V = false;
            if (this.f25202H == 0) {
                this.f25202H = 1;
            }
        }
        int i10 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i10 == -2 && this.f25213T) {
            this.f25216W = false;
            if (this.f25203I == 0) {
                this.f25203I = 1;
            }
        }
        if (i9 == 0 || i9 == -1) {
            this.f25215V = false;
            if (i9 == 0 && this.f25202H == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.f25212S = true;
            }
        }
        if (i10 == 0 || i10 == -1) {
            this.f25216W = false;
            if (i10 == 0 && this.f25203I == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.f25213T = true;
            }
        }
        if (this.f25223c == -1.0f && this.f25219a == -1 && this.f25221b == -1) {
            return;
        }
        this.Y = true;
        this.f25215V = true;
        this.f25216W = true;
        if (!(this.f25239k0 instanceof C2153h)) {
            this.f25239k0 = new C2153h();
        }
        ((C2153h) this.f25239k0).B(this.f25211R);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void resolveLayoutDirection(int r10) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z.C2225e.resolveLayoutDirection(int):void");
    }
}
