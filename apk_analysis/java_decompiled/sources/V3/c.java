package V3;

import A4.r;
import U3.l;
import java.util.Locale;
import l4.AbstractC1566a;
import l4.y;
import l6.AbstractC1570b;
import q3.InterfaceC1907l;
import q3.u;

/* loaded from: classes.dex */
public final class c implements h {

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f7680h = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f7681i = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* renamed from: a, reason: collision with root package name */
    public final l f7682a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7683b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7684c;

    /* renamed from: d, reason: collision with root package name */
    public u f7685d;

    /* renamed from: e, reason: collision with root package name */
    public long f7686e;

    /* renamed from: f, reason: collision with root package name */
    public long f7687f;

    /* renamed from: g, reason: collision with root package name */
    public int f7688g;

    public c(l lVar) {
        this.f7682a = lVar;
        String str = lVar.f7400c.f19435l;
        str.getClass();
        this.f7683b = "audio/amr-wb".equals(str);
        this.f7684c = lVar.f7399b;
        this.f7686e = -9223372036854775807L;
        this.f7688g = -1;
        this.f7687f = 0L;
    }

    @Override // V3.h
    public final void b(long j, long j4) {
        this.f7686e = j;
        this.f7687f = j4;
    }

    @Override // V3.h
    public final void c(long j) {
        this.f7686e = j;
    }

    @Override // V3.h
    public final void d(r rVar, long j, int i9, boolean z9) {
        boolean z10;
        String str;
        int i10;
        int a5;
        AbstractC1566a.n(this.f7685d);
        int i11 = this.f7688g;
        if (i11 != -1 && i9 != (a5 = U3.i.a(i11))) {
            int i12 = y.f20553a;
            Locale locale = Locale.US;
            AbstractC1566a.P("RtpAmrReader", "Received RTP packet with unexpected sequence number. Expected: " + a5 + "; received: " + i9 + ".");
        }
        boolean z11 = true;
        rVar.I(1);
        int g9 = (rVar.g() >> 3) & 15;
        if ((g9 >= 0 && g9 <= 8) || g9 == 15) {
            z10 = true;
        } else {
            z10 = false;
        }
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        boolean z12 = this.f7683b;
        if (z12) {
            str = "WB";
        } else {
            str = "NB";
        }
        sb.append(str);
        sb.append(" frame type ");
        sb.append(g9);
        AbstractC1566a.g(sb.toString(), z10);
        if (z12) {
            i10 = f7681i[g9];
        } else {
            i10 = f7680h[g9];
        }
        int e8 = rVar.e();
        if (e8 != i10) {
            z11 = false;
        }
        AbstractC1566a.g("compound payload not supported currently", z11);
        this.f7685d.c(e8, rVar);
        this.f7685d.d(AbstractC1570b.w(this.f7687f, j, this.f7686e, this.f7684c), 1, e8, 0, null);
        this.f7688g = i9;
    }

    @Override // V3.h
    public final void e(InterfaceC1907l interfaceC1907l, int i9) {
        u u9 = interfaceC1907l.u(i9, 1);
        this.f7685d = u9;
        u9.e(this.f7682a.f7400c);
    }
}
