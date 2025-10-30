package i4;

import P5.AbstractC0356y;
import P5.P;
import l4.y;

/* loaded from: classes.dex */
public final class n extends m {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f18572e;

    /* renamed from: f, reason: collision with root package name */
    public final h f18573f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f18574g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f18575h;

    /* renamed from: i, reason: collision with root package name */
    public final int f18576i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final int f18577k;

    /* renamed from: l, reason: collision with root package name */
    public final int f18578l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f18579m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f18580n;

    /* renamed from: o, reason: collision with root package name */
    public final int f18581o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f18582p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f18583q;

    /* renamed from: r, reason: collision with root package name */
    public final int f18584r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00d9 A[EDGE_INSN: B:133:0x00d9->B:70:0x00d9 BREAK  A[LOOP:0: B:62:0x00bf->B:131:0x00d7], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public n(int r9, N3.m0 r10, int r11, i4.h r12, int r13, int r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.n.<init>(int, N3.m0, int, i4.h, int, int, boolean):void");
    }

    public static int c(n nVar, n nVar2) {
        AbstractC0356y b9 = AbstractC0356y.f6012a.c(nVar.f18575h, nVar2.f18575h).a(nVar.f18578l, nVar2.f18578l).c(nVar.f18579m, nVar2.f18579m).c(nVar.f18572e, nVar2.f18572e).c(nVar.f18574g, nVar2.f18574g).b(Integer.valueOf(nVar.f18577k), Integer.valueOf(nVar2.f18577k), P.f5924c);
        boolean z9 = nVar2.f18582p;
        boolean z10 = nVar.f18582p;
        AbstractC0356y c3 = b9.c(z10, z9);
        boolean z11 = nVar2.f18583q;
        boolean z12 = nVar.f18583q;
        AbstractC0356y c9 = c3.c(z12, z11);
        if (z10 && z12) {
            c9 = c9.a(nVar.f18584r, nVar2.f18584r);
        }
        return c9.e();
    }

    @Override // i4.m
    public final int a() {
        return this.f18581o;
    }

    @Override // i4.m
    public final boolean b(m mVar) {
        n nVar = (n) mVar;
        if (this.f18580n || y.a(this.f18571d.f19435l, nVar.f18571d.f19435l)) {
            if (!this.f18573f.f18548X) {
                if (this.f18582p != nVar.f18582p || this.f18583q != nVar.f18583q) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return false;
    }
}
