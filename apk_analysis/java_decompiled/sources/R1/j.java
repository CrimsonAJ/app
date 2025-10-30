package R1;

import a.AbstractC0485a;
import com.anilab.android.ui.download.DownloadFragment;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class j extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f6534r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ DownloadFragment f6535s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(E7.d dVar, DownloadFragment downloadFragment) {
        super(2, dVar);
        this.f6535s = downloadFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        j jVar = new j(dVar, this.f6535s);
        jVar.f6534r = obj;
        return jVar;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        j jVar = (j) create((List) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        jVar.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        List list = (List) this.f6534r;
        C c3 = (C) this.f6535s.f13747U0.getValue();
        c3.getClass();
        kotlin.jvm.internal.h.e(list, "list");
        if (!list.isEmpty()) {
            ArrayList arrayList = c3.f6511i;
            arrayList.clear();
            arrayList.addAll(list);
            c3.o(arrayList);
        }
        return A7.n.f558a;
    }
}
