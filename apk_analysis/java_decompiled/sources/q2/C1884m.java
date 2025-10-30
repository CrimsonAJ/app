package q2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import androidx.lifecycle.EnumC0555p;
import androidx.lifecycle.Y;
import com.anilab.android.ui.update.UpdateFragment;

/* renamed from: q2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1884m extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f22261r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ UpdateFragment f22262s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1884m(E7.d dVar, UpdateFragment updateFragment) {
        super(2, dVar);
        this.f22262s = updateFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C1884m(dVar, this.f22262s);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1884m) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f22261r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            EnumC0555p enumC0555p = EnumC0555p.f9895c;
            UpdateFragment updateFragment = this.f22262s;
            C1883l c1883l = new C1883l(null, updateFragment);
            this.f22261r = 1;
            if (Y.h(updateFragment, enumC0555p, c1883l, this) == aVar) {
                return aVar;
            }
        }
        return A7.n.f558a;
    }
}
