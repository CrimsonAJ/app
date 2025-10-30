package android.support.v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import co.notix.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g extends Binder implements InterfaceC0513b {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f9302f = 0;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f9303e;

    public g(androidx.mediarouter.app.p pVar) {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.f9303e = new WeakReference(pVar);
    }

    @Override // android.support.v4.media.session.InterfaceC0513b
    public final void U0(PlaybackStateCompat playbackStateCompat) {
        androidx.mediarouter.app.p pVar = (androidx.mediarouter.app.p) this.f9303e.get();
        if (pVar != null) {
            pVar.e(2, playbackStateCompat, null);
        }
    }

    @Override // android.support.v4.media.session.InterfaceC0513b
    public final void V(Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0513b
    public final void c0(ArrayList arrayList) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0513b
    public final void c1(ParcelableVolumeInfo parcelableVolumeInfo) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0513b
    public final void n(CharSequence charSequence) {
        throw new AssertionError();
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i9, Parcel parcel, Parcel parcel2, int i10) {
        boolean z9;
        if (i9 != 1598968902) {
            WeakReference weakReference = this.f9303e;
            Bundle bundle = null;
            ParcelableVolumeInfo parcelableVolumeInfo = null;
            Bundle bundle2 = null;
            CharSequence charSequence = null;
            MediaMetadataCompat mediaMetadataCompat = null;
            PlaybackStateCompat playbackStateCompat = null;
            switch (i9) {
                case 1:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    String readString = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    androidx.mediarouter.app.p pVar = (androidx.mediarouter.app.p) weakReference.get();
                    if (pVar != null) {
                        pVar.e(1, readString, bundle);
                    }
                    return true;
                case 2:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    t();
                    return true;
                case 3:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcel.readInt() != 0) {
                        playbackStateCompat = PlaybackStateCompat.CREATOR.createFromParcel(parcel);
                    }
                    U0(playbackStateCompat);
                    return true;
                case 4:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcel.readInt() != 0) {
                        mediaMetadataCompat = MediaMetadataCompat.CREATOR.createFromParcel(parcel);
                    }
                    w(mediaMetadataCompat);
                    return true;
                case 5:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    c0(parcel.createTypedArrayList(MediaSessionCompat$QueueItem.CREATOR));
                    return true;
                case 6:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcel.readInt() != 0) {
                        charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
                    }
                    n(charSequence);
                    return true;
                case 7:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcel.readInt() != 0) {
                        bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    V(bundle2);
                    return true;
                case 8:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcel.readInt() != 0) {
                        parcelableVolumeInfo = ParcelableVolumeInfo.CREATOR.createFromParcel(parcel);
                    }
                    c1(parcelableVolumeInfo);
                    return true;
                case 9:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    int readInt = parcel.readInt();
                    androidx.mediarouter.app.p pVar2 = (androidx.mediarouter.app.p) weakReference.get();
                    if (pVar2 != null) {
                        pVar2.e(9, Integer.valueOf(readInt), null);
                        return true;
                    }
                    return true;
                case R.styleable.GradientColor_android_endX /* 10 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    parcel.readInt();
                    return true;
                case R.styleable.GradientColor_android_endY /* 11 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcel.readInt() != 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    androidx.mediarouter.app.p pVar3 = (androidx.mediarouter.app.p) weakReference.get();
                    if (pVar3 != null) {
                        pVar3.e(11, Boolean.valueOf(z9), null);
                        return true;
                    }
                    return true;
                case 12:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    int readInt2 = parcel.readInt();
                    androidx.mediarouter.app.p pVar4 = (androidx.mediarouter.app.p) weakReference.get();
                    if (pVar4 != null) {
                        pVar4.e(12, Integer.valueOf(readInt2), null);
                        return true;
                    }
                    return true;
                case 13:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    androidx.mediarouter.app.p pVar5 = (androidx.mediarouter.app.p) weakReference.get();
                    if (pVar5 != null) {
                        pVar5.e(13, null, null);
                        return true;
                    }
                    return true;
                default:
                    return super.onTransact(i9, parcel, parcel2, i10);
            }
        }
        parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
        return true;
    }

    @Override // android.support.v4.media.session.InterfaceC0513b
    public final void t() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0513b
    public final void w(MediaMetadataCompat mediaMetadataCompat) {
        throw new AssertionError();
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
