package b5;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class J0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10731a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final long f10732b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f10733c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f10734d;

    public /* synthetic */ J0(S0 s02, Bundle bundle, long j) {
        this.f10733c = s02;
        this.f10734d = bundle;
        this.f10732b = j;
    }

    public boolean a() {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) ((FirebaseMessaging) this.f10734d).f16444b.getSystemService("connectivity");
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    public boolean b() {
        try {
            if (((FirebaseMessaging) this.f10734d).a() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Token successfully retrieved");
                return true;
            }
            return true;
        } catch (IOException e8) {
            String message = e8.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                if (e8.getMessage() == null) {
                    Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                    return false;
                }
                throw e8;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e8.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10731a) {
            case 0:
                S0 s02 = (S0) this.f10733c;
                if (TextUtils.isEmpty(((C0650n0) s02.f1707a).i().s0())) {
                    s02.B0((Bundle) this.f10734d, 0, this.f10732b);
                    return;
                }
                V v8 = ((C0650n0) s02.f1707a).f11229i;
                C0650n0.f(v8);
                v8.f10975k.b("Using developer consent only; google app id found");
                return;
            case 1:
                C0612a1 c0612a1 = (C0612a1) this.f10733c;
                long j = this.f10732b;
                C0621d1 c0621d1 = (C0621d1) this.f10734d;
                c0621d1.r0(c0612a1, false, j);
                c0621d1.f11066e = null;
                C0648m1 m9 = ((C0650n0) c0621d1.f1707a).m();
                m9.l0();
                m9.m0();
                m9.C0(new S5.o(m9, null, 25, false));
                return;
            default:
                com.google.firebase.messaging.s i9 = com.google.firebase.messaging.s.i();
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f10734d;
                boolean l9 = i9.l(firebaseMessaging.f16444b);
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.f10733c;
                if (l9) {
                    wakeLock.acquire();
                }
                try {
                    try {
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.j = true;
                        }
                        if (!firebaseMessaging.f16451i.e()) {
                            firebaseMessaging.f(false);
                            if (!com.google.firebase.messaging.s.i().l(firebaseMessaging.f16444b)) {
                                return;
                            }
                        } else if (com.google.firebase.messaging.s.i().k(firebaseMessaging.f16444b) && !a()) {
                            D4.x xVar = new D4.x();
                            xVar.f1904c = this;
                            xVar.a();
                            if (!com.google.firebase.messaging.s.i().l(firebaseMessaging.f16444b)) {
                                return;
                            }
                        } else {
                            if (b()) {
                                firebaseMessaging.f(false);
                            } else {
                                firebaseMessaging.h(this.f10732b);
                            }
                            if (!com.google.firebase.messaging.s.i().l(firebaseMessaging.f16444b)) {
                                return;
                            }
                        }
                    } catch (IOException e8) {
                        Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e8.getMessage() + ". Won't retry the operation.");
                        firebaseMessaging.f(false);
                        if (!com.google.firebase.messaging.s.i().l(firebaseMessaging.f16444b)) {
                            return;
                        }
                    }
                    wakeLock.release();
                    return;
                } catch (Throwable th) {
                    if (com.google.firebase.messaging.s.i().l(firebaseMessaging.f16444b)) {
                        wakeLock.release();
                    }
                    throw th;
                }
        }
    }

    public J0(C0621d1 c0621d1, C0612a1 c0612a1, long j) {
        this.f10733c = c0612a1;
        this.f10732b = j;
        this.f10734d = c0621d1;
    }

    public J0(FirebaseMessaging firebaseMessaging, long j) {
        new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new L4.a("firebase-iid-executor"));
        this.f10734d = firebaseMessaging;
        this.f10732b = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) firebaseMessaging.f16444b.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f10733c = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }
}
