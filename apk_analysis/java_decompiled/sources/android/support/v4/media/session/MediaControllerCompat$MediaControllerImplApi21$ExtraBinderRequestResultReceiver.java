package android.support.v4.media.session;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.versionedparcelable.ParcelImpl;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver extends ResultReceiver {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference f9267a;

    /* JADX WARN: Type inference failed for: r4v2, types: [android.support.v4.media.session.c, java.lang.Object] */
    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i9, Bundle bundle) {
        d dVar;
        h hVar = (h) this.f9267a.get();
        if (hVar != null && bundle != null) {
            synchronized (hVar.f9305b) {
                MediaSessionCompat$Token mediaSessionCompat$Token = hVar.f9308e;
                IBinder binder = bundle.getBinder("android.support.v4.media.session.EXTRA_BINDER");
                int i10 = s.f9316f;
                Z0.d dVar2 = null;
                if (binder == null) {
                    dVar = null;
                } else {
                    IInterface queryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                    if (queryLocalInterface != null && (queryLocalInterface instanceof d)) {
                        dVar = (d) queryLocalInterface;
                    } else {
                        ?? obj = new Object();
                        obj.f9297e = binder;
                        dVar = obj;
                    }
                }
                mediaSessionCompat$Token.d(dVar);
                MediaSessionCompat$Token mediaSessionCompat$Token2 = hVar.f9308e;
                try {
                    Bundle bundle2 = (Bundle) bundle.getParcelable("android.support.v4.media.session.SESSION_TOKEN2");
                    if (bundle2 != null) {
                        bundle2.setClassLoader(Z0.a.class.getClassLoader());
                        Parcelable parcelable = bundle2.getParcelable("a");
                        if (parcelable instanceof ParcelImpl) {
                            dVar2 = ((ParcelImpl) parcelable).f10391a;
                        } else {
                            throw new IllegalArgumentException("Invalid parcel");
                        }
                    }
                } catch (RuntimeException unused) {
                }
                mediaSessionCompat$Token2.f(dVar2);
                hVar.a();
            }
        }
    }
}
