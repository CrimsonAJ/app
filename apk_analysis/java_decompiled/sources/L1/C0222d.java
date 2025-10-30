package L1;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import android.net.Network;
import android.os.Build;
import com.anilab.android.ui.activity.MainActivity;

/* renamed from: L1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0222d extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MainActivity f4518r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Network f4519s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0222d(MainActivity mainActivity, Network network, E7.d dVar) {
        super(2, dVar);
        this.f4518r = mainActivity;
        this.f4519s = network;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C0222d(this.f4518r, this.f4519s, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        C0222d c0222d = (C0222d) create((InterfaceC0484z) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        c0222d.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        int v8;
        AbstractC0485a.A(obj);
        int i9 = Build.VERSION.SDK_INT;
        MainActivity mainActivity = this.f4518r;
        if (i9 >= 24) {
            int i10 = MainActivity.f13724k0;
            v8 = v4.e.w(mainActivity.U().getNetworkCapabilities(this.f4519s));
        } else {
            v8 = v4.e.v(mainActivity.getApplicationContext());
        }
        mainActivity.V().h(v8);
        return A7.n.f558a;
    }
}
