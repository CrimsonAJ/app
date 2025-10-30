package l2;

import O7.p;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import androidx.lifecycle.EnumC0555p;
import androidx.lifecycle.Y;
import com.anilab.android.ui.search.SearchFragment;

/* renamed from: l2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1544i extends G7.j implements p {

    /* renamed from: r, reason: collision with root package name */
    public int f20202r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SearchFragment f20203s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1544i(E7.d dVar, SearchFragment searchFragment) {
        super(2, dVar);
        this.f20203s = searchFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C1544i(dVar, this.f20203s);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1544i) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f20202r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            EnumC0555p enumC0555p = EnumC0555p.f9895c;
            SearchFragment searchFragment = this.f20203s;
            C1543h c1543h = new C1543h(null, searchFragment);
            this.f20202r = 1;
            if (Y.h(searchFragment, enumC0555p, c1543h, this) == aVar) {
                return aVar;
            }
        }
        return A7.n.f558a;
    }
}
