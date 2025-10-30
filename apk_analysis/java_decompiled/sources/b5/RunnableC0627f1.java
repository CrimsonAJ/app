package b5;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: b5.f1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0627f1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11111a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f11112b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f11113c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Q1 f11114d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f11115e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0648m1 f11116f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f11117g;

    public RunnableC0627f1(C0648m1 c0648m1, String str, String str2, Q1 q12, boolean z9, com.google.android.gms.internal.measurement.L l9) {
        this.f11112b = str;
        this.f11113c = str2;
        this.f11114d = q12;
        this.f11115e = z9;
        this.f11117g = l9;
        this.f11116f = c0648m1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        P1 p12;
        G g9;
        String str;
        AtomicReference atomicReference;
        C0648m1 c0648m1;
        G g10;
        switch (this.f11111a) {
            case 0:
                String str2 = this.f11112b;
                com.google.android.gms.internal.measurement.L l9 = (com.google.android.gms.internal.measurement.L) this.f11117g;
                C0648m1 c0648m12 = this.f11116f;
                C0650n0 c0650n0 = (C0650n0) c0648m12.f1707a;
                Bundle bundle = new Bundle();
                try {
                    try {
                        g9 = c0648m12.f11196d;
                        str = this.f11113c;
                    } catch (RemoteException e8) {
                        e = e8;
                    }
                    if (g9 == null) {
                        V v8 = c0650n0.f11229i;
                        C0650n0.f(v8);
                        v8.f10971f.d(str2, str, "Failed to get user properties; not connected to service");
                        p12 = c0650n0.f11231l;
                        C0650n0.d(p12);
                        p12.J0(l9, bundle);
                        return;
                    }
                    List<M1> b12 = g9.b1(str2, str, this.f11115e, this.f11114d);
                    Bundle bundle2 = new Bundle();
                    if (b12 != null) {
                        for (M1 m12 : b12) {
                            String str3 = m12.f10807e;
                            String str4 = m12.f10804b;
                            if (str3 != null) {
                                bundle2.putString(str4, str3);
                            } else {
                                Long l10 = m12.f10806d;
                                if (l10 != null) {
                                    bundle2.putLong(str4, l10.longValue());
                                } else {
                                    Double d9 = m12.f10809g;
                                    if (d9 != null) {
                                        bundle2.putDouble(str4, d9.doubleValue());
                                    }
                                }
                            }
                        }
                    }
                    try {
                        c0648m12.B0();
                        P1 p13 = c0650n0.f11231l;
                        C0650n0.d(p13);
                        p13.J0(l9, bundle2);
                        return;
                    } catch (RemoteException e9) {
                        e = e9;
                        bundle = bundle2;
                        V v9 = c0650n0.f11229i;
                        C0650n0.f(v9);
                        v9.f10971f.d(str2, e, "Failed to get user properties; remote exception");
                        p12 = c0650n0.f11231l;
                        C0650n0.d(p12);
                        p12.J0(l9, bundle);
                        return;
                    } catch (Throwable th) {
                        th = th;
                        bundle = bundle2;
                        P1 p14 = c0650n0.f11231l;
                        C0650n0.d(p14);
                        p14.J0(l9, bundle);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            default:
                AtomicReference atomicReference2 = (AtomicReference) this.f11117g;
                synchronized (atomicReference2) {
                    try {
                        try {
                            c0648m1 = this.f11116f;
                            g10 = c0648m1.f11196d;
                        } catch (RemoteException e10) {
                            V v10 = ((C0650n0) this.f11116f.f1707a).f11229i;
                            C0650n0.f(v10);
                            v10.f10971f.e("(legacy) Failed to get user properties; remote exception", null, this.f11112b, e10);
                            ((AtomicReference) this.f11117g).set(Collections.EMPTY_LIST);
                            atomicReference = (AtomicReference) this.f11117g;
                        }
                        if (g10 == null) {
                            V v11 = ((C0650n0) c0648m1.f1707a).f11229i;
                            C0650n0.f(v11);
                            v11.f10971f.e("(legacy) Failed to get user properties; not connected to service", null, this.f11112b, this.f11113c);
                            atomicReference2.set(Collections.EMPTY_LIST);
                            atomicReference2.notify();
                            return;
                        }
                        if (TextUtils.isEmpty(null)) {
                            atomicReference2.set(g10.b1(this.f11112b, this.f11113c, this.f11115e, this.f11114d));
                        } else {
                            atomicReference2.set(g10.e1(null, this.f11112b, this.f11113c, this.f11115e));
                        }
                        c0648m1.B0();
                        atomicReference = (AtomicReference) this.f11117g;
                        atomicReference.notify();
                        return;
                    } catch (Throwable th3) {
                        ((AtomicReference) this.f11117g).notify();
                        throw th3;
                    }
                }
        }
    }

    public RunnableC0627f1(C0648m1 c0648m1, AtomicReference atomicReference, String str, String str2, Q1 q12, boolean z9) {
        this.f11117g = atomicReference;
        this.f11112b = str;
        this.f11113c = str2;
        this.f11114d = q12;
        this.f11115e = z9;
        this.f11116f = c0648m1;
    }
}
