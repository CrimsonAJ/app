package L1;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import android.content.SharedPreferences;
import y2.C2203a;

/* renamed from: L1.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0236s extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ L2.H f4545r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0236s(L2.H h7, E7.d dVar) {
        super(2, dVar);
        this.f4545r = h7;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C0236s(this.f4545r, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        C0236s c0236s = (C0236s) create((InterfaceC0484z) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        c0236s.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        L2.H h7 = this.f4545r;
        h7.getClass();
        g6.o oVar = g6.o.f17761a;
        String H02 = oVar.H0();
        C2203a c2203a = h7.f4587a;
        SharedPreferences.Editor edit = c2203a.f24771a.edit();
        edit.putBoolean(H02, false);
        edit.apply();
        String q02 = oVar.q0();
        SharedPreferences sharedPreferences = c2203a.f24771a;
        SharedPreferences.Editor edit2 = sharedPreferences.edit();
        edit2.putString(q02, "1.1.2");
        edit2.apply();
        String p02 = oVar.p0();
        SharedPreferences.Editor edit3 = sharedPreferences.edit();
        edit3.putInt(p02, 13);
        edit3.apply();
        return A7.n.f558a;
    }
}
