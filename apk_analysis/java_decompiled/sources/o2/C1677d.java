package o2;

import J1.AbstractC0185k0;
import a.AbstractC0485a;
import com.anilab.android.ui.settings.PlayerSettingsFragment;

/* renamed from: o2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1677d extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ boolean f21522r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PlayerSettingsFragment f21523s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1677d(PlayerSettingsFragment playerSettingsFragment, E7.d dVar) {
        super(2, dVar);
        this.f21523s = playerSettingsFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        C1677d c1677d = new C1677d(this.f21523s, dVar);
        c1677d.f21522r = ((Boolean) obj).booleanValue();
        return c1677d;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        C1677d c1677d = (C1677d) create(bool, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        c1677d.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        ((AbstractC0185k0) this.f21523s.e0()).f3976w.setChecked(this.f21522r);
        return A7.n.f558a;
    }
}
