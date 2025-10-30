package i7;

import android.os.Build;

/* renamed from: i7.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1387b {

    /* renamed from: a, reason: collision with root package name */
    public final String f18828a;

    /* renamed from: b, reason: collision with root package name */
    public final C1386a f18829b;

    public C1387b(String appId, C1386a c1386a) {
        String deviceModel = Build.MODEL;
        String osVersion = Build.VERSION.RELEASE;
        kotlin.jvm.internal.h.e(appId, "appId");
        kotlin.jvm.internal.h.e(deviceModel, "deviceModel");
        kotlin.jvm.internal.h.e(osVersion, "osVersion");
        this.f18828a = appId;
        this.f18829b = c1386a;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1387b) {
                C1387b c1387b = (C1387b) obj;
                if (kotlin.jvm.internal.h.a(this.f18828a, c1387b.f18828a)) {
                    String str = Build.MODEL;
                    if (kotlin.jvm.internal.h.a(str, str)) {
                        String str2 = Build.VERSION.RELEASE;
                        if (!kotlin.jvm.internal.h.a(str2, str2) || !this.f18829b.equals(c1387b.f18829b)) {
                            return false;
                        }
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f18829b.hashCode() + ((C.LOG_ENVIRONMENT_PROD.hashCode() + u0.z.c(Build.VERSION.RELEASE, (((Build.MODEL.hashCode() + (this.f18828a.hashCode() * 31)) * 31) + 47595001) * 31, 31)) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.f18828a + ", deviceModel=" + Build.MODEL + ", sessionSdkVersion=2.1.2, osVersion=" + Build.VERSION.RELEASE + ", logEnvironment=" + C.LOG_ENVIRONMENT_PROD + ", androidAppInfo=" + this.f18829b + ')';
    }
}
