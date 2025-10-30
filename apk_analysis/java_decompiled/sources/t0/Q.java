package t0;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import i.HandlerC1317c;

/* loaded from: classes.dex */
public final class Q implements IBinder.DeathRecipient {

    /* renamed from: a, reason: collision with root package name */
    public final Messenger f22896a;

    /* renamed from: b, reason: collision with root package name */
    public final HandlerC1317c f22897b;

    /* renamed from: c, reason: collision with root package name */
    public final Messenger f22898c;

    /* renamed from: f, reason: collision with root package name */
    public int f22901f;

    /* renamed from: g, reason: collision with root package name */
    public int f22902g;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ W f22904i;

    /* renamed from: d, reason: collision with root package name */
    public int f22899d = 1;

    /* renamed from: e, reason: collision with root package name */
    public int f22900e = 1;

    /* renamed from: h, reason: collision with root package name */
    public final SparseArray f22903h = new SparseArray();

    public Q(W w7, Messenger messenger) {
        this.f22904i = w7;
        this.f22896a = messenger;
        HandlerC1317c handlerC1317c = new HandlerC1317c(this);
        this.f22897b = handlerC1317c;
        this.f22898c = new Messenger(handlerC1317c);
    }

    public final void a(int i9) {
        int i10 = this.f22899d;
        this.f22899d = i10 + 1;
        b(5, i10, i9, null, null);
    }

    public final boolean b(int i9, int i10, int i11, Bundle bundle, Bundle bundle2) {
        Message obtain = Message.obtain();
        obtain.what = i9;
        obtain.arg1 = i10;
        obtain.arg2 = i11;
        obtain.obj = bundle;
        obtain.setData(bundle2);
        obtain.replyTo = this.f22898c;
        try {
            this.f22896a.send(obtain);
            return true;
        } catch (DeadObjectException unused) {
            return false;
        } catch (RemoteException e8) {
            if (i9 != 2) {
                Log.e("MediaRouteProviderProxy", "Could not send message to service.", e8);
                return false;
            }
            return false;
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        W w7 = this.f22904i;
        w7.j.post(new P(this, 1));
    }

    public final void c(int i9, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i10);
        int i11 = this.f22899d;
        this.f22899d = i11 + 1;
        b(7, i11, i9, null, bundle);
    }

    public final void d(int i9, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i10);
        int i11 = this.f22899d;
        this.f22899d = i11 + 1;
        b(8, i11, i9, null, bundle);
    }
}
