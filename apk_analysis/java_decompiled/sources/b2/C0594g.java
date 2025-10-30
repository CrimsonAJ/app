package b2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import androidx.lifecycle.EnumC0555p;
import androidx.lifecycle.Y;
import com.anilab.android.ui.main.HostFragment;

/* renamed from: b2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0594g extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f10487r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ HostFragment f10488s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0594g(E7.d dVar, HostFragment hostFragment) {
        super(2, dVar);
        this.f10488s = hostFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C0594g(dVar, this.f10488s);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0594g) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f10487r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            EnumC0555p enumC0555p = EnumC0555p.f9896d;
            HostFragment hostFragment = this.f10488s;
            C0593f c0593f = new C0593f(null, hostFragment);
            this.f10487r = 1;
            if (Y.h(hostFragment, enumC0555p, c0593f, this) == aVar) {
                return aVar;
            }
        }
        return A7.n.f558a;
    }
}
