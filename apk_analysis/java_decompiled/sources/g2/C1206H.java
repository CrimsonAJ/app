package g2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import android.view.View;

/* renamed from: g2.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1206H extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f17572r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ View f17573s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1206H(View view, E7.d dVar) {
        super(2, dVar);
        this.f17573s = view;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C1206H(this.f17573s, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1206H) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f17572r;
        A7.n nVar = A7.n.f558a;
        View view = this.f17573s;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            view.setVisibility(0);
            int i10 = X7.a.f8474d;
            long A2 = Z0.a.A(1, X7.c.SECONDS);
            this.f17572r = 1;
            Object g9 = Y7.B.g(Y7.B.z(A2), this);
            if (g9 != aVar) {
                g9 = nVar;
            }
            if (g9 == aVar) {
                return aVar;
            }
        }
        view.setVisibility(8);
        return nVar;
    }
}
