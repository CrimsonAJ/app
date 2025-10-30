package com.google.android.gms.common.api;

import A0.a;
import B4.b;
import B4.f;
import D4.C0088g;
import F4.y;
import T4.d;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
/* loaded from: classes.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f14651b = 0;

    /* renamed from: a, reason: collision with root package name */
    public int f14652a = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i9, int i10, Intent intent) {
        super.onActivityResult(i9, i10, intent);
        if (i9 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f14652a = 0;
            setResult(i10, intent);
            if (booleanExtra) {
                C0088g g9 = C0088g.g(this);
                if (i10 != -1) {
                    if (i10 == 0) {
                        g9.h(new b(13, null), getIntent().getIntExtra("failing_client_id", -1));
                    }
                } else {
                    d dVar = g9.f1855n;
                    dVar.sendMessage(dVar.obtainMessage(3));
                }
            }
        } else if (i9 == 2) {
            this.f14652a = 0;
            setResult(i10, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f14652a = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        GoogleApiActivity googleApiActivity;
        super.onCreate(bundle);
        if (bundle != null) {
            this.f14652a = bundle.getInt("resolution");
        }
        if (this.f14652a != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                Log.e("GoogleApiActivity", "Activity started without extras");
                finish();
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
            Integer num = (Integer) extras.get("error_code");
            if (pendingIntent == null && num == null) {
                Log.e("GoogleApiActivity", "Activity started without resolution");
                finish();
                return;
            }
            if (pendingIntent != null) {
                try {
                    googleApiActivity = this;
                    try {
                        googleApiActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                        googleApiActivity.f14652a = 1;
                    } catch (ActivityNotFoundException e8) {
                        e = e8;
                        if (extras.getBoolean("notify_manager", true)) {
                            C0088g.g(this).h(new b(22, null), getIntent().getIntExtra("failing_client_id", -1));
                        } else {
                            String n7 = a.n("Activity not found while launching ", pendingIntent.toString(), ".");
                            if (Build.FINGERPRINT.contains("generic")) {
                                n7 = n7.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                            }
                            Log.e("GoogleApiActivity", n7, e);
                        }
                        googleApiActivity.f14652a = 1;
                        finish();
                    } catch (IntentSender.SendIntentException e9) {
                        e = e9;
                        Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e);
                        finish();
                    }
                } catch (ActivityNotFoundException e10) {
                    e = e10;
                    googleApiActivity = this;
                } catch (IntentSender.SendIntentException e11) {
                    e = e11;
                }
            } else {
                y.h(num);
                f.f695d.c(this, num.intValue(), this);
                this.f14652a = 1;
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f14652a);
        super.onSaveInstanceState(bundle);
    }
}
