package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import android.os.Looper;
import co.notix.R;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.cast.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0890x0 {

    /* renamed from: i, reason: collision with root package name */
    public static final y4.b f15098i = new y4.b("FeatureUsageAnalytics", null);
    public static final String j = "22.1.0";

    /* renamed from: k, reason: collision with root package name */
    public static C0890x0 f15099k;

    /* renamed from: a, reason: collision with root package name */
    public final Y f15100a;

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f15101b;

    /* renamed from: c, reason: collision with root package name */
    public final String f15102c;

    /* renamed from: h, reason: collision with root package name */
    public long f15107h;

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f15105f = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    public final HashSet f15106g = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    public final T4.d f15104e = new T4.d(Looper.getMainLooper(), 4);

    /* renamed from: d, reason: collision with root package name */
    public final RunnableC0893y f15103d = new RunnableC0893y(3, this);

    public C0890x0(SharedPreferences sharedPreferences, Y y9, String str) {
        this.f15101b = sharedPreferences;
        this.f15100a = y9;
        this.f15102c = str;
    }

    public static void a(EnumC0894y0 enumC0894y0) {
        C0890x0 c0890x0;
        if (Y.f14790k && (c0890x0 = f15099k) != null) {
            String num = Integer.toString(enumC0894y0.f15166a);
            SharedPreferences sharedPreferences = c0890x0.f15101b;
            SharedPreferences.Editor edit = sharedPreferences.edit();
            String e8 = u0.z.e("feature_usage_timestamp_reported_feature_", num);
            if (!sharedPreferences.contains(e8)) {
                e8 = u0.z.e("feature_usage_timestamp_detected_feature_", num);
            }
            edit.putLong(e8, System.currentTimeMillis()).apply();
            c0890x0.f15105f.add(enumC0894y0);
            c0890x0.f15104e.post(c0890x0.f15103d);
        }
    }

    public static EnumC0894y0 b(String str) {
        EnumC0894y0 enumC0894y0 = EnumC0894y0.DEVELOPER_FEATURE_FLAG_UNKNOWN;
        switch (Integer.parseInt(str)) {
            case 0:
                return enumC0894y0;
            case 1:
                return EnumC0894y0.CAF_CAST_BUTTON;
            case 2:
                return EnumC0894y0.CAF_EXPANDED_CONTROLLER;
            case 3:
                return EnumC0894y0.CAF_MINI_CONTROLLER;
            case 4:
                return EnumC0894y0.CAF_CONTAINER_CONTROLLER;
            case 5:
                return EnumC0894y0.CAST_CONTEXT;
            case 6:
                return EnumC0894y0.IMAGE_CACHE;
            case 7:
                return EnumC0894y0.IMAGE_PICKER;
            case 8:
                return EnumC0894y0.AD_BREAK_PARSER;
            case 9:
                return EnumC0894y0.UI_STYLE;
            case R.styleable.GradientColor_android_endX /* 10 */:
                return EnumC0894y0.HARDWARE_VOLUME_BUTTON;
            case R.styleable.GradientColor_android_endY /* 11 */:
                return EnumC0894y0.NON_CAST_DEVICE_PROVIDER;
            case 12:
                return EnumC0894y0.PAUSE_CONTROLLER;
            case 13:
                return EnumC0894y0.SEEK_CONTROLLER;
            case 14:
                return EnumC0894y0.STREAM_VOLUME;
            case 15:
                return EnumC0894y0.UI_MEDIA_CONTROLLER;
            case 16:
                return EnumC0894y0.PLAYBACK_RATE_CONTROLLER;
            case 17:
                return EnumC0894y0.PRECACHE;
            case 18:
                return EnumC0894y0.INSTRUCTIONS_VIEW;
            case 19:
                return EnumC0894y0.OPTION_SUSPEND_SESSIONS_WHEN_BACKGROUNDED;
            case 20:
                return EnumC0894y0.OPTION_STOP_RECEIVER_APPLICATION_WHEN_ENDING_SESSION;
            case 21:
                return EnumC0894y0.OPTION_DISABLE_DISCOVERY_AUTOSTART;
            case 22:
                return EnumC0894y0.OPTION_DISABLE_ANALYTICS_LOGGING;
            case 23:
                return EnumC0894y0.OPTION_PHYSICAL_VOLUME_BUTTONS_WILL_CONTROL_DEVICE_VOLUME;
            case 24:
                return EnumC0894y0.CAF_EXPANDED_CONTROLLER_HIDE_STREAM_POSITION_CONTROLS_FOR_LIVE_CONTENT;
            case 25:
                return EnumC0894y0.CAF_EXPANDED_CONTROLLER_WITH_LIVE_CONTENT;
            case 26:
                return EnumC0894y0.REMOTE_MEDIA_CLIENT_LOAD_MEDIA_WITH_OPTIONS;
            case 27:
                return EnumC0894y0.REMOTE_MEDIA_CLIENT_QUEUE_LOAD_ITEMS_WITH_OPTIONS;
            case 28:
                return EnumC0894y0.REMOTE_MEDIA_CLIENT_LOAD_MEDIA_WITH_LOAD_REQUEST_DATA;
            case 29:
                return EnumC0894y0.LAUNCH_OPTION_ANDROID_RECEIVER_COMPATIBLE;
            case 30:
                return EnumC0894y0.CAST_CONTEXT_SET_LAUNCH_CREDENTIALS_DATA;
            case 31:
                return EnumC0894y0.START_DISCOVERY_AFTER_FIRST_TAP_ON_CAST_BUTTON;
            case 32:
                return EnumC0894y0.CAST_UNAVAILABLE_BUTTON_VISIBLE;
            case 33:
                return EnumC0894y0.CAST_DEFAULT_MEDIA_ROUTER_DIALOG;
            case 34:
                return EnumC0894y0.CAST_CUSTOM_MEDIA_ROUTER_DIALOG;
            case 35:
                return EnumC0894y0.CAST_OUTPUT_SWITCHER_ENABLED;
            case 36:
                return EnumC0894y0.CAST_TRANSFER_TO_LOCAL_ENABLED;
            case 37:
                return EnumC0894y0.CAST_BUTTON_IS_TRIGGERED_DEFAULT_CAST_DIALOG_FALSE;
            case 38:
                return EnumC0894y0.CAST_BUTTON_DELEGATE;
            case 39:
                return EnumC0894y0.CAST_BUTTON_DELEGATE_PRESENT_LNA_PERMISSION_CUSTOM_DIALOG;
            case 40:
                return EnumC0894y0.CAST_BUTTON_DELEGATE_PRESENT_CAST_STATE_CUSTOM_DIALOG;
            case 41:
                return EnumC0894y0.CAST_TRANSFER_TO_LOCAL_USED;
            case 42:
                return EnumC0894y0.MEDIA_REQUEST_ITEM_MAP_HLS_SEGMENT_FORMAT_TO_STRING;
            case 43:
                return EnumC0894y0.MEDIA_REQUEST_ITEM_MAP_HLS_SEGMENT_FORMAT_STRING_TO_ENUM;
            case 44:
                return EnumC0894y0.HLS_SEGMENT_MAP_HLS_SEGMENT_FORMAT_TO_STRING;
            case 45:
                return EnumC0894y0.HLS_SEGMENT_MAP_HLS_SEGMENT_FORMAT_STRING_TO_ENUM;
            case 46:
                return EnumC0894y0.HLS_VIDEO_SEGMENT_MAP_HLS_VIDEO_SEGMENT_FORMAT_TO_STRING;
            case 47:
                return EnumC0894y0.HLS_VIDEO_SEGMENT_MAP_HLS_VIDEO_SEGMENT_FORMAT_STRING_TO_ENUM;
            case 48:
                return EnumC0894y0.CAST_SLIDER_SET_AD_BLOCK_POSITIONS;
            case 49:
                return EnumC0894y0.CAF_NOTIFICATION_SERVICE;
            case 50:
                return EnumC0894y0.HARDWARE_VOLUME_BUTTON_PRESS;
            case 51:
                return EnumC0894y0.CAST_SDK_DEFAULT_DEVICE_DIALOG;
            case 52:
                return EnumC0894y0.CAST_SDK_CUSTOM_DEVICE_DIALOG;
            case 53:
                return EnumC0894y0.PERSISTENT_CAST_BUTTON_DISCOVERY_DISABLED_WITH_CONFLICT_TYPES;
            case 54:
                return EnumC0894y0.CAST_DEVICE_DIALOG_FACTORY_INSTANTIATED;
            case 55:
                return EnumC0894y0.CAF_MEDIA_NOTIFICATION_PROXY;
            case 56:
                return EnumC0894y0.REMOTE_CONNECTION_MANAGER_ACQUIRED;
            case 57:
                return EnumC0894y0.REMOTE_CONNECTION_CALLBACK_SET;
            default:
                return null;
        }
    }

    public final void c(HashSet hashSet) {
        if (hashSet.isEmpty()) {
            return;
        }
        SharedPreferences.Editor edit = this.f15101b.edit();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            edit.remove((String) it.next());
        }
        edit.apply();
    }
}
