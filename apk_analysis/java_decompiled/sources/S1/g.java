package S1;

import A7.n;
import O7.p;
import Y7.B;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import com.anilab.android.ui.editProfile.EditProfileFragment;

/* loaded from: classes.dex */
public final class g extends G7.j implements p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f6717r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ EditProfileFragment f6718s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(EditProfileFragment editProfileFragment, E7.d dVar) {
        super(2, dVar);
        this.f6718s = editProfileFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        g gVar = new g(this.f6718s, dVar);
        gVar.f6717r = obj;
        return gVar;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        g gVar = (g) create((InterfaceC0484z) obj, (E7.d) obj2);
        n nVar = n.f558a;
        gVar.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        InterfaceC0484z interfaceC0484z = (InterfaceC0484z) this.f6717r;
        EditProfileFragment editProfileFragment = this.f6718s;
        B.r(interfaceC0484z, null, new e(editProfileFragment, null), 3);
        B.r(interfaceC0484z, null, new f(editProfileFragment, null), 3);
        return n.f558a;
    }
}
