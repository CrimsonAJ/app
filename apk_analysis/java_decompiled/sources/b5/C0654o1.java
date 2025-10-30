package b5;

import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import p4.C1857a;

/* renamed from: b5.o1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0654o1 extends D1 {

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f11259d;

    /* renamed from: e, reason: collision with root package name */
    public final C0617c0 f11260e;

    /* renamed from: f, reason: collision with root package name */
    public final C0617c0 f11261f;

    /* renamed from: g, reason: collision with root package name */
    public final C0617c0 f11262g;

    /* renamed from: h, reason: collision with root package name */
    public final C0617c0 f11263h;

    /* renamed from: i, reason: collision with root package name */
    public final C0617c0 f11264i;
    public final C0617c0 j;

    public C0654o1(J1 j12) {
        super(j12);
        this.f11259d = new HashMap();
        C0623e0 c0623e0 = ((C0650n0) this.f1707a).f11228h;
        C0650n0.d(c0623e0);
        this.f11260e = new C0617c0(c0623e0, "last_delete_stale", 0L);
        C0623e0 c0623e02 = ((C0650n0) this.f1707a).f11228h;
        C0650n0.d(c0623e02);
        this.f11261f = new C0617c0(c0623e02, "last_delete_stale_batch", 0L);
        C0623e0 c0623e03 = ((C0650n0) this.f1707a).f11228h;
        C0650n0.d(c0623e03);
        this.f11262g = new C0617c0(c0623e03, "backoff", 0L);
        C0623e0 c0623e04 = ((C0650n0) this.f1707a).f11228h;
        C0650n0.d(c0623e04);
        this.f11263h = new C0617c0(c0623e04, "last_upload", 0L);
        C0623e0 c0623e05 = ((C0650n0) this.f1707a).f11228h;
        C0650n0.d(c0623e05);
        this.f11264i = new C0617c0(c0623e05, "last_upload_attempt", 0L);
        C0623e0 c0623e06 = ((C0650n0) this.f1707a).f11228h;
        C0650n0.d(c0623e06);
        this.j = new C0617c0(c0623e06, "midnight_offset", 0L);
    }

    public final Pair p0(String str) {
        C0651n1 c0651n1;
        F4.L l9;
        l0();
        C0650n0 c0650n0 = (C0650n0) this.f1707a;
        c0650n0.f11233n.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = this.f11259d;
        C0651n1 c0651n12 = (C0651n1) hashMap.get(str);
        if (c0651n12 != null && elapsedRealtime < c0651n12.f11248c) {
            return new Pair(c0651n12.f11246a, Boolean.valueOf(c0651n12.f11247b));
        }
        D d9 = E.f10638b;
        C0628g c0628g = c0650n0.f11227g;
        long t02 = c0628g.t0(str, d9) + elapsedRealtime;
        try {
            try {
                l9 = C1857a.a(c0650n0.f11221a);
            } catch (PackageManager.NameNotFoundException unused) {
                if (c0651n12 != null && elapsedRealtime < c0651n12.f11248c + c0628g.t0(str, E.f10641c)) {
                    return new Pair(c0651n12.f11246a, Boolean.valueOf(c0651n12.f11247b));
                }
                l9 = null;
            }
        } catch (Exception e8) {
            V v8 = c0650n0.f11229i;
            C0650n0.f(v8);
            v8.f10977m.c(e8, "Unable to get advertising id");
            c0651n1 = new C0651n1(t02, "", false);
        }
        if (l9 == null) {
            return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String str2 = l9.f2365c;
        boolean z9 = l9.f2364b;
        if (str2 != null) {
            c0651n1 = new C0651n1(t02, str2, z9);
        } else {
            c0651n1 = new C0651n1(t02, "", z9);
        }
        hashMap.put(str, c0651n1);
        return new Pair(c0651n1.f11246a, Boolean.valueOf(c0651n1.f11247b));
    }

    public final String q0(String str, boolean z9) {
        String str2;
        l0();
        if (z9) {
            str2 = (String) p0(str).first;
        } else {
            str2 = "00000000-0000-0000-0000-000000000000";
        }
        MessageDigest w02 = P1.w0();
        if (w02 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, w02.digest(str2.getBytes())));
    }

    @Override // b5.D1
    public final void o0() {
    }
}
