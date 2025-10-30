package i2;

import O7.p;
import Y7.B;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import com.anilab.android.ui.rating.BottomSheetRating;

/* renamed from: i2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1376d extends G7.j implements p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f18454r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ BottomSheetRating f18455s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1376d(BottomSheetRating bottomSheetRating, E7.d dVar) {
        super(2, dVar);
        this.f18455s = bottomSheetRating;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        C1376d c1376d = new C1376d(this.f18455s, dVar);
        c1376d.f18454r = obj;
        return c1376d;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        C1376d c1376d = (C1376d) create((InterfaceC0484z) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        c1376d.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        InterfaceC0484z interfaceC0484z = (InterfaceC0484z) this.f18454r;
        BottomSheetRating bottomSheetRating = this.f18455s;
        B.r(interfaceC0484z, null, new C1374b(bottomSheetRating, null), 3);
        B.r(interfaceC0484z, null, new C1375c(bottomSheetRating, null), 3);
        return A7.n.f558a;
    }
}
