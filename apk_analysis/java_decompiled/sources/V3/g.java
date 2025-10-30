package V3;

import A4.r;
import U3.l;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import j3.L;
import java.util.ArrayList;
import java.util.Locale;
import l3.AbstractC1552a;
import l4.AbstractC1566a;
import l4.y;
import l6.AbstractC1570b;
import q3.InterfaceC1907l;
import q3.u;

/* loaded from: classes.dex */
public final class g implements h {

    /* renamed from: a, reason: collision with root package name */
    public final l f7718a;

    /* renamed from: b, reason: collision with root package name */
    public u f7719b;

    /* renamed from: d, reason: collision with root package name */
    public long f7721d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7723f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7724g;

    /* renamed from: c, reason: collision with root package name */
    public long f7720c = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f7722e = -1;

    public g(l lVar) {
        this.f7718a = lVar;
    }

    @Override // V3.h
    public final void b(long j, long j4) {
        this.f7720c = j;
        this.f7721d = j4;
    }

    @Override // V3.h
    public final void c(long j) {
        this.f7720c = j;
    }

    @Override // V3.h
    public final void d(r rVar, long j, int i9, boolean z9) {
        boolean z10;
        AbstractC1566a.n(this.f7719b);
        boolean z11 = false;
        if (!this.f7723f) {
            int i10 = rVar.f382a;
            if (rVar.f383b > 18) {
                z10 = true;
            } else {
                z10 = false;
            }
            AbstractC1566a.g("ID Header has insufficient data", z10);
            AbstractC1566a.g("ID Header missing", rVar.v(8, O5.e.f5491c).equals("OpusHead"));
            if (rVar.x() == 1) {
                z11 = true;
            }
            AbstractC1566a.g("version number must always be 1", z11);
            rVar.H(i10);
            ArrayList c3 = AbstractC1552a.c((byte[]) rVar.f384c);
            L a5 = this.f7718a.f7400c.a();
            a5.f19404m = c3;
            AbstractC0953k1.u(a5, this.f7719b);
            this.f7723f = true;
        } else if (!this.f7724g) {
            if (rVar.f383b >= 8) {
                z11 = true;
            }
            AbstractC1566a.g("Comment Header has insufficient data", z11);
            AbstractC1566a.g("Comment Header should follow ID Header", rVar.v(8, O5.e.f5491c).equals("OpusTags"));
            this.f7724g = true;
        } else {
            int a9 = U3.i.a(this.f7722e);
            if (i9 != a9) {
                int i11 = y.f20553a;
                Locale locale = Locale.US;
                AbstractC1566a.P("RtpOpusReader", "Received RTP packet with unexpected sequence number. Expected: " + a9 + "; received: " + i9 + ".");
            }
            int e8 = rVar.e();
            this.f7719b.c(e8, rVar);
            this.f7719b.d(AbstractC1570b.w(this.f7721d, j, this.f7720c, 48000), 1, e8, 0, null);
        }
        this.f7722e = i9;
    }

    @Override // V3.h
    public final void e(InterfaceC1907l interfaceC1907l, int i9) {
        u u9 = interfaceC1907l.u(i9, 1);
        this.f7719b = u9;
        u9.e(this.f7718a.f7400c);
    }
}
