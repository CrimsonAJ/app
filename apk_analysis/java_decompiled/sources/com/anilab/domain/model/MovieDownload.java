package com.anilab.domain.model;

import A1.a;
import J2.c;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class MovieDownload implements Parcelable {
    public static final Parcelable.Creator<MovieDownload> CREATOR = new a(26);

    /* renamed from: a, reason: collision with root package name */
    public final String f14435a;

    /* renamed from: b, reason: collision with root package name */
    public final c f14436b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14437c;

    /* renamed from: d, reason: collision with root package name */
    public final List f14438d;

    public MovieDownload(String name, c quality, String streamUrl, List subtitles) {
        h.e(name, "name");
        h.e(quality, "quality");
        h.e(streamUrl, "streamUrl");
        h.e(subtitles, "subtitles");
        this.f14435a = name;
        this.f14436b = quality;
        this.f14437c = streamUrl;
        this.f14438d = subtitles;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i9) {
        h.e(dest, "dest");
        dest.writeString(this.f14435a);
        dest.writeString(this.f14436b.name());
        dest.writeString(this.f14437c);
        List list = this.f14438d;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((I2.c) it.next()).writeToParcel(dest, i9);
        }
    }
}
