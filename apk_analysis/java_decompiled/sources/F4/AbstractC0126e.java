package F4;

import android.accounts.Account;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import b7.C0701c;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: F4.e */
/* loaded from: classes.dex */
public abstract class AbstractC0126e {

    /* renamed from: y */
    public static final B4.d[] f2367y = new B4.d[0];

    /* renamed from: b */
    public L f2369b;

    /* renamed from: c */
    public final Context f2370c;

    /* renamed from: d */
    public final Looper f2371d;

    /* renamed from: e */
    public final J f2372e;

    /* renamed from: f */
    public final B4.g f2373f;

    /* renamed from: g */
    public final A f2374g;
    public u j;

    /* renamed from: k */
    public InterfaceC0125d f2377k;

    /* renamed from: l */
    public IInterface f2378l;

    /* renamed from: n */
    public C f2380n;

    /* renamed from: p */
    public final InterfaceC0123b f2382p;

    /* renamed from: q */
    public final InterfaceC0124c f2383q;

    /* renamed from: r */
    public final int f2384r;

    /* renamed from: s */
    public final String f2385s;

    /* renamed from: t */
    public volatile String f2386t;

    /* renamed from: a */
    public volatile String f2368a = null;

    /* renamed from: h */
    public final Object f2375h = new Object();

    /* renamed from: i */
    public final Object f2376i = new Object();

    /* renamed from: m */
    public final ArrayList f2379m = new ArrayList();

    /* renamed from: o */
    public int f2381o = 1;

    /* renamed from: u */
    public B4.b f2387u = null;

    /* renamed from: v */
    public boolean f2388v = false;

    /* renamed from: w */
    public volatile F f2389w = null;

    /* renamed from: x */
    public final AtomicInteger f2390x = new AtomicInteger(0);

    public AbstractC0126e(Context context, Looper looper, J j, B4.g gVar, int i9, InterfaceC0123b interfaceC0123b, InterfaceC0124c interfaceC0124c, String str) {
        y.i(context, "Context must not be null");
        this.f2370c = context;
        y.i(looper, "Looper must not be null");
        this.f2371d = looper;
        y.i(j, "Supervisor must not be null");
        this.f2372e = j;
        y.i(gVar, "API availability must not be null");
        this.f2373f = gVar;
        this.f2374g = new A(this, looper);
        this.f2384r = i9;
        this.f2382p = interfaceC0123b;
        this.f2383q = interfaceC0124c;
        this.f2385s = str;
    }

    public static /* bridge */ /* synthetic */ void B(AbstractC0126e abstractC0126e) {
        int i9;
        int i10;
        synchronized (abstractC0126e.f2375h) {
            i9 = abstractC0126e.f2381o;
        }
        if (i9 == 3) {
            abstractC0126e.f2388v = true;
            i10 = 5;
        } else {
            i10 = 4;
        }
        A a5 = abstractC0126e.f2374g;
        a5.sendMessage(a5.obtainMessage(i10, abstractC0126e.f2390x.get(), 16));
    }

