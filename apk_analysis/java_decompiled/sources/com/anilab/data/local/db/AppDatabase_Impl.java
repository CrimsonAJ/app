package com.anilab.data.local.db;

import B7.t;
import C2.P;
import F0.K;
import G0.C0145k;
import Z0.a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.p;
import z2.C2235a;
import z2.C2236b;

/* loaded from: classes.dex */
public final class AppDatabase_Impl extends AppDatabase {
    public AppDatabase_Impl() {
        a.q(new P(this));
    }

    @Override // G0.E
    public final List d(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // G0.E
    public final C0145k e() {
        return new C0145k(this, new LinkedHashMap(), new LinkedHashMap(), "AnimeEntity");
    }

    @Override // G0.E
    public final K f() {
        return new C2236b(this);
    }

    @Override // G0.E
    public final Set j() {
        return new LinkedHashSet();
    }

    @Override // G0.E
    public final LinkedHashMap k() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(p.a(C2235a.class), t.f1135a);
        return linkedHashMap;
    }
}
