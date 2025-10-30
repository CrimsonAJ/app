package S3;

import com.google.android.gms.internal.measurement.AbstractC0953k1;
import j3.L;
import j3.M;
import java.io.EOFException;
import java.util.Arrays;
import k4.InterfaceC1510j;
import l4.AbstractC1566a;
import l4.y;

/* loaded from: classes.dex */
public final class p implements q3.u {

    /* renamed from: f, reason: collision with root package name */
    public static final M f6853f;

    /* renamed from: g, reason: collision with root package name */
    public static final M f6854g;

    /* renamed from: a, reason: collision with root package name */
    public final q3.u f6855a;

    /* renamed from: b, reason: collision with root package name */
    public final M f6856b;

    /* renamed from: c, reason: collision with root package name */
    public M f6857c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f6858d;

    /* renamed from: e, reason: collision with root package name */
    public int f6859e;

    static {
        L l9 = new L();
        l9.f19402k = "application/id3";
        f6853f = new M(l9);
        L l10 = new L();
        l10.f19402k = "application/x-emsg";
        f6854g = new M(l10);
    }

    public p(q3.u uVar, int i9) {
        this.f6855a = uVar;
        if (i9 != 1) {
            if (i9 == 3) {
                this.f6856b = f6854g;
            } else {
                throw new IllegalArgumentException(AbstractC0953k1.j(i9, "Unknown metadataType: "));
            }
        } else {
            this.f6856b = f6853f;
        }
        this.f6858d = new byte[0];
        this.f6859e = 0;
    }

    @Override // q3.u
    public final int a(InterfaceC1510j interfaceC1510j, int i9, boolean z9) {
        int i10 = this.f6859e + i9;
        byte[] bArr = this.f6858d;
        if (bArr.length < i10) {
            this.f6858d = Arrays.copyOf(bArr, (i10 / 2) + i10);
        }
        int D8 = interfaceC1510j.D(this.f6858d, this.f6859e, i9);
        if (D8 == -1) {
            if (z9) {
                return -1;
            }
            throw new EOFException();
        }
        this.f6859e += D8;
        return D8;
    }

    @Override // q3.u
    public final void b(int i9, A4.r rVar) {
        int i10 = this.f6859e + i9;
        byte[] bArr = this.f6858d;
        if (bArr.length < i10) {
            this.f6858d = Arrays.copyOf(bArr, (i10 / 2) + i10);
        }
        rVar.h(this.f6858d, this.f6859e, i9);
        this.f6859e += i9;
    }

    @Override // q3.u
    public final /* synthetic */ void c(int i9, A4.r rVar) {
        AbstractC0953k1.a(this, rVar, i9);
    }

    @Override // q3.u
    public final void d(long j, int i9, int i10, int i11, q3.t tVar) {
        this.f6857c.getClass();
        int i12 = this.f6859e - i11;
        A4.r rVar = new A4.r(Arrays.copyOfRange(this.f6858d, i12 - i10, i12));
        byte[] bArr = this.f6858d;
        System.arraycopy(bArr, i12, bArr, 0, i11);
        this.f6859e = i11;
        String str = this.f6857c.f19435l;
        M m9 = this.f6856b;
        if (!y.a(str, m9.f19435l)) {
            if ("application/x-emsg".equals(this.f6857c.f19435l)) {
                F3.a a02 = E3.b.a0(rVar);
                M c3 = a02.c();
                String str2 = m9.f19435l;
                if (c3 != null && y.a(str2, c3.f19435l)) {
                    byte[] e8 = a02.e();
                    e8.getClass();
                    rVar = new A4.r(e8);
                } else {
                    AbstractC1566a.P("HlsSampleStreamWrapper", "Ignoring EMSG. Expected it to contain wrapped " + str2 + " but actual wrapped format: " + a02.c());
                    return;
                }
            } else {
                AbstractC1566a.P("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.f6857c.f19435l);
                return;
            }
        }
        int e9 = rVar.e();
        q3.u uVar = this.f6855a;
        uVar.c(e9, rVar);
        uVar.d(j, i9, e9, i11, tVar);
    }

    @Override // q3.u
    public final void e(M m9) {
        this.f6857c = m9;
        this.f6855a.e(this.f6856b);
    }
}
