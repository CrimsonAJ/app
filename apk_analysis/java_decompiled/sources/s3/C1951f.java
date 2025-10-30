package s3;

import A4.r;
import P5.AbstractC0349q;
import P5.C;
import P5.D;
import P5.F;
import P5.S;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import j3.L;
import j3.M;
import java.util.Arrays;
import l4.AbstractC1566a;
import l4.y;

/* renamed from: s3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1951f implements InterfaceC1946a {

    /* renamed from: a, reason: collision with root package name */
    public final S f22705a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22706b;

    public C1951f(int i9, S s9) {
        this.f22706b = i9;
        this.f22705a = s9;
    }

    public static C1951f c(int i9, r rVar) {
        String str;
        InterfaceC1946a c1952g;
        String str2;
        int i10;
        int i11 = 4;
        AbstractC0349q.c(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i12 = rVar.f383b;
        int i13 = 0;
        int i14 = -2;
        int i15 = 0;
        while (rVar.e() > 8) {
            int k5 = rVar.k();
            int k9 = rVar.f382a + rVar.k();
            rVar.G(k9);
            if (k5 == 1414744396) {
                c1952g = c(rVar.k(), rVar);
            } else {
                C1949d c1949d = null;
                switch (k5) {
                    case 1718776947:
                        if (i14 == 2) {
                            rVar.I(i11);
                            int k10 = rVar.k();
                            int k11 = rVar.k();
                            rVar.I(i11);
                            int k12 = rVar.k();
                            switch (k12) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 == null) {
                                AbstractC0953k1.v("Ignoring track with unsupported compression ", k12, "StreamFormatChunk");
                                break;
                            } else {
                                L l9 = new L();
                                l9.f19407p = k10;
                                l9.f19408q = k11;
                                l9.f19402k = str2;
                                c1952g = new C1952g(new M(l9));
                                break;
                            }
                        } else if (i14 == 1) {
                            int p9 = rVar.p();
                            if (p9 == 1) {
                                str = "audio/raw";
                            } else if (p9 != 85) {
                                if (p9 == 255) {
                                    str = "audio/mp4a-latm";
                                } else if (p9 != 8192) {
                                    if (p9 != 8193) {
                                        str = null;
                                    } else {
                                        str = "audio/vnd.dts";
                                    }
                                } else {
                                    str = "audio/ac3";
                                }
                            } else {
                                str = "audio/mpeg";
                            }
                            if (str == null) {
                                AbstractC0953k1.v("Ignoring track with unsupported format tag ", p9, "StreamFormatChunk");
                                break;
                            } else {
                                int p10 = rVar.p();
                                int k13 = rVar.k();
                                rVar.I(6);
                                int w7 = y.w(rVar.C());
                                int p11 = rVar.p();
                                byte[] bArr = new byte[p11];
                                rVar.h(bArr, i13, p11);
                                L l10 = new L();
                                l10.f19402k = str;
                                l10.f19415x = p10;
                                l10.f19416y = k13;
                                if ("audio/raw".equals(str) && w7 != 0) {
                                    l10.f19417z = w7;
                                }
                                if ("audio/mp4a-latm".equals(str) && p11 > 0) {
                                    l10.f19404m = F.s(bArr);
                                }
                                c1952g = new C1952g(new M(l10));
                                break;
                            }
                        } else {
                            AbstractC1566a.P("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + y.C(i14));
                            break;
                        }
                    case 1751742049:
                        int k14 = rVar.k();
                        rVar.I(8);
                        int k15 = rVar.k();
                        int k16 = rVar.k();
                        rVar.I(i11);
                        rVar.k();
                        rVar.I(12);
                        c1952g = new C1948c(k14, k15, k16);
                        break;
                    case 1752331379:
                        int k17 = rVar.k();
                        rVar.I(12);
                        rVar.k();
                        int k18 = rVar.k();
                        int k19 = rVar.k();
                        rVar.I(i11);
                        int k20 = rVar.k();
                        int k21 = rVar.k();
                        rVar.I(8);
                        c1949d = new C1949d(k17, k18, k19, k20, k21);
                        break;
                    case 1852994675:
                        c1952g = new C1953h(rVar.v(rVar.e(), O5.e.f5491c));
                        break;
                }
                c1952g = c1949d;
            }
            if (c1952g != null) {
                if (c1952g.a() == 1752331379) {
                    int i16 = ((C1949d) c1952g).f22689a;
                    if (i16 != 1935960438) {
                        if (i16 != 1935963489) {
                            if (i16 != 1937012852) {
                                AbstractC1566a.P("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(i16));
                                i10 = -1;
                            } else {
                                i10 = 3;
                            }
                            i14 = i10;
                        } else {
                            i14 = 1;
                        }
                    } else {
                        i14 = 2;
                    }
                }
                int i17 = i15 + 1;
                if (objArr.length < i17) {
                    objArr = Arrays.copyOf(objArr, C.e(objArr.length, i17));
                }
                objArr[i15] = c1952g;
                i15 = i17;
            }
            rVar.H(k9);
            rVar.G(i12);
            i11 = 4;
            i13 = 0;
        }
        return new C1951f(i9, F.k(i15, objArr));
    }

    @Override // s3.InterfaceC1946a
    public final int a() {
        return this.f22706b;
    }

    public final InterfaceC1946a b(Class cls) {
        D listIterator = this.f22705a.listIterator(0);
        while (listIterator.hasNext()) {
            InterfaceC1946a interfaceC1946a = (InterfaceC1946a) listIterator.next();
            if (interfaceC1946a.getClass() == cls) {
                return interfaceC1946a;
            }
        }
        return null;
    }
}
