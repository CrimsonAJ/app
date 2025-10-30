package t0;

import android.media.MediaRouter2;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: t0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1976j extends AbstractC1984s {

    /* renamed from: a, reason: collision with root package name */
    public final String f23000a;

    /* renamed from: b, reason: collision with root package name */
    public final C1975i f23001b;

    public C1976j(String str, C1975i c1975i) {
        this.f23000a = str;
        this.f23001b = c1975i;
    }

    @Override // t0.AbstractC1984s
    public final void f(int i9) {
        C1975i c1975i;
        MediaRouter2.RoutingController routingController;
        boolean isReleased;
        Messenger messenger;
        String str = this.f23000a;
        if (str != null && (c1975i = this.f23001b) != null && (routingController = c1975i.f22991g) != null) {
            isReleased = routingController.isReleased();
            if (!isReleased && (messenger = c1975i.f22992h) != null) {
                int andIncrement = c1975i.f22995l.getAndIncrement();
                Message obtain = Message.obtain();
                obtain.what = 7;
                obtain.arg1 = andIncrement;
                Bundle bundle = new Bundle();
                bundle.putInt("volume", i9);
                bundle.putString("routeId", str);
                obtain.setData(bundle);
                obtain.replyTo = c1975i.f22993i;
                try {
                    messenger.send(obtain);
                } catch (DeadObjectException unused) {
                } catch (RemoteException e8) {
                    Log.e("MR2Provider", "Could not send control request to service.", e8);
                }
            }
        }
    }

    @Override // t0.AbstractC1984s
    public final void i(int i9) {
        C1975i c1975i;
        MediaRouter2.RoutingController routingController;
        boolean isReleased;
        Messenger messenger;
        String str = this.f23000a;
        if (str != null && (c1975i = this.f23001b) != null && (routingController = c1975i.f22991g) != null) {
            isReleased = routingController.isReleased();
            if (!isReleased && (messenger = c1975i.f22992h) != null) {
                int andIncrement = c1975i.f22995l.getAndIncrement();
                Message obtain = Message.obtain();
                obtain.what = 8;
                obtain.arg1 = andIncrement;
                Bundle bundle = new Bundle();
                bundle.putInt("volume", i9);
                bundle.putString("routeId", str);
                obtain.setData(bundle);
                obtain.replyTo = c1975i.f22993i;
                try {
                    messenger.send(obtain);
                } catch (DeadObjectException unused) {
                } catch (RemoteException e8) {
                    Log.e("MR2Provider", "Could not send control request to service.", e8);
                }
            }
        }
    }
}
