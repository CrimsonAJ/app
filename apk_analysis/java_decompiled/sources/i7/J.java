package i7;

import X.InterfaceC0408h;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import android.util.Log;
import java.io.IOException;

/* loaded from: classes.dex */
public final class J extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f18759r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ K f18760s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f18761t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(K k5, String str, E7.d dVar) {
        super(2, dVar);
        this.f18760s = k5;
        this.f18761t = str;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new J(this.f18760s, this.f18761t, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((J) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f18759r;
        try {
            if (i9 != 0) {
                if (i9 == 1) {
                    AbstractC0485a.A(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC0485a.A(obj);
                InterfaceC0408h interfaceC0408h = this.f18760s.f18763b;
                I i10 = new I(this.f18761t, null);
                this.f18759r = 1;
                if (interfaceC0408h.a(new b0.i(i10, null), this) == aVar) {
                    return aVar;
                }
            }
        } catch (IOException e8) {
            Log.w("FirebaseSessionsRepo", "Failed to update session Id: " + e8);
        }
        return A7.n.f558a;
    }
}
