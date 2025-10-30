package S1;

import A7.n;
import O7.p;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import androidx.lifecycle.EnumC0555p;
import androidx.lifecycle.Y;
import com.anilab.android.ui.editProfile.EditProfileFragment;

/* loaded from: classes.dex */
public final class h extends G7.j implements p {

    /* renamed from: r, reason: collision with root package name */
    public int f6719r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ EditProfileFragment f6720s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(EditProfileFragment editProfileFragment, E7.d dVar) {
        super(2, dVar);
        this.f6720s = editProfileFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new h(this.f6720s, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f6719r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            EnumC0555p enumC0555p = EnumC0555p.f9895c;
            EditProfileFragment editProfileFragment = this.f6720s;
            g gVar = new g(editProfileFragment, null);
            this.f6719r = 1;
            if (Y.h(editProfileFragment, enumC0555p, gVar, this) == aVar) {
                return aVar;
            }
        }
        return n.f558a;
    }
}
