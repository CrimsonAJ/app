package A4;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import l1.C1535g;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f364a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f365b;

    public /* synthetic */ m(int i9, Object obj) {
        this.f364a = i9;
        this.f365b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [A4.p, java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r5v4, types: [A4.p, java.lang.Exception] */
    private final boolean a(Message message) {
        int i9 = message.arg1;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Received response to request: " + i9);
        }
        n nVar = (n) this.f365b;
        synchronized (nVar) {
            try {
                o oVar = (o) nVar.f370e.get(i9);
                if (oVar == 0) {
                    Log.w("MessengerIpcClient", "Received response for unknown request: " + i9);
                    return true;
                }
                nVar.f370e.remove(i9);
                nVar.c();
                Bundle data = message.getData();
                if (data.getBoolean("unsupported", false)) {
                    oVar.b(new Exception("Not supported by GmsCore", null));
                    return true;
                }
                switch (oVar.f376e) {
                    case 0:
                        if (data.getBoolean("ack", false)) {
                            oVar.c(null);
                            return true;
                        }
                        oVar.b(new Exception("Invalid response to one way request", null));
                        return true;
                    default:
                        Bundle bundle = data.getBundle("data");
                        if (bundle == null) {
                            bundle = Bundle.EMPTY;
                        }
                        oVar.c(bundle);
                        return true;
                }
            } finally {
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f364a) {
            case 0:
                return a(message);
            default:
                if (message.what != 0) {
                    return false;
                }
                C1535g c1535g = (C1535g) this.f365b;
                I5.m mVar = (I5.m) message.obj;
                synchronized (c1535g.f20182a) {
                    if (((I5.m) c1535g.f20184c) == mVar || ((I5.m) c1535g.f20185d) == mVar) {
                        c1535g.h(mVar, 2);
                    }
                }
                return true;
        }
    }
}
