package com.google.firebase.crashlytics;

import M4.a;
import T6.e;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import f7.InterfaceC1187a;
import j2.C1435b;
import j7.C1477a;
import j7.d;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import l6.C1574f;
import p6.InterfaceC1861b;
import r6.InterfaceC1930a;
import r6.b;
import r6.c;
import s6.C1961a;
import s6.C1962b;
import s6.h;
import s6.p;
import u6.C2083b;
import v6.C2110a;

/* loaded from: classes.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f16413d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final p f16414a = new p(InterfaceC1930a.class, ExecutorService.class);

    /* renamed from: b, reason: collision with root package name */
    public final p f16415b = new p(b.class, ExecutorService.class);

    /* renamed from: c, reason: collision with root package name */
    public final p f16416c = new p(c.class, ExecutorService.class);

    static {
        d dVar = d.f19794a;
        Map map = j7.c.f19793b;
        if (map.containsKey(dVar)) {
            Log.d("SessionsDependencies", "Dependency " + dVar + " already added.");
            return;
        }
        map.put(dVar, new C1477a(new g8.d(true)));
        Log.d("SessionsDependencies", "Dependency to " + dVar + " added.");
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        C1961a a5 = C1962b.a(C2083b.class);
        a5.f22740a = "fire-cls";
        a5.a(h.a(C1574f.class));
        a5.a(h.a(e.class));
        a5.a(new h(this.f16414a, 1, 0));
        a5.a(new h(this.f16415b, 1, 0));
        a5.a(new h(this.f16416c, 1, 0));
        a5.a(new h(0, 2, C2110a.class));
        a5.a(new h(0, 2, InterfaceC1861b.class));
        a5.a(new h(0, 2, InterfaceC1187a.class));
        a5.f22745f = new C1435b(16, this);
        a5.c(2);
        return Arrays.asList(a5.b(), a.c("fire-cls", "19.4.4"));
    }
}
