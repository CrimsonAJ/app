package Q1;

import A7.n;
import E7.d;
import G7.j;
import O7.p;
import Y7.B;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import co.notix.R;
import com.anilab.android.ui.congratulation.CongratulationDialogFragment;
import com.google.android.gms.internal.measurement.AbstractC1002u1;

/* loaded from: classes.dex */
public final class a extends j implements p {

    /* renamed from: r, reason: collision with root package name */
    public int f6040r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ CongratulationDialogFragment f6041s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(CongratulationDialogFragment congratulationDialogFragment, d dVar) {
        super(2, dVar);
        this.f6041s = congratulationDialogFragment;
    }

    @Override // G7.a
    public final d create(Object obj, d dVar) {
        return new a(this.f6041s, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((InterfaceC0484z) obj, (d) obj2)).invokeSuspend(n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f6040r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            this.f6040r = 1;
            if (B.g(1000L, this) == aVar) {
                return aVar;
            }
        }
        AbstractC1002u1.A(this.f6041s).j(R.id.goToHost, null, null);
        return n.f558a;
    }
}
