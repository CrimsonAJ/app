package com.google.android.gms.internal.cast;

import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.cast.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0881v implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15065a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0885w f15066b;

    public /* synthetic */ RunnableC0881v(C0885w c0885w, int i9) {
        this.f15065a = i9;
        this.f15066b = c0885w;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z9;
        C0885w c0885w = this.f15066b;
        int i9 = 2;
        switch (this.f15065a) {
            case 0:
                c0885w.getClass();
                y4.b bVar = C0885w.f15073g;
                Log.i(bVar.f24917a, bVar.d("transfer with type = %d has timed out", 0));
                bVar.b("notify failed transfer with type = %d, reason = %d", 0, 101);
                Iterator it = new HashSet(c0885w.f15075b).iterator();
                while (it.hasNext()) {
                    C0859p0 c0859p0 = (C0859p0) it.next();
                    switch (c0859p0.f14943a) {
                        case 0:
                            C0870s0.f14972i.b("onTransferFailed with type = %d and reason = %d", 0, 101);
                            C0870s0 c0870s0 = (C0870s0) c0859p0.f14944b;
                            c0870s0.c();
                            N0 b9 = c0870s0.f14975c.b(c0870s0.f14979g);
                            H0 m9 = I0.m(b9.f());
                            m9.e();
                            I0.x((I0) m9.f14748b);
                            m9.e();
                            I0.w((I0) m9.f14748b);
                            b9.h((I0) m9.b());
                            c0870s0.f14973a.a((O0) b9.b(), 232);
                            break;
                        default:
                            A3.E e8 = new A3.E(11, 10);
                            e8.f47c = 101;
                            Y2.r rVar = (Y2.r) c0859p0.f14944b;
                            if (((BinderC0822g) rVar.f8649c).f14849h == 2) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            e8.f48d = Boolean.valueOf(z9);
                            Y2.r.W(rVar, new D(e8));
                            break;
                    }
                }
                c0885w.a();
                return;
            default:
                W2 w22 = new W2(i9, c0885w);
                u4.h hVar = c0885w.f15079f;
                F4.y.h(hVar);
                hVar.a(w22);
                return;
        }
    }
}
