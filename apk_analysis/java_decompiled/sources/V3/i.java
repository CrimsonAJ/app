package V3;

import A4.r;
import U3.l;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import j3.L;
import j3.M;
import java.util.Locale;
import l4.AbstractC1566a;
import l4.y;
import l6.AbstractC1570b;
import q3.InterfaceC1907l;
import q3.u;

/* loaded from: classes.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    public final l f7725a;

    /* renamed from: b, reason: collision with root package name */
    public u f7726b;

    /* renamed from: c, reason: collision with root package name */
    public long f7727c = -9223372036854775807L;

    /* renamed from: d, reason: collision with root package name */
    public int f7728d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f7729e = -1;

    /* renamed from: f, reason: collision with root package name */
    public long f7730f = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    public long f7731g = 0;

    /* renamed from: h, reason: collision with root package name */
    public boolean f7732h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f7733i;
    public boolean j;

    public i(l lVar) {
        this.f7725a = lVar;
    }

    @Override // V3.h
    public final void b(long j, long j4) {
        this.f7727c = j;
        this.f7729e = -1;
        this.f7731g = j4;
    }

    @Override // V3.h
    public final void c(long j) {
        boolean z9;
        if (this.f7727c == -9223372036854775807L) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC1566a.m(z9);
        this.f7727c = j;
    }

    @Override // V3.h
    public final void d(r rVar, long j, int i9, boolean z9) {
        boolean z10;
        AbstractC1566a.n(this.f7726b);
        int x5 = rVar.x();
        if ((x5 & 16) == 16 && (x5 & 7) == 0) {
            if (this.f7732h && this.f7729e > 0) {
                u uVar = this.f7726b;
                uVar.getClass();
                uVar.d(this.f7730f, this.f7733i ? 1 : 0, this.f7729e, 0, null);
                this.f7729e = -1;
                this.f7730f = -9223372036854775807L;
                this.f7732h = false;
            }
            this.f7732h = true;
        } else if (this.f7732h) {
            int a5 = U3.i.a(this.f7728d);
            if (i9 < a5) {
                int i10 = y.f20553a;
                Locale locale = Locale.US;
                AbstractC1566a.P("RtpVP8Reader", "Received RTP packet with unexpected sequence number. Expected: " + a5 + "; received: " + i9 + ". Dropping packet.");
                return;
            }
        } else {
            AbstractC1566a.P("RtpVP8Reader", "RTP packet is not the start of a new VP8 partition, skipping.");
            return;
        }
        if ((x5 & 128) != 0) {
            int x9 = rVar.x();
            if ((x9 & 128) != 0 && (rVar.x() & 128) != 0) {
                rVar.I(1);
            }
            if ((x9 & 64) != 0) {
                rVar.I(1);
            }
            if ((x9 & 32) != 0 || (16 & x9) != 0) {
                rVar.I(1);
            }
        }
        if (this.f7729e == -1 && this.f7732h) {
            if ((rVar.g() & 1) == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f7733i = z10;
        }
        if (!this.j) {
            int i11 = rVar.f382a;
            rVar.H(i11 + 6);
            int p9 = rVar.p() & 16383;
            int p10 = rVar.p() & 16383;
            rVar.H(i11);
            M m9 = this.f7725a.f7400c;
            if (p9 != m9.f19440q || p10 != m9.f19441r) {
                u uVar2 = this.f7726b;
                L a9 = m9.a();
                a9.f19407p = p9;
                a9.f19408q = p10;
                AbstractC0953k1.u(a9, uVar2);
            }
            this.j = true;
        }
        int e8 = rVar.e();
        this.f7726b.c(e8, rVar);
        int i12 = this.f7729e;
        if (i12 == -1) {
            this.f7729e = e8;
        } else {
            this.f7729e = i12 + e8;
        }
        this.f7730f = AbstractC1570b.w(this.f7731g, j, this.f7727c, 90000);
        if (z9) {
            u uVar3 = this.f7726b;
            uVar3.getClass();
            uVar3.d(this.f7730f, this.f7733i ? 1 : 0, this.f7729e, 0, null);
            this.f7729e = -1;
            this.f7730f = -9223372036854775807L;
            this.f7732h = false;
        }
        this.f7728d = i9;
    }

    @Override // V3.h
    public final void e(InterfaceC1907l interfaceC1907l, int i9) {
        u u9 = interfaceC1907l.u(i9, 2);
        this.f7726b = u9;
        u9.e(this.f7725a.f7400c);
    }
}
