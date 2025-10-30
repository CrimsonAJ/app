package D3;

import I3.i;
import j3.M;
import u0.z;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f1788a = new Object();

    public final v4.e a(M m9) {
        String str = m9.f19435l;
        if (str != null) {
            char c3 = 65535;
            switch (str.hashCode()) {
                case -1354451219:
                    if (str.equals("application/vnd.dvb.ait")) {
                        c3 = 0;
                        break;
                    }
                    break;
                case -1348231605:
                    if (str.equals("application/x-icy")) {
                        c3 = 1;
                        break;
                    }
                    break;
                case -1248341703:
                    if (str.equals("application/id3")) {
                        c3 = 2;
                        break;
                    }
                    break;
                case 1154383568:
                    if (str.equals("application/x-emsg")) {
                        c3 = 3;
                        break;
                    }
                    break;
                case 1652648887:
                    if (str.equals("application/x-scte35")) {
                        c3 = 4;
                        break;
                    }
                    break;
            }
            switch (c3) {
                case 0:
                    return new E3.b(0);
                case 1:
                    return new H3.a();
                case 2:
                    return new i(null);
                case 3:
                    return new E3.b(1);
                case 4:
                    return new K3.c();
            }
        }
        throw new IllegalArgumentException(z.e("Attempted to create decoder for unsupported MIME type: ", str));
    }

    public final boolean b(M m9) {
        String str = m9.f19435l;
        if (!"application/id3".equals(str) && !"application/x-emsg".equals(str) && !"application/x-scte35".equals(str) && !"application/x-icy".equals(str) && !"application/vnd.dvb.ait".equals(str)) {
            return false;
        }
        return true;
    }
}
