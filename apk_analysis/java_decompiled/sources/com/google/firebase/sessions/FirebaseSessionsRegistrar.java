package com.google.firebase.sessions;

import B7.l;
import E7.i;
import M4.a;
import T6.e;
import V2.f;
import X0.k;
import Y7.AbstractC0480v;
import android.content.Context;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import i7.AbstractC1404t;
import i7.AbstractC1407w;
import i7.C1394i;
import i7.C1398m;
import i7.C1401p;
import i7.C1408x;
import i7.C1409y;
import i7.InterfaceC1403s;
import i7.L;
import i7.U;
import i7.W;
import java.util.List;
import kotlin.jvm.internal.h;
import l6.C1574f;
import l7.C1576a;
import r6.InterfaceC1930a;
import r6.b;
import s6.C1961a;
import s6.C1962b;
import s6.c;
import s6.p;
import z7.InterfaceC2251a;

@Keep
/* loaded from: classes.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @Deprecated
    public static final String LIBRARY_NAME = "fire-sessions";

    @Deprecated
    public static final String TAG = "FirebaseSessions";
    private static final C1408x Companion = new Object();
    private static final p appContext = p.a(Context.class);
    private static final p firebaseApp = p.a(C1574f.class);
    private static final p firebaseInstallationsApi = p.a(e.class);
    private static final p backgroundDispatcher = new p(InterfaceC1930a.class, AbstractC0480v.class);
    private static final p blockingDispatcher = new p(b.class, AbstractC0480v.class);
    private static final p transportFactory = p.a(f.class);
    private static final p firebaseSessionsComponent = p.a(InterfaceC1403s.class);

    /* JADX WARN: Type inference failed for: r0v0, types: [i7.x, java.lang.Object] */
    static {
        try {
            int i9 = AbstractC1407w.f18916a;
        } catch (NoClassDefFoundError unused) {
            Log.w(TAG, "Your app is experiencing a known issue in the Android Gradle plugin, see https://issuetracker.google.com/328687152\n\nIt affects Java-only apps using AGP version 8.3.2 and under. To avoid the issue, either:\n\n1. Upgrade Android Gradle plugin to 8.4.0+\n   Follow the guide at https://developer.android.com/build/agp-upgrade-assistant\n\n2. Or, add the Kotlin plugin to your app\n   Follow the guide at https://developer.android.com/kotlin/add-kotlin\n\n3. Or, do the technical workaround described in https://issuetracker.google.com/issues/328687152#comment3");
        }
    }

    public static final C1401p getComponents$lambda$0(c cVar) {
        return (C1401p) ((C1394i) ((InterfaceC1403s) cVar.d(firebaseSessionsComponent))).f18882i.get();
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [i7.s, i7.i, java.lang.Object] */
    public static final InterfaceC1403s getComponents$lambda$1(c cVar) {
        Object d9 = cVar.d(appContext);
        h.d(d9, "container[appContext]");
        Object d10 = cVar.d(backgroundDispatcher);
        h.d(d10, "container[backgroundDispatcher]");
        Object d11 = cVar.d(blockingDispatcher);
        h.d(d11, "container[blockingDispatcher]");
        Object d12 = cVar.d(firebaseApp);
        h.d(d12, "container[firebaseApp]");
        Object d13 = cVar.d(firebaseInstallationsApi);
        h.d(d13, "container[firebaseInstallationsApi]");
        S6.b i9 = cVar.i(transportFactory);
        h.d(i9, "container.getProvider(transportFactory)");
        ?? obj = new Object();
        obj.f18874a = l7.c.a((C1574f) d12);
        l7.c a5 = l7.c.a((Context) d9);
        obj.f18875b = a5;
        obj.f18876c = C1576a.a(new C1398m(a5, 5));
        obj.f18877d = l7.c.a((i) d10);
        obj.f18878e = l7.c.a((e) d13);
        InterfaceC2251a a9 = C1576a.a(new C1398m(obj.f18874a, 1));
        obj.f18879f = a9;
        obj.f18880g = C1576a.a(new L(a9, obj.f18877d));
        obj.f18881h = C1576a.a(new W(obj.f18876c, C1576a.a(new U(obj.f18877d, obj.f18878e, obj.f18879f, obj.f18880g, C1576a.a(new C1398m(C1576a.a(new C1398m(obj.f18875b, 2)), 6)), 1)), 1));
        obj.f18882i = C1576a.a(new C1409y(obj.f18874a, obj.f18881h, obj.f18877d, C1576a.a(new C1398m(obj.f18875b, 4))));
        obj.j = C1576a.a(new L(obj.f18877d, C1576a.a(new C1398m(obj.f18875b, 3))));
        obj.f18883k = C1576a.a(new U(obj.f18874a, obj.f18878e, obj.f18881h, C1576a.a(new C1398m(l7.c.a(i9), 0)), obj.f18877d, 0));
        obj.f18884l = C1576a.a(AbstractC1404t.f18911a);
        obj.f18885m = C1576a.a(new W(obj.f18884l, C1576a.a(AbstractC1404t.f18912b), 0));
        return obj;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1962b> getComponents() {
        C1961a a5 = C1962b.a(C1401p.class);
        a5.f22740a = LIBRARY_NAME;
        a5.a(s6.h.b(firebaseSessionsComponent));
        a5.f22745f = new k(18);
        a5.c(2);
        C1962b b9 = a5.b();
        C1961a a9 = C1962b.a(InterfaceC1403s.class);
        a9.f22740a = "fire-sessions-component";
        a9.a(s6.h.b(appContext));
        a9.a(s6.h.b(backgroundDispatcher));
        a9.a(s6.h.b(blockingDispatcher));
        a9.a(s6.h.b(firebaseApp));
        a9.a(s6.h.b(firebaseInstallationsApi));
        a9.a(new s6.h(transportFactory, 1, 1));
        a9.f22745f = new k(19);
        return l.b0(b9, a9.b(), a.c(LIBRARY_NAME, "2.1.2"));
    }
}
