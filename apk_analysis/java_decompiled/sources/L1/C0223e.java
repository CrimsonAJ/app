package L1;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import android.net.Network;
import android.os.Build;
import com.anilab.android.ui.activity.MainActivity;

/* renamed from: L1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0223e extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MainActivity f4520r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Network f4521s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0223e(MainActivity mainActivity, Network network, E7.d dVar) {
        super(2, dVar);
        this.f4520r = mainActivity;
        this.f4521s = network;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C0223e(this.f4520r, this.f4521s, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        C0223e c0223e = (C0223e) create((InterfaceC0484z) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        c0223e.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        int v8;
        AbstractC0485a.A(obj);
        int i9 = Build.VERSION.SDK_INT;
        MainActivity mainActivity = this.f4520r;
        if (i9 >= 24) {
            int i10 = MainActivity.f13724k0;
            v8 = v4.e.w(mainActivity.U().getNetworkCapabilities(this.f4521s));
        } else {
            v8 = v4.e.v(mainActivity.getApplicationContext());
        }
        mainActivity.V().h(v8);
        return A7.n.f558a;
    }
}
