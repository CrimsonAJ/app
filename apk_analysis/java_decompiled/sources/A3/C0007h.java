package A3;

import com.google.android.gms.internal.measurement.AbstractC0953k1;
import j3.L;
import java.util.Collections;
import java.util.List;
import l4.AbstractC1566a;
import q3.InterfaceC1907l;

/* renamed from: A3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0007h implements InterfaceC0008i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f140b;

    /* renamed from: c, reason: collision with root package name */
    public long f141c;

    /* renamed from: d, reason: collision with root package name */
    public int f142d;

    /* renamed from: e, reason: collision with root package name */
    public int f143e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f144f;

    /* renamed from: g, reason: collision with root package name */
    public Object f145g;

    public C0007h(List list) {
        this.f139a = 0;
        this.f144f = list;
        this.f145g = new q3.u[list.size()];
        this.f141c = -9223372036854775807L;
    }

    @Override // A3.InterfaceC0008i
    public final void a() {
        switch (this.f139a) {
            case 0:
                this.f140b = false;
                this.f141c = -9223372036854775807L;
                return;
            default:
                this.f140b = false;
                this.f141c = -9223372036854775807L;
                return;
        }
    }

    @Override // A3.InterfaceC0008i
    public final void c(A4.r rVar) {
        boolean z9;
        boolean z10;
        switch (this.f139a) {
            case 0:
                if (this.f140b) {
                    if (this.f142d == 2) {
                        if (rVar.e() == 0) {
                            z10 = false;
                        } else {
                            if (rVar.x() != 32) {
                                this.f140b = false;
                            }
                            this.f142d--;
                            z10 = this.f140b;
                        }
                        if (!z10) {
                            return;
                        }
                    }
                    if (this.f142d == 1) {
                        if (rVar.e() == 0) {
                            z9 = false;
                        } else {
                            if (rVar.x() != 0) {
                                this.f140b = false;
                            }
                            this.f142d--;
                            z9 = this.f140b;
                        }
                        if (!z9) {
                            return;
                        }
                    }
                    int i9 = rVar.f382a;
                    int e8 = rVar.e();
                    for (q3.u uVar : (q3.u[]) this.f145g) {
                        rVar.H(i9);
                        uVar.c(e8, rVar);
                    }
                    this.f143e += e8;
                    return;
                }
                return;
            default:
                AbstractC1566a.n((q3.u) this.f145g);
                if (this.f140b) {
                    int e9 = rVar.e();
                    int i10 = this.f143e;
                    if (i10 < 10) {
                        int min = Math.min(e9, 10 - i10);
                        byte[] bArr = (byte[]) rVar.f384c;
                        int i11 = rVar.f382a;
                        A4.r rVar2 = (A4.r) this.f144f;
                        System.arraycopy(bArr, i11, (byte[]) rVar2.f384c, this.f143e, min);
                        if (this.f143e + min == 10) {
                            rVar2.H(0);
                            if (73 == rVar2.x() && 68 == rVar2.x() && 51 == rVar2.x()) {
                                rVar2.I(3);
                                this.f142d = rVar2.w() + 10;
                            } else {
                                AbstractC1566a.P("Id3Reader", "Discarding invalid ID3 tag");
                                this.f140b = false;
                                return;
                            }
                        }
                    }
                    int min2 = Math.min(e9, this.f142d - this.f143e);
                    ((q3.u) this.f145g).c(min2, rVar);
                    this.f143e += min2;
                    return;
                }
                return;
        }
    }

    @Override // A3.InterfaceC0008i
    public final void d() {
        int i9;
        switch (this.f139a) {
            case 0:
                if (this.f140b) {
                    if (this.f141c != -9223372036854775807L) {
                        for (q3.u uVar : (q3.u[]) this.f145g) {
                            uVar.d(this.f141c, 1, this.f143e, 0, null);
                        }
                    }
                    this.f140b = false;
                    return;
                }
                return;
            default:
                AbstractC1566a.n((q3.u) this.f145g);
                if (this.f140b && (i9 = this.f142d) != 0 && this.f143e == i9) {
                    long j = this.f141c;
                    if (j != -9223372036854775807L) {
                        ((q3.u) this.f145g).d(j, 1, i9, 0, null);
                    }
                    this.f140b = false;
                    return;
                }
                return;
        }
    }

    @Override // A3.InterfaceC0008i
    public final void e(long j, int i9) {
        switch (this.f139a) {
            case 0:
                if ((i9 & 4) != 0) {
                    this.f140b = true;
                    if (j != -9223372036854775807L) {
                        this.f141c = j;
                    }
                    this.f143e = 0;
                    this.f142d = 2;
                    return;
                }
                return;
            default:
                if ((i9 & 4) != 0) {
                    this.f140b = true;
                    if (j != -9223372036854775807L) {
                        this.f141c = j;
                    }
                    this.f142d = 0;
                    this.f143e = 0;
                    return;
                }
                return;
        }
    }

    @Override // A3.InterfaceC0008i
    public final void f(InterfaceC1907l interfaceC1907l, I i9) {
        switch (this.f139a) {
            case 0:
                int i10 = 0;
                while (true) {
                    q3.u[] uVarArr = (q3.u[]) this.f145g;
                    if (i10 < uVarArr.length) {
                        H h7 = (H) ((List) this.f144f).get(i10);
                        i9.a();
                        i9.b();
                        q3.u u9 = interfaceC1907l.u(i9.f77d, 3);
                        L l9 = new L();
                        i9.b();
                        l9.f19393a = i9.f78e;
                        l9.f19402k = "application/dvbsubs";
                        l9.f19404m = Collections.singletonList(h7.f73b);
                        l9.f19395c = h7.f72a;
                        AbstractC0953k1.u(l9, u9);
                        uVarArr[i10] = u9;
                        i10++;
                    } else {
                        return;
                    }
                }
            default:
                i9.a();
                i9.b();
                q3.u u10 = interfaceC1907l.u(i9.f77d, 5);
                this.f145g = u10;
                L l10 = new L();
                i9.b();
                l10.f19393a = i9.f78e;
                l10.f19402k = "application/id3";
                AbstractC0953k1.u(l10, u10);
                return;
        }
    }

    public C0007h() {
        this.f139a = 1;
        this.f144f = new A4.r(10);
        this.f141c = -9223372036854775807L;
    }
}
