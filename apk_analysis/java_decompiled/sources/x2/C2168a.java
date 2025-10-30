package x2;

import A7.i;
import A7.n;
import E7.d;
import G7.j;
import O7.p;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import java.net.InetSocketAddress;
import java.net.Socket;

/* renamed from: x2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2168a extends j implements p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f24558r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f24559s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2168a(String str, d dVar) {
        super(2, dVar);
        this.f24559s = str;
    }

    @Override // G7.a
    public final d create(Object obj, d dVar) {
        C2168a c2168a = new C2168a(this.f24559s, dVar);
        c2168a.f24558r = obj;
        return c2168a;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C2168a) create((InterfaceC0484z) obj, (d) obj2)).invokeSuspend(n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        Object h7;
        AbstractC0485a.A(obj);
        String str = this.f24559s;
        try {
            Socket socket = new Socket();
            socket.connect(new InetSocketAddress(str, 443), 1500);
            socket.close();
            h7 = Boolean.TRUE;
        } catch (Throwable th) {
            h7 = AbstractC0485a.h(th);
        }
        Boolean bool = Boolean.FALSE;
        if (h7 instanceof i) {
            return bool;
        }
        return h7;
    }
}
