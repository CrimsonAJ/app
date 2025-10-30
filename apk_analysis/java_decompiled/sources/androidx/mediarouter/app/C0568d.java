package androidx.mediarouter.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import b5.C0647m0;
import b5.C0650n0;
import b5.V;
import co.notix.R;
import com.google.android.gms.internal.measurement.K3;
import j3.z0;
import java.util.concurrent.Executor;
import l1.AbstractC1531c;
import l1.C1533e;
import t0.X;

/* renamed from: androidx.mediarouter.app.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0568d extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10071a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f10072b;

    public /* synthetic */ C0568d(int i9, Object obj) {
        this.f10071a = i9;
        this.f10072b = obj;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        char c3;
        int i9;
        int i10;
        l4.s sVar;
        Executor mainExecutor;
        switch (this.f10071a) {
            case 0:
                if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                    ((DialogC0569e) this.f10072b).dismiss();
                    return;
                }
                return;
            case 1:
                C0650n0 c0650n0 = (C0650n0) this.f10072b;
                if (intent == null) {
                    V v8 = c0650n0.f11229i;
                    C0650n0.f(v8);
                    v8.f10974i.b("App receiver called with null intent");
                    return;
                }
                String action = intent.getAction();
                if (action == null) {
                    V v9 = c0650n0.f11229i;
                    C0650n0.f(v9);
                    v9.f10974i.b("App receiver called with null action");
                    return;
                }
                int hashCode = action.hashCode();
                if (hashCode != -1928239649) {
                    if (hashCode == 1279883384 && action.equals("com.google.android.gms.measurement.BATCHES_AVAILABLE")) {
                        c3 = 1;
                    }
                    c3 = 65535;
                } else {
                    if (action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
                        c3 = 0;
                    }
                    c3 = 65535;
                }
                if (c3 != 0) {
                    if (c3 != 1) {
                        V v10 = c0650n0.f11229i;
                        C0650n0.f(v10);
                        v10.f10974i.b("App receiver called with unknown action");
                        return;
                    } else {
                        if (c0650n0.f11227g.y0(null, b5.E.f10621S0)) {
                            V v11 = c0650n0.f11229i;
                            C0650n0.f(v11);
                            v11.f10978n.b("[sgtm] App Receiver notified batches are available");
                            C0647m0 c0647m0 = c0650n0.j;
                            C0650n0.f(c0647m0);
                            c0647m0.v0(new A4.e(17, this));
                            return;
                        }
                        return;
                    }
                }
                K3.b();
                if (c0650n0.f11227g.y0(null, b5.E.f10631X0)) {
                    V v12 = c0650n0.f11229i;
                    C0650n0.f(v12);
                    v12.f10978n.b("App receiver notified triggers are available");
                    C0647m0 c0647m02 = c0650n0.j;
                    C0650n0.f(c0647m02);
                    c0647m02.v0(new A4.e(16, c0650n0));
                    return;
                }
                return;
            case 2:
                ((A5.q) this.f10072b).p();
                return;
            case 3:
                z0 z0Var = (z0) this.f10072b;
                z0Var.f19771b.post(new A6.s(24, z0Var));
                return;
            case 4:
                if (intent != null) {
                    ((AbstractC1531c) this.f10072b).g(intent);
                    return;
                }
                return;
            case 5:
                if (intent != null && intent.getAction() != null && intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                    e1.q.d().a(C1533e.j, "Network broadcast received", new Throwable[0]);
                    C1533e c1533e = (C1533e) this.f10072b;
                    c1533e.c(c1533e.f());
                    return;
                }
                return;
            case 6:
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null) {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        i9 = 1;
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            int type = activeNetworkInfo.getType();
                            if (type != 0) {
                                if (type != 1) {
                                    if (type != 4 && type != 5) {
                                        if (type != 6) {
                                            i9 = type != 9 ? 8 : 7;
                                        }
                                        i9 = 5;
                                    }
                                }
                                i9 = 2;
                            }
                            switch (activeNetworkInfo.getSubtype()) {
                                case 1:
                                case 2:
                                    i9 = 3;
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case R.styleable.GradientColor_android_endX /* 10 */:
                                case R.styleable.GradientColor_android_endY /* 11 */:
                                case 12:
                                case 14:
                                case 15:
                                case 17:
                                    i9 = 4;
                                    break;
                                case 13:
                                    i9 = 5;
                                    break;
                                case 16:
                                case 19:
                                default:
                                    i9 = 6;
                                    break;
                                case 18:
                                    i9 = 2;
                                    break;
                                case 20:
                                    if (l4.y.f20553a >= 29) {
                                        i9 = 9;
                                        break;
                                    }
                                    break;
                            }
                        }
                    } catch (SecurityException unused) {
                    }
                    i10 = l4.y.f20553a;
                    sVar = (l4.s) this.f10072b;
                    if (i10 < 31 && i9 == 5) {
                        try {
                            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                            telephonyManager.getClass();
                            l4.r rVar = new l4.r(sVar);
                            mainExecutor = context.getMainExecutor();
                            telephonyManager.registerTelephonyCallback(mainExecutor, rVar);
                            telephonyManager.unregisterTelephonyCallback(rVar);
                            return;
                        } catch (RuntimeException unused2) {
                            l4.s.b(sVar, 5);
                            return;
                        }
                    }
                    l4.s.b(sVar, i9);
                    return;
                }
                i9 = 0;
                i10 = l4.y.f20553a;
                sVar = (l4.s) this.f10072b;
                if (i10 < 31) {
                }
                l4.s.b(sVar, i9);
                return;
            default:
                ((X) this.f10072b).a();
                return;
        }
    }

    public C0568d(C0650n0 c0650n0) {
        this.f10071a = 1;
        this.f10072b = c0650n0;
    }
}
