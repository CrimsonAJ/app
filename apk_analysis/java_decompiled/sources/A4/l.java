package A4;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f362a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f363b;

    public /* synthetic */ l(n nVar, int i9) {
        this.f362a = i9;
        this.f363b = nVar;
    }

    private final void a() {
        n nVar = this.f363b;
        synchronized (nVar) {
            if (nVar.f366a == 1) {
                nVar.a("Timed out while binding");
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f362a) {
            case 0:
                break;
            case 1:
                a();
                return;
            default:
                this.f363b.a("Service disconnected");
                return;
        }
        while (true) {
            n nVar = this.f363b;
            synchronized (nVar) {
                try {
                    if (nVar.f366a == 2) {
                        if (nVar.f369d.isEmpty()) {
                            nVar.c();
                            return;
                        }
                        o oVar = (o) nVar.f369d.poll();
                        nVar.f370e.put(oVar.f372a, oVar);
                        ((ScheduledExecutorService) nVar.f371f.f380c).schedule(new S5.o(nVar, 2, oVar), 30L, TimeUnit.SECONDS);
                        if (Log.isLoggable("MessengerIpcClient", 3)) {
                            Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(oVar)));
                        }
                        q qVar = nVar.f371f;
                        Messenger messenger = nVar.f367b;
                        int i9 = oVar.f374c;
                        Context context = (Context) qVar.f379b;
                        Message obtain = Message.obtain();
                        obtain.what = i9;
                        obtain.arg1 = oVar.f372a;
                        obtain.replyTo = messenger;
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("oneWay", oVar.a());
                        bundle.putString("pkg", context.getPackageName());
                        bundle.putBundle("data", oVar.f375d);
                        obtain.setData(bundle);
                        try {
                            A1.g gVar = nVar.f368c;
                            Messenger messenger2 = (Messenger) gVar.f18b;
                            if (messenger2 != null) {
                                messenger2.send(obtain);
                            } else {
                                h hVar = (h) gVar.f19c;
                                if (hVar != null) {
                                    Messenger messenger3 = hVar.f349a;
                                    messenger3.getClass();
                                    messenger3.send(obtain);
                                } else {
                                    throw new IllegalStateException("Both messengers are null");
                                }
                            }
                        } catch (RemoteException e8) {
                            nVar.a(e8.getMessage());
                        }
                    } else {
                        return;
                    }
                } finally {
                }
            }
        }
    }
}
