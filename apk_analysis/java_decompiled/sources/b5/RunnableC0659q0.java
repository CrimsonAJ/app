package b5;

import android.os.Bundle;
import android.os.RemoteException;
import b7.C0701c;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: b5.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0659q0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11276a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11277b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11278c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f11279d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f11280e;

    public /* synthetic */ RunnableC0659q0(BinderC0672w0 binderC0672w0, Bundle bundle, String str, Q1 q12) {
        this.f11276a = 1;
        this.f11277b = binderC0672w0;
        this.f11279d = bundle;
        this.f11278c = str;
        this.f11280e = q12;
    }

    private final void a() {
        G g9;
        C0648m1 c0648m1 = (C0648m1) this.f11277b;
        AtomicReference atomicReference = (AtomicReference) this.f11278c;
        Q1 q12 = (Q1) this.f11280e;
        B1 b12 = (B1) this.f11279d;
        synchronized (atomicReference) {
            try {
                g9 = c0648m1.f11196d;
            } catch (RemoteException e8) {
                V v8 = ((C0650n0) c0648m1.f1707a).f11229i;
                C0650n0.f(v8);
                v8.f10971f.c(e8, "[sgtm] Failed to get upload batches; remote exception");
                atomicReference.notifyAll();
            }
            if (g9 == null) {
                V v9 = ((C0650n0) c0648m1.f1707a).f11229i;
                C0650n0.f(v9);
                v9.f10971f.b("[sgtm] Failed to get upload batches; not connected to service");
            } else {
                g9.W(q12, b12, new BinderC0633h1(c0648m1, atomicReference));
                c0648m1.B0();
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:146|147|(1:149)(5:177|(1:179)(2:181|(1:183))|180|169|170)|150|(2:153|151)|154|155|156|157|(2:160|158)|161|162|163|164|165|(1:167)|168|169|170) */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0580, code lost:
    
        r6.A().f10974i.c(r8, "Failed to parse queued batch. appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0545, code lost:
    
        r11 = 2;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.RunnableC0659q0.run():void");
    }

    public /* synthetic */ RunnableC0659q0(C0648m1 c0648m1, AtomicReference atomicReference, Q1 q12, B1 b12) {
        this.f11276a = 5;
        this.f11277b = c0648m1;
        this.f11278c = atomicReference;
        this.f11280e = q12;
        this.f11279d = b12;
    }

    public RunnableC0659q0(C0701c c0701c, String str, String str2, Bundle bundle) {
        this.f11276a = 8;
        this.f11278c = str;
        this.f11277b = str2;
        this.f11279d = bundle;
        this.f11280e = c0701c;
    }

    public RunnableC0659q0(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.L l9, C0665t c0665t, String str) {
        this.f11276a = 2;
        this.f11277b = l9;
        this.f11279d = c0665t;
        this.f11278c = str;
        this.f11280e = appMeasurementDynamiteService;
    }

    public /* synthetic */ RunnableC0659q0(Object obj, Serializable serializable, G4.a aVar, Object obj2, int i9) {
        this.f11276a = i9;
        this.f11277b = obj;
        this.f11278c = serializable;
        this.f11279d = aVar;
        this.f11280e = obj2;
    }

    public /* synthetic */ RunnableC0659q0(Object obj, Object obj2, Object obj3, Object obj4, int i9) {
        this.f11276a = i9;
        this.f11277b = obj2;
        this.f11278c = obj3;
        this.f11279d = obj4;
        this.f11280e = obj;
    }
}
