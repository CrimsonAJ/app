package o2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import androidx.lifecycle.EnumC0555p;
import androidx.lifecycle.Y;
import com.anilab.android.ui.settings.PlayerSettingsFragment;

/* renamed from: o2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1679f extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f21526r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PlayerSettingsFragment f21527s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1679f(PlayerSettingsFragment playerSettingsFragment, E7.d dVar) {
        super(2, dVar);
        this.f21527s = playerSettingsFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C1679f(this.f21527s, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1679f) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f21526r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            EnumC0555p enumC0555p = EnumC0555p.f9895c;
            PlayerSettingsFragment playerSettingsFragment = this.f21527s;
            C1678e c1678e = new C1678e(playerSettingsFragment, null);
            this.f21526r = 1;
            if (Y.h(playerSettingsFragment, enumC0555p, c1678e, this) == aVar) {
                return aVar;
            }
        }
        return A7.n.f558a;
    }
}
