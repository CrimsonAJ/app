package l4;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* loaded from: classes.dex */
public final class r extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

    /* renamed from: a, reason: collision with root package name */
    public final s f20536a;

    public r(s sVar) {
        this.f20536a = sVar;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType;
        boolean z9;
        overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        int i9 = 5;
        if (overrideNetworkType != 3 && overrideNetworkType != 4 && overrideNetworkType != 5) {
            z9 = false;
        } else {
            z9 = true;
        }
        s sVar = this.f20536a;
        if (z9) {
            i9 = 10;
        }
        s.b(sVar, i9);
    }
}
