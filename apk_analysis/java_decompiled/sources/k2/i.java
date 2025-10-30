package k2;

import A7.n;
import O7.p;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import androidx.lifecycle.EnumC0555p;
import androidx.lifecycle.Y;
import com.anilab.android.ui.releaseCalendar.ReleaseCalendarFragment;

/* loaded from: classes.dex */
public final class i extends G7.j implements p {

    /* renamed from: r, reason: collision with root package name */
    public int f19898r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ReleaseCalendarFragment f19899s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ReleaseCalendarFragment releaseCalendarFragment, E7.d dVar) {
        super(2, dVar);
        this.f19899s = releaseCalendarFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new i(this.f19899s, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f19898r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            EnumC0555p enumC0555p = EnumC0555p.f9895c;
            ReleaseCalendarFragment releaseCalendarFragment = this.f19899s;
            h hVar = new h(releaseCalendarFragment, null);
            this.f19898r = 1;
            if (Y.h(releaseCalendarFragment, enumC0555p, hVar, this) == aVar) {
                return aVar;
            }
        }
        return n.f558a;
    }
}
