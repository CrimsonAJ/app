package i7;

import android.os.Build;
import java.util.ArrayList;

/* renamed from: i7.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1386a {

    /* renamed from: a, reason: collision with root package name */
    public final String f18820a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18821b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18822c;

    /* renamed from: d, reason: collision with root package name */
    public final D f18823d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f18824e;

    public C1386a(String str, String versionName, String appBuildVersion, D d9, ArrayList arrayList) {
        String deviceManufacturer = Build.MANUFACTURER;
        kotlin.jvm.internal.h.e(versionName, "versionName");
        kotlin.jvm.internal.h.e(appBuildVersion, "appBuildVersion");
        kotlin.jvm.internal.h.e(deviceManufacturer, "deviceManufacturer");
        this.f18820a = str;
        this.f18821b = versionName;
        this.f18822c = appBuildVersion;
        this.f18823d = d9;
        this.f18824e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1386a) {
                C1386a c1386a = (C1386a) obj;
                if (this.f18820a.equals(c1386a.f18820a) && kotlin.jvm.internal.h.a(this.f18821b, c1386a.f18821b) && kotlin.jvm.internal.h.a(this.f18822c, c1386a.f18822c)) {
                    String str = Build.MANUFACTURER;
                    if (!kotlin.jvm.internal.h.a(str, str) || !this.f18823d.equals(c1386a.f18823d) || !this.f18824e.equals(c1386a.f18824e)) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f18824e.hashCode() + ((this.f18823d.hashCode() + u0.z.c(Build.MANUFACTURER, u0.z.c(this.f18822c, u0.z.c(this.f18821b, this.f18820a.hashCode() * 31, 31), 31), 31)) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f18820a + ", versionName=" + this.f18821b + ", appBuildVersion=" + this.f18822c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.f18823d + ", appProcessDetails=" + this.f18824e + ')';
    }
}
