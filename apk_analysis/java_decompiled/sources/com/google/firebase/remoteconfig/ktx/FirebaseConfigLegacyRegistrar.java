package com.google.firebase.remoteconfig.ktx;

import B6.u0;
import M4.a;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import s6.C1962b;

@Keep
/* loaded from: classes.dex */
public final class FirebaseConfigLegacyRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1962b> getComponents() {
        return u0.D(a.c("fire-cfg-ktx", "22.1.2"));
    }
}
