package com.anilab.domain.model;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.h;
import u0.z;

/* loaded from: classes.dex */
public final class Genre implements Parcelable {
    public static final Parcelable.Creator<Genre> CREATOR = new a(23);

    /* renamed from: a, reason: collision with root package name */
    public final long f14405a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14406b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14407c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f14408d;

    public Genre(long j, String name, String slug, boolean z9) {
        h.e(name, "name");
        h.e(slug, "slug");
        this.f14405a = j;
        this.f14406b = name;
        this.f14407c = slug;
        this.f14408d = z9;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Genre)) {
            return false;
        }
        Genre genre = (Genre) obj;
        return this.f14405a == genre.f14405a && h.a(this.f14406b, genre.f14406b) && h.a(this.f14407c, genre.f14407c) && this.f14408d == genre.f14408d;
    }

    public final int hashCode() {
        int i9;
        long j = this.f14405a;
        int c3 = z.c(this.f14407c, z.c(this.f14406b, ((int) (j ^ (j >>> 32))) * 31, 31), 31);
        if (this.f14408d) {
            i9 = 1231;
        } else {
            i9 = 1237;
        }
        return c3 + i9;
    }

    public final String toString() {
        return "Genre(id=" + this.f14405a + ", name=" + this.f14406b + ", slug=" + this.f14407c + ", publish=" + this.f14408d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i9) {
        h.e(dest, "dest");
        dest.writeLong(this.f14405a);
        dest.writeString(this.f14406b);
        dest.writeString(this.f14407c);
        dest.writeInt(this.f14408d ? 1 : 0);
    }
}
