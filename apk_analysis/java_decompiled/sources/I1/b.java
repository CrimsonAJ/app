package I1;

import Y7.B;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import com.anilab.android.App;

/* loaded from: classes.dex */
public final class b extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f3277r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ App f3278s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f3279t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(App app, String str, E7.d dVar) {
        super(2, dVar);
        this.f3278s = app;
        this.f3279t = str;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new b(this.f3278s, this.f3279t, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f3277r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            int i10 = X7.a.f8474d;
            long A2 = Z0.a.A(15, X7.c.SECONDS);
            a aVar2 = new a(this.f3278s, this.f3279t, null);
            this.f3277r = 1;
            if (B.D(B.z(A2), aVar2, this) == aVar) {
                return aVar;
            }
        }
        return A7.n.f558a;
    }
}
