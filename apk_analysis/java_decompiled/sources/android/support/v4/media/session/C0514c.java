package android.support.v4.media.session;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;

/* renamed from: android.support.v4.media.session.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0514c implements d {

    /* renamed from: e, reason: collision with root package name */
    public IBinder f9297e;

    @Override // android.support.v4.media.session.d
    public final PendingIntent J() {
        throw null;
    }

    @Override // android.support.v4.media.session.d
    public final void Z() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.f9297e.transact(13, obtain, obtain2, 0)) {
                int i9 = s.f9316f;
            }
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f9297e;
    }

    @Override // android.support.v4.media.session.d
    public final PlaybackStateCompat e() {
        PlaybackStateCompat playbackStateCompat;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.f9297e.transact(28, obtain, obtain2, 0)) {
                int i9 = s.f9316f;
            }
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                playbackStateCompat = PlaybackStateCompat.CREATOR.createFromParcel(obtain2);
            } else {
                playbackStateCompat = null;
            }
            return playbackStateCompat;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.d
    public final void n0() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.f9297e.transact(18, obtain, obtain2, 0)) {
                int i9 = s.f9316f;
            }
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.d
    public final MediaMetadataCompat o0() {
        throw null;
    }

    @Override // android.support.v4.media.session.d
    public final void r(InterfaceC0513b interfaceC0513b) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            obtain.writeStrongBinder((g) interfaceC0513b);
            if (!this.f9297e.transact(3, obtain, obtain2, 0)) {
                int i9 = s.f9316f;
            }
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.d
    public final void r0(InterfaceC0513b interfaceC0513b) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            obtain.writeStrongBinder((g) interfaceC0513b);
            if (!this.f9297e.transact(4, obtain, obtain2, 0)) {
                int i9 = s.f9316f;
            }
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.d
    public final void stop() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.f9297e.transact(19, obtain, obtain2, 0)) {
                int i9 = s.f9316f;
            }
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
