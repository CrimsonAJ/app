package L1;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import androidx.lifecycle.EnumC0555p;
import androidx.lifecycle.Y;
import com.anilab.android.ui.activity.MainActivity;

/* renamed from: L1.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0232n extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f4535r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MainActivity f4536s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0232n(E7.d dVar, MainActivity mainActivity) {
        super(2, dVar);
        this.f4536s = mainActivity;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C0232n(dVar, this.f4536s);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0232n) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f4535r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            EnumC0555p enumC0555p = EnumC0555p.f9895c;
            MainActivity mainActivity = this.f4536s;
            C0231m c0231m = new C0231m(null, mainActivity);
            this.f4535r = 1;
            if (Y.h(mainActivity, enumC0555p, c0231m, this) == aVar) {
                return aVar;
            }
        }
        return A7.n.f558a;
    }
}
