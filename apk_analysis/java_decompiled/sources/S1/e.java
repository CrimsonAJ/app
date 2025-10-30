package S1;

import A7.n;
import O7.p;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import b8.C0709H;
import b8.C0718Q;
import com.anilab.android.ui.editProfile.EditProfileFragment;

/* loaded from: classes.dex */
public final class e extends G7.j implements p {

    /* renamed from: r, reason: collision with root package name */
    public int f6713r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ EditProfileFragment f6714s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(EditProfileFragment editProfileFragment, E7.d dVar) {
        super(2, dVar);
        this.f6714s = editProfileFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new e(this.f6714s, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        ((e) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(n.f558a);
        return F7.a.f2587a;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f6713r;
        if (i9 != 0) {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0485a.A(obj);
            throw new RuntimeException();
        }
        AbstractC0485a.A(obj);
        EditProfileFragment editProfileFragment = this.f6714s;
        C0709H c0709h = editProfileFragment.h0().j;
        d dVar = new d(editProfileFragment, 0);
        this.f6713r = 1;
        ((C0718Q) c0709h.f11422a).collect(dVar, this);
        return aVar;
    }
}
