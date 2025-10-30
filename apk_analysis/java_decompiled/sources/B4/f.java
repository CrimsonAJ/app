package B4;

import D4.InterfaceC0089h;
import F4.y;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import i0.AbstractActivityC1369y;
import i0.C1337N;

/* loaded from: classes.dex */
public final class f extends g {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f694c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final f f695d = new Object();

    public static AlertDialog d(Activity activity, int i9, F4.p pVar, DialogInterface.OnCancelListener onCancelListener) {
        String string;
        AlertDialog.Builder builder = null;
        if (i9 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        if ("Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(activity, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(F4.o.b(activity, i9));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    string = resources.getString(R.string.ok);
                } else {
                    string = resources.getString(co.notix.R.string.common_google_play_services_enable_button);
                }
            } else {
                string = resources.getString(co.notix.R.string.common_google_play_services_update_button);
            }
        } else {
            string = resources.getString(co.notix.R.string.common_google_play_services_install_button);
        }
        if (string != null) {
            builder.setPositiveButton(string, pVar);
        }
        String c3 = F4.o.c(activity, i9);
        if (c3 != null) {
            builder.setTitle(c3);
        }
        Log.w("GoogleApiAvailability", AbstractC0953k1.j(i9, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [B4.c, android.app.DialogFragment] */
    public static void e(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof AbstractActivityC1369y) {
                C1337N P8 = ((AbstractActivityC1369y) activity).P();
                j jVar = new j();
                y.i(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                jVar.f706L0 = alertDialog;
                if (onCancelListener != null) {
                    jVar.f707M0 = onCancelListener;
                }
                jVar.k0(P8, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        ?? dialogFragment = new DialogFragment();
        y.i(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        dialogFragment.f688a = alertDialog;
        if (onCancelListener != null) {
            dialogFragment.f689b = onCancelListener;
        }
        dialogFragment.show(fragmentManager, str);
    }

    public final void c(GoogleApiActivity googleApiActivity, int i9, GoogleApiActivity googleApiActivity2) {
        AlertDialog d9 = d(googleApiActivity, i9, new F4.p(super.a(i9, googleApiActivity, "d"), googleApiActivity, 0), googleApiActivity2);
        if (d9 == null) {
            return;
        }
        e(googleApiActivity, d9, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6, types: [D.k, D.n, java.lang.Object] */
    public final void f(Context context, int i9, PendingIntent pendingIntent) {
        String c3;
        String d9;
        int i10;
        NotificationChannel notificationChannel;
        CharSequence name;
        Log.w("GoogleApiAvailability", A0.a.m("GMS core API Availability. ConnectionResult=", i9, ", tag=null"), new IllegalArgumentException());
        if (i9 == 18) {
            new k(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i9 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        if (i9 == 6) {
            c3 = F4.o.e(context, "common_google_play_services_resolution_required_title");
        } else {
            c3 = F4.o.c(context, i9);
        }
        if (c3 == null) {
            c3 = context.getResources().getString(co.notix.R.string.common_google_play_services_notification_ticker);
        }
        if (i9 != 6 && i9 != 19) {
            d9 = F4.o.b(context, i9);
        } else {
            d9 = F4.o.d(context, "common_google_play_services_resolution_required_text", F4.o.a(context));
        }
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        y.h(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        D.m mVar = new D.m(context, null);
        mVar.f1697o = true;
        mVar.c(16, true);
        mVar.f1688e = D.m.b(c3);
        ?? obj = new Object();
        obj.f1683b = D.m.b(d9);
        mVar.e(obj);
        PackageManager packageManager = context.getPackageManager();
        if (K4.b.f4295c == null) {
            K4.b.f4295c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (K4.b.f4295c.booleanValue()) {
            mVar.f1705w.icon = context.getApplicationInfo().icon;
            mVar.f1693k = 2;
            if (K4.b.f(context)) {
                mVar.f1685b.add(new D.g(IconCompat.b(null, "", co.notix.R.drawable.common_full_open_on_phone), resources.getString(co.notix.R.string.common_open_on_phone), pendingIntent, new Bundle(), null, null, true, true));
            } else {
                mVar.f1690g = pendingIntent;
            }
        } else {
            mVar.f1705w.icon = R.drawable.stat_sys_warning;
            String string = resources.getString(co.notix.R.string.common_google_play_services_notification_ticker);
            mVar.f1705w.tickerText = D.m.b(string);
            mVar.f1705w.when = System.currentTimeMillis();
            mVar.f1690g = pendingIntent;
            mVar.f1689f = D.m.b(d9);
        }
        if (K4.b.d()) {
            if (K4.b.d()) {
                synchronized (f694c) {
                }
                notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String string2 = context.getResources().getString(co.notix.R.string.common_google_play_services_notification_channel_name);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(e.g(string2));
                } else {
                    name = notificationChannel.getName();
                    if (!string2.contentEquals(name)) {
                        notificationChannel.setName(string2);
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                }
                mVar.f1702t = "com.google.android.gms.availability";
            } else {
                throw new IllegalStateException();
            }
        }
        Notification a5 = mVar.a();
        if (i9 != 1 && i9 != 2 && i9 != 3) {
            i10 = 39789;
        } else {
            h.f698a.set(false);
            i10 = 10436;
        }
        notificationManager.notify(i10, a5);
    }

    public final void g(Activity activity, InterfaceC0089h interfaceC0089h, int i9, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog d9 = d(activity, i9, new F4.p(super.a(i9, activity, "d"), interfaceC0089h, 1), onCancelListener);
        if (d9 == null) {
            return;
        }
        e(activity, d9, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
