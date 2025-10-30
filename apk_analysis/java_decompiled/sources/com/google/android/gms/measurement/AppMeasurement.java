package com.google.android.gms.measurement;

import F4.y;
import Z4.a;
import Z4.b;
import Z4.c;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import b5.C0650n0;
import b5.D0;
import b5.T0;
import com.google.android.gms.internal.measurement.U;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Deprecated
/* loaded from: classes.dex */
public class AppMeasurement {

    /* renamed from: b, reason: collision with root package name */
    public static volatile AppMeasurement f15714b;

    /* renamed from: a, reason: collision with root package name */
    public final c f15715a;

    /* loaded from: classes.dex */
    public static class ConditionalUserProperty {

        @Keep
        public boolean mActive;

        @Keep
        public String mAppId;

        @Keep
        public long mCreationTimestamp;

        @Keep
        public String mExpiredEventName;

        @Keep
        public Bundle mExpiredEventParams;

        @Keep
        public String mName;

        @Keep
        public String mOrigin;

        @Keep
        public long mTimeToLive;

        @Keep
        public String mTimedOutEventName;

        @Keep
        public Bundle mTimedOutEventParams;

        @Keep
        public String mTriggerEventName;

        @Keep
        public long mTriggerTimeout;

        @Keep
        public String mTriggeredEventName;

        @Keep
        public Bundle mTriggeredEventParams;

        @Keep
        public long mTriggeredTimestamp;

        @Keep
        public Object mValue;
    }

    public AppMeasurement(C0650n0 c0650n0) {
        this.f15715a = new a(c0650n0);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Keep
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        if (f15714b == null) {
            synchronized (AppMeasurement.class) {
                if (f15714b == null) {
                    T0 t02 = (T0) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                    if (t02 != null) {
                        f15714b = new AppMeasurement(t02);
                    } else {
                        f15714b = new AppMeasurement(C0650n0.l(context, new U(0L, 0L, true, null, null, null, null, null), null));
                    }
                }
            }
        }
        return f15714b;
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        this.f15715a.d(str);
    }

    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f15715a.e(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(String str) {
        this.f15715a.h(str);
    }

    @Keep
    public long generateEventId() {
        return this.f15715a.m();
    }

    @Keep
    public String getAppInstanceId() {
        return this.f15715a.b();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty, java.lang.Object] */
    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        int size;
        List<Bundle> f9 = this.f15715a.f(str, str2);
        if (f9 == null) {
            size = 0;
        } else {
            size = f9.size();
        }
        ArrayList arrayList = new ArrayList(size);
        for (Bundle bundle : f9) {
            ?? obj = new Object();
            y.h(bundle);
            obj.mAppId = (String) D0.a(bundle, "app_id", String.class, null);
            obj.mOrigin = (String) D0.a(bundle, "origin", String.class, null);
            obj.mName = (String) D0.a(bundle, "name", String.class, null);
            obj.mValue = D0.a(bundle, "value", Object.class, null);
            obj.mTriggerEventName = (String) D0.a(bundle, "trigger_event_name", String.class, null);
            obj.mTriggerTimeout = ((Long) D0.a(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            obj.mTimedOutEventName = (String) D0.a(bundle, "timed_out_event_name", String.class, null);
            obj.mTimedOutEventParams = (Bundle) D0.a(bundle, "timed_out_event_params", Bundle.class, null);
            obj.mTriggeredEventName = (String) D0.a(bundle, "triggered_event_name", String.class, null);
            obj.mTriggeredEventParams = (Bundle) D0.a(bundle, "triggered_event_params", Bundle.class, null);
            obj.mTimeToLive = ((Long) D0.a(bundle, "time_to_live", Long.class, 0L)).longValue();
            obj.mExpiredEventName = (String) D0.a(bundle, "expired_event_name", String.class, null);
            obj.mExpiredEventParams = (Bundle) D0.a(bundle, "expired_event_params", Bundle.class, null);
            obj.mActive = ((Boolean) D0.a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            obj.mCreationTimestamp = ((Long) D0.a(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            obj.mTriggeredTimestamp = ((Long) D0.a(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(obj);
        }
        return arrayList;
    }

    @Keep
    public String getCurrentScreenClass() {
        return this.f15715a.c();
    }

    @Keep
    public String getCurrentScreenName() {
        return this.f15715a.j();
    }

    @Keep
    public String getGmpAppId() {
        return this.f15715a.n();
    }

    @Keep
    public int getMaxUserProperties(String str) {
        return this.f15715a.i(str);
    }

    @Keep
    public Map<String, Object> getUserProperties(String str, String str2, boolean z9) {
        return this.f15715a.g(str, str2, z9);
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.f15715a.l(str, str2, bundle);
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        y.h(conditionalUserProperty);
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            D0.e(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        this.f15715a.k(bundle);
    }

    public AppMeasurement(T0 t02) {
        this.f15715a = new b(t02);
    }
}
