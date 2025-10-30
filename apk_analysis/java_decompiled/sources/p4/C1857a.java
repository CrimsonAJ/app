package p4;

import B4.g;
import F4.L;
import F4.y;
import R4.c;
import R4.d;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import m3.i;

/* renamed from: p4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1857a {

    /* renamed from: a, reason: collision with root package name */
    public B4.a f22170a;

    /* renamed from: b, reason: collision with root package name */
    public d f22171b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f22172c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f22173d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public C1858b f22174e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f22175f;

    /* renamed from: g, reason: collision with root package name */
    public final long f22176g;

    public C1857a(Context context) {
        y.h(context);
        Context applicationContext = context.getApplicationContext();
        this.f22175f = applicationContext != null ? applicationContext : context;
        this.f22172c = false;
        this.f22176g = -1L;
    }

    public static L a(Context context) {
        C1857a c1857a = new C1857a(context);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            c1857a.c();
            L e8 = c1857a.e();
            d(e8, SystemClock.elapsedRealtime() - elapsedRealtime, null);
            return e8;
        } finally {
        }
    }

    public static void d(L l9, long j, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap hashMap = new HashMap();
            String str = "1";
            hashMap.put("app_context", "1");
            if (l9 != null) {
                if (true != l9.f2364b) {
                    str = "0";
                }
                hashMap.put("limit_ad_tracking", str);
                String str2 = l9.f2365c;
                if (str2 != null) {
                    hashMap.put("ad_id_size", Integer.toString(str2.length()));
                }
            }
            if (th != null) {
                hashMap.put("error", th.getClass().getName());
            }
            hashMap.put("tag", "AdvertisingIdClient");
            hashMap.put("time_spent", Long.toString(j));
            new i(hashMap).start();
        }
    }

    public final void b() {
        y.g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f22175f != null && this.f22170a != null) {
                    try {
                        if (this.f22172c) {
                            J4.a.b().c(this.f22175f, this.f22170a);
                        }
                    } catch (Throwable th) {
                        Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                    }
                    this.f22172c = false;
                    this.f22171b = null;
                    this.f22170a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c() {
        d bVar;
        y.g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f22172c) {
                    b();
                }
                Context context = this.f22175f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int b9 = g.f697b.b(context, 12451000);
                    if (b9 != 0 && b9 != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    B4.a aVar = new B4.a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (J4.a.b().a(context, intent, aVar, 1)) {
                            this.f22170a = aVar;
                            try {
                                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                                IBinder a5 = aVar.a();
                                int i9 = c.f6661e;
                                IInterface queryLocalInterface = a5.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                                if (queryLocalInterface instanceof d) {
                                    bVar = (d) queryLocalInterface;
                                } else {
                                    bVar = new R4.b(a5);
                                }
                                this.f22171b = bVar;
                                this.f22172c = true;
                            } catch (InterruptedException unused) {
                                throw new IOException("Interrupted exception");
                            } catch (Throwable th) {
                                throw new IOException(th);
                            }
                        } else {
                            throw new IOException("Connection failure");
                        }
                    } finally {
                        IOException iOException = new IOException(th);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new Exception();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final L e() {
        L l9;
        y.g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.f22172c) {
                    synchronized (this.f22173d) {
                        C1858b c1858b = this.f22174e;
                        if (c1858b == null || !c1858b.f22180d) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        c();
                        if (!this.f22172c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e8) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e8);
                    }
                }
                y.h(this.f22170a);
                y.h(this.f22171b);
                try {
                    R4.b bVar = (R4.b) this.f22171b;
                    bVar.getClass();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    boolean z9 = true;
                    Parcel d9 = bVar.d(obtain, 1);
                    String readString = d9.readString();
                    d9.recycle();
                    R4.b bVar2 = (R4.b) this.f22171b;
                    bVar2.getClass();
                    Parcel obtain2 = Parcel.obtain();
                    obtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    int i9 = R4.a.f6659a;
                    obtain2.writeInt(1);
                    Parcel d10 = bVar2.d(obtain2, 2);
                    if (d10.readInt() == 0) {
                        z9 = false;
                    }
                    d10.recycle();
                    l9 = new L(readString, z9, 3);
                } catch (RemoteException e9) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e9);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        f();
        return l9;
    }

    public final void f() {
        synchronized (this.f22173d) {
            C1858b c1858b = this.f22174e;
            if (c1858b != null) {
                c1858b.f22179c.countDown();
                try {
                    this.f22174e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j = this.f22176g;
            if (j > 0) {
                this.f22174e = new C1858b(this, j);
            }
        }
    }

    public final void finalize() {
        b();
        super.finalize();
    }
}
