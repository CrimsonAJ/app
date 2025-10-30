package A3;

import l4.AbstractC1566a;
import q3.InterfaceC1907l;

/* loaded from: classes.dex */
public final class q implements InterfaceC0008i {

    /* renamed from: a, reason: collision with root package name */
    public final D f224a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f225b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f226c;

    /* renamed from: g, reason: collision with root package name */
    public long f230g;

    /* renamed from: i, reason: collision with root package name */
    public String f232i;
    public q3.u j;

    /* renamed from: k, reason: collision with root package name */
    public p f233k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f234l;

    /* renamed from: n, reason: collision with root package name */
    public boolean f236n;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f231h = new boolean[3];

    /* renamed from: d, reason: collision with root package name */
    public final v f227d = new v(7);

    /* renamed from: e, reason: collision with root package name */
    public final v f228e = new v(8);

    /* renamed from: f, reason: collision with root package name */
    public final v f229f = new v(6);

    /* renamed from: m, reason: collision with root package name */
    public long f235m = -9223372036854775807L;

    /* renamed from: o, reason: collision with root package name */
    public final A4.r f237o = new A4.r(5, false);

    public q(D d9, boolean z9, boolean z10) {
        this.f224a = d9;
        this.f225b = z9;
        this.f226c = z10;
    }

    @Override // A3.InterfaceC0008i
    public final void a() {
        this.f230g = 0L;
        this.f236n = false;
        this.f235m = -9223372036854775807L;
        AbstractC1566a.q(this.f231h);
        this.f227d.f();
        this.f228e.f();
        this.f229f.f();
        p pVar = this.f233k;
        if (pVar != null) {
            pVar.f216k = false;
            pVar.f220o = false;
            o oVar = pVar.f219n;
            oVar.f193b = false;
            oVar.f192a = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(byte[] r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A3.q.b(byte[], int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x01f6, code lost:
    
        if (r8.f204n != r9.f204n) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0207, code lost:
    
        if (r8.f206p != r9.f206p) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0215, code lost:
    
        if (r8.f202l != r9.f202l) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0270 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02a5 A[ADDED_TO_REGION] */
    @Override // A3.InterfaceC0008i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(A4.r r30) {
        /*
            Method dump skipped, instructions count: 716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A3.q.c(A4.r):void");
    }

    @Override // A3.InterfaceC0008i
    public final void e(long j, int i9) {
        boolean z9;
        if (j != -9223372036854775807L) {
            this.f235m = j;
        }
        boolean z10 = this.f236n;
        if ((i9 & 2) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f236n = z10 | z9;
    }

    @Override // A3.InterfaceC0008i
    public final void f(InterfaceC1907l interfaceC1907l, I i9) {
        i9.a();
        i9.b();
        this.f232i = i9.f78e;
        i9.b();
        q3.u u9 = interfaceC1907l.u(i9.f77d, 2);
        this.j = u9;
        this.f233k = new p(u9, this.f225b, this.f226c);
        this.f224a.b(interfaceC1907l, i9);
    }

    @Override // A3.InterfaceC0008i
    public final void d() {
    }
}
