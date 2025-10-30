package com.anilab.domain.model;

import A1.a;
import H2.j;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.h;
import u0.z;

/* loaded from: classes.dex */
public final class Shortcut implements Parcelable {
    public static final Parcelable.Creator<Shortcut> CREATOR = new a(28);

    /* renamed from: a, reason: collision with root package name */
    public final String f14439a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14440b;

    /* renamed from: c, reason: collision with root package name */
    public final List f14441c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f14442d;

    public Shortcut(String id, String title, List filters, boolean z9) {
        h.e(id, "id");
        h.e(title, "title");
        h.e(filters, "filters");
        this.f14439a = id;
        this.f14440b = title;
        this.f14441c = filters;
        this.f14442d = z9;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Shortcut)) {
            return false;
        }
        Shortcut shortcut = (Shortcut) obj;
        return h.a(this.f14439a, shortcut.f14439a) && h.a(this.f14440b, shortcut.f14440b) && h.a(this.f14441c, shortcut.f14441c) && this.f14442d == shortcut.f14442d;
    }

    public final int hashCode() {
        int i9;
        int hashCode = (this.f14441c.hashCode() + z.c(this.f14440b, this.f14439a.hashCode() * 31, 31)) * 31;
        if (this.f14442d) {
            i9 = 1231;
        } else {
            i9 = 1237;
        }
        return hashCode + i9;
    }

    public final String toString() {
        return "Shortcut(id=" + this.f14439a + ", title=" + this.f14440b + ", filters=" + this.f14441c + ", isGrid=" + this.f14442d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i9) {
        h.e(dest, "dest");
        dest.writeString(this.f14439a);
        dest.writeString(this.f14440b);
        List list = this.f14441c;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((j) it.next()).writeToParcel(dest, i9);
        }
        dest.writeInt(this.f14442d ? 1 : 0);
    }
}
