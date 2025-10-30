package o2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import android.content.SharedPreferences;
import y2.C2203a;

/* renamed from: o2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1682i extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1683j f21529r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f21530s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1682i(C1683j c1683j, boolean z9, E7.d dVar) {
        super(2, dVar);
        this.f21529r = c1683j;
        this.f21530s = z9;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C1682i(this.f21529r, this.f21530s, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        C1682i c1682i = (C1682i) create((InterfaceC0484z) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        c1682i.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        C2203a c2203a = this.f21529r.f21531f.f4577a;
        kotlin.jvm.internal.h.e(c2203a, "<this>");
        String j02 = g6.o.f17761a.j0();
        boolean z9 = this.f21530s;
        SharedPreferences.Editor edit = c2203a.f24771a.edit();
        edit.putBoolean(j02, z9);
        edit.apply();
        return A7.n.f558a;
    }
}
