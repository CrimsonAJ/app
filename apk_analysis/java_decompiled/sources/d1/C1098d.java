package d1;

import F0.e0;
import X1.p;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* renamed from: d1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1098d extends e0 {

    /* renamed from: a, reason: collision with root package name */
    public p f16693a;

    /* renamed from: b, reason: collision with root package name */
    public final ViewPager2 f16694b;

    /* renamed from: c, reason: collision with root package name */
    public final l f16695c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayoutManager f16696d;

    /* renamed from: e, reason: collision with root package name */
    public int f16697e;

    /* renamed from: f, reason: collision with root package name */
    public int f16698f;

    /* renamed from: g, reason: collision with root package name */
    public final C1097c f16699g;

    /* renamed from: h, reason: collision with root package name */
    public int f16700h;

    /* renamed from: i, reason: collision with root package name */
    public int f16701i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f16702k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f16703l;

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, d1.c] */
    public C1098d(ViewPager2 viewPager2) {
        this.f16694b = viewPager2;
        l lVar = viewPager2.j;
        this.f16695c = lVar;
        this.f16696d = (LinearLayoutManager) lVar.getLayoutManager();
        this.f16699g = new Object();
        e();
    }

    @Override // F0.e0
    public final void a(RecyclerView recyclerView, int i9) {
        boolean z9;
        p pVar;
        int i10 = this.f16697e;
        boolean z10 = true;
        if ((i10 != 1 || this.f16698f != 1) && i9 == 1) {
            this.f16697e = 1;
            int i11 = this.f16701i;
            if (i11 != -1) {
                this.f16700h = i11;
                this.f16701i = -1;
            } else if (this.f16700h == -1) {
                this.f16700h = this.f16696d.U0();
            }
            d(1);
            return;
        }
        if (i10 != 1 && i10 != 4) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z9 && i9 == 2) {
            if (this.f16702k) {
                d(2);
                this.j = true;
                return;
            }
            return;
        }
        if (i10 != 1 && i10 != 4) {
            z10 = false;
        }
        C1097c c1097c = this.f16699g;
        if (z10 && i9 == 0) {
            f();
            if (!this.f16702k) {
                int i12 = c1097c.f16691b;
                if (i12 != -1 && (pVar = this.f16693a) != null) {
                    pVar.b(i12, 0.0f, 0);
                }
            } else if (c1097c.f16692c == 0) {
                int i13 = this.f16700h;
                int i14 = c1097c.f16691b;
                if (i13 != i14) {
                    c(i14);
                }
            }
            d(0);
            e();
        }
        if (this.f16697e == 2 && i9 == 0 && this.f16703l) {
            f();
            if (c1097c.f16692c == 0) {
                int i15 = this.f16701i;
                int i16 = c1097c.f16691b;
                if (i15 != i16) {
                    if (i16 == -1) {
                        i16 = 0;
                    }
                    c(i16);
                }
                d(0);
                e();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        if (r7 == r8) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    @Override // F0.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(androidx.recyclerview.widget.RecyclerView r6, int r7, int r8) {
        /*
            r5 = this;
            r6 = 1
            r5.f16702k = r6
            r5.f()
            boolean r0 = r5.j
            d1.c r1 = r5.f16699g
            r2 = -1
            r3 = 0
            if (r0 == 0) goto L3e
            r5.j = r3
            if (r8 > 0) goto L2a
            if (r8 != 0) goto L32
            if (r7 >= 0) goto L18
            r7 = r6
            goto L19
        L18:
            r7 = r3
        L19:
            androidx.viewpager2.widget.ViewPager2 r8 = r5.f16694b
            d1.h r8 = r8.f10398g
            androidx.recyclerview.widget.RecyclerView r8 = r8.f10338b
            int r8 = r8.getLayoutDirection()
            if (r8 != r6) goto L27
            r8 = r6
            goto L28
        L27:
            r8 = r3
        L28:
            if (r7 != r8) goto L32
        L2a:
            int r7 = r1.f16692c
            if (r7 == 0) goto L32
            int r7 = r1.f16691b
            int r7 = r7 + r6
            goto L34
        L32:
            int r7 = r1.f16691b
        L34:
            r5.f16701i = r7
            int r8 = r5.f16700h
            if (r8 == r7) goto L4a
            r5.c(r7)
            goto L4a
        L3e:
            int r7 = r5.f16697e
            if (r7 != 0) goto L4a
            int r7 = r1.f16691b
            if (r7 != r2) goto L47
            r7 = r3
        L47:
            r5.c(r7)
        L4a:
            int r7 = r1.f16691b
            if (r7 != r2) goto L4f
            r7 = r3
        L4f:
            float r8 = r1.f16690a
            int r0 = r1.f16692c
            X1.p r4 = r5.f16693a
            if (r4 == 0) goto L5a
            r4.b(r7, r8, r0)
        L5a:
            int r7 = r1.f16691b
            int r8 = r5.f16701i
            if (r7 == r8) goto L62
            if (r8 != r2) goto L70
        L62:
            int r7 = r1.f16692c
            if (r7 != 0) goto L70
            int r7 = r5.f16698f
            if (r7 == r6) goto L70
            r5.d(r3)
            r5.e()
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.C1098d.b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    public final void c(int i9) {
        p pVar = this.f16693a;
        if (pVar != null) {
            pVar.c(i9);
        }
    }

    public final void d(int i9) {
        if ((this.f16697e != 3 || this.f16698f != 0) && this.f16698f != i9) {
            this.f16698f = i9;
            p pVar = this.f16693a;
            if (pVar != null) {
                pVar.a(i9);
            }
        }
    }

    public final void e() {
        this.f16697e = 0;
        this.f16698f = 0;
        C1097c c1097c = this.f16699g;
        c1097c.f16691b = -1;
        c1097c.f16690a = 0.0f;
        c1097c.f16692c = 0;
        this.f16700h = -1;
        this.f16701i = -1;
        this.j = false;
        this.f16702k = false;
        this.f16703l = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0132, code lost:
    
        if (r5[r1 - 1][1] >= r6) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0139, code lost:
    
        if (r0.w() <= 1) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.C1098d.f():void");
    }
}
