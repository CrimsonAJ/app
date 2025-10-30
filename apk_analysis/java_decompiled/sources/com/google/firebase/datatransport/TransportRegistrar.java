package com.google.firebase.datatransport;

import J6.b;
import V2.f;
import W2.a;
import Y2.s;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import s6.C1961a;
import s6.C1962b;
import s6.c;
import s6.h;
import s6.p;

@Keep
/* loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public static /* synthetic */ f lambda$getComponents$0(c cVar) {
        s.b((Context) cVar.b(Context.class));
        return s.a().c(a.f7876f);
    }

    public static /* synthetic */ f lambda$getComponents$1(c cVar) {
        s.b((Context) cVar.b(Context.class));
        return s.a().c(a.f7876f);
    }

    public static /* synthetic */ f lambda$getComponents$2(c cVar) {
        s.b((Context) cVar.b(Context.class));
        return s.a().c(a.f7875e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1962b> getComponents() {
        C1961a a5 = C1962b.a(f.class);
        a5.f22740a = LIBRARY_NAME;
        a5.a(h.a(Context.class));
        a5.f22745f = new C6.a(8);
        C1962b b9 = a5.b();
        C1961a b10 = C1962b.b(new p(J6.a.class, f.class));
        b10.a(h.a(Context.class));
        b10.f22745f = new C6.a(9);
        C1962b b11 = b10.b();
        C1961a b12 = C1962b.b(new p(b.class, f.class));
        b12.a(h.a(Context.class));
        b12.f22745f = new C6.a(10);
        return Arrays.asList(b9, b11, b12.b(), M4.a.c(LIBRARY_NAME, "19.0.0"));
    }
}
