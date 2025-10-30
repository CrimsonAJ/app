package b5;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

/* renamed from: b5.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0628g extends D.n {

    /* renamed from: b, reason: collision with root package name */
    public Boolean f11118b;

    /* renamed from: c, reason: collision with root package name */
    public String f11119c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC0625f f11120d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f11121e;

    public final boolean m0() {
        ((C0650n0) this.f1707a).getClass();
        Boolean w02 = w0("firebase_analytics_collection_deactivated");
        if (w02 != null && w02.booleanValue()) {
            return true;
        }
        return false;
    }

    public final boolean n0(String str) {
        return "1".equals(this.f11120d.o(str, "measurement.event_sampling_enabled"));
    }

    public final boolean o0() {
        if (this.f11118b == null) {
            Boolean w02 = w0("app_measurement_lite");
            this.f11118b = w02;
            if (w02 == null) {
                this.f11118b = Boolean.FALSE;
            }
        }
        if (!this.f11118b.booleanValue() && ((C0650n0) this.f1707a).f11225e) {
            return false;
        }
        return true;
    }

    public final String p0(String str) {
        C0650n0 c0650n0 = (C0650n0) this.f1707a;
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            F4.y.h(str2);
            return str2;
        } catch (ClassNotFoundException e8) {
            V v8 = c0650n0.f11229i;
            C0650n0.f(v8);
            v8.f10971f.c(e8, "Could not find SystemProperties class");
            return "";
        } catch (IllegalAccessException e9) {
            V v9 = c0650n0.f11229i;
            C0650n0.f(v9);
            v9.f10971f.c(e9, "Could not access SystemProperties.get()");
            return "";
        } catch (NoSuchMethodException e10) {
            V v10 = c0650n0.f11229i;
            C0650n0.f(v10);
            v10.f10971f.c(e10, "Could not find SystemProperties.get() method");
            return "";
        } catch (InvocationTargetException e11) {
            V v11 = c0650n0.f11229i;
            C0650n0.f(v11);
            v11.f10971f.c(e11, "SystemProperties.get() threw an exception");
            return "";
        }
    }

    public final double q0(String str, D d9) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) d9.a(null)).doubleValue();
        }
        String o9 = this.f11120d.o(str, d9.f10569a);
        if (TextUtils.isEmpty(o9)) {
            return ((Double) d9.a(null)).doubleValue();
        }
        try {
            return ((Double) d9.a(Double.valueOf(Double.parseDouble(o9)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) d9.a(null)).doubleValue();
        }
    }

    public final int r0(String str, D d9) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) d9.a(null)).intValue();
        }
        String o9 = this.f11120d.o(str, d9.f10569a);
        if (TextUtils.isEmpty(o9)) {
            return ((Integer) d9.a(null)).intValue();
        }
        try {
            return ((Integer) d9.a(Integer.valueOf(Integer.parseInt(o9)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) d9.a(null)).intValue();
        }
    }

    public final long s0() {
        ((C0650n0) this.f1707a).getClass();
        return 119002L;
    }

    public final long t0(String str, D d9) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) d9.a(null)).longValue();
        }
        String o9 = this.f11120d.o(str, d9.f10569a);
        if (TextUtils.isEmpty(o9)) {
            return ((Long) d9.a(null)).longValue();
        }
        try {
            return ((Long) d9.a(Long.valueOf(Long.parseLong(o9)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) d9.a(null)).longValue();
        }
    }

    public final Bundle u0() {
        C0650n0 c0650n0 = (C0650n0) this.f1707a;
        try {
            Context context = c0650n0.f11221a;
            Context context2 = c0650n0.f11221a;
            PackageManager packageManager = context.getPackageManager();
            V v8 = c0650n0.f11229i;
            if (packageManager == null) {
                C0650n0.f(v8);
                v8.f10971f.b("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo b9 = M4.c.a(context2).b(128, context2.getPackageName());
            if (b9 == null) {
                C0650n0.f(v8);
                v8.f10971f.b("Failed to load metadata: ApplicationInfo is null");
                return null;
            }
            return b9.metaData;
        } catch (PackageManager.NameNotFoundException e8) {
            V v9 = c0650n0.f11229i;
            C0650n0.f(v9);
            v9.f10971f.c(e8, "Failed to load metadata: Package name not found");
            return null;
        }
    }

    public final EnumC0678z0 v0(String str, boolean z9) {
        Object obj;
        F4.y.e(str);
        Bundle u02 = u0();
        C0650n0 c0650n0 = (C0650n0) this.f1707a;
        if (u02 == null) {
            V v8 = c0650n0.f11229i;
            C0650n0.f(v8);
            v8.f10971f.b("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = u02.get(str);
        }
        EnumC0678z0 enumC0678z0 = EnumC0678z0.UNINITIALIZED;
        if (obj == null) {
            return enumC0678z0;
        }
        if (Boolean.TRUE.equals(obj)) {
            return EnumC0678z0.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return EnumC0678z0.DENIED;
        }
        if (z9 && "eu_consent_policy".equals(obj)) {
            return EnumC0678z0.POLICY;
        }
        V v9 = c0650n0.f11229i;
        C0650n0.f(v9);
        v9.f10974i.c(str, "Invalid manifest metadata for");
        return enumC0678z0;
    }

    public final Boolean w0(String str) {
        F4.y.e(str);
        Bundle u02 = u0();
        if (u02 == null) {
            V v8 = ((C0650n0) this.f1707a).f11229i;
            C0650n0.f(v8);
            v8.f10971f.b("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (!u02.containsKey(str)) {
            return null;
        }
        return Boolean.valueOf(u02.getBoolean(str));
    }

    public final String x0(String str, D d9) {
        if (TextUtils.isEmpty(str)) {
            return (String) d9.a(null);
        }
        return (String) d9.a(this.f11120d.o(str, d9.f10569a));
    }

    public final boolean y0(String str, D d9) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) d9.a(null)).booleanValue();
        }
        String o9 = this.f11120d.o(str, d9.f10569a);
        if (TextUtils.isEmpty(o9)) {
            return ((Boolean) d9.a(null)).booleanValue();
        }
        return ((Boolean) d9.a(Boolean.valueOf("1".equals(o9)))).booleanValue();
    }

    public final boolean z0() {
        Boolean w02 = w0("google_analytics_automatic_screen_reporting_enabled");
        if (w02 != null && !w02.booleanValue()) {
            return false;
        }
        return true;
    }
}
