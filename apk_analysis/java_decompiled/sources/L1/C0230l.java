package L1;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import b8.AbstractC0714M;
import b8.C0709H;
import com.anilab.android.ui.activity.MainActivity;

/* renamed from: L1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0230l extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f4531r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MainActivity f4532s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0230l(E7.d dVar, MainActivity mainActivity) {
        super(2, dVar);
        this.f4532s = mainActivity;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C0230l(dVar, this.f4532s);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0230l) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f4531r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            MainActivity mainActivity = this.f4532s;
            C0709H c0709h = new C0709H(mainActivity.V().f4508v);
            C0229k c0229k = new C0229k(null, mainActivity);
            this.f4531r = 1;
            if (AbstractC0714M.i(c0709h, c0229k, this) == aVar) {
                return aVar;
            }
        }
        return A7.n.f558a;
    }
}
