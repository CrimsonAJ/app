package b5;

import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class L extends B {

    /* renamed from: c, reason: collision with root package name */
    public String f10780c;

    /* renamed from: d, reason: collision with root package name */
    public String f10781d;

    /* renamed from: e, reason: collision with root package name */
    public int f10782e;

    /* renamed from: f, reason: collision with root package name */
    public String f10783f;

    /* renamed from: g, reason: collision with root package name */
    public String f10784g;

    /* renamed from: h, reason: collision with root package name */
    public long f10785h;

    /* renamed from: i, reason: collision with root package name */
    public final long f10786i;
    public final long j;

    /* renamed from: k, reason: collision with root package name */
    public List f10787k;

    /* renamed from: l, reason: collision with root package name */
    public String f10788l;

    /* renamed from: m, reason: collision with root package name */
    public int f10789m;

    /* renamed from: n, reason: collision with root package name */
    public String f10790n;

    /* renamed from: o, reason: collision with root package name */
    public String f10791o;

    /* renamed from: p, reason: collision with root package name */
    public String f10792p;

    /* renamed from: q, reason: collision with root package name */
    public long f10793q;

    /* renamed from: r, reason: collision with root package name */
    public String f10794r;

    public L(C0650n0 c0650n0, long j, long j4) {
        super(c0650n0);
        this.f10793q = 0L;
        this.f10794r = null;
        this.f10786i = j;
        this.j = j4;
    }

    @Override // b5.B
    public final boolean o0() {
        return true;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v0 b5.Q1, still in use, count: 2, list:
          (r4v0 b5.Q1) from 0x0109: MOVE (r23v0 b5.Q1) = (r4v0 b5.Q1) (LINE:266)
          (r4v0 b5.Q1) from 0x00f4: MOVE (r23v6 b5.Q1) = (r4v0 b5.Q1) (LINE:245)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:56)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    public final b5.Q1 p0(java.lang.String r47) {
        /*
            Method dump skipped, instructions count: 865
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.L.p0(java.lang.String):b5.Q1");
    }

    public final String q0() {
        m0();
        if (((C0650n0) this.f1707a).f11227g.y0(null, E.f10684q1)) {
            return null;
        }
        return this.f10791o;
    }

    public final String r0() {
        m0();
        F4.y.h(this.f10780c);
        return this.f10780c;
    }

    public final String s0() {
        l0();
        m0();
        F4.y.h(this.f10790n);
        return this.f10790n;
    }

    public final void t0() {
        String format;
        String str;
        l0();
        C0650n0 c0650n0 = (C0650n0) this.f1707a;
        C0623e0 c0623e0 = c0650n0.f11228h;
        C0650n0.d(c0623e0);
        boolean k5 = c0623e0.s0().k(B0.ANALYTICS_STORAGE);
        V v8 = c0650n0.f11229i;
        if (!k5) {
            C0650n0.f(v8);
            v8.f10977m.b("Analytics Storage consent is not granted");
            format = null;
        } else {
            byte[] bArr = new byte[16];
            P1 p12 = c0650n0.f11231l;
            C0650n0.d(p12);
            p12.x0().nextBytes(bArr);
            format = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        }
        C0650n0.f(v8);
        if (format == null) {
            str = "null";
        } else {
            str = "not null";
        }
        v8.f10977m.b("Resetting session stitching token to ".concat(str));
        this.f10792p = format;
        c0650n0.f11233n.getClass();
        this.f10793q = System.currentTimeMillis();
    }
}
