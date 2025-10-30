package a2;

import A7.n;
import O7.p;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import androidx.lifecycle.EnumC0555p;
import androidx.lifecycle.Y;
import com.anilab.android.ui.logout.BottomSheetConfirmLogout;

/* loaded from: classes.dex */
public final class g extends G7.j implements p {

    /* renamed from: r, reason: collision with root package name */
    public int f9093r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ BottomSheetConfirmLogout f9094s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(BottomSheetConfirmLogout bottomSheetConfirmLogout, E7.d dVar) {
        super(2, dVar);
        this.f9094s = bottomSheetConfirmLogout;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new g(this.f9094s, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f9093r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            EnumC0555p enumC0555p = EnumC0555p.f9895c;
            BottomSheetConfirmLogout bottomSheetConfirmLogout = this.f9094s;
            f fVar = new f(bottomSheetConfirmLogout, null);
            this.f9093r = 1;
            if (Y.h(bottomSheetConfirmLogout, enumC0555p, fVar, this) == aVar) {
                return aVar;
            }
        }
        return n.f558a;
    }
}
