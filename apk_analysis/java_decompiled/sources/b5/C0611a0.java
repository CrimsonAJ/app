package b5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: b5.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0611a0 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final J1 f11016a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f11017b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f11018c;

    public C0611a0(J1 j12) {
        F4.y.h(j12);
        this.f11016a = j12;
    }

    public final void a() {
        J1 j12 = this.f11016a;
        j12.f();
        j12.K().l0();
        j12.K().l0();
        if (!this.f11017b) {
            return;
        }
        j12.A().f10978n.b("Unregistering connectivity change receiver");
        this.f11017b = false;
        this.f11018c = false;
        try {
            j12.f10755l.f11221a.unregisterReceiver(this);
        } catch (IllegalArgumentException e8) {
            j12.A().f10971f.c(e8, "Failed to unregister the network broadcast receiver");
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        J1 j12 = this.f11016a;
        j12.f();
        String action = intent.getAction();
        j12.A().f10978n.c(action, "NetworkBroadcastReceiver received action");
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            Z z9 = j12.f10743b;
            J1.J(z9);
            boolean K02 = z9.K0();
            if (this.f11018c != K02) {
                this.f11018c = K02;
                j12.K().v0(new A4.e(this, K02));
                return;
            }
            return;
        }
        j12.A().f10974i.c(action, "NetworkBroadcastReceiver received unknown action");
    }
}
