package X;

import a.AbstractC0485a;
import java.util.List;

/* renamed from: X.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0404d extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f8056r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f8057s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ List f8058t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0404d(List list, E7.d dVar) {
        super(2, dVar);
        this.f8058t = list;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        C0404d c0404d = new C0404d(this.f8058t, dVar);
        c0404d.f8057s = obj;
        return c0404d;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0404d) create((C0411k) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f8056r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            C0411k c0411k = (C0411k) this.f8057s;
            this.f8056r = 1;
            if (s8.e.a(this.f8058t, c0411k, this) == aVar) {
                return aVar;
            }
        }
        return A7.n.f558a;
    }
}
