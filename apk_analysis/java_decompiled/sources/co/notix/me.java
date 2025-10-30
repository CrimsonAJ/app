package co.notix;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;

/* loaded from: classes.dex */
public final class me extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ te f12780a;

    public me(te teVar) {
        this.f12780a = teVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Boolean bool;
        boolean a5;
        kotlin.jvm.internal.h.e(context, "context");
        kotlin.jvm.internal.h.e(intent, "intent");
        NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
        if (networkInfo != null) {
            bool = Boolean.valueOf(networkInfo.isConnectedOrConnecting());
        } else {
            bool = null;
        }
        te teVar = this.f12780a;
        if (kotlin.jvm.internal.h.a(bool, Boolean.TRUE)) {
            a5 = bool.booleanValue();
        } else {
            a5 = teVar.a();
        }
        teVar.a(a5);
    }
}
