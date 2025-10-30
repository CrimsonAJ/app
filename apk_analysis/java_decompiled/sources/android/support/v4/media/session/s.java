package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.text.TextUtils;
import android.view.KeyEvent;
import co.notix.R;
import java.util.ArrayList;
import p0.C1835a;

/* loaded from: classes.dex */
public final class s extends Binder implements d {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f9316f = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f9317e;

    public s(t tVar) {
        this.f9317e = tVar;
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
    }

    @Override // android.support.v4.media.session.d
    public final void A(RatingCompat ratingCompat) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void B0(long j) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void C0(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void D(Uri uri, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void E0(int i9, int i10) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void F(MediaDescriptionCompat mediaDescriptionCompat) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final ParcelableVolumeInfo F0() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final boolean G() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void H0() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void I(MediaDescriptionCompat mediaDescriptionCompat) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final Bundle I0() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final PendingIntent J() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void K0(Uri uri, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void M(int i9) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void N0(long j) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void O0(int i9) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void P(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final String S0() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void Y0(float f9) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void Z() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void b() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void b0(String str, Bundle bundle, MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final boolean d1(KeyEvent keyEvent) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final PlaybackStateCompat e() {
        long j;
        t tVar = this.f9317e;
        PlaybackStateCompat playbackStateCompat = tVar.f9323f;
        MediaMetadataCompat mediaMetadataCompat = tVar.f9324g;
        if (playbackStateCompat != null) {
            long j4 = playbackStateCompat.f9281b;
            long j9 = -1;
            if (j4 != -1) {
                int i9 = playbackStateCompat.f9280a;
                if (i9 == 3 || i9 == 4 || i9 == 5) {
                    if (playbackStateCompat.f9287h > 0) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        long j10 = (playbackStateCompat.f9283d * ((float) (elapsedRealtime - r7))) + j4;
                        if (mediaMetadataCompat != null) {
                            Bundle bundle = mediaMetadataCompat.f9253a;
                            if (bundle.containsKey("android.media.metadata.DURATION")) {
                                j9 = bundle.getLong("android.media.metadata.DURATION", 0L);
                            }
                        }
                        if (j9 >= 0 && j10 > j9) {
                            j = j9;
                        } else if (j10 < 0) {
                            j = 0;
                        } else {
                            j = j10;
                        }
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = playbackStateCompat.f9288i;
                        if (arrayList2 != null) {
                            arrayList.addAll(arrayList2);
                        }
                        return new PlaybackStateCompat(playbackStateCompat.f9280a, j, playbackStateCompat.f9282c, playbackStateCompat.f9283d, playbackStateCompat.f9284e, playbackStateCompat.f9285f, playbackStateCompat.f9286g, elapsedRealtime, arrayList, playbackStateCompat.j, playbackStateCompat.f9289k);
                    }
                    return playbackStateCompat;
                }
                return playbackStateCompat;
            }
            return playbackStateCompat;
        }
        return playbackStateCompat;
    }

    @Override // android.support.v4.media.session.d
    public final void e0(int i9, int i10) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void g0() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void h(int i9) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final long i() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final CharSequence j0() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void n0() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void next() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final MediaMetadataCompat o0() {
        throw new AssertionError();
    }

    /* JADX WARN: Type inference failed for: r3v12, types: [android.support.v4.media.session.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [android.support.v4.media.session.a, java.lang.Object] */
    @Override // android.os.Binder
    public final boolean onTransact(int i9, Parcel parcel, Parcel parcel2, int i10) {
        Bundle bundle;
        Uri uri;
        Uri uri2;
        RatingCompat ratingCompat;
        if (i9 != 1598968902) {
            MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper = null;
            Bundle bundle2 = null;
            MediaDescriptionCompat mediaDescriptionCompat = null;
            MediaDescriptionCompat mediaDescriptionCompat2 = null;
            MediaDescriptionCompat mediaDescriptionCompat3 = null;
            Bundle bundle3 = null;
            Bundle bundle4 = null;
            Bundle bundle5 = null;
            Bundle bundle6 = null;
            RatingCompat ratingCompat2 = null;
            Bundle bundle7 = null;
            Bundle bundle8 = null;
            Bundle bundle9 = null;
            InterfaceC0513b interfaceC0513b = null;
            InterfaceC0513b interfaceC0513b2 = null;
            KeyEvent keyEvent = null;
            boolean z9 = false;
            switch (i9) {
                case 1:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    String readString = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    } else {
                        bundle = null;
                    }
                    if (parcel.readInt() != 0) {
                        mediaSessionCompat$ResultReceiverWrapper = MediaSessionCompat$ResultReceiverWrapper.CREATOR.createFromParcel(parcel);
                    }
                    b0(readString, bundle, mediaSessionCompat$ResultReceiverWrapper);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    if (parcel.readInt() != 0) {
                        keyEvent = (KeyEvent) KeyEvent.CREATOR.createFromParcel(parcel);
                    }
                    boolean d12 = d1(keyEvent);
                    parcel2.writeNoException();
                    parcel2.writeInt(d12 ? 1 : 0);
                    return true;
                case 3:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    IBinder readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder != null) {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC0513b)) {
                            interfaceC0513b2 = (InterfaceC0513b) queryLocalInterface;
                        } else {
                            ?? obj = new Object();
                            obj.f9296e = readStrongBinder;
                            interfaceC0513b2 = obj;
                        }
                    }
                    r(interfaceC0513b2);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 != null) {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (queryLocalInterface2 != null && (queryLocalInterface2 instanceof InterfaceC0513b)) {
                            interfaceC0513b = (InterfaceC0513b) queryLocalInterface2;
                        } else {
                            ?? obj2 = new Object();
                            obj2.f9296e = readStrongBinder2;
                            interfaceC0513b = obj2;
                        }
                    }
                    r0(interfaceC0513b);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    boolean G8 = G();
                    parcel2.writeNoException();
                    parcel2.writeInt(G8 ? 1 : 0);
                    return true;
                case 6:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    String S02 = S0();
                    parcel2.writeNoException();
                    parcel2.writeString(S02);
                    return true;
                case 7:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    String x5 = x();
                    parcel2.writeNoException();
                    parcel2.writeString(x5);
                    return true;
                case 8:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    PendingIntent J8 = J();
                    parcel2.writeNoException();
                    if (J8 != null) {
                        parcel2.writeInt(1);
                        J8.writeToParcel(parcel2, 1);
                        return true;
                    }
                    parcel2.writeInt(0);
                    return true;
                case 9:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    long i11 = i();
                    parcel2.writeNoException();
                    parcel2.writeLong(i11);
                    return true;
                case R.styleable.GradientColor_android_endX /* 10 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    ParcelableVolumeInfo F02 = F0();
                    parcel2.writeNoException();
                    if (F02 != null) {
                        parcel2.writeInt(1);
                        F02.writeToParcel(parcel2, 1);
                        return true;
                    }
                    parcel2.writeInt(0);
                    return true;
                case R.styleable.GradientColor_android_endY /* 11 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    int readInt = parcel.readInt();
                    int readInt2 = parcel.readInt();
                    parcel.readString();
                    e0(readInt, readInt2);
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    int readInt3 = parcel.readInt();
                    int readInt4 = parcel.readInt();
                    parcel.readString();
                    E0(readInt3, readInt4);
                    parcel2.writeNoException();
                    return true;
                case 13:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    Z();
                    parcel2.writeNoException();
                    return true;
                case 14:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    String readString2 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle9 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    w0(readString2, bundle9);
                    parcel2.writeNoException();
                    return true;
                case 15:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    String readString3 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle8 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    C0(readString3, bundle8);
                    parcel2.writeNoException();
                    return true;
                case 16:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    if (parcel.readInt() != 0) {
                        uri = (Uri) Uri.CREATOR.createFromParcel(parcel);
                    } else {
                        uri = null;
                    }
                    if (parcel.readInt() != 0) {
                        bundle7 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    K0(uri, bundle7);
                    parcel2.writeNoException();
                    return true;
                case 17:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    B0(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 18:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    n0();
                    parcel2.writeNoException();
                    return true;
                case 19:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    stop();
                    parcel2.writeNoException();
                    return true;
                case 20:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    next();
                    parcel2.writeNoException();
                    return true;
                case 21:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    previous();
                    parcel2.writeNoException();
                    return true;
                case 22:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    H0();
                    parcel2.writeNoException();
                    return true;
                case 23:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    g0();
                    parcel2.writeNoException();
                    return true;
                case 24:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    N0(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 25:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    if (parcel.readInt() != 0) {
                        ratingCompat2 = RatingCompat.CREATOR.createFromParcel(parcel);
                    }
                    A(ratingCompat2);
                    parcel2.writeNoException();
                    return true;
                case 26:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    String readString4 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle6 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    q(readString4, bundle6);
                    parcel2.writeNoException();
                    return true;
                case 27:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    MediaMetadataCompat o02 = o0();
                    parcel2.writeNoException();
                    if (o02 != null) {
                        parcel2.writeInt(1);
                        parcel2.writeBundle(o02.f9253a);
                        return true;
                    }
                    parcel2.writeInt(0);
                    return true;
                case 28:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    PlaybackStateCompat e8 = e();
                    parcel2.writeNoException();
                    if (e8 != null) {
                        parcel2.writeInt(1);
                        e8.writeToParcel(parcel2, 1);
                        return true;
                    }
                    parcel2.writeInt(0);
                    return true;
                case 29:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    parcel2.writeNoException();
                    parcel2.writeTypedList(null);
                    return true;
                case 30:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    CharSequence j02 = j0();
                    parcel2.writeNoException();
                    if (j02 != null) {
                        parcel2.writeInt(1);
                        TextUtils.writeToParcel(j02, parcel2, 1);
                        return true;
                    }
                    parcel2.writeInt(0);
                    return true;
                case 31:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    Bundle I02 = I0();
                    parcel2.writeNoException();
                    if (I02 != null) {
                        parcel2.writeInt(1);
                        I02.writeToParcel(parcel2, 1);
                        return true;
                    }
                    parcel2.writeInt(0);
                    return true;
                case 32:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
                case 33:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    b();
                    parcel2.writeNoException();
                    return true;
                case 34:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    String readString5 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle5 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    p0(readString5, bundle5);
                    parcel2.writeNoException();
                    return true;
                case 35:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    String readString6 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle4 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    P(readString6, bundle4);
                    parcel2.writeNoException();
                    return true;
                case 36:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    if (parcel.readInt() != 0) {
                        uri2 = (Uri) Uri.CREATOR.createFromParcel(parcel);
                    } else {
                        uri2 = null;
                    }
                    if (parcel.readInt() != 0) {
                        bundle3 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    D(uri2, bundle3);
                    parcel2.writeNoException();
                    return true;
                case 37:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
                case 38:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
                case 39:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    h(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 40:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    parcel.readInt();
                    parcel2.writeNoException();
                    return true;
                case 41:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    if (parcel.readInt() != 0) {
                        mediaDescriptionCompat3 = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                    }
                    I(mediaDescriptionCompat3);
                    parcel2.writeNoException();
                    return true;
                case 42:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    if (parcel.readInt() != 0) {
                        mediaDescriptionCompat2 = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                    }
                    u(mediaDescriptionCompat2, parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 43:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    if (parcel.readInt() != 0) {
                        mediaDescriptionCompat = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                    }
                    F(mediaDescriptionCompat);
                    parcel2.writeNoException();
                    return true;
                case 44:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    M(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 45:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
                case 46:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    if (parcel.readInt() != 0) {
                        z9 = true;
                    }
                    z(z9);
                    parcel2.writeNoException();
                    return true;
                case 47:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
                case 48:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    O0(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 49:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    Y0(parcel.readFloat());
                    parcel2.writeNoException();
                    return true;
                case 50:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    Bundle q02 = q0();
                    parcel2.writeNoException();
                    if (q02 != null) {
                        parcel2.writeInt(1);
                        q02.writeToParcel(parcel2, 1);
                        return true;
                    }
                    parcel2.writeInt(0);
                    return true;
                case 51:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    if (parcel.readInt() != 0) {
                        ratingCompat = RatingCompat.CREATOR.createFromParcel(parcel);
                    } else {
                        ratingCompat = null;
                    }
                    if (parcel.readInt() != 0) {
                        bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    s(ratingCompat, bundle2);
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i9, parcel, parcel2, i10);
            }
        }
        parcel2.writeString("android.support.v4.media.session.IMediaSession");
        return true;
    }

    @Override // android.support.v4.media.session.d
    public final void p0(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void previous() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void q(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final Bundle q0() {
        return null;
    }

    @Override // android.support.v4.media.session.d
    public final void r(InterfaceC0513b interfaceC0513b) {
        if (this.f9317e.f9321d) {
            return;
        }
        this.f9317e.f9322e.register(interfaceC0513b, new C1835a("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
        synchronized (this.f9317e.f9320c) {
        }
    }

    @Override // android.support.v4.media.session.d
    public final void r0(InterfaceC0513b interfaceC0513b) {
        this.f9317e.f9322e.unregister(interfaceC0513b);
        Binder.getCallingPid();
        Binder.getCallingUid();
        synchronized (this.f9317e.f9320c) {
        }
    }

    @Override // android.support.v4.media.session.d
    public final void s(RatingCompat ratingCompat, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void stop() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void u(MediaDescriptionCompat mediaDescriptionCompat, int i9) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void w0(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final String x() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void z(boolean z9) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void L() {
    }

    @Override // android.support.v4.media.session.d
    public final void N() {
    }

    @Override // android.support.v4.media.session.d
    public final void R() {
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.support.v4.media.session.d
    public final void d0() {
    }

    @Override // android.support.v4.media.session.d
    public final void j() {
    }
}
