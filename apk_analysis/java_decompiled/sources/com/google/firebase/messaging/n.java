package com.google.firebase.messaging;

import P.f0;
import P.u0;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import android.view.View;
import h5.AbstractC1281a;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import l6.C1574f;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public int f16488a;

    /* renamed from: b, reason: collision with root package name */
    public int f16489b;

    /* renamed from: c, reason: collision with root package name */
    public Object f16490c;

    /* renamed from: d, reason: collision with root package name */
    public Object f16491d;

    /* renamed from: e, reason: collision with root package name */
    public Serializable f16492e;

    public static String c(C1574f c1574f) {
        c1574f.a();
        l6.i iVar = c1574f.f20589c;
        String str = iVar.f20605e;
        if (str != null) {
            return str;
        }
        c1574f.a();
        String str2 = iVar.f20602b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] split = str2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public synchronized String a() {
        try {
            if (((String) this.f16491d) == null) {
                g();
            }
        } catch (Throwable th) {
            throw th;
        }
        return (String) this.f16491d;
    }

    public synchronized String b() {
        try {
            if (((String) this.f16492e) == null) {
                g();
            }
        } catch (Throwable th) {
            throw th;
        }
        return (String) this.f16492e;
    }

    public PackageInfo d(String str) {
        try {
            return ((Context) this.f16490c).getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e8) {
            Log.w("FirebaseMessaging", "Failed to find package " + e8);
            return null;
        }
    }

    public boolean e() {
        int i9;
        synchronized (this) {
            i9 = this.f16489b;
            if (i9 == 0) {
                PackageManager packageManager = ((Context) this.f16490c).getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                    i9 = 0;
                } else {
                    if (!K4.b.d()) {
                        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                        intent.setPackage("com.google.android.gms");
                        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                        if (queryIntentServices != null && queryIntentServices.size() > 0) {
                            this.f16489b = 1;
                            i9 = 1;
                        }
                    }
                    Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
                    if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
                        this.f16489b = 2;
                        i9 = 2;
                    } else {
                        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                        if (K4.b.d()) {
                            this.f16489b = 2;
                        } else {
                            this.f16489b = 1;
                        }
                        i9 = this.f16489b;
                    }
                }
            }
        }
        if (i9 != 0) {
            return true;
        }
        return false;
    }

    public void f(u0 u0Var, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if ((((f0) it.next()).f5595a.c() & 8) != 0) {
                ((View) this.f16491d).setTranslationY(AbstractC1281a.c(this.f16489b, r3.f5595a.b(), 0));
                return;
            }
        }
    }

    public synchronized void g() {
        PackageInfo d9 = d(((Context) this.f16490c).getPackageName());
        if (d9 != null) {
            this.f16491d = Integer.toString(d9.versionCode);
            this.f16492e = d9.versionName;
        }
    }
}
