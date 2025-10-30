package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import c7.CallableC0783c;
import f5.C1185q;
import java.util.concurrent.ExecutorService;
import s.C1939i;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f16477c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static E f16478d;

    /* renamed from: a, reason: collision with root package name */
    public final Object f16479a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f16480b;

    public j(ExecutorService executorService) {
        this.f16480b = new C1939i(0);
        this.f16479a = executorService;
    }

    public static C1185q a(Context context, Intent intent, boolean z9) {
        E e8;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (f16477c) {
            try {
                if (f16478d == null) {
                    f16478d = new E(context);
                }
                e8 = f16478d;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z9) {
            if (s.i().l(context)) {
                B.c(context, e8, intent);
            } else {
                e8.b(intent);
            }
            return s8.n.p(-1);
        }
        return e8.b(intent).l(new C0.e(0), new X0.k(12));
    }

    public C1185q b(Intent intent) {
        boolean z9;
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        boolean z10 = false;
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        boolean d9 = K4.b.d();
        Context context = (Context) this.f16479a;
        if (d9 && context.getApplicationInfo().targetSdkVersion >= 26) {
            z9 = true;
        } else {
            z9 = false;
        }
        if ((intent.getFlags() & 268435456) != 0) {
            z10 = true;
        }
        if (z9 && !z10) {
            return a(context, intent, z10);
        }
        C0.e eVar = (C0.e) this.f16480b;
        return s8.n.e(eVar, new CallableC0783c(context, 1, intent)).e(eVar, new i(context, intent, z10));
    }

    public j(Context context) {
        this.f16479a = context;
        this.f16480b = new C0.e(0);
    }
}
