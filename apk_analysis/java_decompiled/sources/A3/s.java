package A3;

import l4.AbstractC1566a;
import q3.InterfaceC1907l;

/* loaded from: classes.dex */
public final class s implements InterfaceC0008i {

    /* renamed from: a, reason: collision with root package name */
    public final D f250a;

    /* renamed from: b, reason: collision with root package name */
    public String f251b;

    /* renamed from: c, reason: collision with root package name */
    public q3.u f252c;

    /* renamed from: d, reason: collision with root package name */
    public r f253d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f254e;

    /* renamed from: l, reason: collision with root package name */
    public long f260l;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f255f = new boolean[3];

    /* renamed from: g, reason: collision with root package name */
    public final v f256g = new v(32);

    /* renamed from: h, reason: collision with root package name */
    public final v f257h = new v(33);

    /* renamed from: i, reason: collision with root package name */
    public final v f258i = new v(34);
    public final v j = new v(39);

    /* renamed from: k, reason: collision with root package name */
    public final v f259k = new v(40);

    /* renamed from: m, reason: collision with root package name */
    public long f261m = -9223372036854775807L;

    /* renamed from: n, reason: collision with root package name */
    public final A4.r f262n = new A4.r(5, false);

    public s(D d9) {
        this.f250a = d9;
    }

    @Override // A3.InterfaceC0008i
    public final void a() {
        this.f260l = 0L;
        this.f261m = -9223372036854775807L;
        AbstractC1566a.q(this.f255f);
        this.f256g.f();
        this.f257h.f();
        this.f258i.f();
        this.j.f();
        this.f259k.f();
        r rVar = this.f253d;
        if (rVar != null) {
            rVar.f243f = false;
            rVar.f244g = false;
            rVar.f245h = false;
            rVar.f246i = false;
            rVar.j = false;
        }
    }

    public final void b(byte[] bArr, int i9, int i10) {
        boolean z9;
        r rVar = this.f253d;
        if (rVar.f243f) {
            int i11 = rVar.f241d;
            int i12 = (i9 + 2) - i11;
            if (i12 < i10) {
                if ((bArr[i12] & 128) != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                rVar.f244g = z9;
                rVar.f243f = false;
            } else {
                rVar.f241d = (i10 - i9) + i11;
            }
        }
        if (!this.f254e) {
            this.f256g.a(bArr, i9, i10);
            this.f257h.a(bArr, i9, i10);
            this.f258i.a(bArr, i9, i10);
        }
        this.j.a(bArr, i9, i10);
        this.f259k.a(bArr, i9, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:205:0x0492, code lost:
    
        if (r6 <= 9) goto L222;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x04a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c3  */
    @Override // A3.InterfaceC0008i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(A4.r r45) {
        /*
            Method dump skipped, instructions count: 1211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A3.s.c(A4.r):void");
    }

    @Override // A3.InterfaceC0008i
    public final void e(long j, int i9) {
        if (j != -9223372036854775807L) {
            this.f261m = j;
        }
    }

    @Override // A3.InterfaceC0008i
    public final void f(InterfaceC1907l interfaceC1907l, I i9) {
        i9.a();
        i9.b();
        this.f251b = i9.f78e;
        i9.b();
        q3.u u9 = interfaceC1907l.u(i9.f77d, 2);
        this.f252c = u9;
        this.f253d = new r(u9);
        this.f250a.b(interfaceC1907l, i9);
    }

    @Override // A3.InterfaceC0008i
    public final void d() {
    }
}
