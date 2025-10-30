package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class M {
    public static void a(Object obj, Object obj2) {
        L l9 = (L) obj;
        if (obj2 == null) {
            if (!l9.isEmpty()) {
                Iterator it = l9.entrySet().iterator();
                if (!it.hasNext()) {
                    return;
                }
                Map.Entry entry = (Map.Entry) it.next();
                entry.getKey();
                entry.getValue();
                throw null;
            }
            return;
        }
        throw new ClassCastException();
    }

    public static L b(Object obj, Object obj2) {
        L l9 = (L) obj;
        L l10 = (L) obj2;
        if (!l10.isEmpty()) {
            if (!l9.f16304a) {
                l9 = l9.e();
            }
            l9.c();
            if (!l10.isEmpty()) {
                l9.putAll(l10);
            }
        }
        return l9;
    }
}
