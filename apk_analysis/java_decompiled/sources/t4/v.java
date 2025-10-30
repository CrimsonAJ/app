package t4;

import co.notix.R;
import com.google.android.gms.internal.measurement.AbstractC0953k1;

/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final B4.d f23270a;

    /* renamed from: b, reason: collision with root package name */
    public static final B4.d f23271b;

    /* renamed from: c, reason: collision with root package name */
    public static final B4.d f23272c;

    /* renamed from: d, reason: collision with root package name */
    public static final B4.d f23273d;

    /* renamed from: e, reason: collision with root package name */
    public static final B4.d[] f23274e;

    static {
        B4.d dVar = new B4.d("client_side_logging");
        B4.d dVar2 = new B4.d("cxless_client_minimal");
        f23270a = dVar2;
        B4.d dVar3 = new B4.d("cxless_caf_control");
        B4.d dVar4 = new B4.d("module_flag_control");
        f23271b = dVar4;
        B4.d dVar5 = new B4.d("discovery_hint_supply");
        B4.d dVar6 = new B4.d("relay_casting_set_active_account");
        B4.d dVar7 = new B4.d("analytics_proto_enum_translation");
        f23272c = dVar7;
        B4.d dVar8 = new B4.d("integer_to_integer_map");
        f23273d = dVar8;
        f23274e = new B4.d[]{dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, new B4.d("relay_casting_set_remote_casting_mode"), new B4.d("get_relay_access_token"), new B4.d("get_cast_settings"), new B4.d("set_bundle_setting"), new B4.d("get_client_updated_info"), new B4.d("device_suggestions")};
    }

    public static String a(String str) {
        if (str != null) {
            return j8.a.a(new j8.a(1, str, null));
        }
        throw new IllegalArgumentException("applicationId cannot be null");
    }

    public static String b(int i9) {
        switch (i9) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case R.styleable.GradientColor_android_endY /* 11 */:
            case 12:
            default:
                return AbstractC0953k1.j(i9, "unknown status code: ");
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case R.styleable.GradientColor_android_endX /* 10 */:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            case 19:
                return "REMOTE_EXCEPTION";
            case 20:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case 21:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case 22:
                return "RECONNECTION_TIMED_OUT";
        }
    }
}
