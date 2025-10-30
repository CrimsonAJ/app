package R1;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import b8.AbstractC0714M;
import b8.C0709H;
import com.anilab.android.ui.download.DownloadFragment;

/* renamed from: R1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0385d extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f6523r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ DownloadFragment f6524s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0385d(E7.d dVar, DownloadFragment downloadFragment) {
        super(2, dVar);
        this.f6524s = downloadFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C0385d(dVar, this.f6524s);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0385d) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f6523r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            DownloadFragment downloadFragment = this.f6524s;
            C0709H c0709h = new C0709H(downloadFragment.t0().f6500l);
            C0384c c0384c = new C0384c(null, downloadFragment);
            this.f6523r = 1;
            if (AbstractC0714M.i(c0709h, c0384c, this) == aVar) {
                return aVar;
            }
        }
        return A7.n.f558a;
    }
}
