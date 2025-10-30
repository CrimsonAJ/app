package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import k8.a;
import n6.C1655a;
import p6.InterfaceC1861b;
import s6.C1961a;
import s6.C1962b;
import s6.c;
import s6.h;

@Keep
/* loaded from: classes.dex */
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    public static /* synthetic */ C1655a lambda$getComponents$0(c cVar) {
        return new C1655a((Context) cVar.b(Context.class), cVar.h(InterfaceC1861b.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1962b> getComponents() {
        C1961a a5 = C1962b.a(C1655a.class);
        a5.f22740a = LIBRARY_NAME;
        a5.a(h.a(Context.class));
        a5.a(new h(0, 1, InterfaceC1861b.class));
        a5.f22745f = new a(9);
        return Arrays.asList(a5.b(), M4.a.c(LIBRARY_NAME, "21.1.1"));
    }
}
