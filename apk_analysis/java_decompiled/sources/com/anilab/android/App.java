package com.anilab.android;

import C3.v;
import D4.q;
import I1.c;
import I1.m;
import L2.C0237a;
import L2.C0238b;
import L2.y;
import L2.z;
import O4.h;
import Y7.B;
import Y7.K;
import Y7.z0;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import c7.C0785e;
import c7.CallableC0783c;
import co.notix.Notix;
import co.notix.R;
import co.notix.interstitial.InterstitialLoader;
import co.notix.interstitial.NotixInterstitial;
import co.notix.log.LogLevel;
import com.google.android.gms.internal.measurement.D1;
import com.google.firebase.messaging.AbstractC1059e;
import com.google.firebase.messaging.FirebaseMessaging;
import d7.i;
import d8.e;
import d8.o;
import f5.AbstractC1178j;
import f5.C1181m;
import f5.C1185q;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import s8.n;
import u4.C2077b;

/* loaded from: classes.dex */
public final class App extends m {

    /* renamed from: h, reason: collision with root package name */
    public static InterstitialLoader f13715h;

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicBoolean f13716i = new AtomicBoolean(true);

    /* renamed from: c, reason: collision with root package name */
    public C0238b f13717c;

    /* renamed from: d, reason: collision with root package name */
    public C0237a f13718d;

    /* renamed from: e, reason: collision with root package name */
    public z f13719e;

    /* renamed from: f, reason: collision with root package name */
    public y f13720f;

    /* renamed from: g, reason: collision with root package name */
    public final e f13721g;

    public App() {
        z0 b9 = B.b();
        f8.e eVar = K.f8773a;
        this.f13721g = new e(h.D(b9, o.f17003a));
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, c7.j] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, c7.j] */
    @Override // I1.m, android.app.Application
    public final void onCreate() {
        C0785e v8;
        ?? obj;
        long seconds;
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            String string = getString(R.string.default_channel_name);
            kotlin.jvm.internal.h.d(string, "getString(...)");
            String string2 = getString(R.string.default_channel_description);
            kotlin.jvm.internal.h.d(string2, "getString(...)");
            AbstractC1059e.C();
            NotificationChannel e8 = AbstractC1059e.e(getString(R.string.default_notification_channel_id), string);
            e8.setDescription(string2);
            Object systemService = getSystemService("notification");
            kotlin.jvm.internal.h.c(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            ((NotificationManager) systemService).createNotificationChannel(e8);
        }
        try {
            C2077b.a(this);
            f13716i.set(false);
        } catch (Exception unused) {
            f13716i.set(true);
        }
        try {
            FirebaseMessaging D8 = s8.e.D();
            v vVar = new v(18, "1.1.2");
            C1185q c1185q = D8.f16450h;
            c1185q.getClass();
            q qVar = AbstractC1178j.f17414a;
            c1185q.f17436b.f(new C1181m(qVar, vVar, new C1185q()));
            c1185q.s();
            FirebaseMessaging D9 = s8.e.D();
            v vVar2 = new v(18, "com.anilab.android");
            C1185q c1185q2 = D9.f16450h;
            c1185q2.getClass();
            c1185q2.f17436b.f(new C1181m(qVar, vVar2, new C1185q()));
            c1185q2.s();
        } catch (Exception unused2) {
        }
        try {
            v8 = D1.v();
            obj = new Object();
            obj.f11723a = i.f16915i;
            seconds = TimeUnit.HOURS.toSeconds(2L);
        } catch (Exception unused3) {
        }
        if (seconds >= 0) {
            obj.f11723a = seconds;
            ?? obj2 = new Object();
            obj2.f11723a = obj.f11723a;
            n.e(v8.f11714b, new CallableC0783c(v8, 0, obj2));
            C0785e v9 = D1.v();
            c cVar = new c(0, this);
            O0.c cVar2 = v9.f11720h;
            synchronized (cVar2) {
                ((LinkedHashSet) cVar2.f5263b).add(cVar);
                cVar2.f();
            }
            try {
                NotixInterstitial.Companion companion = NotixInterstitial.Companion;
                y yVar = this.f13720f;
                if (yVar != null) {
                    InterstitialLoader createLoader = companion.createLoader(yVar.a().f3049a.longValue());
                    kotlin.jvm.internal.h.e(createLoader, "<set-?>");
                    f13715h = createLoader;
                    createLoader.startLoading();
                    Notix.Companion.setLogLevel(LogLevel.NONE);
                    return;
                }
                kotlin.jvm.internal.h.h("n");
                throw null;
            } catch (Exception unused4) {
                return;
            }
        }
        throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + seconds + " is an invalid argument");
    }
}
