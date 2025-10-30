package h2;

import A7.n;
import G7.j;
import O7.p;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import androidx.lifecycle.EnumC0555p;
import androidx.lifecycle.Y;
import com.anilab.android.ui.profile.ProfileFragment;

/* renamed from: h2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1272d extends j implements p {

    /* renamed from: r, reason: collision with root package name */
    public int f17872r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ProfileFragment f17873s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1272d(E7.d dVar, ProfileFragment profileFragment) {
        super(2, dVar);
        this.f17873s = profileFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C1272d(dVar, this.f17873s);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1272d) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f17872r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            EnumC0555p enumC0555p = EnumC0555p.f9895c;
            ProfileFragment profileFragment = this.f17873s;
            C1271c c1271c = new C1271c(null, profileFragment);
            this.f17872r = 1;
            if (Y.h(profileFragment, enumC0555p, c1271c, this) == aVar) {
                return aVar;
            }
        }
        return n.f558a;
    }
}
