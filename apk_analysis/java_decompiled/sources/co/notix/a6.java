package co.notix;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import android.widget.ImageView;

/* loaded from: classes.dex */
public final class a6 extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j6 f11825a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6(j6 j6Var, E7.d dVar) {
        super(2, dVar);
        this.f11825a = j6Var;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new a6(this.f11825a, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((a6) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        j6 j6Var = this.f11825a;
        int i9 = j6.f12519v;
        Object value = j6Var.f12522k.getValue();
        kotlin.jvm.internal.h.d(value, "<get-image>(...)");
        ((ImageView) value).setImageBitmap(((i) this.f11825a.c()).f12418c);
        j6 j6Var2 = this.f11825a;
        j6.a(j6Var2, ((i) j6Var2.c()).f12418c);
        j6 j6Var3 = this.f11825a;
        q8.a(j6Var3, ((i) j6Var3.c()).f12418c, new b6(j6Var3));
        j6 j6Var4 = this.f11825a;
        j6Var4.a(((i) j6Var4.c()).f12423h);
        return A7.n.f558a;
    }
}
