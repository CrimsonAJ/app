package j3;

import N3.C0273y;
import l4.AbstractC1566a;

/* renamed from: j3.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1462m extends Exception implements InterfaceC1453f {

    /* renamed from: a, reason: collision with root package name */
    public final int f19684a;

    /* renamed from: b, reason: collision with root package name */
    public final long f19685b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19686c;

    /* renamed from: d, reason: collision with root package name */
    public final String f19687d;

    /* renamed from: e, reason: collision with root package name */
    public final int f19688e;

    /* renamed from: f, reason: collision with root package name */
    public final M f19689f;

    /* renamed from: g, reason: collision with root package name */
    public final int f19690g;

    /* renamed from: h, reason: collision with root package name */
    public final C0273y f19691h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f19692i;

    public C1462m(int i9, Exception exc, int i10) {
        this(i9, exc, i10, null, -1, null, 4, false);
    }

    public final C1462m a(C0273y c0273y) {
        String message = getMessage();
        int i9 = l4.y.f20553a;
        return new C1462m(message, getCause(), this.f19684a, this.f19686c, this.f19687d, this.f19688e, this.f19689f, this.f19690g, c0273y, this.f19685b, this.f19692i);
    }

    public C1462m(String str, Throwable th, int i9, int i10, String str2, int i11, M m9, int i12, C0273y c0273y, long j, boolean z9) {
        super(str, th);
        this.f19684a = i9;
        this.f19685b = j;
        AbstractC1566a.h(!z9 || i10 == 1);
        AbstractC1566a.h(th != null || i10 == 3);
        this.f19686c = i10;
        this.f19687d = str2;
        this.f19688e = i11;
        this.f19689f = m9;
        this.f19690g = i12;
        this.f19691h = c0273y;
        this.f19692i = z9;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1462m(int r14, java.lang.Exception r15, int r16, java.lang.String r17, int r18, j3.M r19, int r20, boolean r21) {
        /*
            r13 = this;
            r8 = r20
            if (r14 == 0) goto L63
            r0 = 3
            r1 = 1
            if (r14 == r1) goto L16
            if (r14 == r0) goto L13
            java.lang.String r0 = "Unexpected runtime error"
        Lc:
            r5 = r17
            r6 = r18
            r7 = r19
            goto L6b
        L13:
            java.lang.String r0 = "Remote error"
            goto Lc
        L16:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r5 = r17
            r2.append(r5)
            java.lang.String r3 = " error, index="
            r2.append(r3)
            r6 = r18
            r2.append(r6)
            java.lang.String r3 = ", format="
            r2.append(r3)
            r7 = r19
            r2.append(r7)
            java.lang.String r3 = ", format_supported="
            r2.append(r3)
            int r3 = l4.y.f20553a
            if (r8 == 0) goto L59
            if (r8 == r1) goto L56
            r1 = 2
            if (r8 == r1) goto L53
            if (r8 == r0) goto L50
            r0 = 4
            if (r8 != r0) goto L4a
            java.lang.String r0 = "YES"
            goto L5b
        L4a:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            r14.<init>()
            throw r14
        L50:
            java.lang.String r0 = "NO_EXCEEDS_CAPABILITIES"
            goto L5b
        L53:
            java.lang.String r0 = "NO_UNSUPPORTED_DRM"
            goto L5b
        L56:
            java.lang.String r0 = "NO_UNSUPPORTED_TYPE"
            goto L5b
        L59:
            java.lang.String r0 = "NO"
        L5b:
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto L6b
        L63:
            r5 = r17
            r6 = r18
            r7 = r19
            java.lang.String r0 = "Source error"
        L6b:
            r1 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L78
            java.lang.String r1 = ": null"
            java.lang.String r0 = com.google.android.gms.internal.measurement.AbstractC0953k1.n(r0, r1)
        L78:
            r1 = r0
            r9 = 0
            long r10 = android.os.SystemClock.elapsedRealtime()
            r0 = r13
            r4 = r14
            r2 = r15
            r3 = r16
            r12 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.C1462m.<init>(int, java.lang.Exception, int, java.lang.String, int, j3.M, int, boolean):void");
    }
}
