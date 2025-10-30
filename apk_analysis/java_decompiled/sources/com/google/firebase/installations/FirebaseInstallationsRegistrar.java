package com.google.firebase.installations;

import C6.a;
import Q6.f;
import Q6.g;
import T6.d;
import T6.e;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import k3.C1487c;
import l6.C1574f;
import r6.InterfaceC1930a;
import r6.b;
import s6.C1961a;
import s6.C1962b;
import s6.c;
import s6.h;
import s6.p;
import t6.ExecutorC2025j;

@Keep
/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    public static e lambda$getComponents$0(c cVar) {
        return new d((C1574f) cVar.b(C1574f.class), cVar.h(g.class), (ExecutorService) cVar.d(new p(InterfaceC1930a.class, ExecutorService.class)), new ExecutorC2025j((Executor) cVar.d(new p(b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1962b> getComponents() {
        C1961a a5 = C1962b.a(e.class);
        a5.f22740a = LIBRARY_NAME;
        a5.a(h.a(C1574f.class));
        a5.a(new h(0, 1, g.class));
        a5.a(new h(new p(InterfaceC1930a.class, ExecutorService.class), 1, 0));
        a5.a(new h(new p(b.class, Executor.class), 1, 0));
        a5.f22745f = new a(22);
        C1962b b9 = a5.b();
        f fVar = new f(0);
        C1961a a9 = C1962b.a(f.class);
        a9.f22744e = 1;
        a9.f22745f = new C1487c(fVar);
        return Arrays.asList(b9, a9.b(), M4.a.c(LIBRARY_NAME, "18.0.0"));
    }
}
