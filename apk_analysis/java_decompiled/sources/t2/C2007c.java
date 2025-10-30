package t2;

import A7.i;
import A7.n;
import E7.d;
import G7.j;
import O7.p;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import java.net.InetSocketAddress;
import java.net.Socket;

/* renamed from: t2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2007c extends j implements p {
    @Override // G7.a
    public final d create(Object obj, d dVar) {
        return new j(2, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C2007c) create((InterfaceC0484z) obj, (d) obj2)).invokeSuspend(n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        Object h7;
        boolean z9;
        Object h9;
        AbstractC0485a.A(obj);
        try {
            Socket socket = new Socket();
            socket.connect(new InetSocketAddress("8.8.8.8", 53), 1000);
            socket.close();
            h7 = Boolean.TRUE;
        } catch (Throwable th) {
            h7 = AbstractC0485a.h(th);
        }
        Object obj2 = Boolean.FALSE;
        if (h7 instanceof i) {
            h7 = obj2;
        }
        if (!((Boolean) h7).booleanValue()) {
            try {
                Socket socket2 = new Socket();
                socket2.connect(new InetSocketAddress("1.1.1.1", 53), 1000);
                socket2.close();
                h9 = Boolean.TRUE;
            } catch (Throwable th2) {
                h9 = AbstractC0485a.h(th2);
            }
            Object obj3 = Boolean.FALSE;
            if (h9 instanceof i) {
                h9 = obj3;
            }
            z9 = ((Boolean) h9).booleanValue();
        } else {
            z9 = true;
        }
        return Boolean.valueOf(z9);
    }
}
