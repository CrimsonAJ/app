package R1;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import com.anilab.android.ui.download.DownloadFragment;

/* loaded from: classes.dex */
public final class p extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f6546r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ DownloadFragment f6547s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ CharSequence f6548t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(DownloadFragment downloadFragment, CharSequence charSequence, E7.d dVar) {
        super(2, dVar);
        this.f6547s = downloadFragment;
        this.f6548t = charSequence;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new p(this.f6547s, this.f6548t, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f6546r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            this.f6546r = 1;
            if (Y7.B.g(200L, this) == aVar) {
                return aVar;
            }
        }
        C c3 = (C) this.f6547s.f13747U0.getValue();
        c3.getClass();
        new B(c3, 0).filter(this.f6548t);
        return A7.n.f558a;
    }
}
