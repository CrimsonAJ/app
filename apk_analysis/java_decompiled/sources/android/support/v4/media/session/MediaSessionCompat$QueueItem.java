package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class MediaSessionCompat$QueueItem implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$QueueItem> CREATOR = new x(1);

    /* renamed from: a, reason: collision with root package name */
    public final MediaDescriptionCompat f9268a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9269b;

    public MediaSessionCompat$QueueItem(MediaDescriptionCompat mediaDescriptionCompat, long j) {
        if (mediaDescriptionCompat == null) {
            throw new IllegalArgumentException("Description cannot be null");
        }
        if (j != -1) {
            this.f9268a = mediaDescriptionCompat;
            this.f9269b = j;
            return;
        }
        throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaSession.QueueItem {Description=");
        sb.append(this.f9268a);
        sb.append(", Id=");
        return A0.a.o(sb, this.f9269b, " }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        this.f9268a.writeToParcel(parcel, i9);
        parcel.writeLong(this.f9269b);
    }

    public MediaSessionCompat$QueueItem(Parcel parcel) {
        this.f9268a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        this.f9269b = parcel.readLong();
    }
}
