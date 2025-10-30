package co.notix;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import android.content.Context;
import android.widget.Toast;

/* loaded from: classes.dex */
public final class hf extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f12380a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f12381b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hf(Context context, String str, E7.d dVar) {
        super(2, dVar);
        this.f12380a = context;
        this.f12381b = str;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new hf(this.f12380a, this.f12381b, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((hf) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        Toast.makeText(this.f12380a, this.f12381b, 1).show();
        return A7.n.f558a;
    }
}
