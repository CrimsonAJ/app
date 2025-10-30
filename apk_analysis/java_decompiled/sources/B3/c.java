package B3;

import j3.L;
import j3.M;
import j3.j0;
import l4.y;
import q3.C1902g;
import q3.InterfaceC1907l;
import q3.u;

/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public int f654a;

    /* renamed from: b, reason: collision with root package name */
    public long f655b;

    /* renamed from: c, reason: collision with root package name */
    public long f656c;

    /* renamed from: d, reason: collision with root package name */
    public int f657d;

    /* renamed from: e, reason: collision with root package name */
    public Object f658e;

    /* renamed from: f, reason: collision with root package name */
    public Object f659f;

    /* renamed from: g, reason: collision with root package name */
    public Object f660g;

    /* renamed from: h, reason: collision with root package name */
    public Object f661h;

    public c(InterfaceC1907l interfaceC1907l, u uVar, e eVar, String str, int i9) {
        this.f658e = interfaceC1907l;
        this.f659f = uVar;
        this.f660g = eVar;
        int i10 = eVar.f672d;
        int i11 = eVar.f669a;
        int i12 = (i10 * i11) / 8;
        int i13 = eVar.f671c;
        if (i13 == i12) {
            int i14 = eVar.f670b;
            int i15 = i14 * i12;
            int i16 = i15 * 8;
            int max = Math.max(i12, i15 / 10);
            this.f654a = max;
            L l9 = new L();
            l9.f19402k = str;
            l9.f19398f = i16;
            l9.f19399g = i16;
            l9.f19403l = max;
            l9.f19415x = i11;
            l9.f19416y = i14;
            l9.f19417z = i9;
            this.f661h = new M(l9);
            return;
        }
        throw j0.a("Expected block size: " + i12 + "; got: " + i13, null);
    }

    @Override // B3.b
    public void a(long j, int i9) {
        ((InterfaceC1907l) this.f658e).r(new g((e) this.f660g, 1, i9, j));
        ((u) this.f659f).e((M) this.f661h);
    }

    @Override // B3.b
    public void b(long j) {
        this.f655b = j;
        this.f657d = 0;
        this.f656c = 0L;
    }

    @Override // B3.b
    public boolean c(C1902g c1902g, long j) {
        int i9;
        int i10;
        long j4 = j;
        while (j4 > 0 && (i9 = this.f657d) < (i10 = this.f654a)) {
            int a5 = ((u) this.f659f).a(c1902g, (int) Math.min(i10 - i9, j4), true);
            if (a5 == -1) {
                j4 = 0;
            } else {
                this.f657d += a5;
                j4 -= a5;
            }
        }
        e eVar = (e) this.f660g;
        int i11 = this.f657d;
        int i12 = eVar.f671c;
        int i13 = i11 / i12;
        if (i13 > 0) {
            long O8 = this.f655b + y.O(this.f656c, 1000000L, eVar.f670b);
            int i14 = i13 * i12;
            int i15 = this.f657d - i14;
            ((u) this.f659f).d(O8, 1, i14, i15, null);
            this.f656c += i13;
            this.f657d = i15;
        }
        if (j4 <= 0) {
            return true;
        }
        return false;
    }
}
