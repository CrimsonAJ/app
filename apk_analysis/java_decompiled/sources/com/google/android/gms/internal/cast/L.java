package com.google.android.gms.internal.cast;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import f5.C1177i;

/* loaded from: classes.dex */
public final class L extends C4.j {

    /* renamed from: k, reason: collision with root package name */
    public static int f14740k = 1;

    public void d() {
        boolean z9;
        BasePendingResult basePendingResult;
        if (e() == 3) {
            z9 = true;
        } else {
            z9 = false;
        }
        s4.h.f22732a.f("Signing out", new Object[0]);
        s4.h.b(this.f1578a);
        D4.w wVar = this.f1585h;
        if (z9) {
            C4.o oVar = Status.f14655e;
            BasePendingResult mVar = new D4.m(wVar, 0);
            mVar.J(oVar);
            basePendingResult = mVar;
        } else {
            s4.g gVar = new s4.g(wVar, 0);
            wVar.b(gVar);
            basePendingResult = gVar;
        }
        basePendingResult.D(new D4.o(basePendingResult, new C1177i(), new F5.e(5)));
    }

    public synchronized int e() {
        int i9;
        try {
            i9 = f14740k;
            if (i9 == 1) {
                Context context = this.f1578a;
                B4.f fVar = B4.f.f695d;
                int b9 = fVar.b(context, 12451000);
                if (b9 == 0) {
                    i9 = 4;
                    f14740k = 4;
                } else if (fVar.a(b9, context, null) == null && O4.f.a(context, "com.google.android.gms.auth.api.fallback") != 0) {
                    i9 = 3;
                    f14740k = 3;
                } else {
                    i9 = 2;
                    f14740k = 2;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return i9;
    }
}
