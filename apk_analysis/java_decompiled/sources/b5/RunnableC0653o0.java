package b5;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import m1.C1583a;
import p1.C1838a;
import p1.C1847j;

/* renamed from: b5.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0653o0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11253a = 2;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11254b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11255c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f11256d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f11257e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f11258f;

    public /* synthetic */ RunnableC0653o0(BinderC0672w0 binderC0672w0, Q1 q12, Bundle bundle, I i9, String str) {
        this.f11256d = binderC0672w0;
        this.f11255c = q12;
        this.f11257e = bundle;
        this.f11258f = i9;
        this.f11254b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        C0648m1 c0648m1;
        G g9;
        P1 p12;
        G g10;
        switch (this.f11253a) {
            case 0:
                I i9 = (I) this.f11258f;
                BinderC0672w0 binderC0672w0 = (BinderC0672w0) this.f11256d;
                J1 j12 = binderC0672w0.f11339e;
                j12.e();
                try {
                    i9.y0(j12.d((Bundle) this.f11257e, (Q1) this.f11255c));
                    return;
                } catch (RemoteException e8) {
                    binderC0672w0.f11339e.A().f10971f.d((String) this.f11254b, e8, "Failed to return trigger URIs for app");
                    return;
                }
            case 1:
                AtomicReference atomicReference2 = (AtomicReference) this.f11256d;
                synchronized (atomicReference2) {
                    try {
                        try {
                            c0648m1 = (C0648m1) this.f11258f;
                            g9 = c0648m1.f11196d;
                        } catch (RemoteException e9) {
                            V v8 = ((C0650n0) ((C0648m1) this.f11258f).f1707a).f11229i;
                            C0650n0.f(v8);
                            v8.f10971f.e("(legacy) Failed to get conditional properties; remote exception", null, (String) this.f11254b, e9);
                            ((AtomicReference) this.f11256d).set(Collections.EMPTY_LIST);
                            atomicReference = (AtomicReference) this.f11256d;
                        }
                        if (g9 == null) {
                            V v9 = ((C0650n0) c0648m1.f1707a).f11229i;
                            C0650n0.f(v9);
                            v9.f10971f.e("(legacy) Failed to get conditional properties; not connected to service", null, (String) this.f11254b, (String) this.f11257e);
                            atomicReference2.set(Collections.EMPTY_LIST);
                            atomicReference2.notify();
                            return;
                        }
                        if (TextUtils.isEmpty(null)) {
                            atomicReference2.set(g9.S((String) this.f11254b, (String) this.f11257e, (Q1) this.f11255c));
                        } else {
                            atomicReference2.set(g9.x0(null, (String) this.f11254b, (String) this.f11257e));
                        }
                        c0648m1.B0();
                        atomicReference = (AtomicReference) this.f11256d;
                        atomicReference.notify();
                        return;
                    } catch (Throwable th) {
                        ((AtomicReference) this.f11256d).notify();
                        throw th;
                    }
                }
            case 2:
                com.google.android.gms.internal.measurement.L l9 = (com.google.android.gms.internal.measurement.L) this.f11257e;
                String str = (String) this.f11256d;
                String str2 = (String) this.f11254b;
                C0648m1 c0648m12 = (C0648m1) this.f11258f;
                C0650n0 c0650n0 = (C0650n0) c0648m12.f1707a;
                ArrayList arrayList = new ArrayList();
                try {
                    try {
                        g10 = c0648m12.f11196d;
                    } catch (RemoteException e10) {
                        V v10 = c0650n0.f11229i;
                        C0650n0.f(v10);
                        v10.f10971f.e("Failed to get conditional properties; remote exception", str2, str, e10);
                    }
                    if (g10 == null) {
                        V v11 = c0650n0.f11229i;
                        C0650n0.f(v11);
                        v11.f10971f.d(str2, str, "Failed to get conditional properties; not connected to service");
                        p12 = c0650n0.f11231l;
                        C0650n0.d(p12);
                        p12.I0(l9, arrayList);
                        return;
                    }
                    arrayList = P1.y0(g10.S(str2, str, (Q1) this.f11255c));
                    c0648m12.B0();
                    p12 = c0650n0.f11231l;
                    C0650n0.d(p12);
                    p12.I0(l9, arrayList);
                    return;
                } catch (Throwable th2) {
                    P1 p13 = c0650n0.f11231l;
                    C0650n0.d(p13);
                    p13.I0(l9, arrayList);
                    throw th2;
                }
            default:
                try {
                    if (!(((C1847j) this.f11256d).f22131a instanceof C1838a)) {
                        String uuid = ((UUID) this.f11255c).toString();
                        int j = ((o1.n) this.f11254b).f21498c.j(uuid);
                        if (j != 0 && !AbstractC0953k1.c(j)) {
                            ((o1.n) this.f11254b).f21497b.g(uuid, (e1.j) this.f11257e);
                            ((Context) this.f11258f).startService(C1583a.b((Context) this.f11258f, uuid, (e1.j) this.f11257e));
                        } else {
                            throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                        }
                    }
                    ((C1847j) this.f11256d).j(null);
                    return;
                } catch (Throwable th3) {
                    ((C1847j) this.f11256d).k(th3);
                    return;
                }
        }
    }

    public RunnableC0653o0(C0648m1 c0648m1, String str, String str2, Q1 q12, com.google.android.gms.internal.measurement.L l9) {
        this.f11254b = str;
        this.f11256d = str2;
        this.f11255c = q12;
        this.f11257e = l9;
        this.f11258f = c0648m1;
    }

    public RunnableC0653o0(C0648m1 c0648m1, AtomicReference atomicReference, String str, String str2, Q1 q12) {
        this.f11256d = atomicReference;
        this.f11254b = str;
        this.f11257e = str2;
        this.f11255c = q12;
        this.f11258f = c0648m1;
    }

    public RunnableC0653o0(o1.n nVar, C1847j c1847j, UUID uuid, e1.j jVar, Context context) {
        this.f11254b = nVar;
        this.f11256d = c1847j;
        this.f11255c = uuid;
        this.f11257e = jVar;
        this.f11258f = context;
    }
}
