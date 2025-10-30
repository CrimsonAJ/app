package r3;

import O5.e;
import c7.C0790j;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import j3.L;
import j3.j0;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.Arrays;
import l4.AbstractC1566a;
import l4.y;
import q3.C1902g;
import q3.C1908m;
import q3.InterfaceC1905j;
import q3.InterfaceC1906k;
import q3.InterfaceC1907l;
import q3.r;
import q3.u;
import x3.C2169a;

/* renamed from: r3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1925a implements InterfaceC1905j {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f22603n = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f22604o;

    /* renamed from: p, reason: collision with root package name */
    public static final byte[] f22605p;

    /* renamed from: q, reason: collision with root package name */
    public static final byte[] f22606q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f22607r;

    /* renamed from: b, reason: collision with root package name */
    public boolean f22609b;

    /* renamed from: c, reason: collision with root package name */
    public long f22610c;

    /* renamed from: d, reason: collision with root package name */
    public int f22611d;

    /* renamed from: e, reason: collision with root package name */
    public int f22612e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f22613f;

    /* renamed from: h, reason: collision with root package name */
    public int f22615h;

    /* renamed from: i, reason: collision with root package name */
    public long f22616i;
    public InterfaceC1907l j;

    /* renamed from: k, reason: collision with root package name */
    public u f22617k;

    /* renamed from: l, reason: collision with root package name */
    public r f22618l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f22619m;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f22608a = new byte[1];

    /* renamed from: g, reason: collision with root package name */
    public int f22614g = -1;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f22604o = iArr;
        int i9 = y.f20553a;
        Charset charset = e.f5491c;
        f22605p = "#!AMR\n".getBytes(charset);
        f22606q = "#!AMR-WB\n".getBytes(charset);
        f22607r = iArr[8];
    }

    @Override // q3.InterfaceC1905j
    public final void b(long j, long j4) {
        this.f22610c = 0L;
        this.f22611d = 0;
        this.f22612e = 0;
        if (j != 0) {
            r rVar = this.f22618l;
            if (rVar instanceof C2169a) {
                this.f22616i = (Math.max(0L, j - ((C2169a) rVar).f24561b) * 8000000) / r0.f24564e;
                return;
            }
        }
        this.f22616i = 0L;
    }

    public final int c(C1902g c1902g) {
        String str;
        boolean z9;
        c1902g.f22314f = 0;
        byte[] bArr = this.f22608a;
        c1902g.t(bArr, 0, 1, false);
        byte b9 = bArr[0];
        if ((b9 & 131) <= 0) {
            int i9 = (b9 >> 3) & 15;
            if (i9 >= 0 && i9 <= 15 && (((z9 = this.f22609b) && (i9 < 10 || i9 > 13)) || (!z9 && (i9 < 12 || i9 > 14)))) {
                if (z9) {
                    return f22604o[i9];
                }
                return f22603n[i9];
            }
            StringBuilder sb = new StringBuilder("Illegal AMR ");
            if (this.f22609b) {
                str = "WB";
            } else {
                str = "NB";
            }
            sb.append(str);
            sb.append(" frame type ");
            sb.append(i9);
            throw j0.a(sb.toString(), null);
        }
        throw j0.a("Invalid padding bits for frame header " + ((int) b9), null);
    }

    public final boolean d(C1902g c1902g) {
        c1902g.f22314f = 0;
        byte[] bArr = f22605p;
        byte[] bArr2 = new byte[bArr.length];
        c1902g.t(bArr2, 0, bArr.length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.f22609b = false;
            c1902g.n(bArr.length);
            return true;
        }
        c1902g.f22314f = 0;
        byte[] bArr3 = f22606q;
        byte[] bArr4 = new byte[bArr3.length];
        c1902g.t(bArr4, 0, bArr3.length, false);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f22609b = true;
        c1902g.n(bArr3.length);
        return true;
    }

    @Override // q3.InterfaceC1905j
    public final int f(InterfaceC1906k interfaceC1906k, C0790j c0790j) {
        String str;
        int i9;
        AbstractC1566a.n(this.f22617k);
        int i10 = y.f20553a;
        if (((C1902g) interfaceC1906k).f22312d == 0 && !d((C1902g) interfaceC1906k)) {
            throw j0.a("Could not find AMR header.", null);
        }
        if (!this.f22619m) {
            this.f22619m = true;
            boolean z9 = this.f22609b;
            if (z9) {
                str = "audio/amr-wb";
            } else {
                str = "audio/3gpp";
            }
            if (z9) {
                i9 = 16000;
            } else {
                i9 = 8000;
            }
            u uVar = this.f22617k;
            L l9 = new L();
            l9.f19402k = str;
            l9.f19403l = f22607r;
            l9.f19415x = 1;
            l9.f19416y = i9;
            AbstractC0953k1.u(l9, uVar);
        }
        int i11 = -1;
        if (this.f22612e == 0) {
            try {
                int c3 = c((C1902g) interfaceC1906k);
                this.f22611d = c3;
                this.f22612e = c3;
                if (this.f22614g == -1) {
                    long j = ((C1902g) interfaceC1906k).f22312d;
                    this.f22614g = c3;
                }
                if (this.f22614g == c3) {
                    this.f22615h++;
                }
            } catch (EOFException unused) {
            }
        }
        int a5 = this.f22617k.a(interfaceC1906k, this.f22612e, true);
        if (a5 != -1) {
            int i12 = this.f22612e - a5;
            this.f22612e = i12;
            i11 = 0;
            if (i12 <= 0) {
                this.f22617k.d(this.f22610c + this.f22616i, 1, this.f22611d, 0, null);
                this.f22610c += 20000;
            }
        }
        if (!this.f22613f) {
            C1908m c1908m = new C1908m(-9223372036854775807L);
            this.f22618l = c1908m;
            this.j.r(c1908m);
            this.f22613f = true;
        }
        return i11;
    }

    @Override // q3.InterfaceC1905j
    public final void i(InterfaceC1907l interfaceC1907l) {
        this.j = interfaceC1907l;
        this.f22617k = interfaceC1907l.u(0, 1);
        interfaceC1907l.i();
    }

    @Override // q3.InterfaceC1905j
    public final boolean j(InterfaceC1906k interfaceC1906k) {
        return d((C1902g) interfaceC1906k);
    }

    @Override // q3.InterfaceC1905j
    public final void a() {
    }
}
