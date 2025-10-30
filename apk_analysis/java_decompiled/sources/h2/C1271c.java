package h2;

import A7.n;
import G7.j;
import L1.S;
import O7.p;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import b8.AbstractC0714M;
import com.anilab.android.ui.profile.ProfileFragment;

/* renamed from: h2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1271c extends j implements p {

    /* renamed from: r, reason: collision with root package name */
    public int f17870r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ProfileFragment f17871s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1271c(E7.d dVar, ProfileFragment profileFragment) {
        super(2, dVar);
        this.f17871s = profileFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C1271c(dVar, this.f17871s);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1271c) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f17870r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            ProfileFragment profileFragment = this.f17871s;
            S s9 = (S) profileFragment.f13819E0.getValue();
            C1270b c1270b = new C1270b(null, profileFragment);
            this.f17870r = 1;
            if (AbstractC0714M.i(s9.f4505s, c1270b, this) == aVar) {
                return aVar;
            }
        }
        return n.f558a;
    }
}
