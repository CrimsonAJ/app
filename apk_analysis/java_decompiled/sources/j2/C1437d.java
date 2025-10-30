package j2;

import A7.n;
import O7.p;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import b8.AbstractC0714M;
import com.anilab.android.ui.register.RegisterFragment;

/* renamed from: j2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1437d extends G7.j implements p {

    /* renamed from: r, reason: collision with root package name */
    public int f19203r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ RegisterFragment f19204s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1437d(E7.d dVar, RegisterFragment registerFragment) {
        super(2, dVar);
        this.f19204s = registerFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C1437d(dVar, this.f19204s);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1437d) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f19203r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            RegisterFragment registerFragment = this.f19204s;
            j jVar = (j) registerFragment.f13823D0.getValue();
            C1436c c1436c = new C1436c(null, registerFragment);
            this.f19203r = 1;
            if (AbstractC0714M.i(jVar.j, c1436c, this) == aVar) {
                return aVar;
            }
        }
        return n.f558a;
    }
}
