package com.google.firebase.analytics.connector.internal;

import F4.y;
import M4.a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.C0952k0;
import com.google.firebase.components.ComponentRegistrar;
import d0.o;
import d0.w;
import f5.ExecutorC1184p;
import java.util.Arrays;
import java.util.List;
import l6.C1574f;
import p6.C1862c;
import p6.InterfaceC1861b;
import s6.C1961a;
import s6.C1962b;
import s6.c;
import s6.h;
import s6.j;

@Keep
/* loaded from: classes.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    public static InterfaceC1861b lambda$getComponents$0(c cVar) {
        C1574f c1574f = (C1574f) cVar.b(C1574f.class);
        Context context = (Context) cVar.b(Context.class);
        P6.c cVar2 = (P6.c) cVar.b(P6.c.class);
        y.h(c1574f);
        y.h(context);
        y.h(cVar2);
        y.h(context.getApplicationContext());
        if (C1862c.f22196c == null) {
            synchronized (C1862c.class) {
                try {
                    if (C1862c.f22196c == null) {
                        Bundle bundle = new Bundle(1);
                        c1574f.a();
                        if ("[DEFAULT]".equals(c1574f.f20588b)) {
                            ((j) cVar2).a(new ExecutorC1184p(2), new o(11));
                            bundle.putBoolean("dataCollectionDefaultEnabled", c1574f.h());
                        }
                        C1862c.f22196c = new C1862c(C0952k0.d(context, bundle).f15516d);
                    }
                } finally {
                }
            }
        }
        return C1862c.f22196c;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<C1962b> getComponents() {
        C1961a a5 = C1962b.a(InterfaceC1861b.class);
        a5.a(h.a(C1574f.class));
        a5.a(h.a(Context.class));
        a5.a(h.a(P6.c.class));
        a5.f22745f = new w(12);
        a5.c(2);
        return Arrays.asList(a5.b(), a.c("fire-analytics", "22.4.0"));
    }
}
