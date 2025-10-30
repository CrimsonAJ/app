package L1;

import a.AbstractC0485a;
import co.notix.interstitial.InterstitialLoader;
import com.anilab.android.App;
import com.anilab.android.ui.activity.MainActivity;
import u6.C2083b;

/* renamed from: L1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0229k extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f4529r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MainActivity f4530s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0229k(E7.d dVar, MainActivity mainActivity) {
        super(2, dVar);
        this.f4530s = mainActivity;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        C0229k c0229k = new C0229k(dVar, this.f4530s);
        c0229k.f4529r = obj;
        return c0229k;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        C0229k c0229k = (C0229k) create((M1.t) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        c0229k.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        Object a5 = ((M1.t) this.f4529r).a();
        if (a5 != null && ((Boolean) a5).booleanValue()) {
            try {
                InterstitialLoader interstitialLoader = App.f13715h;
                if (interstitialLoader != null) {
                    interstitialLoader.doOnNextAvailable(new C0228j(this.f4530s), 10000L);
                } else {
                    kotlin.jvm.internal.h.h("interstitialLoader");
                    throw null;
                }
            } catch (Exception e8) {
                C2083b.a().b(e8);
            }
        }
        return A7.n.f558a;
    }
}
