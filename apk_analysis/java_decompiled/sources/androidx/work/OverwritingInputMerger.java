package androidx.work;

import b7.C0701c;
import e1.h;
import e1.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class OverwritingInputMerger extends k {
    @Override // e1.k
    public final h a(ArrayList arrayList) {
        C0701c c0701c = new C0701c(27);
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            hashMap.putAll(Collections.unmodifiableMap(((h) obj).f17050a));
        }
        c0701c.L(hashMap);
        h hVar = new h((HashMap) c0701c.f11404b);
        h.b(hVar);
        return hVar;
    }
}
