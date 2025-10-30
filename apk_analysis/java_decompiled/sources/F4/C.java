package F4;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class C implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final int f2332a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC0126e f2333b;

    public C(AbstractC0126e abstractC0126e, int i9) {
        this.f2333b = abstractC0126e;
        this.f2332a = i9;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        u uVar;
        AbstractC0126e abstractC0126e = this.f2333b;
        if (iBinder == null) {
            AbstractC0126e.B(abstractC0126e);
            return;
        }
        synchronized (abstractC0126e.f2376i) {
            try {
                AbstractC0126e abstractC0126e2 = this.f2333b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                if (queryLocalInterface != null && (queryLocalInterface instanceof u)) {
                    uVar = (u) queryLocalInterface;
                } else {
                    uVar = new u(iBinder);
                }
                abstractC0126e2.j = uVar;
            } catch (Throwable th) {
                throw th;
            }
        }
        AbstractC0126e abstractC0126e3 = this.f2333b;
        int i9 = this.f2332a;
        abstractC0126e3.getClass();
        E e8 = new E(abstractC0126e3, 0, null);
        A a5 = abstractC0126e3.f2374g;
        a5.sendMessage(a5.obtainMessage(7, i9, -1, e8));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC0126e abstractC0126e;
        synchronized (this.f2333b.f2376i) {
            abstractC0126e = this.f2333b;
            abstractC0126e.j = null;
        }
        int i9 = this.f2332a;
        A a5 = abstractC0126e.f2374g;
        a5.sendMessage(a5.obtainMessage(6, i9, 1));
    }
}
