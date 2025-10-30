package A3;

import j3.L;
import j3.M;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: A3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0005f {

    /* renamed from: a, reason: collision with root package name */
    public final int f127a;

    /* renamed from: b, reason: collision with root package name */
    public final List f128b;

    public C0005f(List list, int i9) {
        this.f127a = i9;
        this.f128b = list;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x0031. Please report as an issue. */
    public J a(int i9, android.support.v4.media.session.y yVar) {
        if (i9 != 2) {
            String str = (String) yVar.f9331b;
            if (i9 != 3 && i9 != 4) {
                if (i9 != 21) {
                    if (i9 != 27) {
                        if (i9 != 36) {
                            if (i9 != 89) {
                                if (i9 != 138) {
                                    if (i9 != 172) {
                                        if (i9 != 257) {
                                            if (i9 != 134) {
                                                if (i9 != 135) {
                                                    switch (i9) {
                                                        case 15:
                                                            if (!c(2)) {
                                                                return new w(new C0004e(str, false));
                                                            }
                                                            return null;
                                                        case 16:
                                                            return new w(new n(new D(b(yVar), 1)));
                                                        case 17:
                                                            if (!c(2)) {
                                                                return new w(new t(str));
                                                            }
                                                            return null;
                                                        default:
                                                            switch (i9) {
                                                                case 128:
                                                                    break;
                                                                case 129:
                                                                    break;
                                                                case 130:
                                                                    if (!c(64)) {
                                                                        return null;
                                                                    }
                                                                    break;
                                                                default:
                                                                    return null;
                                                            }
                                                    }
                                                }
                                                return new w(new C0001b(str, 0));
                                            }
                                            if (!c(16)) {
                                                return new C(new android.support.v4.media.session.y("application/x-scte35", 1));
                                            }
                                            return null;
                                        }
                                        return new C(new android.support.v4.media.session.y("application/vnd.dvb.ait", 1));
                                    }
                                    return new w(new C0001b(str, 1));
                                }
                                return new w(new C0006g(str));
                            }
                            return new w(new C0007h((List) yVar.f9332c));
                        }
                        return new w(new s(new D(b(yVar), 0)));
                    }
                    if (c(4)) {
                        return null;
                    }
                    return new w(new q(new D(b(yVar), 0), c(1), c(8)));
                }
                return new w(new C0007h());
            }
            return new w(new u(str));
        }
        return new w(new k(new D(b(yVar), 1)));
    }

    public List b(android.support.v4.media.session.y yVar) {
        boolean z9;
        String str;
        int i9;
        List list;
        byte[] bArr;
        boolean c3 = c(32);
        List list2 = this.f128b;
        if (c3) {
            return list2;
        }
        A4.r rVar = new A4.r((byte[]) yVar.f9333d);
        while (rVar.e() > 0) {
            int x5 = rVar.x();
            int x9 = rVar.f382a + rVar.x();
            if (x5 == 134) {
                ArrayList arrayList = new ArrayList();
                int x10 = rVar.x() & 31;
                for (int i10 = 0; i10 < x10; i10++) {
                    String v8 = rVar.v(3, O5.e.f5491c);
                    int x11 = rVar.x();
                    if ((x11 & 128) != 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        i9 = x11 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i9 = 1;
                    }
                    byte x12 = (byte) rVar.x();
                    rVar.I(1);
                    if (z9) {
                        if ((x12 & 64) != 0) {
                            bArr = new byte[]{1};
                        } else {
                            bArr = new byte[]{0};
                        }
                        list = Collections.singletonList(bArr);
                    } else {
                        list = null;
                    }
                    L l9 = new L();
                    l9.f19402k = str;
                    l9.f19395c = v8;
                    l9.f19391C = i9;
                    l9.f19404m = list;
                    arrayList.add(new M(l9));
                }
                list2 = arrayList;
            }
            rVar.H(x9);
        }
        return list2;
    }

    public boolean c(int i9) {
        if ((i9 & this.f127a) != 0) {
            return true;
        }
        return false;
    }

    public C0005f() {
        this.f127a = 1;
        this.f128b = Collections.singletonList(null);
    }

    public C0005f(ArrayList arrayList) {
        this.f127a = 0;
        this.f128b = arrayList;
    }
}
