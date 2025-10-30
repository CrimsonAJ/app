package F4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes.dex */
public final class D extends s {

    /* renamed from: g, reason: collision with root package name */
    public final IBinder f2334g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AbstractC0126e f2335h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(AbstractC0126e abstractC0126e, int i9, IBinder iBinder, Bundle bundle) {
        super(abstractC0126e, i9, bundle);
        this.f2335h = abstractC0126e;
        this.f2334g = iBinder;
    }

    @Override // F4.s
    public final void a(B4.b bVar) {
        AbstractC0126e abstractC0126e = this.f2335h;
        InterfaceC0124c interfaceC0124c = abstractC0126e.f2383q;
        if (interfaceC0124c != null) {
            interfaceC0124c.d(bVar);
        }
        abstractC0126e.y(bVar);
    }

    @Override // F4.s
    public final boolean b() {
        IBinder iBinder = this.f2334g;
        try {
            y.h(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            AbstractC0126e abstractC0126e = this.f2335h;
            if (!abstractC0126e.v().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + abstractC0126e.v() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface o9 = abstractC0126e.o(iBinder);
            if (o9 == null || (!AbstractC0126e.C(abstractC0126e, 2, 4, o9) && !AbstractC0126e.C(abstractC0126e, 3, 4, o9))) {
                return false;
            }
            abstractC0126e.f2387u = null;
            Bundle r5 = abstractC0126e.r();
            InterfaceC0123b interfaceC0123b = abstractC0126e.f2382p;
            if (interfaceC0123b != null) {
                interfaceC0123b.b(r5);
                return true;
            }
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
