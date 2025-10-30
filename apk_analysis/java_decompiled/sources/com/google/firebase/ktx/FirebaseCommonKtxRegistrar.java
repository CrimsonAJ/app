package com.google.firebase.ktx;

import B7.l;
import Y6.a;
import Y7.AbstractC0480v;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import r6.InterfaceC1930a;
import r6.b;
import r6.c;
import r6.d;
import s6.C1961a;
import s6.C1962b;
import s6.h;
import s6.p;

@Keep
/* loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1962b> getComponents() {
        C1961a b9 = C1962b.b(new p(InterfaceC1930a.class, AbstractC0480v.class));
        b9.a(new h(new p(InterfaceC1930a.class, Executor.class), 1, 0));
        b9.f22745f = a.f8735b;
        C1962b b10 = b9.b();
        C1961a b11 = C1962b.b(new p(c.class, AbstractC0480v.class));
        b11.a(new h(new p(c.class, Executor.class), 1, 0));
        b11.f22745f = a.f8736c;
        C1962b b12 = b11.b();
        C1961a b13 = C1962b.b(new p(b.class, AbstractC0480v.class));
        b13.a(new h(new p(b.class, Executor.class), 1, 0));
        b13.f22745f = a.f8737d;
        C1962b b14 = b13.b();
        C1961a b15 = C1962b.b(new p(d.class, AbstractC0480v.class));
        b15.a(new h(new p(d.class, Executor.class), 1, 0));
        b15.f22745f = a.f8738e;
        return l.b0(b10, b12, b14, b15.b());
    }
}
