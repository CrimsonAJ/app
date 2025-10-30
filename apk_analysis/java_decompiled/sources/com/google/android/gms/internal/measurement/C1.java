package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.EnumC0555p;
import f5.AbstractC1176h;
import f5.InterfaceC1182n;
import j3.RunnableC1443a;
import java.util.ArrayDeque;
import java.util.Map;
import r.C1922d;
import r.C1924f;

/* loaded from: classes.dex */
public final class C1 {

    /* renamed from: d, reason: collision with root package name */
    public static C1 f15185d;

    /* renamed from: a, reason: collision with root package name */
    public boolean f15186a;

    /* renamed from: b, reason: collision with root package name */
    public Object f15187b;

    /* renamed from: c, reason: collision with root package name */
    public Object f15188c;

    public C1(int i9) {
        switch (i9) {
            case 4:
                this.f15187b = new Object();
                return;
            default:
                this.f15186a = false;
                this.f15187b = null;
                this.f15188c = null;
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [com.google.android.gms.internal.measurement.C1, java.lang.Object] */
    public static C1 e(Context context) {
        C1 c12;
        C1 c13;
        synchronized (C1.class) {
            try {
                if (f15185d == null) {
                    if (E.d.b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                        ?? obj = new Object();
                        obj.f15186a = false;
                        obj.f15187b = context;
                        obj.f15188c = new ContentObserver(null);
                        c13 = obj;
                    } else {
                        c13 = new C1(0);
                    }
                    f15185d = c13;
                }
                C1 c14 = f15185d;
                if (c14 != null && ((B1) c14.f15188c) != null && !c14.f15186a) {
                    try {
                        context.getContentResolver().registerContentObserver(AbstractC0997t1.f15595a, true, (B1) f15185d.f15188c);
                        C1 c15 = f15185d;
                        c15.getClass();
                        c15.f15186a = true;
                    } catch (SecurityException e8) {
                        Log.e("GservicesLoader", "Unable to register Gservices content observer", e8);
                    }
                }
                c12 = f15185d;
                c12.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
        return c12;
    }

    public static synchronized void i() {
        Context context;
        synchronized (C1.class) {
            try {
                C1 c12 = f15185d;
                if (c12 != null && (context = (Context) c12.f15187b) != null && ((B1) c12.f15188c) != null && c12.f15186a) {
                    context.getContentResolver().unregisterContentObserver((B1) f15185d.f15188c);
                }
                f15185d = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a() {
        N0.g gVar = (N0.g) this.f15187b;
        D.n x5 = gVar.x();
        if (x5.a0() == EnumC0555p.f9894b) {
            x5.V(new N0.b(0, gVar));
            N0.f fVar = (N0.f) this.f15188c;
            fVar.getClass();
            if (!fVar.f4820a) {
                x5.V(new N0.c(0, fVar));
                fVar.f4820a = true;
                this.f15186a = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    public void b(Bundle bundle) {
        Bundle bundle2;
        if (!this.f15186a) {
            a();
        }
        D.n x5 = ((N0.g) this.f15187b).x();
        if (x5.a0().compareTo(EnumC0555p.f9896d) < 0) {
            N0.f fVar = (N0.f) this.f15188c;
            if (fVar.f4820a) {
                if (!fVar.f4821b) {
                    if (bundle != null) {
                        bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                    } else {
                        bundle2 = null;
                    }
                    fVar.f4824e = bundle2;
                    fVar.f4821b = true;
                    return;
                }
                throw new IllegalStateException("SavedStateRegistry was already restored.");
            }
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + x5.a0()).toString());
    }

    public void c(Bundle bundle) {
        N0.f fVar = (N0.f) this.f15188c;
        fVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = (Bundle) fVar.f4824e;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C1924f c1924f = (C1924f) fVar.f4823d;
        c1924f.getClass();
        C1922d c1922d = new C1922d(c1924f);
        c1924f.f22587c.put(c1922d, Boolean.FALSE);
        while (c1922d.hasNext()) {
            Map.Entry entry = (Map.Entry) c1922d.next();
            bundle2.putBundle((String) entry.getKey(), ((N0.e) entry.getValue()).a());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }

    public void d() {
        if (this.f15186a) {
            ((Context) this.f15187b).unregisterReceiver((RunnableC1443a) this.f15188c);
            this.f15186a = false;
        }
    }

    public void f(InterfaceC1182n interfaceC1182n) {
        synchronized (this.f15187b) {
            try {
                if (((ArrayDeque) this.f15188c) == null) {
                    this.f15188c = new ArrayDeque();
                }
                ((ArrayDeque) this.f15188c).add(interfaceC1182n);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void g(AbstractC1176h abstractC1176h) {
        InterfaceC1182n interfaceC1182n;
        synchronized (this.f15187b) {
            if (((ArrayDeque) this.f15188c) != null && !this.f15186a) {
                this.f15186a = true;
                while (true) {
                    synchronized (this.f15187b) {
                        try {
                            interfaceC1182n = (InterfaceC1182n) ((ArrayDeque) this.f15188c).poll();
                            if (interfaceC1182n == null) {
                                this.f15186a = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    interfaceC1182n.b(abstractC1176h);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0045, code lost:
    
        if (r5.isUserRunning(android.os.Process.myUserHandle()) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0047, code lost:
    
        r6 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String h(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f15187b
            android.content.Context r0 = (android.content.Context) r0
            r1 = 0
            if (r0 == 0) goto L93
            boolean r2 = com.google.android.gms.internal.measurement.AbstractC1017x1.a()
            if (r2 == 0) goto L65
            boolean r2 = com.google.android.gms.internal.measurement.AbstractC1017x1.f15691b
            r3 = 1
            if (r2 == 0) goto L13
            goto L60
        L13:
            java.lang.Class<com.google.android.gms.internal.measurement.x1> r2 = com.google.android.gms.internal.measurement.AbstractC1017x1.class
            monitor-enter(r2)
            boolean r4 = com.google.android.gms.internal.measurement.AbstractC1017x1.f15691b     // Catch: java.lang.Throwable -> L1c
            if (r4 == 0) goto L1e
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            goto L60
        L1c:
            r9 = move-exception
            goto L63
        L1e:
            r4 = r3
        L1f:
            r5 = 2
            r6 = 0
            if (r4 > r5) goto L56
            android.os.UserManager r5 = com.google.android.gms.internal.measurement.AbstractC1017x1.f15690a     // Catch: java.lang.Throwable -> L1c
            if (r5 != 0) goto L31
            java.lang.Class<android.os.UserManager> r5 = android.os.UserManager.class
            java.lang.Object r5 = r0.getSystemService(r5)     // Catch: java.lang.Throwable -> L1c
            android.os.UserManager r5 = (android.os.UserManager) r5     // Catch: java.lang.Throwable -> L1c
            com.google.android.gms.internal.measurement.AbstractC1017x1.f15690a = r5     // Catch: java.lang.Throwable -> L1c
        L31:
            android.os.UserManager r5 = com.google.android.gms.internal.measurement.AbstractC1017x1.f15690a     // Catch: java.lang.Throwable -> L1c
            if (r5 != 0) goto L37
            r6 = r3
            goto L5a
        L37:
            boolean r7 = C3.d.y(r5)     // Catch: java.lang.Throwable -> L1c java.lang.NullPointerException -> L49
            if (r7 != 0) goto L47
            android.os.UserHandle r7 = android.os.Process.myUserHandle()     // Catch: java.lang.Throwable -> L1c java.lang.NullPointerException -> L49
            boolean r0 = r5.isUserRunning(r7)     // Catch: java.lang.Throwable -> L1c java.lang.NullPointerException -> L49
            if (r0 != 0) goto L56
        L47:
            r6 = r3
            goto L56
        L49:
            r5 = move-exception
            java.lang.String r6 = "DirectBootUtils"
            java.lang.String r7 = "Failed to check if user is unlocked."
            android.util.Log.w(r6, r7, r5)     // Catch: java.lang.Throwable -> L1c
            com.google.android.gms.internal.measurement.AbstractC1017x1.f15690a = r1     // Catch: java.lang.Throwable -> L1c
            int r4 = r4 + 1
            goto L1f
        L56:
            if (r6 == 0) goto L5a
            com.google.android.gms.internal.measurement.AbstractC1017x1.f15690a = r1     // Catch: java.lang.Throwable -> L1c
        L5a:
            if (r6 == 0) goto L5e
            com.google.android.gms.internal.measurement.AbstractC1017x1.f15691b = r3     // Catch: java.lang.Throwable -> L1c
        L5e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            r3 = r6
        L60:
            if (r3 != 0) goto L65
            goto L93
        L63:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            throw r9
        L65:
            com.google.android.gms.internal.measurement.t r0 = new com.google.android.gms.internal.measurement.t     // Catch: java.lang.NullPointerException -> L7d java.lang.SecurityException -> L7f java.lang.IllegalStateException -> L81
            r0.<init>(r8, r9)     // Catch: java.lang.NullPointerException -> L7d java.lang.SecurityException -> L7f java.lang.IllegalStateException -> L81
            java.lang.Object r0 = r0.b()     // Catch: java.lang.SecurityException -> L6f java.lang.NullPointerException -> L7d java.lang.IllegalStateException -> L81
            goto L7a
        L6f:
            long r2 = android.os.Binder.clearCallingIdentity()     // Catch: java.lang.NullPointerException -> L7d java.lang.SecurityException -> L7f java.lang.IllegalStateException -> L81
            java.lang.Object r0 = r0.b()     // Catch: java.lang.Throwable -> L83
            android.os.Binder.restoreCallingIdentity(r2)     // Catch: java.lang.NullPointerException -> L7d java.lang.SecurityException -> L7f java.lang.IllegalStateException -> L81
        L7a:
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.NullPointerException -> L7d java.lang.SecurityException -> L7f java.lang.IllegalStateException -> L81
            return r0
        L7d:
            r0 = move-exception
            goto L88
        L7f:
            r0 = move-exception
            goto L88
        L81:
            r0 = move-exception
            goto L88
        L83:
            r0 = move-exception
            android.os.Binder.restoreCallingIdentity(r2)     // Catch: java.lang.NullPointerException -> L7d java.lang.SecurityException -> L7f java.lang.IllegalStateException -> L81
            throw r0     // Catch: java.lang.NullPointerException -> L7d java.lang.SecurityException -> L7f java.lang.IllegalStateException -> L81
        L88:
            java.lang.String r2 = "Unable to read GServices for: "
            java.lang.String r9 = r2.concat(r9)
            java.lang.String r2 = "GservicesLoader"
            android.util.Log.e(r2, r9, r0)
        L93:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1.h(java.lang.String):java.lang.String");
    }

    public C1(N0.g gVar) {
        this.f15187b = gVar;
        this.f15188c = new N0.f();
    }
}
