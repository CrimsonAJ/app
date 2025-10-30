package q2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import b8.AbstractC0714M;
import b8.C0709H;
import com.anilab.android.ui.update.UpdateFragment;

/* renamed from: q2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1878g extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f22249r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ UpdateFragment f22250s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1878g(E7.d dVar, UpdateFragment updateFragment) {
        super(2, dVar);
        this.f22250s = updateFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C1878g(dVar, this.f22250s);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1878g) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f22249r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            UpdateFragment updateFragment = this.f22250s;
            C0709H c0709h = new C0709H(updateFragment.h0().f22280i);
            C1877f c1877f = new C1877f(null, updateFragment);
            this.f22249r = 1;
            if (AbstractC0714M.i(c0709h, c1877f, this) == aVar) {
                return aVar;
            }
        }
        return A7.n.f558a;
    }
}
