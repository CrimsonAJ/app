package com.anilab.domain.model;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class FilterConfig implements Parcelable {
    public static final Parcelable.Creator<FilterConfig> CREATOR = new a(22);

    /* renamed from: a, reason: collision with root package name */
    public final String f14403a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14404b;

    public FilterConfig(String title, String str) {
        h.e(title, "title");
        this.f14403a = title;
        this.f14404b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilterConfig)) {
            return false;
        }
        FilterConfig filterConfig = (FilterConfig) obj;
        return h.a(this.f14403a, filterConfig.f14403a) && h.a(this.f14404b, filterConfig.f14404b);
    }

    public final int hashCode() {
        int hashCode = this.f14403a.hashCode() * 31;
        String str = this.f14404b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilterConfig(title=");
        sb.append(this.f14403a);
        sb.append(", value=");
        return AbstractC0953k1.q(sb, this.f14404b, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i9) {
        h.e(dest, "dest");
        dest.writeString(this.f14403a);
        dest.writeString(this.f14404b);
    }
}
