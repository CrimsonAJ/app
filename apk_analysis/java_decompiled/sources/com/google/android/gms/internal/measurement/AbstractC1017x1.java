package com.google.android.gms.internal.measurement;

import android.os.Build;
import android.os.UserManager;

/* renamed from: com.google.android.gms.internal.measurement.x1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1017x1 {

    /* renamed from: a, reason: collision with root package name */
    public static UserManager f15690a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f15691b = !a();

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 24;
    }
}
