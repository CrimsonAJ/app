package com.google.firebase.messaging;

import D4.InterfaceC0093l;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.util.Log;
import android.view.MenuItem;
import co.notix.R;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import com.google.android.gms.internal.measurement.Y1;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import f.C1148a;
import f5.AbstractC1176h;
import f5.C1177i;
import f5.C1185q;
import f5.InterfaceC1171c;
import f5.InterfaceC1175g;
import i0.AbstractC1336M;
import i0.AbstractComponentCallbacksC1366v;
import i0.C1331H;
import i0.C1368x;
import i8.InterfaceC1420j;
import i8.L;
import j2.C1435b;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import l1.C1535g;
import l6.AbstractC1570b;
import n5.InterfaceC1653a;
import p.InterfaceC1771U;
import p6.C1862c;
import p6.InterfaceC1861b;
import u0.C2031b;
import u0.F;
import u0.H;
import u0.J;
import u4.C2079d;
import w4.InterfaceC2139a;
import w5.C2143c;
import z8.C2259h;
import z8.InterfaceC2255d;
import z8.InterfaceC2258g;
import z8.O;

/* loaded from: classes.dex */
public class u implements f.b, i6.h, InterfaceC1653a, InterfaceC1771U, InterfaceC1420j, InterfaceC1171c, y4.o, InterfaceC2139a, C5.a, w6.a, InterfaceC0093l, InterfaceC1175g, o.j, InterfaceC2258g {

    /* renamed from: a, reason: collision with root package name */
    public Object f16512a;

    public /* synthetic */ u(Object obj) {
        this.f16512a = obj;
    }

    @Override // f5.InterfaceC1171c
    public void G(AbstractC1176h abstractC1176h) {
        C2079d.e((C2079d) ((u4.j) this.f16512a).f23692g, "launchApplication", abstractC1176h);
    }

    @Override // D4.InterfaceC0093l
    public void H(Object obj, Object obj2) {
        y4.s sVar = (y4.s) obj;
        y4.q qVar = new y4.q(0, (C1177i) obj2);
        Context context = sVar.f2370c;
        C4.g gVar = new C4.g(-1, -1, 0, true);
        y4.j jVar = (y4.j) sVar.u();
        C4.f fVar = new C4.f(gVar);
        Parcel Q7 = jVar.Q();
        com.google.android.gms.internal.cast.C.d(Q7, qVar);
        Q7.writeStringArray((String[]) this.f16512a);
        com.google.android.gms.internal.cast.C.c(Q7, fVar);
        jVar.i1(Q7, 5);
    }

    @Override // i8.InterfaceC1420j
    public void c(n8.g gVar, L l9) {
        S5.q qVar = (S5.q) this.f16512a;
        if (S5.n.f6958f.d(qVar, null, l9)) {
            S5.n.d(qVar);
        }
    }

    @Override // f.b
    public void d(Object obj) {
        C1148a c1148a = (C1148a) obj;
        AbstractC1336M abstractC1336M = (AbstractC1336M) this.f16512a;
        C1331H c1331h = (C1331H) abstractC1336M.f18186D.pollFirst();
        if (c1331h == null) {
            Log.w("FragmentManager", "No IntentSenders were started for " + this);
            return;
        }
        C1535g c1535g = abstractC1336M.f18198c;
        String str = c1331h.f18174a;
        AbstractComponentCallbacksC1366v k5 = c1535g.k(str);
        if (k5 == null) {
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        } else {
            k5.C(c1331h.f18175b, c1148a.f17224a, c1148a.f17225b);
        }
    }

    @Override // z8.InterfaceC2258g
    public void e(InterfaceC2255d interfaceC2255d, Throwable th) {
        s8.a.e((C2259h) this.f16512a, th);
    }

    @Override // i8.InterfaceC1420j
    public void f(n8.g gVar, IOException iOException) {
        S5.q qVar = (S5.q) this.f16512a;
        if (S5.n.f6958f.d(qVar, null, new S5.c(iOException))) {
            S5.n.d(qVar);
        }
    }

