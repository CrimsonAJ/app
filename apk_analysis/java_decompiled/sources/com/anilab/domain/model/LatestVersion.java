package com.anilab.domain.model;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.h;
import u0.z;

/* loaded from: classes.dex */
public final class LatestVersion implements Parcelable {
    public static final Parcelable.Creator<LatestVersion> CREATOR = new a(24);

    /* renamed from: a, reason: collision with root package name */
    public final String f14409a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14410b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14411c;

    /* renamed from: d, reason: collision with root package name */
    public final String f14412d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f14413e;

    public /* synthetic */ LatestVersion() {
        this("", 0, "", "", false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatestVersion)) {
            return false;
        }
        LatestVersion latestVersion = (LatestVersion) obj;
        return h.a(this.f14409a, latestVersion.f14409a) && this.f14410b == latestVersion.f14410b && h.a(this.f14411c, latestVersion.f14411c) && h.a(this.f14412d, latestVersion.f14412d) && this.f14413e == latestVersion.f14413e;
    }

    public final int hashCode() {
        int i9;
        int c3 = z.c(this.f14412d, z.c(this.f14411c, ((this.f14409a.hashCode() * 31) + this.f14410b) * 31, 31), 31);
        if (this.f14413e) {
            i9 = 1231;
        } else {
            i9 = 1237;
        }
        return c3 + i9;
    }

    public final String toString() {
        return "LatestVersion(version=" + this.f14409a + ", versionCode=" + this.f14410b + ", changeLog=" + this.f14411c + ", link=" + this.f14412d + ", forceUpdate=" + this.f14413e + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i9) {
        h.e(dest, "dest");
        dest.writeString(this.f14409a);
        dest.writeInt(this.f14410b);
        dest.writeString(this.f14411c);
        dest.writeString(this.f14412d);
        dest.writeInt(this.f14413e ? 1 : 0);
    }

    public LatestVersion(String version, int i9, String changeLog, String link, boolean z9) {
        h.e(version, "version");
        h.e(changeLog, "changeLog");
        h.e(link, "link");
        this.f14409a = version;
        this.f14410b = i9;
        this.f14411c = changeLog;
        this.f14412d = link;
        this.f14413e = z9;
    }
}
