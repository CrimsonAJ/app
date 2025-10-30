package com.google.android.gms.internal.cast;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.math.BigInteger;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.cast.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0882v0 {

    /* renamed from: d, reason: collision with root package name */
    public static final y4.b f15067d = new y4.b("ApplicationAnalyticsUtils", null);

    /* renamed from: e, reason: collision with root package name */
    public static final String f15068e = "22.1.0";

    /* renamed from: a, reason: collision with root package name */
    public final String f15069a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f15070b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f15071c;

    public C0882v0(String str, Bundle bundle) {
        this.f15069a = str;
        this.f15070b = J.h("com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", bundle);
        this.f15071c = J.h("com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON", bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.cast.O0 a(com.google.android.gms.internal.cast.C0874t0 r5, int r6) {
        /*
            r4 = this;
            com.google.android.gms.internal.cast.N0 r5 = r4.b(r5)
            com.google.android.gms.internal.cast.I0 r0 = r5.f()
            com.google.android.gms.internal.cast.H0 r0 = com.google.android.gms.internal.cast.I0.m(r0)
            java.util.Map r1 = r4.f15071c
            if (r1 == 0) goto L29
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            boolean r3 = r1.containsKey(r2)
            if (r3 != 0) goto L1b
            goto L29
        L1b:
            java.lang.Object r1 = r1.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            F4.y.h(r1)
            int r1 = r1.intValue()
            goto L2b
        L29:
            int r1 = r6 + 10000
        L2b:
            r0.e()
            com.google.android.gms.internal.cast.N2 r2 = r0.f14748b
            com.google.android.gms.internal.cast.I0 r2 = (com.google.android.gms.internal.cast.I0) r2
            com.google.android.gms.internal.cast.I0.u(r2, r1)
            java.util.Map r1 = r4.f15070b
            if (r1 == 0) goto L52
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            boolean r3 = r1.containsKey(r2)
            if (r3 != 0) goto L44
            goto L52
        L44:
            java.lang.Object r6 = r1.get(r2)
            java.lang.Integer r6 = (java.lang.Integer) r6
            F4.y.h(r6)
            int r6 = r6.intValue()
            goto L54
        L52:
            int r6 = r6 + 10000
        L54:
            r0.e()
            com.google.android.gms.internal.cast.N2 r1 = r0.f14748b
            com.google.android.gms.internal.cast.I0 r1 = (com.google.android.gms.internal.cast.I0) r1
            com.google.android.gms.internal.cast.I0.q(r1, r6)
            com.google.android.gms.internal.cast.N2 r6 = r0.b()
            com.google.android.gms.internal.cast.I0 r6 = (com.google.android.gms.internal.cast.I0) r6
            r5.h(r6)
            com.google.android.gms.internal.cast.N2 r5 = r5.b()
            com.google.android.gms.internal.cast.O0 r5 = (com.google.android.gms.internal.cast.O0) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.C0882v0.a(com.google.android.gms.internal.cast.t0, int):com.google.android.gms.internal.cast.O0");
    }

    public final N0 b(C0874t0 c0874t0) {
        int i9;
        long j;
        boolean z9 = false;
        N0 m9 = O0.m();
        long j4 = c0874t0.f14993d;
        m9.e();
        O0.z((O0) m9.f14748b, j4);
        int i10 = c0874t0.f14994e;
        c0874t0.f14994e = i10 + 1;
        m9.e();
        O0.t((O0) m9.f14748b, i10);
        String str = c0874t0.f14992c;
        if (str != null) {
            m9.e();
            O0.w((O0) m9.f14748b, str);
        }
        S1 l9 = T1.l();
        if (!TextUtils.isEmpty(c0874t0.f14997h)) {
            String str2 = c0874t0.f14997h;
            m9.e();
            O0.s((O0) m9.f14748b, str2);
            String str3 = c0874t0.f14997h;
            l9.e();
            T1.o((T1) l9.f14748b, str3);
        }
        if (!TextUtils.isEmpty(c0874t0.f14998i)) {
            String str4 = c0874t0.f14998i;
            l9.e();
            T1.p((T1) l9.f14748b, str4);
        }
        if (!TextUtils.isEmpty(c0874t0.j)) {
            String str5 = c0874t0.j;
            l9.e();
            T1.q((T1) l9.f14748b, str5);
        }
        if (!TextUtils.isEmpty(c0874t0.f14999k)) {
            String str6 = c0874t0.f14999k;
            l9.e();
            T1.m((T1) l9.f14748b, str6);
        }
        if (!TextUtils.isEmpty(c0874t0.f15000l)) {
            String str7 = c0874t0.f15000l;
            l9.e();
            T1.n((T1) l9.f14748b, str7);
        }
        if (!TextUtils.isEmpty(c0874t0.f15001m)) {
            String str8 = c0874t0.f15001m;
            l9.e();
            T1.r((T1) l9.f14748b, str8);
        }
        int i11 = c0874t0.f15002n;
        if (i11 != 1) {
            i9 = 3;
            if (i11 != 2) {
                if (i11 != 3) {
                    i9 = 5;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            i9 = 1;
                        } else {
                            i9 = 6;
                        }
                    }
                } else {
                    i9 = 4;
                }
            }
        } else {
            i9 = 2;
        }
        l9.e();
        T1.s((T1) l9.f14748b, i9);
        T1 t12 = (T1) l9.b();
        m9.e();
        O0.v((O0) m9.f14748b, t12);
        E0 l10 = F0.l();
        l10.e();
        F0.n((F0) l10.f14748b, f15068e);
        l10.e();
        F0.m((F0) l10.f14748b, this.f15069a);
        F0 f02 = (F0) l10.b();
        m9.e();
        O0.o((O0) m9.f14748b, f02);
        H0 l11 = I0.l();
        if (c0874t0.f14991b != null) {
            C0824g1 l12 = C0828h1.l();
            String str9 = c0874t0.f14991b;
            l12.e();
            C0828h1.m((C0828h1) l12.f14748b, str9);
            C0828h1 c0828h1 = (C0828h1) l12.b();
            l11.e();
            I0.o((I0) l11.f14748b, c0828h1);
        }
        l11.e();
        I0.t((I0) l11.f14748b, false);
        String str10 = c0874t0.f14995f;
        if (str10 != null) {
            try {
                String replace = str10.replace("-", "");
                j = new BigInteger(replace.substring(0, Math.min(16, replace.length())), 16).longValue();
            } catch (NumberFormatException e8) {
                Object[] objArr = {str10};
                y4.b bVar = f15067d;
                Log.w(bVar.f24917a, bVar.d("receiverSessionId %s is not valid for hash", objArr), e8);
                j = 0;
            }
            l11.e();
            I0.v((I0) l11.f14748b, j);
        }
        int i12 = c0874t0.f14996g;
        l11.e();
        I0.p((I0) l11.f14748b, i12);
        if (c0874t0.f14990a.f14849h == 2) {
            z9 = true;
        }
        l11.e();
        I0.r((I0) l11.f14748b, z9);
        boolean z10 = c0874t0.f15003o;
        l11.e();
        I0.s((I0) l11.f14748b, z10);
        m9.e();
        O0.q((O0) m9.f14748b, (I0) l11.b());
        return m9;
    }
}