    @Override // z8.InterfaceC2258g
    public void g(InterfaceC2255d interfaceC2255d, O o9) {
        s8.a.g((C2259h) this.f16512a, o9);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003a A[LOOP:0: B:8:0x0034->B:10:0x003a, LOOP_END] */
    @Override // y4.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(java.lang.String r14, long r15, int r17, d0.w r18, long r19, long r21) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f16512a
            r1 = r0
            v4.s r1 = (v4.s) r1
            v4.r r0 = new v4.r     // Catch: java.lang.IllegalStateException -> L19
            com.google.android.gms.common.api.Status r2 = new com.google.android.gms.common.api.Status     // Catch: java.lang.IllegalStateException -> L19
            r3 = 0
            r8 = r17
            r2.<init>(r8, r3, r3, r3)     // Catch: java.lang.IllegalStateException -> L17
            r3 = 2
            r0.<init>(r2, r3)     // Catch: java.lang.IllegalStateException -> L17
            r1.J(r0)     // Catch: java.lang.IllegalStateException -> L17
            goto L2c
        L17:
            r0 = move-exception
            goto L1c
        L19:
            r0 = move-exception
            r8 = r17
        L1c:
            y4.b r2 = v4.h.f23846k
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = r2.f24917a
            java.lang.String r5 = "Result already set when calling onRequestCompleted"
            java.lang.String r2 = r2.d(r5, r3)
            android.util.Log.e(r4, r2, r0)
        L2c:
            v4.h r0 = r1.f23883z
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.f23854h
            java.util.Iterator r0 = r0.iterator()
        L34:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4d
            java.lang.Object r1 = r0.next()
            r4 = r1
            v4.g r4 = (v4.g) r4
            r5 = r14
            r6 = r15
            r9 = r19
            r11 = r21
            r4.o(r5, r6, r8, r9, r11)
            r8 = r17
            goto L34
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.u.h(java.lang.String, long, int, d0.w, long, long):void");
    }

    @Override // w6.a
    public void j(Bundle bundle) {
        ((C1862c) ((InterfaceC1861b) this.f16512a)).a("clx", "_ae", bundle);
    }

