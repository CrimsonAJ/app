package M1;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import b8.AbstractC0714M;
import b8.C0708G;
import com.anilab.android.ui.activity.MainActivity;

/* renamed from: M1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0247c extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f4708r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MainActivity f4709s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0247c(E7.d dVar, MainActivity mainActivity) {
        super(2, dVar);
        this.f4709s = mainActivity;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C0247c(dVar, this.f4709s);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0247c) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f4708r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            MainActivity mainActivity = this.f4709s;
            C0708G c0708g = new C0708G(mainActivity.V().f4740d);
            C0246b c0246b = new C0246b(null, mainActivity);
            this.f4708r = 1;
            if (AbstractC0714M.i(c0708g, c0246b, this) == aVar) {
                return aVar;
            }
        }
        return A7.n.f558a;
    }
}
