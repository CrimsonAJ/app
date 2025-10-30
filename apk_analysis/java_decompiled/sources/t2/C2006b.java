package t2;

import A7.n;
import B7.k;
import E7.d;
import G7.j;
import O7.p;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import java.net.InetAddress;
import java.util.ArrayList;

/* renamed from: t2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2006b extends j implements p {
    @Override // G7.a
    public final d create(Object obj, d dVar) {
        return new j(2, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C2006b) create((InterfaceC0484z) obj, (d) obj2)).invokeSuspend(n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        try {
            byte[] bArr = {49, 54, 57, 40, 40, 49, 118, 59, 55};
            ArrayList arrayList = new ArrayList(9);
            for (int i9 = 0; i9 < 9; i9++) {
                arrayList.add(new Character((char) (bArr[i9] ^ 88)));
            }
            return InetAddress.getByName(k.u0(arrayList, "", null, null, null, 62)).getHostAddress();
        } catch (Exception unused) {
            return null;
        }
    }
}
