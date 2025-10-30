package g2;

import J1.AbstractC0165c;
import a.AbstractC0485a;
import com.anilab.android.ui.player.PlayerActivity;
import com.anilab.android.ui.views.FreakLoading;

/* renamed from: g2.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1238o extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ boolean f17682r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PlayerActivity f17683s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1238o(E7.d dVar, PlayerActivity playerActivity) {
        super(2, dVar);
        this.f17683s = playerActivity;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        C1238o c1238o = new C1238o(dVar, this.f17683s);
        c1238o.f17682r = ((Boolean) obj).booleanValue();
        return c1238o;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        C1238o c1238o = (C1238o) create(bool, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        c1238o.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        int i9;
        AbstractC0485a.A(obj);
        boolean z9 = this.f17682r;
        AbstractC0165c abstractC0165c = this.f17683s.f13799D;
        if (abstractC0165c != null) {
            FreakLoading freakLoading = abstractC0165c.f3845E;
            kotlin.jvm.internal.h.d(freakLoading, "freakLoading");
            if (z9) {
                i9 = 0;
            } else {
                i9 = 8;
            }
            freakLoading.setVisibility(i9);
            return A7.n.f558a;
        }
        kotlin.jvm.internal.h.h("binding");
        throw null;
    }
}
