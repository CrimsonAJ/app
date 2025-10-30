package com.google.firebase.analytics;

import F4.y;
import T6.d;
import T6.e;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import b5.T0;
import com.google.android.gms.internal.measurement.C0952k0;
import com.google.android.gms.internal.measurement.W;
import com.google.android.gms.internal.measurement.Z;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import l6.C1574f;
import o6.C1704a;
import s8.n;

/* loaded from: classes.dex */
public final class FirebaseAnalytics {

    /* renamed from: b, reason: collision with root package name */
    public static volatile FirebaseAnalytics f16407b;

    /* renamed from: a, reason: collision with root package name */
    public final C0952k0 f16408a;

    public FirebaseAnalytics(C0952k0 c0952k0) {
        y.h(c0952k0);
        this.f16408a = c0952k0;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f16407b == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f16407b == null) {
                        f16407b = new FirebaseAnalytics(C0952k0.d(context, null));
                    }
                } finally {
                }
            }
        }
        return f16407b;
    }

    @Keep
    public static T0 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        C0952k0 d9 = C0952k0.d(context, bundle);
        if (d9 == null) {
            return null;
        }
        return new C1704a(d9);
    }

    @Keep
    public String getFirebaseInstanceId() {
        try {
            Object obj = d.f7216m;
            return (String) n.c(((d) C1574f.c().b(e.class)).d(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e8) {
            throw new IllegalStateException(e8);
        } catch (ExecutionException e9) {
            throw new IllegalStateException(e9.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        W f9 = W.f(activity);
        C0952k0 c0952k0 = this.f16408a;
        c0952k0.getClass();
        c0952k0.b(new Z(c0952k0, f9, str, str2));
    }
}
