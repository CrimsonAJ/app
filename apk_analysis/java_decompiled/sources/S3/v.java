package S3;

import android.text.TextUtils;
import c7.C0790j;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import j3.L;
import j3.j0;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l4.x;
import q3.C1902g;
import q3.C1908m;
import q3.InterfaceC1905j;
import q3.InterfaceC1906k;
import q3.InterfaceC1907l;

/* loaded from: classes.dex */
public final class v implements InterfaceC1905j {

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f6920g = Pattern.compile("LOCAL:([^,]+)");

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f6921h = Pattern.compile("MPEGTS:(-?\\d+)");

    /* renamed from: a, reason: collision with root package name */
    public final String f6922a;

    /* renamed from: b, reason: collision with root package name */
    public final x f6923b;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC1907l f6925d;

    /* renamed from: f, reason: collision with root package name */
    public int f6927f;

    /* renamed from: c, reason: collision with root package name */
    public final A4.r f6924c = new A4.r(5, false);

    /* renamed from: e, reason: collision with root package name */
    public byte[] f6926e = new byte[1024];

    public v(String str, x xVar) {
        this.f6922a = str;
        this.f6923b = xVar;
    }

    @Override // q3.InterfaceC1905j
    public final void b(long j, long j4) {
        throw new IllegalStateException();
    }

    public final q3.u c(long j) {
        q3.u u9 = this.f6925d.u(0, 3);
        L l9 = new L();
        l9.f19402k = "text/vtt";
        l9.f19395c = this.f6922a;
        l9.f19406o = j;
        AbstractC0953k1.u(l9, u9);
        this.f6925d.i();
        return u9;
    }

    @Override // q3.InterfaceC1905j
    public final int f(InterfaceC1906k interfaceC1906k, C0790j c0790j) {
        String j;
        int length;
        this.f6925d.getClass();
        int i9 = (int) ((C1902g) interfaceC1906k).f22311c;
        int i10 = this.f6927f;
        byte[] bArr = this.f6926e;
        int i11 = -1;
        if (i10 == bArr.length) {
            if (i9 != -1) {
                length = i9;
            } else {
                length = bArr.length;
            }
            this.f6926e = Arrays.copyOf(bArr, (length * 3) / 2);
        }
        byte[] bArr2 = this.f6926e;
        int i12 = this.f6927f;
        int D8 = ((C1902g) interfaceC1906k).D(bArr2, i12, bArr2.length - i12);
        if (D8 != -1) {
            int i13 = this.f6927f + D8;
            this.f6927f = i13;
            if (i9 == -1 || i13 != i9) {
                return 0;
            }
        }
        A4.r rVar = new A4.r(this.f6926e);
        h4.i.c(rVar);
        String j4 = rVar.j();
        long j9 = 0;
        long j10 = 0;
        while (true) {
            int i14 = i11;
            Matcher matcher = null;
            if (!TextUtils.isEmpty(j4)) {
                if (j4.startsWith("X-TIMESTAMP-MAP")) {
                    Matcher matcher2 = f6920g.matcher(j4);
                    if (matcher2.find()) {
                        Matcher matcher3 = f6921h.matcher(j4);
                        if (matcher3.find()) {
                            String group = matcher2.group(1);
                            group.getClass();
                            j10 = h4.i.b(group);
                            String group2 = matcher3.group(1);
                            group2.getClass();
                            j9 = (Long.parseLong(group2) * 1000000) / 90000;
                        } else {
                            throw j0.a("X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(j4), null);
                        }
                    } else {
                        throw j0.a("X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(j4), null);
                    }
                }
                j4 = rVar.j();
                i11 = i14;
            } else {
                while (true) {
                    String j11 = rVar.j();
                    if (j11 == null) {
                        break;
                    }
                    if (h4.i.f17924a.matcher(j11).matches()) {
                        do {
                            j = rVar.j();
                            if (j != null) {
                            }
                        } while (!j.isEmpty());
                    } else {
                        Matcher matcher4 = h4.h.f17920a.matcher(j11);
                        if (matcher4.matches()) {
                            matcher = matcher4;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    c(0L);
                    return i14;
                }
                String group3 = matcher.group(1);
                group3.getClass();
                long b9 = h4.i.b(group3);
                long b10 = this.f6923b.b(((((j9 + b9) - j10) * 90000) / 1000000) % 8589934592L);
                q3.u c3 = c(b10 - b9);
                byte[] bArr3 = this.f6926e;
                int i15 = this.f6927f;
                A4.r rVar2 = this.f6924c;
                rVar2.F(i15, bArr3);
                c3.c(this.f6927f, rVar2);
                c3.d(b10, 1, this.f6927f, 0, null);
                return i14;
            }
        }
    }

    @Override // q3.InterfaceC1905j
    public final void i(InterfaceC1907l interfaceC1907l) {
        this.f6925d = interfaceC1907l;
        interfaceC1907l.r(new C1908m(-9223372036854775807L));
    }

    @Override // q3.InterfaceC1905j
    public final boolean j(InterfaceC1906k interfaceC1906k) {
        C1902g c1902g = (C1902g) interfaceC1906k;
        c1902g.t(this.f6926e, 0, 6, false);
        byte[] bArr = this.f6926e;
        A4.r rVar = this.f6924c;
        rVar.F(6, bArr);
        Pattern pattern = h4.i.f17924a;
        String j = rVar.j();
        if (j != null && j.startsWith("WEBVTT")) {
            return true;
        }
        c1902g.t(this.f6926e, 6, 3, false);
        rVar.F(9, this.f6926e);
        String j4 = rVar.j();
        if (j4 == null || !j4.startsWith("WEBVTT")) {
            return false;
        }
        return true;
    }

    @Override // q3.InterfaceC1905j
    public final void a() {
    }
}
