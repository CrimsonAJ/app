package co.notix;

import Y7.B;
import Y7.F;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import co.notix.push.NotixNotificationModifier;

/* loaded from: classes.dex */
public final class af extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public int f11841a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mg f11842b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NotixNotificationModifier f11843c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df f11844d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ we f11845e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af(mg mgVar, E7.d dVar, NotixNotificationModifier notixNotificationModifier, df dfVar, we weVar) {
        super(2, dVar);
        this.f11842b = mgVar;
        this.f11843c = notixNotificationModifier;
        this.f11844d = dfVar;
        this.f11845e = weVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new af(this.f11842b, dVar, this.f11843c, this.f11844d, this.f11845e);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((af) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f11841a;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC0485a.A(obj);
        F c3 = B.c(this.f11842b.f12783b, null, new ze(null, this.f11843c, this.f11844d, this.f11845e), 3);
        this.f11841a = 1;
        Object o9 = c3.o(this);
        if (o9 == aVar) {
            return aVar;
        }
        return o9;
    }
}
