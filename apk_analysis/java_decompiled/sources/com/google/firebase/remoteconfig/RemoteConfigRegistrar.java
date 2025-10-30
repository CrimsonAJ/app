package com.google.firebase.remoteconfig;

import M4.a;
import T6.e;
import android.content.Context;
import androidx.annotation.Keep;
import c7.n;
import com.google.firebase.components.ComponentRegistrar;
import f7.InterfaceC1187a;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import l6.C1574f;
import n6.C1655a;
import p6.InterfaceC1861b;
import r6.b;
import s6.C1961a;
import s6.C1962b;
import s6.c;
import s6.h;
import s6.p;

@Keep
/* loaded from: classes.dex */
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    /* JADX INFO: Access modifiers changed from: private */
    public static n lambda$getComponents$0(p pVar, c cVar) {
        m6.c cVar2;
        Context context = (Context) cVar.b(Context.class);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) cVar.d(pVar);
        C1574f c1574f = (C1574f) cVar.b(C1574f.class);
        e eVar = (e) cVar.b(e.class);
        C1655a c1655a = (C1655a) cVar.b(C1655a.class);
        synchronized (c1655a) {
            try {
                if (!c1655a.f21243a.containsKey("frc")) {
                    c1655a.f21243a.put("frc", new m6.c(c1655a.f21244b));
                }
                cVar2 = (m6.c) c1655a.f21243a.get("frc");
            } catch (Throwable th) {
                throw th;
            }
        }
        return new n(context, scheduledExecutorService, c1574f, eVar, cVar2, cVar.h(InterfaceC1861b.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1962b> getComponents() {
        p pVar = new p(b.class, ScheduledExecutorService.class);
        C1961a c1961a = new C1961a(n.class, new Class[]{InterfaceC1187a.class});
        c1961a.f22740a = LIBRARY_NAME;
        c1961a.a(h.a(Context.class));
        c1961a.a(new h(pVar, 1, 0));
        c1961a.a(h.a(C1574f.class));
        c1961a.a(h.a(e.class));
        c1961a.a(h.a(C1655a.class));
        c1961a.a(new h(0, 1, InterfaceC1861b.class));
        c1961a.f22745f = new Q6.b(pVar, 1);
        c1961a.c(2);
        return Arrays.asList(c1961a.b(), a.c(LIBRARY_NAME, "22.1.2"));
    }
}
