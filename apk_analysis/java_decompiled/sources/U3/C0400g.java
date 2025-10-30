package U3;

import N3.C0270v;
import android.os.SystemClock;
import c7.C0790j;
import co.notix.R;
import l4.AbstractC1566a;
import q3.C1902g;
import q3.C1908m;
import q3.InterfaceC1905j;
import q3.InterfaceC1906k;
import q3.InterfaceC1907l;

/* renamed from: U3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0400g implements InterfaceC1905j {

    /* renamed from: a, reason: collision with root package name */
    public final V3.h f7367a;

    /* renamed from: b, reason: collision with root package name */
    public final A4.r f7368b;

    /* renamed from: c, reason: collision with root package name */
    public final A4.r f7369c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7370d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f7371e;

    /* renamed from: f, reason: collision with root package name */
    public final k f7372f;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC1907l f7373g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f7374h;

    /* renamed from: i, reason: collision with root package name */
    public volatile long f7375i;
    public volatile int j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f7376k;

    /* renamed from: l, reason: collision with root package name */
    public long f7377l;

    /* renamed from: m, reason: collision with root package name */
    public long f7378m;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public C0400g(l lVar, int i9) {
        char c3;
        V3.h dVar;
        V3.h hVar;
        this.f7370d = i9;
        String str = lVar.f7400c.f19435l;
        str.getClass();
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals("video/3gpp")) {
                    c3 = 0;
                    break;
                }
                c3 = 65535;
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c3 = 1;
                    break;
                }
                c3 = 65535;
                break;
            case -1606874997:
                if (str.equals("audio/amr-wb")) {
                    c3 = 2;
                    break;
                }
                c3 = 65535;
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c3 = 3;
                    break;
                }
                c3 = 65535;
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c3 = 4;
                    break;
                }
                c3 = 65535;
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                    c3 = 5;
                    break;
                }
                c3 = 65535;
                break;
            case 1187890754:
                if (str.equals("video/mp4v-es")) {
                    c3 = 6;
                    break;
                }
                c3 = 65535;
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c3 = 7;
                    break;
                }
                c3 = 65535;
                break;
            case 1503095341:
                if (str.equals("audio/3gpp")) {
                    c3 = '\b';
                    break;
                }
                c3 = 65535;
                break;
            case 1504891608:
                if (str.equals("audio/opus")) {
                    c3 = '\t';
                    break;
                }
                c3 = 65535;
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c3 = '\n';
                    break;
                }
                c3 = 65535;
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c3 = 11;
                    break;
                }
                c3 = 65535;
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    c3 = '\f';
                    break;
                }
                c3 = 65535;
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    c3 = '\r';
                    break;
                }
                c3 = 65535;
                break;
            default:
                c3 = 65535;
                break;
        }
        switch (c3) {
            case 0:
                dVar = new V3.d(lVar, 0);
                hVar = dVar;
                break;
            case 1:
                dVar = new V3.e(lVar, 1);
                hVar = dVar;
                break;
            case 2:
            case '\b':
                dVar = new V3.c(lVar);
                hVar = dVar;
                break;
            case 3:
                if (lVar.f7402e.equals("MP4A-LATM")) {
                    dVar = new V3.f(lVar);
                } else {
                    dVar = new V3.a(lVar);
                }
                hVar = dVar;
                break;
            case 4:
                dVar = new V3.b(lVar);
                hVar = dVar;
                break;
            case 5:
            case '\f':
            case '\r':
                dVar = new D4.z(lVar);
                hVar = dVar;
                break;
            case 6:
                dVar = new C0270v(lVar);
                hVar = dVar;
                break;
            case 7:
                dVar = new V3.e(lVar, 0);
                hVar = dVar;
                break;
            case '\t':
                dVar = new V3.g(lVar);
                hVar = dVar;
                break;
            case R.styleable.GradientColor_android_endX /* 10 */:
                dVar = new V3.i(lVar);
                hVar = dVar;
                break;
            case R.styleable.GradientColor_android_endY /* 11 */:
                dVar = new V3.d(lVar, 1);
                hVar = dVar;
                break;
            default:
                hVar = null;
                break;
        }
        hVar.getClass();
        this.f7367a = hVar;
        this.f7368b = new A4.r(65507);
        this.f7369c = new A4.r(5, false);
        this.f7371e = new Object();
        this.f7372f = new k();
        this.f7375i = -9223372036854775807L;
        this.j = -1;
        this.f7377l = -9223372036854775807L;
        this.f7378m = -9223372036854775807L;
    }

    @Override // q3.InterfaceC1905j
    public final void b(long j, long j4) {
        synchronized (this.f7371e) {
            try {
                if (!this.f7376k) {
                    this.f7376k = true;
                }
                this.f7377l = j;
                this.f7378m = j4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, U3.h] */
    @Override // q3.InterfaceC1905j
    public final int f(InterfaceC1906k interfaceC1906k, C0790j c0790j) {
        boolean z9;
        boolean z10;
        this.f7373g.getClass();
        int D8 = ((C1902g) interfaceC1906k).D((byte[]) this.f7368b.f384c, 0, 65507);
        if (D8 == -1) {
            return -1;
        }
        if (D8 != 0) {
            this.f7368b.H(0);
            this.f7368b.G(D8);
            A4.r rVar = this.f7368b;
            i iVar = null;
            if (rVar.e() >= 12) {
                int x5 = rVar.x();
                byte b9 = (byte) (x5 >> 6);
                byte b10 = (byte) (x5 & 15);
                if (b9 == 2) {
                    int x9 = rVar.x();
                    if (((x9 >> 7) & 1) == 1) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    byte b11 = (byte) (x9 & 127);
                    int C8 = rVar.C();
                    long y9 = rVar.y();
                    int i9 = rVar.i();
                    byte[] bArr = i.f7385g;
                    if (b10 > 0) {
                        byte[] bArr2 = new byte[b10 * 4];
                        for (int i10 = 0; i10 < b10; i10++) {
                            rVar.h(bArr2, i10 * 4, 4);
                        }
                    }
                    byte[] bArr3 = new byte[rVar.e()];
                    rVar.h(bArr3, 0, rVar.e());
                    ?? obj = new Object();
                    obj.f7384f = bArr;
                    obj.f7379a = z9;
                    obj.f7380b = b11;
                    if (C8 >= 0 && C8 <= 65535) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    AbstractC1566a.h(z10);
                    obj.f7381c = 65535 & C8;
                    obj.f7382d = y9;
                    obj.f7383e = i9;
                    obj.f7384f = bArr3;
                    iVar = new i(obj);
                }
            }
            if (iVar != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = elapsedRealtime - 30;
                this.f7372f.c(iVar, elapsedRealtime);
                i d9 = this.f7372f.d(j);
                if (d9 != null) {
                    if (!this.f7374h) {
                        if (this.f7375i == -9223372036854775807L) {
                            this.f7375i = d9.f7389d;
                        }
                        if (this.j == -1) {
                            this.j = d9.f7388c;
                        }
                        this.f7367a.c(this.f7375i);
                        this.f7374h = true;
                    }
                    synchronized (this.f7371e) {
                        try {
                            if (this.f7376k) {
                                if (this.f7377l != -9223372036854775807L && this.f7378m != -9223372036854775807L) {
                                    this.f7372f.e();
                                    this.f7367a.b(this.f7377l, this.f7378m);
                                    this.f7376k = false;
                                    this.f7377l = -9223372036854775807L;
                                    this.f7378m = -9223372036854775807L;
                                }
                            }
                            do {
                                A4.r rVar2 = this.f7369c;
                                byte[] bArr4 = d9.f7391f;
                                rVar2.getClass();
                                rVar2.F(bArr4.length, bArr4);
                                this.f7367a.d(this.f7369c, d9.f7389d, d9.f7388c, d9.f7386a);
                                d9 = this.f7372f.d(j);
                            } while (d9 != null);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return 0;
                }
            }
        }
        return 0;
    }

    @Override // q3.InterfaceC1905j
    public final void i(InterfaceC1907l interfaceC1907l) {
        this.f7367a.e(interfaceC1907l, this.f7370d);
        interfaceC1907l.i();
        interfaceC1907l.r(new C1908m(-9223372036854775807L));
        this.f7373g = interfaceC1907l;
    }

    @Override // q3.InterfaceC1905j
    public final boolean j(InterfaceC1906k interfaceC1906k) {
        throw new UnsupportedOperationException("RTP packets are transmitted in a packet stream do not support sniffing.");
    }

    @Override // q3.InterfaceC1905j
    public final void a() {
    }
}
