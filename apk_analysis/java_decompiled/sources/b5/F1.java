package b5;

import android.net.Uri;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class F1 extends z1 {
    public static final boolean o0(String str) {
        String str2 = (String) E.f10688t.a(null);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String str3 : str2.split(",")) {
            if (str.equalsIgnoreCase(str3.trim())) {
                return true;
            }
        }
        return false;
    }

    public final String m0(String str) {
        C0635i0 c0635i0 = this.f11361b.f10742a;
        J1.J(c0635i0);
        String B02 = c0635i0.B0(str);
        if (!TextUtils.isEmpty(B02)) {
            Uri parse = Uri.parse((String) E.f10685r.a(null));
            Uri.Builder buildUpon = parse.buildUpon();
            buildUpon.authority(B02 + "." + parse.getAuthority());
            return buildUpon.build().toString();
        }
        return (String) E.f10685r.a(null);
    }

    public final boolean n0(String str, String str2) {
        J1 j12 = this.f11361b;
        C0635i0 c0635i0 = j12.f10742a;
        J1.J(c0635i0);
        com.google.android.gms.internal.measurement.F0 A02 = c0635i0.A0(str);
        if (A02 != null) {
            C0649n c0649n = j12.f10744c;
            J1.J(c0649n);
            Q i12 = c0649n.i1(str);
            if (i12 != null) {
                if (!A02.G() || A02.u().n() != 100) {
                    P1 p12 = ((C0650n0) this.f1707a).f11231l;
                    C0650n0.d(p12);
                    if (!p12.b1(str, i12.i())) {
                        if (!TextUtils.isEmpty(str2) && Math.abs(str2.hashCode() % 100) < A02.u().n()) {
                            return true;
                        }
                        return false;
                    }
                    return true;
                }
                return true;
            }
            return false;
        }
        return false;
    }
}
