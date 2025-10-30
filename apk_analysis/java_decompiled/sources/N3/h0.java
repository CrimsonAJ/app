package N3;

import android.net.Uri;
import j3.C0;
import j3.C1446b0;
import j3.E0;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import l4.AbstractC1566a;

/* loaded from: classes.dex */
public final class h0 extends E0 {

    /* renamed from: n, reason: collision with root package name */
    public static final Object f5106n = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final long f5107b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5108c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5109d;

    /* renamed from: e, reason: collision with root package name */
    public final long f5110e;

    /* renamed from: f, reason: collision with root package name */
    public final long f5111f;

    /* renamed from: g, reason: collision with root package name */
    public final long f5112g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f5113h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f5114i;
    public final boolean j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f5115k;

    /* renamed from: l, reason: collision with root package name */
    public final j3.Y f5116l;

    /* renamed from: m, reason: collision with root package name */
    public final j3.T f5117m;

    static {
        boolean z9;
        j3.S s9;
        j3.O o9 = new j3.O();
        Y2.r rVar = new Y2.r(6);
        List list = Collections.EMPTY_LIST;
        P5.S s10 = P5.S.f5926e;
        j3.V v8 = j3.V.f19480c;
        Uri uri = Uri.EMPTY;
        if (((Uri) rVar.f8648b) != null && ((UUID) rVar.f8647a) == null) {
            z9 = false;
        } else {
            z9 = true;
        }
        AbstractC1566a.m(z9);
        if (uri != null) {
            if (((UUID) rVar.f8647a) != null) {
                s9 = new j3.S(rVar);
            } else {
                s9 = null;
            }
            new j3.U(uri, null, s9, list, s10);
        }
        o9.a();
        C1446b0 c1446b0 = C1446b0.f19533Z;
    }

    public h0(long j, boolean z9, boolean z10, j3.Y y9) {
        this(j, j, 0L, 0L, z9, false, z10, null, y9);
    }

    @Override // j3.E0
    public final int b(Object obj) {
        if (f5106n.equals(obj)) {
            return 0;
        }
        return -1;
    }

    @Override // j3.E0
    public final C0 f(int i9, C0 c02, boolean z9) {
        Object obj;
        AbstractC1566a.k(i9, 1);
        if (z9) {
            obj = f5106n;
        } else {
            obj = null;
        }
        Object obj2 = obj;
        long j = -this.f5111f;
        c02.getClass();
        c02.h(null, obj2, 0, this.f5109d, j, O3.b.f5451f, false);
        return c02;
    }

    @Override // j3.E0
    public final int h() {
        return 1;
    }

    @Override // j3.E0
    public final Object l(int i9) {
        AbstractC1566a.k(i9, 1);
        return f5106n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        if (r1 > r3) goto L10;
     */
    @Override // j3.E0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j3.D0 m(int r25, j3.D0 r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 1
            r2 = r25
            l4.AbstractC1566a.k(r2, r1)
            long r1 = r0.f5112g
            boolean r14 = r0.f5114i
            if (r14 == 0) goto L2d
            boolean r3 = r0.j
            if (r3 != 0) goto L2d
            r3 = 0
            int r3 = (r27 > r3 ? 1 : (r27 == r3 ? 0 : -1))
            if (r3 == 0) goto L2d
            long r3 = r0.f5110e
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L26
        L23:
            r16 = r5
            goto L2f
        L26:
            long r1 = r1 + r27
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L2d
            goto L23
        L2d:
            r16 = r1
        L2f:
            java.lang.Object r4 = j3.D0.f19300r
            long r1 = r0.f5110e
            r20 = 0
            j3.Y r5 = r0.f5116l
            java.lang.Object r6 = r0.f5115k
            long r7 = r0.f5107b
            long r9 = r0.f5108c
            boolean r13 = r0.f5113h
            j3.T r15 = r0.f5117m
            r21 = 0
            long r11 = r0.f5111f
            r3 = r26
            r18 = r1
            r22 = r11
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.b(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r26
        */
        throw new UnsupportedOperationException("Method not decompiled: N3.h0.m(int, j3.D0, long):j3.D0");
    }

    @Override // j3.E0
    public final int o() {
        return 1;
    }

    public h0(long j, long j4, long j9, long j10, boolean z9, boolean z10, boolean z11, Object obj, j3.Y y9) {
        this(-9223372036854775807L, -9223372036854775807L, j, j4, j9, j10, z9, z10, false, obj, y9, z11 ? y9.f19493c : null);
    }

    public h0(long j, long j4, long j9, long j10, long j11, long j12, boolean z9, boolean z10, boolean z11, Object obj, j3.Y y9, j3.T t7) {
        this.f5107b = j;
        this.f5108c = j4;
        this.f5109d = j9;
        this.f5110e = j10;
        this.f5111f = j11;
        this.f5112g = j12;
        this.f5113h = z9;
        this.f5114i = z10;
        this.j = z11;
        this.f5115k = obj;
        y9.getClass();
        this.f5116l = y9;
        this.f5117m = t7;
    }
}
