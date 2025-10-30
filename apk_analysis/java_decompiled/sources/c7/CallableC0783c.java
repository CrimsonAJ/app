package c7;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import com.google.firebase.messaging.B;
import com.google.firebase.messaging.s;
import java.io.FileOutputStream;
import java.util.ArrayDeque;
import java.util.concurrent.Callable;

/* renamed from: c7.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC0783c implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11706a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11707b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11708c;

    public /* synthetic */ CallableC0783c(Object obj, int i9, Object obj2) {
        this.f11706a = i9;
        this.f11707b = obj;
        this.f11708c = obj2;
    }

    private final Object a() {
        C0785e c0785e = (C0785e) this.f11707b;
        C0790j c0790j = (C0790j) this.f11708c;
        d7.m mVar = c0785e.f11719g;
        synchronized (mVar.f16952b) {
            SharedPreferences.Editor edit = mVar.f16951a.edit();
            c0790j.getClass();
            edit.putLong("fetch_timeout_in_seconds", 60L).putLong("minimum_fetch_interval_in_seconds", c0790j.f11723a).commit();
        }
        return null;
    }

    private final Object b() {
        String str;
        ServiceInfo serviceInfo;
        String str2;
        int i9;
        ComponentName startService;
        Context context = (Context) this.f11707b;
        Intent intent = (Intent) this.f11708c;
        s i10 = s.i();
        i10.getClass();
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Starting service");
        }
        ((ArrayDeque) i10.f16507e).offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        synchronized (i10) {
            try {
                str = (String) i10.f16504b;
                if (str == null) {
                    ResolveInfo resolveService = context.getPackageManager().resolveService(intent2, 0);
                    if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
                        if (context.getPackageName().equals(serviceInfo.packageName) && (str2 = serviceInfo.name) != null) {
                            if (str2.startsWith(".")) {
                                i10.f16504b = context.getPackageName() + serviceInfo.name;
                            } else {
                                i10.f16504b = serviceInfo.name;
                            }
                            str = (String) i10.f16504b;
                        }
                        Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                        str = null;
                    }
                    Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                    str = null;
                }
            } finally {
            }
        }
        if (str != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Restricting intent to a specific service: ".concat(str));
            }
            intent2.setClassName(context.getPackageName(), str);
        }
        try {
            if (i10.l(context)) {
                startService = B.d(context, intent2);
            } else {
                startService = context.startService(intent2);
                Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
            }
            if (startService == null) {
                Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                i9 = 404;
            } else {
                i9 = -1;
            }
        } catch (IllegalStateException e8) {
            Log.e("FirebaseMessaging", "Failed to start service while in background: " + e8);
            i9 = 402;
        } catch (SecurityException e9) {
            Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e9);
            i9 = 401;
        }
        return Integer.valueOf(i9);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f11706a) {
            case 0:
                return a();
            case 1:
                return b();
            default:
                d7.d dVar = (d7.d) this.f11707b;
                d7.e eVar = (d7.e) this.f11708c;
                d7.n nVar = dVar.f16894b;
                synchronized (nVar) {
                    FileOutputStream openFileOutput = nVar.f16956a.openFileOutput(nVar.f16957b, 0);
                    try {
                        openFileOutput.write(eVar.f16897a.toString().getBytes("UTF-8"));
                    } finally {
                        openFileOutput.close();
                    }
                }
                return null;
        }
    }
}
