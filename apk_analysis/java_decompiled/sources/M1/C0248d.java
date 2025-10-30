package M1;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import androidx.lifecycle.EnumC0555p;
import androidx.lifecycle.Y;
import com.anilab.android.ui.activity.MainActivity;

/* renamed from: M1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0248d extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f4710r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MainActivity f4711s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0248d(E7.d dVar, MainActivity mainActivity) {
        super(2, dVar);
        this.f4711s = mainActivity;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C0248d(dVar, this.f4711s);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0248d) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f4710r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            EnumC0555p enumC0555p = EnumC0555p.f9895c;
            MainActivity mainActivity = this.f4711s;
            C0247c c0247c = new C0247c(null, mainActivity);
            this.f4710r = 1;
            if (Y.h(mainActivity, enumC0555p, c0247c, this) == aVar) {
                return aVar;
            }
        }
        return A7.n.f558a;
    }
}
