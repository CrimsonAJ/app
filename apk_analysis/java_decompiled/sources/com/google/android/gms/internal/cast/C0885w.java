package com.google.android.gms.internal.cast;

import android.os.Looper;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import u4.C2078c;

/* renamed from: com.google.android.gms.internal.cast.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0885w {

    /* renamed from: g, reason: collision with root package name */
    public static final y4.b f15073g = new y4.b("SessionTransController", null);

    /* renamed from: a, reason: collision with root package name */
    public final C2078c f15074a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f15075b = Collections.synchronizedSet(new HashSet());

    /* renamed from: c, reason: collision with root package name */
    public final T4.d f15076c = new T4.d(Looper.getMainLooper(), 4);

    /* renamed from: d, reason: collision with root package name */
    public final RunnableC0881v f15077d = new RunnableC0881v(this, 0);

    /* renamed from: e, reason: collision with root package name */
    public boolean f15078e;

    /* renamed from: f, reason: collision with root package name */
    public u4.h f15079f;

    public C0885w(C2078c c2078c) {
        this.f15074a = c2078c;
    }

    public final void a() {
        T4.d dVar = this.f15076c;
        F4.y.h(dVar);
        RunnableC0881v runnableC0881v = this.f15077d;
        F4.y.h(runnableC0881v);
        dVar.removeCallbacks(runnableC0881v);
    }
}
