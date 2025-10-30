package com.google.firebase;

import A7.d;
import M4.a;
import Q6.b;
import Q6.e;
import Q6.f;
import Q6.g;
import X0.k;
import android.content.Context;
import android.os.Build;
import b7.C0699a;
import b7.C0700b;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import l6.C1574f;
import r6.InterfaceC1930a;
import s6.C1961a;
import s6.C1962b;
import s6.h;
import s6.p;

/* loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        C1961a a5 = C1962b.a(C0700b.class);
        a5.a(new h(2, 0, C0699a.class));
        a5.f22745f = new k(5);
        arrayList.add(a5.b());
        p pVar = new p(InterfaceC1930a.class, Executor.class);
        C1961a c1961a = new C1961a(e.class, new Class[]{g.class, Q6.h.class});
        c1961a.a(h.a(Context.class));
        c1961a.a(h.a(C1574f.class));
        c1961a.a(new h(2, 0, f.class));
        c1961a.a(new h(1, 1, C0700b.class));
        c1961a.a(new h(pVar, 1, 0));
        c1961a.f22745f = new b(pVar, 0);
        arrayList.add(c1961a.b());
        arrayList.add(a.c("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(a.c("fire-core", "21.0.0"));
        arrayList.add(a.c("device-name", a(Build.PRODUCT)));
        arrayList.add(a.c("device-model", a(Build.DEVICE)));
        arrayList.add(a.c("device-brand", a(Build.BRAND)));
        arrayList.add(a.n("android-target-sdk", new k8.a(1)));
        arrayList.add(a.n("android-min-sdk", new k8.a(2)));
        arrayList.add(a.n("android-platform", new k8.a(3)));
        arrayList.add(a.n("android-installer", new k8.a(4)));
        try {
            d.f543b.getClass();
            str = "2.1.10";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(a.c("kotlin", str));
        }
        return arrayList;
    }
}
