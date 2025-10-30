package E7;

import O7.p;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1974a;

    public /* synthetic */ b(int i9) {
        this.f1974a = i9;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        c cVar;
        switch (this.f1974a) {
            case 0:
                String acc = (String) obj;
                g element = (g) obj2;
                kotlin.jvm.internal.h.e(acc, "acc");
                kotlin.jvm.internal.h.e(element, "element");
                if (acc.length() == 0) {
                    return element.toString();
                }
                return acc + ", " + element;
            default:
                i acc2 = (i) obj;
                g element2 = (g) obj2;
                kotlin.jvm.internal.h.e(acc2, "acc");
                kotlin.jvm.internal.h.e(element2, "element");
                i minusKey = acc2.minusKey(element2.getKey());
                j jVar = j.f1978a;
                if (minusKey != jVar) {
                    e eVar = e.f1977a;
                    f fVar = (f) minusKey.get(eVar);
                    if (fVar == null) {
                        cVar = new c(element2, minusKey);
                    } else {
                        i minusKey2 = minusKey.minusKey(eVar);
                        if (minusKey2 == jVar) {
                            return new c(fVar, element2);
                        }
                        cVar = new c(fVar, new c(element2, minusKey2));
                    }
                    return cVar;
                }
                return element2;
        }
    }
}