    public static /* bridge */ /* synthetic */ boolean C(AbstractC0126e abstractC0126e, int i9, int i10, IInterface iInterface) {
        synchronized (abstractC0126e.f2375h) {
            try {
                if (abstractC0126e.f2381o != i9) {
                    return false;
                }
                abstractC0126e.D(i10, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean A() {
        return this instanceof y4.s;
    }

    public final void D(int i9, IInterface iInterface) {
        boolean z9;
        boolean z10;
        boolean z11;
        L l9;
        boolean z12 = false;
        if (i9 != 4) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (iInterface == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z9 == z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        y.b(z11);
        synchronized (this.f2375h) {
            try {
                this.f2381o = i9;
                this.f2378l = iInterface;
                Bundle bundle = null;
                if (i9 != 1) {
                    if (i9 != 2 && i9 != 3) {
                        if (i9 == 4) {
                            y.h(iInterface);
                            System.currentTimeMillis();
                        }
                    } else {
                        C c3 = this.f2380n;
                        if (c3 != null && (l9 = this.f2369b) != null) {
                            Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + l9.f2365c + " on com.google.android.gms");
                            J j = this.f2372e;
                            String str = this.f2369b.f2365c;
                            y.h(str);
                            this.f2369b.getClass();
                            if (this.f2385s == null) {
                                this.f2370c.getClass();
                            }
                            j.d(str, c3, this.f2369b.f2364b);
                            this.f2390x.incrementAndGet();
                        }
                        C c9 = new C(this, this.f2390x.get());
                        this.f2380n = c9;
                        String w7 = w();
                        boolean x5 = x();
                        this.f2369b = new L(w7, x5, 0);
                        if (x5 && f() < 17895000) {
                            throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f2369b.f2365c)));
                        }
                        J j4 = this.f2372e;
                        String str2 = this.f2369b.f2365c;
                        y.h(str2);
                        this.f2369b.getClass();
                        String str3 = this.f2385s;
                        if (str3 == null) {
                            str3 = this.f2370c.getClass().getName();
                        }
                        B4.b c10 = j4.c(new G(str2, this.f2369b.f2364b), c9, str3, null);
                        if (c10.f685b == 0) {
                            z12 = true;
                        }
                        if (!z12) {
                            Log.w("GmsClient", "unable to connect to service: " + this.f2369b.f2365c + " on com.google.android.gms");
                            int i10 = c10.f685b;
                            if (i10 == -1) {
                                i10 = 16;
                            }
                            if (c10.f686c != null) {
                                bundle = new Bundle();
                                bundle.putParcelable("pendingIntent", c10.f686c);
                            }
                            int i11 = this.f2390x.get();
                            E e8 = new E(this, i10, bundle);
                            A a5 = this.f2374g;
                            a5.sendMessage(a5.obtainMessage(7, i11, -1, e8));
                        }
                    }
                } else {
                    C c11 = this.f2380n;
                    if (c11 != null) {
                        J j9 = this.f2372e;
                        String str4 = this.f2369b.f2365c;
                        y.h(str4);
                        this.f2369b.getClass();
                        if (this.f2385s == null) {
                            this.f2370c.getClass();
                        }
                        j9.d(str4, c11, this.f2369b.f2364b);
                        this.f2380n = null;
                    }
                }
            } finally {
            }
        }
    }

    public final boolean a() {
        boolean z9;
        synchronized (this.f2375h) {
            if (this.f2381o == 4) {
                z9 = true;
            } else {
                z9 = false;
            }
        }
        return z9;
    }

    public final void c(InterfaceC0125d interfaceC0125d) {
        this.f2377k = interfaceC0125d;
        D(2, null);
    }

    public final void d(String str) {
        this.f2368a = str;
        l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(InterfaceC0130i interfaceC0130i, Set set) {
        String str;
        Bundle s9 = s();
        if (Build.VERSION.SDK_INT < 31) {
            str = this.f2386t;
        } else {
            str = this.f2386t;
        }
        String str2 = str;
        int i9 = this.f2384r;
        int i10 = B4.g.f696a;
        Scope[] scopeArr = C0128g.f2397o;
        Bundle bundle = new Bundle();
        B4.d[] dVarArr = C0128g.f2398p;
        C0128g c0128g = new C0128g(6, i9, i10, null, null, scopeArr, bundle, null, dVarArr, dVarArr, true, 0, false, str2);
        c0128g.f2402d = this.f2370c.getPackageName();
        c0128g.f2405g = s9;
        if (set != null) {
            c0128g.f2404f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (m()) {
            Account p9 = p();
            if (p9 == null) {
                p9 = new Account("<<default account>>", "com.google");
            }
            c0128g.f2406h = p9;
            if (interfaceC0130i != 0) {
                c0128g.f2403e = ((S4.a) interfaceC0130i).f6929f;
            }
        }
        c0128g.f2407i = f2367y;
        c0128g.j = q();
        if (A()) {
            c0128g.f2410m = true;
        }
        try {
            synchronized (this.f2376i) {
                try {
                    u uVar = this.j;
                    if (uVar != null) {
                        uVar.d(new B(this, this.f2390x.get()), c0128g);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e8) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e8);
            int i11 = this.f2390x.get();
            A a5 = this.f2374g;
            a5.sendMessage(a5.obtainMessage(6, i11, 3));
        } catch (RemoteException e9) {
            e = e9;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            z(8, null, null, this.f2390x.get());
        } catch (SecurityException e10) {
            throw e10;
        } catch (RuntimeException e11) {
            e = e11;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            z(8, null, null, this.f2390x.get());
        }
    }

    public abstract int f();

    public final boolean g() {
        boolean z9;
        synchronized (this.f2375h) {
            int i9 = this.f2381o;
            z9 = true;
            if (i9 != 2 && i9 != 3) {
                z9 = false;
            }
        }
        return z9;
    }

    public final B4.d[] h() {
        F f9 = this.f2389w;
        if (f9 == null) {
            return null;
        }
        return f9.f2338b;
    }

    public final void i() {
        if (a() && this.f2369b != null) {
        } else {
            throw new RuntimeException("Failed to connect when checking package");
        }
    }

    public final void j(C0701c c0701c) {
        ((D4.t) c0701c.f11404b).f1892q.f1855n.post(new A4.e(2, c0701c));
    }

    public final String k() {
        return this.f2368a;
    }

    public void l() {
        this.f2390x.incrementAndGet();
        synchronized (this.f2379m) {
            try {
                int size = this.f2379m.size();
                for (int i9 = 0; i9 < size; i9++) {
                    ((s) this.f2379m.get(i9)).c();
                }
                this.f2379m.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f2376i) {
            this.j = null;
        }
        D(1, null);
    }

    public boolean m() {
        return false;
    }

    public final void n() {
        int b9 = this.f2373f.b(this.f2370c, f());
        if (b9 != 0) {
            D(1, null);
            this.f2377k = new C0132k(this);
            int i9 = this.f2390x.get();
            A a5 = this.f2374g;
            a5.sendMessage(a5.obtainMessage(3, i9, b9, null));
            return;
        }
        c(new C0132k(this));
    }

    public abstract IInterface o(IBinder iBinder);

    public Account p() {
        return null;
    }

    public B4.d[] q() {
        return f2367y;
    }

    public Bundle r() {
        return null;
    }

    public Bundle s() {
        return new Bundle();
    }

    public Set t() {
        return Collections.EMPTY_SET;
    }

    public final IInterface u() {
        IInterface iInterface;
        synchronized (this.f2375h) {
            try {
                if (this.f2381o != 5) {
                    if (a()) {
                        iInterface = this.f2378l;
                        y.i(iInterface, "Client is connected but service is null");
                    } else {
                        throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                    }
                } else {
                    throw new DeadObjectException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public abstract String v();

    public abstract String w();

    public boolean x() {
        if (f() >= 211700000) {
            return true;
        }
        return false;
    }

    public void y(B4.b bVar) {
        bVar.getClass();
        System.currentTimeMillis();
    }

    public void z(int i9, IBinder iBinder, Bundle bundle, int i10) {
        D d9 = new D(this, i9, iBinder, bundle);
        A a5 = this.f2374g;
        a5.sendMessage(a5.obtainMessage(1, i10, -1, d9));
    }
}
