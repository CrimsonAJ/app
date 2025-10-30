package m4;

import android.view.Surface;
import l4.y;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final d f20811a;

    /* renamed from: b, reason: collision with root package name */
    public final q f20812b;

    /* renamed from: c, reason: collision with root package name */
    public final s f20813c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f20814d;

    /* renamed from: e, reason: collision with root package name */
    public Surface f20815e;

    /* renamed from: f, reason: collision with root package name */
    public float f20816f;

    /* renamed from: g, reason: collision with root package name */
    public float f20817g;

    /* renamed from: h, reason: collision with root package name */
    public float f20818h;

    /* renamed from: i, reason: collision with root package name */
    public float f20819i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public long f20820k;

    /* renamed from: l, reason: collision with root package name */
    public long f20821l;

    /* renamed from: m, reason: collision with root package name */
    public long f20822m;

    /* renamed from: n, reason: collision with root package name */
    public long f20823n;

    /* renamed from: o, reason: collision with root package name */
    public long f20824o;

    /* renamed from: p, reason: collision with root package name */
    public long f20825p;

    /* renamed from: q, reason: collision with root package name */
    public long f20826q;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, m4.d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public t(android.content.Context r6) {
        /*
            r5 = this;
            r5.<init>()
            m4.d r0 = new m4.d
            r0.<init>()
            m4.c r1 = new m4.c
            r1.<init>()
            r0.f20736a = r1
            m4.c r1 = new m4.c
            r1.<init>()
            r0.f20737b = r1
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.f20739d = r1
            r5.f20811a = r0
            r0 = 0
            if (r6 == 0) goto L50
            android.content.Context r6 = r6.getApplicationContext()
            int r3 = l4.y.f20553a
            r4 = 17
            if (r3 < r4) goto L3c
            java.lang.String r3 = "display"
            java.lang.Object r3 = r6.getSystemService(r3)
            android.hardware.display.DisplayManager r3 = (android.hardware.display.DisplayManager) r3
            if (r3 == 0) goto L3c
            m4.r r4 = new m4.r
            r4.<init>(r3)
            goto L3d
        L3c:
            r4 = r0
        L3d:
            if (r4 != 0) goto L51
            java.lang.String r3 = "window"
            java.lang.Object r6 = r6.getSystemService(r3)
            android.view.WindowManager r6 = (android.view.WindowManager) r6
            if (r6 == 0) goto L50
            i.G r4 = new i.G
            r3 = 6
            r4.<init>(r3, r6)
            goto L51
        L50:
            r4 = r0
        L51:
            r5.f20812b = r4
            if (r4 == 0) goto L57
            m4.s r0 = m4.s.f20806e
        L57:
            r5.f20813c = r0
            r5.f20820k = r1
            r5.f20821l = r1
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5.f20816f = r6
            r6 = 1065353216(0x3f800000, float:1.0)
            r5.f20819i = r6
            r6 = 0
            r5.j = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.t.<init>(android.content.Context):void");
    }

    public final void a() {
        Surface surface;
        if (y.f20553a >= 30 && (surface = this.f20815e) != null && this.j != Integer.MIN_VALUE && this.f20818h != 0.0f) {
            this.f20818h = 0.0f;
            p.a(surface, 0.0f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r9 = this;
            int r0 = l4.y.f20553a
            r1 = 30
            if (r0 < r1) goto L8d
            android.view.Surface r0 = r9.f20815e
            if (r0 != 0) goto Lc
            goto L8d
        Lc:
            m4.d r0 = r9.f20811a
            m4.c r2 = r0.f20736a
            boolean r2 = r2.a()
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r2 == 0) goto L39
            m4.c r2 = r0.f20736a
            boolean r2 = r2.a()
            if (r2 == 0) goto L37
            m4.c r2 = r0.f20736a
            long r4 = r2.f20732e
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L2b
            goto L2e
        L2b:
            long r6 = r2.f20733f
            long r6 = r6 / r4
        L2e:
            double r4 = (double) r6
            r6 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            double r6 = r6 / r4
            float r2 = (float) r6
            goto L3b
        L37:
            r2 = r3
            goto L3b
        L39:
            float r2 = r9.f20816f
        L3b:
            float r4 = r9.f20817g
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 != 0) goto L42
            goto L8d
        L42:
            int r5 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r5 == 0) goto L80
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 == 0) goto L80
            m4.c r1 = r0.f20736a
            boolean r1 = r1.a()
            if (r1 == 0) goto L71
            m4.c r1 = r0.f20736a
            boolean r1 = r1.a()
            if (r1 == 0) goto L5f
            m4.c r0 = r0.f20736a
            long r0 = r0.f20733f
            goto L64
        L5f:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L64:
            r3 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L71
            r0 = 1017370378(0x3ca3d70a, float:0.02)
            goto L73
        L71:
            r0 = 1065353216(0x3f800000, float:1.0)
        L73:
            float r1 = r9.f20817g
            float r1 = r2 - r1
            float r1 = java.lang.Math.abs(r1)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L8d
            goto L87
        L80:
            if (r5 == 0) goto L83
            goto L87
        L83:
            int r0 = r0.f20740e
            if (r0 < r1) goto L8d
        L87:
            r9.f20817g = r2
            r0 = 0
            r9.c(r0)
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.t.b():void");
    }

    public final void c(boolean z9) {
        Surface surface;
        float f9;
        if (y.f20553a >= 30 && (surface = this.f20815e) != null && this.j != Integer.MIN_VALUE) {
            if (this.f20814d) {
                float f10 = this.f20817g;
                if (f10 != -1.0f) {
                    f9 = f10 * this.f20819i;
                    if (!z9 || this.f20818h != f9) {
                        this.f20818h = f9;
                        p.a(surface, f9);
                    }
                    return;
                }
            }
            f9 = 0.0f;
            if (!z9) {
            }
            this.f20818h = f9;
            p.a(surface, f9);
        }
    }
}
