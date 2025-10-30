package android.support.v4.media.session;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;

/* renamed from: android.support.v4.media.session.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0512a implements InterfaceC0513b {

    /* renamed from: e, reason: collision with root package name */
    public IBinder f9296e;

    @Override // android.support.v4.media.session.InterfaceC0513b
    public final void U0(PlaybackStateCompat playbackStateCompat) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            if (playbackStateCompat != null) {
                obtain.writeInt(1);
                playbackStateCompat.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (!this.f9296e.transact(3, obtain, null, 1)) {
                int i9 = g.f9302f;
            }
            obtain.recycle();
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    @Override // android.support.v4.media.session.InterfaceC0513b
    public final void V(Bundle bundle) {
        throw null;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f9296e;
    }

    @Override // android.support.v4.media.session.InterfaceC0513b
    public final void c1(ParcelableVolumeInfo parcelableVolumeInfo) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeInt(1);
            parcelableVolumeInfo.writeToParcel(obtain, 0);
            if (!this.f9296e.transact(8, obtain, null, 1)) {
                int i9 = g.f9302f;
            }
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.InterfaceC0513b
    public final void t() {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            if (!this.f9296e.transact(2, obtain, null, 1)) {
                int i9 = g.f9302f;
            }
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.InterfaceC0513b
    public final void w(MediaMetadataCompat mediaMetadataCompat) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            if (mediaMetadataCompat != null) {
                obtain.writeInt(1);
                obtain.writeBundle(mediaMetadataCompat.f9253a);
            } else {
                obtain.writeInt(0);
            }
            if (!this.f9296e.transact(4, obtain, null, 1)) {
                int i9 = g.f9302f;
            }
            obtain.recycle();
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }
}
