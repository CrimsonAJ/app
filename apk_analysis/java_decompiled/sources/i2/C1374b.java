package i2;

import O7.p;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import b8.C0718Q;
import com.anilab.android.ui.rating.BottomSheetRating;

/* renamed from: i2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1374b extends G7.j implements p {

    /* renamed from: r, reason: collision with root package name */
    public int f18450r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ BottomSheetRating f18451s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1374b(BottomSheetRating bottomSheetRating, E7.d dVar) {
        super(2, dVar);
        this.f18451s = bottomSheetRating;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C1374b(this.f18451s, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        ((C1374b) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
        return F7.a.f2587a;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f18450r;
        if (i9 != 0) {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0485a.A(obj);
            throw new RuntimeException();
        }
        AbstractC0485a.A(obj);
        BottomSheetRating bottomSheetRating = this.f18451s;
        C0718Q c0718q = bottomSheetRating.t0().f18484i;
        C1373a c1373a = new C1373a(bottomSheetRating, 0);
        this.f18450r = 1;
        c0718q.collect(c1373a, this);
        return aVar;
    }
}
