package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;

/* loaded from: classes.dex */
public final class x implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9327a;

    /* JADX WARN: Type inference failed for: r0v1, types: [android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.support.v4.media.session.ParcelableVolumeInfo, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f9327a) {
            case 0:
                ?? obj = new Object();
                obj.f9270a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
                return obj;
            case 1:
                return new MediaSessionCompat$QueueItem(parcel);
            case 2:
                return new MediaSessionCompat$Token(parcel.readParcelable(null), null);
            case 3:
                ?? obj2 = new Object();
                obj2.f9275a = parcel.readInt();
                obj2.f9277c = parcel.readInt();
                obj2.f9278d = parcel.readInt();
                obj2.f9279e = parcel.readInt();
                obj2.f9276b = parcel.readInt();
                return obj2;
            default:
                return new PlaybackStateCompat(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i9) {
        switch (this.f9327a) {
            case 0:
                return new MediaSessionCompat$ResultReceiverWrapper[i9];
            case 1:
                return new MediaSessionCompat$QueueItem[i9];
            case 2:
                return new MediaSessionCompat$Token[i9];
            case 3:
                return new ParcelableVolumeInfo[i9];
            default:
                return new PlaybackStateCompat[i9];
        }
    }
}
