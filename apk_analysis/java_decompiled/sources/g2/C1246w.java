package g2;

import J1.AbstractC0165c;
import a.AbstractC0485a;
import android.widget.ArrayAdapter;
import com.anilab.android.ui.player.PlayerActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: g2.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1246w extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f17698r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PlayerActivity f17699s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1246w(E7.d dVar, PlayerActivity playerActivity) {
        super(2, dVar);
        this.f17699s = playerActivity;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        C1246w c1246w = new C1246w(dVar, this.f17699s);
        c1246w.f17698r = obj;
        return c1246w;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        C1246w c1246w = (C1246w) create((M1.t) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        c1246w.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        Object a5 = ((M1.t) this.f17698r).a();
        if (a5 != null && ((Boolean) a5).booleanValue()) {
            int i9 = PlayerActivity.f13798w0;
            PlayerActivity playerActivity = this.f17699s;
            List list = playerActivity.d0().f17638o.f3471f;
            ArrayList h7 = playerActivity.d0().h();
            boolean isEmpty = h7.isEmpty();
            A7.l lVar = playerActivity.f13810n0;
            if (!isEmpty) {
                AbstractC0165c abstractC0165c = playerActivity.f13799D;
                if (abstractC0165c != null) {
                    int selectedItemPosition = abstractC0165c.f3859T.getSelectedItemPosition();
                    int i10 = 0;
                    if (selectedItemPosition < 0 || selectedItemPosition > B7.l.a0(h7)) {
                        selectedItemPosition = 0;
                    }
                    playerActivity.a0().q(list, (List) h7.get(selectedItemPosition));
                    ((ArrayAdapter) lVar.getValue()).clear();
                    int size = h7.size();
                    while (i10 < size) {
                        Object obj2 = h7.get(i10);
                        i10++;
                        List list2 = (List) obj2;
                        if (!list2.isEmpty()) {
                            ((ArrayAdapter) lVar.getValue()).add("EPS: " + ((I2.a) B7.k.p0(list2)).f3445b + "-" + ((I2.a) B7.k.v0(list2)).f3445b);
                        }
                    }
                } else {
                    kotlin.jvm.internal.h.h("binding");
                    throw null;
                }
            } else {
                ((ArrayAdapter) lVar.getValue()).clear();
                C1225b a02 = playerActivity.a0();
                B7.t tVar = B7.t.f1135a;
                a02.q(tVar, tVar);
            }
            ((C1225b) playerActivity.f13809m0.getValue()).o(playerActivity.d0().f17638o.f3471f);
        }
        return A7.n.f558a;
    }
}
