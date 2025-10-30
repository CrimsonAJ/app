package i7;

import a.AbstractC0485a;
import android.util.Log;
import b0.C0584b;
import b8.InterfaceC0726f;

/* loaded from: classes.dex */
public final class G extends G7.j implements O7.q {

    /* renamed from: r, reason: collision with root package name */
    public int f18751r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ InterfaceC0726f f18752s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Throwable f18753t;

    /* JADX WARN: Type inference failed for: r0v0, types: [i7.G, G7.j] */
    @Override // O7.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ?? jVar = new G7.j(3, (E7.d) obj3);
        jVar.f18752s = (InterfaceC0726f) obj;
        jVar.f18753t = (Throwable) obj2;
        return jVar.invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f18751r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            InterfaceC0726f interfaceC0726f = this.f18752s;
            Log.e("FirebaseSessionsRepo", "Error reading stored session data.", this.f18753t);
            C0584b c0584b = new C0584b(true);
            this.f18752s = null;
            this.f18751r = 1;
            if (interfaceC0726f.emit(c0584b, this) == aVar) {
                return aVar;
            }
        }
        return A7.n.f558a;
    }
}
