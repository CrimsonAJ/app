package R1;

import a.AbstractC0485a;
import com.anilab.android.ui.download.DownloadFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class h extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f6530r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ DownloadFragment f6531s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(E7.d dVar, DownloadFragment downloadFragment) {
        super(2, dVar);
        this.f6531s = downloadFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        h hVar = new h(dVar, this.f6531s);
        hVar.f6530r = obj;
        return hVar;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        h hVar = (h) create((Map) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        hVar.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        Map map = (Map) this.f6530r;
        E e8 = (E) this.f6531s.f13748V0.getValue();
        A7.n nVar = A7.n.f558a;
        if (e8 == null) {
            return nVar;
        }
        e8.clear();
        Set keySet = map.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : keySet) {
            if (((J2.c) obj2) != J2.c.f4162b) {
                arrayList.add(obj2);
            }
        }
        List C02 = B7.k.C0(arrayList, new g(0));
        ArrayList arrayList2 = new ArrayList(B7.m.f0(C02, 10));
        Iterator it = C02.iterator();
        while (it.hasNext()) {
            arrayList2.add(((J2.c) it.next()).f4169a + "P");
        }
        e8.addAll(arrayList2);
        return nVar;
    }
}
