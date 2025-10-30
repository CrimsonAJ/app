package com.google.firebase.messaging;

import androidx.annotation.Keep;
import b7.C0700b;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import l6.C1574f;
import s6.C1961a;
import s6.C1962b;

@Keep
/* loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    public static /* synthetic */ FirebaseMessaging a(s6.p pVar, Y2.r rVar) {
        return lambda$getComponents$0(pVar, rVar);
    }

    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(s6.p pVar, s6.c cVar) {
        C1574f c1574f = (C1574f) cVar.b(C1574f.class);
        if (cVar.b(R6.a.class) == null) {
            return new FirebaseMessaging(c1574f, cVar.h(C0700b.class), cVar.h(Q6.h.class), (T6.e) cVar.b(T6.e.class), cVar.i(pVar), (P6.c) cVar.b(P6.c.class));
        }
        throw new ClassCastException();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C1962b> getComponents() {
        s6.p pVar = new s6.p(J6.b.class, V2.f.class);
        C1961a a5 = C1962b.a(FirebaseMessaging.class);
        a5.f22740a = LIBRARY_NAME;
        a5.a(s6.h.a(C1574f.class));
        a5.a(new s6.h(0, 0, R6.a.class));
        a5.a(new s6.h(0, 1, C0700b.class));
        a5.a(new s6.h(0, 1, Q6.h.class));
        a5.a(s6.h.a(T6.e.class));
        a5.a(new s6.h(pVar, 0, 1));
        a5.a(s6.h.a(P6.c.class));
        a5.f22745f = new Q6.b(pVar, 2);
        a5.c(1);
        return Arrays.asList(a5.b(), M4.a.c(LIBRARY_NAME, "24.1.1"));
    }
}
