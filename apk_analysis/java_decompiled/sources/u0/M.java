package u0;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.Y1;

/* loaded from: classes.dex */
public final class M extends T {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f23437r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ M(int i9, boolean z9) {
        super(z9);
        this.f23437r = i9;
    }

    @Override // u0.T
    public final Object a(String str, Bundle bundle) {
        switch (this.f23437r) {
            case 0:
                return (Boolean) z.d(bundle, "bundle", str, "key", str);
            case 1:
                Object d9 = z.d(bundle, "bundle", str, "key", str);
                kotlin.jvm.internal.h.c(d9, "null cannot be cast to non-null type kotlin.Float");
                return (Float) d9;
            case 2:
                Object d10 = z.d(bundle, "bundle", str, "key", str);
                kotlin.jvm.internal.h.c(d10, "null cannot be cast to non-null type kotlin.Int");
                return (Integer) d10;
            case 3:
                Object d11 = z.d(bundle, "bundle", str, "key", str);
                kotlin.jvm.internal.h.c(d11, "null cannot be cast to non-null type kotlin.Long");
                return (Long) d11;
            case 4:
                Object d12 = z.d(bundle, "bundle", str, "key", str);
                kotlin.jvm.internal.h.c(d12, "null cannot be cast to non-null type kotlin.Int");
                return (Integer) d12;
            default:
                return (String) z.d(bundle, "bundle", str, "key", str);
        }
    }

    @Override // u0.T
    public final String b() {
        switch (this.f23437r) {
            case 0:
                return "boolean";
            case 1:
                return "float";
            case 2:
                return "integer";
            case 3:
                return "long";
            case 4:
                return "reference";
            default:
                return "string";
        }
    }

    @Override // u0.T
    public final Object d(String value) {
        boolean z9;
        int parseInt;
        String str;
        long parseLong;
        int parseInt2;
        switch (this.f23437r) {
            case 0:
                kotlin.jvm.internal.h.e(value, "value");
                if (value.equals("true")) {
                    z9 = true;
                } else if (value.equals("false")) {
                    z9 = false;
                } else {
                    throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
                }
                return Boolean.valueOf(z9);
            case 1:
                kotlin.jvm.internal.h.e(value, "value");
                return Float.valueOf(Float.parseFloat(value));
            case 2:
                kotlin.jvm.internal.h.e(value, "value");
                if (W7.l.L(value, "0x", false)) {
                    String substring = value.substring(2);
                    kotlin.jvm.internal.h.d(substring, "substring(...)");
                    Y1.i(16);
                    parseInt = Integer.parseInt(substring, 16);
                } else {
                    parseInt = Integer.parseInt(value);
                }
                return Integer.valueOf(parseInt);
            case 3:
                kotlin.jvm.internal.h.e(value, "value");
                if (W7.l.G(value, "L", false)) {
                    str = value.substring(0, value.length() - 1);
                    kotlin.jvm.internal.h.d(str, "substring(...)");
                } else {
                    str = value;
                }
                if (W7.l.L(value, "0x", false)) {
                    String substring2 = str.substring(2);
                    kotlin.jvm.internal.h.d(substring2, "substring(...)");
                    Y1.i(16);
                    parseLong = Long.parseLong(substring2, 16);
                } else {
                    parseLong = Long.parseLong(str);
                }
                return Long.valueOf(parseLong);
            case 4:
                kotlin.jvm.internal.h.e(value, "value");
                if (W7.l.L(value, "0x", false)) {
                    String substring3 = value.substring(2);
                    kotlin.jvm.internal.h.d(substring3, "substring(...)");
                    Y1.i(16);
                    parseInt2 = Integer.parseInt(substring3, 16);
                } else {
                    parseInt2 = Integer.parseInt(value);
                }
                return Integer.valueOf(parseInt2);
            default:
                kotlin.jvm.internal.h.e(value, "value");
                if (value.equals("null")) {
                    return null;
                }
                return value;
        }
    }

    @Override // u0.T
    public final void e(Bundle bundle, String key, Object obj) {
        switch (this.f23437r) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                kotlin.jvm.internal.h.e(key, "key");
                bundle.putBoolean(key, booleanValue);
                return;
            case 1:
                float floatValue = ((Number) obj).floatValue();
                kotlin.jvm.internal.h.e(key, "key");
                bundle.putFloat(key, floatValue);
                return;
            case 2:
                int intValue = ((Number) obj).intValue();
                kotlin.jvm.internal.h.e(key, "key");
                bundle.putInt(key, intValue);
                return;
            case 3:
                long longValue = ((Number) obj).longValue();
                kotlin.jvm.internal.h.e(key, "key");
                bundle.putLong(key, longValue);
                return;
            case 4:
                int intValue2 = ((Number) obj).intValue();
                kotlin.jvm.internal.h.e(key, "key");
                bundle.putInt(key, intValue2);
                return;
            default:
                kotlin.jvm.internal.h.e(key, "key");
                bundle.putString(key, (String) obj);
                return;
        }
    }

    @Override // u0.T
    public String f(Object obj) {
        String str;
        switch (this.f23437r) {
            case 5:
                String str2 = (String) obj;
                if (str2 != null) {
                    str = Uri.encode(str2);
                } else {
                    str = null;
                }
                if (str == null) {
                    return "null";
                }
                return str;
            default:
                return super.f(obj);
        }
    }
}
