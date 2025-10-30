package com.google.firebase.messaging;

import android.content.res.Resources;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicInteger f16472a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    public static boolean a(Resources resources, int i9) {
        if (Build.VERSION.SDK_INT == 26) {
            try {
                if (B4.e.B(resources.getDrawable(i9, null))) {
                    Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i9);
                    return false;
                }
                return true;
            } catch (Resources.NotFoundException unused) {
                Log.e("FirebaseMessaging", "Couldn't find resource " + i9 + ", treating it as an invalid icon");
                return false;
            }
        }
        return true;
    }
}
