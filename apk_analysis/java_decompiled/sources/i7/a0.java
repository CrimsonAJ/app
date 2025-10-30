package i7;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class a0 extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f18825r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.google.firebase.messaging.s f18826s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ArrayList f18827t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.google.firebase.messaging.s sVar, ArrayList arrayList, E7.d dVar) {
        super(2, dVar);
        this.f18826s = sVar;
        this.f18827t = arrayList;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new a0(this.f18826s, this.f18827t, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((a0) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Comparator] */
    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f18825r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            j7.c cVar = j7.c.f19792a;
            this.f18825r = 1;
            obj = cVar.b(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        Map map = (Map) obj;
        if (map.isEmpty()) {
            Log.d("SessionLifecycleClient", "Sessions SDK did not have any dependent SDKs register as dependencies. Events will not be sent.");
        } else {
            Collection values = map.values();
            if (values == null || !values.isEmpty()) {
                Iterator it = values.iterator();
                while (it.hasNext()) {
                    if (((y6.i) it.next()).f25051a.b()) {
                        ArrayList arrayList = this.f18827t;
                        com.google.firebase.messaging.s sVar = this.f18826s;
                        for (Message message : B7.k.C0(B7.k.n0(B7.l.c0(com.google.firebase.messaging.s.a(sVar, arrayList, 2), com.google.firebase.messaging.s.a(sVar, arrayList, 1))), new Object())) {
                            if (((Messenger) sVar.f16505c) != null) {
                                try {
                                    Log.d("SessionLifecycleClient", "Sending lifecycle " + message.what + " to service");
                                    Messenger messenger = (Messenger) sVar.f16505c;
                                    if (messenger != null) {
                                        messenger.send(message);
                                    }
                                } catch (RemoteException e8) {
                                    Log.w("SessionLifecycleClient", "Unable to deliver message: " + message.what, e8);
                                    sVar.q(message);
                                }
                            } else {
                                sVar.q(message);
                            }
                        }
                    }
                }
            }
            Log.d("SessionLifecycleClient", "Data Collection is disabled for all subscribers. Skipping this Event");
        }
        return A7.n.f558a;
    }
}
