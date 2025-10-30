package com.google.firebase.crashlytics.ktx;

import B6.u0;
import M4.a;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import s6.C1962b;

@Keep
/* loaded from: classes.dex */
public final class FirebaseCrashlyticsLegacyRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1962b> getComponents() {
        return u0.D(a.c("fire-cls-ktx", "19.4.4"));
    }
}
