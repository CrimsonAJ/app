package i2;

import O7.p;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import androidx.lifecycle.EnumC0555p;
import androidx.lifecycle.Y;
import com.anilab.android.ui.rating.BottomSheetRating;

/* renamed from: i2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1377e extends G7.j implements p {

    /* renamed from: r, reason: collision with root package name */
    public int f18456r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ BottomSheetRating f18457s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1377e(BottomSheetRating bottomSheetRating, E7.d dVar) {
        super(2, dVar);
        this.f18457s = bottomSheetRating;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C1377e(this.f18457s, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1377e) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f18456r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            EnumC0555p enumC0555p = EnumC0555p.f9895c;
            BottomSheetRating bottomSheetRating = this.f18457s;
            C1376d c1376d = new C1376d(bottomSheetRating, null);
            this.f18456r = 1;
            if (Y.h(bottomSheetRating, enumC0555p, c1376d, this) == aVar) {
                return aVar;
            }
        }
        return A7.n.f558a;
    }
}
