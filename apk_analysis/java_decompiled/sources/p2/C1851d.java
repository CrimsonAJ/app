package p2;

import A7.n;
import G7.j;
import O7.p;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import androidx.lifecycle.EnumC0555p;
import androidx.lifecycle.Y;
import com.anilab.android.ui.splash.SplashFragment;

/* renamed from: p2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1851d extends j implements p {

    /* renamed from: r, reason: collision with root package name */
    public int f22145r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SplashFragment f22146s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1851d(E7.d dVar, SplashFragment splashFragment) {
        super(2, dVar);
        this.f22146s = splashFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C1851d(dVar, this.f22146s);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1851d) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f22145r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            EnumC0555p enumC0555p = EnumC0555p.f9895c;
            SplashFragment splashFragment = this.f22146s;
            C1850c c1850c = new C1850c(null, splashFragment);
            this.f22145r = 1;
            if (Y.h(splashFragment, enumC0555p, c1850c, this) == aVar) {
                return aVar;
            }
        }
        return n.f558a;
    }
}
