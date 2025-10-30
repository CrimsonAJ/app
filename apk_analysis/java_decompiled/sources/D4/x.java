package D4;

import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import b5.J0;
import com.google.firebase.messaging.FirebaseMessaging;

/* loaded from: classes.dex */
public final class x extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1902a = 1;

    /* renamed from: b, reason: collision with root package name */
    public Context f1903b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1904c;

    public /* synthetic */ x() {
    }

    public void a() {
        if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        J0 j02 = (J0) this.f1904c;
        if (j02 != null) {
            Context context = ((FirebaseMessaging) j02.f10734d).f16444b;
            this.f1903b = context;
            context.registerReceiver(this, intentFilter);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str;
        switch (this.f1902a) {
            case 0:
                Uri data = intent.getData();
                if (data != null) {
                    str = data.getSchemeSpecificPart();
                } else {
                    str = null;
                }
                if ("com.google.android.gms".equals(str)) {
                    A1.g gVar = (A1.g) this.f1904c;
                    p pVar = (p) ((S5.o) gVar.f19c).f6965c;
                    pVar.f1870c.set(null);
                    T4.d dVar = pVar.f1874g.f1855n;
                    dVar.sendMessage(dVar.obtainMessage(3));
                    AlertDialog alertDialog = (AlertDialog) gVar.f18b;
                    if (alertDialog.isShowing()) {
                        alertDialog.dismiss();
                    }
                    synchronized (this) {
                        try {
                            Context context2 = this.f1903b;
                            if (context2 != null) {
                                context2.unregisterReceiver(this);
                            }
                            this.f1903b = null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                }
                return;
            default:
                J0 j02 = (J0) this.f1904c;
                if (j02 != null && j02.a()) {
                    if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    J0 j03 = (J0) this.f1904c;
                    ((FirebaseMessaging) j03.f10734d).getClass();
                    FirebaseMessaging.b(j03, 0L);
                    Context context3 = this.f1903b;
                    if (context3 != null) {
                        context3.unregisterReceiver(this);
                    }
                    this.f1904c = null;
                    return;
                }
                return;
        }
    }

    public x(A1.g gVar) {
        this.f1904c = gVar;
    }
}
