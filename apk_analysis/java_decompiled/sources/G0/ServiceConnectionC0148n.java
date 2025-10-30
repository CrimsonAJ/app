package G0;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import i7.a0;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: G0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ServiceConnectionC0148n implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2785a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2786b;

    public /* synthetic */ ServiceConnectionC0148n(int i9, Object obj) {
        this.f2785a = i9;
        this.f2786b = obj;
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [G0.e, java.lang.Object] */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName name, IBinder service) {
        InterfaceC0140f interfaceC0140f;
        Object obj = this.f2786b;
        switch (this.f2785a) {
            case 0:
                kotlin.jvm.internal.h.e(name, "name");
                kotlin.jvm.internal.h.e(service, "service");
                int i9 = BinderC0150p.f2797f;
                IInterface queryLocalInterface = service.queryLocalInterface(InterfaceC0140f.f2763b);
                if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC0140f)) {
                    interfaceC0140f = (InterfaceC0140f) queryLocalInterface;
                } else {
                    ?? obj2 = new Object();
                    obj2.f2762e = service;
                    interfaceC0140f = obj2;
                }
                C0149o c0149o = (C0149o) obj;
                c0149o.f2793g = interfaceC0140f;
                try {
                    c0149o.f2792f = interfaceC0140f.X(c0149o.j, c0149o.f2787a);
                    return;
                } catch (RemoteException e8) {
                    Log.w("ROOM", "Cannot register multi-instance invalidation callback", e8);
                    return;
                }
            default:
                StringBuilder sb = new StringBuilder("Connected to SessionLifecycleService. Queue size ");
                com.google.firebase.messaging.s sVar = (com.google.firebase.messaging.s) obj;
                sb.append(((LinkedBlockingDeque) sVar.f16506d).size());
                Log.d("SessionLifecycleClient", sb.toString());
                sVar.f16505c = new Messenger(service);
                ArrayList arrayList = new ArrayList();
                ((LinkedBlockingDeque) sVar.f16506d).drainTo(arrayList);
                Y7.B.r(Y7.B.a((E7.i) sVar.f16504b), null, new a0(sVar, arrayList, null), 3);
                return;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName name) {
        switch (this.f2785a) {
            case 0:
                kotlin.jvm.internal.h.e(name, "name");
                ((C0149o) this.f2786b).f2793g = null;
                return;
            default:
                Log.d("SessionLifecycleClient", "Disconnected from SessionLifecycleService");
                com.google.firebase.messaging.s sVar = (com.google.firebase.messaging.s) this.f2786b;
                sVar.f16505c = null;
                sVar.getClass();
                return;
        }
    }
}
