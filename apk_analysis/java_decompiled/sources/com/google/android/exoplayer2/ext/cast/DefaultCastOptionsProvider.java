package com.google.android.exoplayer2.ext.cast;

import android.content.Context;
import com.google.android.gms.internal.cast.C0830i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import t4.i;
import u4.C2078c;
import v4.C2108a;

/* loaded from: classes.dex */
public final class DefaultCastOptionsProvider {
    public List<C0830i> getAdditionalSessionProviders(Context context) {
        return Collections.EMPTY_LIST;
    }

    public C2078c getCastOptions(Context context) {
        ArrayList arrayList = new ArrayList();
        i iVar = new i();
        ArrayList arrayList2 = new ArrayList();
        C2108a c2108a = C2078c.f23657u;
        if (c2108a != null) {
            return new C2078c("A12D4273", arrayList, true, iVar, false, c2108a, false, 0.05000000074505806d, false, false, false, arrayList2, true, false, C2078c.f23655s, C2078c.f23656t, false, false);
        }
        throw new NullPointerException("use Optional.orNull() instead of Optional.or(null)");
    }
}