    @Override // i6.h
    public Object k(String str) {
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
        ArrayList arrayList = new ArrayList();
        int i9 = 0;
        for (int i10 = 0; i10 < 3; i10++) {
            Provider provider = Security.getProvider(strArr[i10]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        int size = arrayList.size();
        Exception exc = null;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            try {
                return ((i6.j) this.f16512a).f(str, (Provider) obj);
            } catch (Exception e8) {
                if (exc == null) {
                    exc = e8;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }

    @Override // o.j
    public boolean l(o.l lVar, MenuItem item) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z9;
        z5.i iVar = ((BottomNavigationView) this.f16512a).f25499e;
        if (iVar != null) {
            H h7 = (H) ((C1435b) iVar).f19200b;
            kotlin.jvm.internal.h.e(item, "item");
            u0.C f9 = h7.f();
            kotlin.jvm.internal.h.b(f9);
            F f10 = f9.f23375b;
            kotlin.jvm.internal.h.b(f10);
            if (f10.g(item.getItemId(), f10, false, null) instanceof C2031b) {
                i9 = R.anim.nav_default_enter_anim;
                i10 = R.anim.nav_default_exit_anim;
                i11 = R.anim.nav_default_pop_enter_anim;
                i12 = R.anim.nav_default_pop_exit_anim;
            } else {
                i9 = R.animator.nav_default_enter_anim;
                i10 = R.animator.nav_default_exit_anim;
                i11 = R.animator.nav_default_pop_enter_anim;
                i12 = R.animator.nav_default_pop_exit_anim;
            }
            int i14 = i9;
            int i15 = i10;
            int i16 = i11;
            int i17 = i12;
            if ((item.getOrder() & 196608) == 0) {
                int i18 = F.f23386n;
                i13 = AbstractC1570b.d(h7.g()).f23381h;
                z9 = true;
            } else {
                i13 = -1;
                z9 = false;
            }
            try {
                h7.j(item.getItemId(), null, new J(true, true, i13, false, z9, i14, i15, i16, i17));
                u0.C f11 = h7.f();
                if (f11 != null) {
                    if (Y1.v(item.getItemId(), f11)) {
                        return false;
                    }
                }
            } catch (IllegalArgumentException e8) {
                int i19 = u0.C.j;
                StringBuilder r5 = AbstractC0953k1.r("Ignoring onNavDestinationSelected for MenuItem ", Y1.o(h7.f23394a, item.getItemId()), " as it cannot be found from the current destination ");
                r5.append(h7.f());
                Log.i("NavigationUI", r5.toString(), e8);
            }
            return true;
        }
        return false;
    }

    @Override // y4.o
    public void m(String str, long j, long j4, long j9) {
        v4.s sVar = (v4.s) this.f16512a;
        try {
            sVar.J(new v4.r(new Status(2103, null, null, null), 1));
        } catch (IllegalStateException e8) {
            y4.b bVar = v4.h.f23846k;
            Log.e(bVar.f24917a, bVar.d("Result already set when calling onRequestReplaced", new Object[0]), e8);
        }
        Iterator it = sVar.f23883z.f23854h.iterator();
        while (it.hasNext()) {
            ((v4.g) it.next()).o(str, j, 2103, j4, j9);
        }
    }

    public void n(int i9, boolean z9) {
        A6.i iVar = (A6.i) this.f16512a;
        if (z9) {
            iVar.b(i9);
        } else {
            iVar.getClass();
        }
    }

    public synchronized void o() {
        ((SharedPreferences) this.f16512a).edit().clear().commit();
    }

    @Override // w4.InterfaceC2139a
    public void p(Bitmap bitmap) {
        ((w4.i) this.f16512a).b(bitmap, 3);
    }

    public void q() {
        ((C1368x) this.f16512a).f18429q.O();
    }

    @Override // C5.a
    public void r(Typeface typeface) {
        C2143c c2143c = (C2143c) this.f16512a;
        if (c2143c.o(typeface)) {
            c2143c.i(false);
        }
    }

    @Override // f5.InterfaceC1175g
    public C1185q s(Object obj) {
        if (((G6.c) obj) == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
            return s8.n.p(null);
        }
        y6.l lVar = ((y6.j) this.f16512a).f25057e;
        return s8.n.C(Arrays.asList(y6.l.a(lVar), lVar.f25073m.m(lVar.f25066e.f25505a, null)));
    }

    public u(int i9) {
        Handler handler;
        Handler handler2;
        switch (i9) {
            case 4:
                this.f16512a = new s4.i(27);
                return;
            case 9:
                this.f16512a = new A6.i();
                return;
            default:
                Looper mainLooper = Looper.getMainLooper();
                if (Build.VERSION.SDK_INT >= 28) {
                    handler2 = F.a.a(mainLooper);
                } else {
                    try {
                        handler = (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(mainLooper, null, Boolean.TRUE);
                    } catch (IllegalAccessException e8) {
                        e = e8;
                        Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                        handler = new Handler(mainLooper);
                        handler2 = handler;
                        this.f16512a = handler2;
                        return;
                    } catch (InstantiationException e9) {
                        e = e9;
                        Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                        handler = new Handler(mainLooper);
                        handler2 = handler;
                        this.f16512a = handler2;
                        return;
                    } catch (NoSuchMethodException e10) {
                        e = e10;
                        Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                        handler = new Handler(mainLooper);
                        handler2 = handler;
                        this.f16512a = handler2;
                        return;
                    } catch (InvocationTargetException e11) {
                        Throwable cause = e11.getCause();
                        if (!(cause instanceof RuntimeException)) {
                            if (cause instanceof Error) {
                                throw ((Error) cause);
                            }
                            throw new RuntimeException(cause);
                        }
                        throw ((RuntimeException) cause);
                    }
                    handler2 = handler;
                }
                this.f16512a = handler2;
                return;
        }
    }

    public u(Context context) {
        boolean isEmpty;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f16512a = sharedPreferences;
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    isEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (isEmpty) {
                    return;
                }
                Log.i("FirebaseMessaging", "App restored, clearing state");
                o();
            }
        } catch (IOException e8) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e8.getMessage());
            }
        }
    }

    @Override // p.InterfaceC1771U
    public void a(int i9) {
    }

    @Override // p.InterfaceC1771U
    public void b(int i9) {
    }

    @Override // o.j
    public void u(o.l lVar) {
    }

    @Override // p.InterfaceC1771U
    public void i(int i9, float f9) {
    }
}
