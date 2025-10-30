package U1;

import O7.p;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import androidx.lifecycle.EnumC0555p;
import androidx.lifecycle.Y;
import com.anilab.android.ui.filter.FilterFragment;

/* loaded from: classes.dex */
public final class h extends G7.j implements p {

    /* renamed from: r, reason: collision with root package name */
    public int f7262r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ FilterFragment f7263s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(FilterFragment filterFragment, E7.d dVar) {
        super(2, dVar);
        this.f7263s = filterFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new h(this.f7263s, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f7262r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            EnumC0555p enumC0555p = EnumC0555p.f9895c;
            FilterFragment filterFragment = this.f7263s;
            g gVar = new g(filterFragment, null);
            this.f7262r = 1;
            if (Y.h(filterFragment, enumC0555p, gVar, this) == aVar) {
                return aVar;
            }
        }
        return A7.n.f558a;
    }
}
