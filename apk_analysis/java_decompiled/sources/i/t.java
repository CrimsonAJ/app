package i;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import b5.G1;
import com.google.android.gms.internal.cast.C0816e1;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class t extends A5.q {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f18092c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w f18093d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f18094e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(w wVar, G1 g12) {
        super(wVar);
        this.f18093d = wVar;
        this.f18094e = g12;
    }

    @Override // A5.q
    public final IntentFilter f() {
        switch (this.f18092c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    /* JADX WARN: Type inference failed for: r3v13, types: [com.google.android.gms.internal.cast.e1, java.lang.Object] */
    @Override // A5.q
    public final int i() {
        Location location;
        boolean z9;
        long j;
        Location location2;
        switch (this.f18092c) {
            case 0:
                if (p.a((PowerManager) this.f18094e)) {
                    return 2;
                }
                return 1;
            default:
                G1 g12 = (G1) this.f18094e;
                E e8 = (E) g12.f10719d;
                if (e8.f17986b > System.currentTimeMillis()) {
                    z9 = e8.f17985a;
                } else {
                    Context context = (Context) g12.f10717b;
                    int b9 = E.d.b(context, "android.permission.ACCESS_COARSE_LOCATION");
                    Location location3 = null;
                    LocationManager locationManager = (LocationManager) g12.f10718c;
                    if (b9 == 0) {
                        try {
                        } catch (Exception e9) {
                            Log.d("TwilightManager", "Failed to get last known location", e9);
                        }
                        if (locationManager.isProviderEnabled("network")) {
                            location2 = locationManager.getLastKnownLocation("network");
                            location = location2;
                        }
                        location2 = null;
                        location = location2;
                    } else {
                        location = null;
                    }
                    if (E.d.b(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                location3 = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e10) {
                            Log.d("TwilightManager", "Failed to get last known location", e10);
                        }
                    }
                    if (location3 == null || location == null ? location3 != null : location3.getTime() > location.getTime()) {
                        location = location3;
                    }
                    z9 = false;
                    if (location != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (C0816e1.f14828d == null) {
                            C0816e1.f14828d = new Object();
                        }
                        C0816e1 c0816e1 = C0816e1.f14828d;
                        c0816e1.a(location.getLatitude(), location.getLongitude(), currentTimeMillis - 86400000);
                        c0816e1.a(location.getLatitude(), location.getLongitude(), currentTimeMillis);
                        if (c0816e1.f14831c == 1) {
                            z9 = true;
                        }
                        long j4 = c0816e1.f14830b;
                        long j9 = c0816e1.f14829a;
                        c0816e1.a(location.getLatitude(), location.getLongitude(), currentTimeMillis + 86400000);
                        long j10 = c0816e1.f14830b;
                        if (j4 != -1 && j9 != -1) {
                            if (currentTimeMillis <= j9) {
                                if (currentTimeMillis > j4) {
                                    j10 = j9;
                                } else {
                                    j10 = j4;
                                }
                            }
                            j = j10 + 60000;
                        } else {
                            j = currentTimeMillis + 43200000;
                        }
                        e8.f17985a = z9;
                        e8.f17986b = j;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i9 = Calendar.getInstance().get(11);
                        if (i9 < 6 || i9 >= 22) {
                            z9 = true;
                        }
                    }
                }
                if (!z9) {
                    return 1;
                }
                return 2;
        }
    }

    @Override // A5.q
    public final void p() {
        switch (this.f18092c) {
            case 0:
                this.f18093d.k(true, true);
                return;
            default:
                this.f18093d.k(true, true);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(w wVar, Context context) {
        super(wVar);
        this.f18093d = wVar;
        this.f18094e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
