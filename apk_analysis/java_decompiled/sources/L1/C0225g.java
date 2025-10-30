package L1;

import a.AbstractC0485a;
import co.notix.R;
import com.anilab.android.ui.activity.MainActivity;

/* renamed from: L1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0225g extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f4523r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MainActivity f4524s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0225g(E7.d dVar, MainActivity mainActivity) {
        super(2, dVar);
        this.f4524s = mainActivity;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        C0225g c0225g = new C0225g(dVar, this.f4524s);
        c0225g.f4523r = obj;
        return c0225g;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        C0225g c0225g = (C0225g) create((M1.t) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        c0225g.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        Object a5 = ((M1.t) this.f4523r).a();
        if (a5 != null) {
            H h7 = (H) a5;
            boolean z9 = h7 instanceof G;
            MainActivity mainActivity = this.f4524s;
            try {
                if (z9) {
                    I1.o oVar = new I1.o(((G) h7).f4463a);
                    int i9 = MainActivity.f13724k0;
                    u0.H h9 = mainActivity.f13725A;
                    if (h9 != null) {
                        h9.l(oVar);
                    } else {
                        kotlin.jvm.internal.h.h("navController");
                        throw null;
                    }
                } else if (h7.equals(F.f4461a)) {
                    int i10 = MainActivity.f13724k0;
                    u0.H h10 = mainActivity.f13725A;
                    if (h10 != null) {
                        h10.j(R.id.showCommonError, null, null);
                    } else {
                        kotlin.jvm.internal.h.h("navController");
                        throw null;
                    }
                } else if (!h7.equals(F.f4462b)) {
                    throw new RuntimeException();
                }
            } catch (Exception unused) {
            }
        }
        return A7.n.f558a;
    }
}
