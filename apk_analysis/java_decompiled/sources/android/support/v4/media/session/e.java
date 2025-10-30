package android.support.v4.media.session;

import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import s.C1935e;

/* loaded from: classes.dex */
public final class e extends MediaController.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f9298a;

    public e(androidx.mediarouter.app.p pVar) {
        this.f9298a = new WeakReference(pVar);
    }

    @Override // android.media.session.MediaController.Callback
    public final void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
        if (((androidx.mediarouter.app.p) this.f9298a.get()) != null) {
            playbackInfo.getPlaybackType();
            playbackInfo.getAudioAttributes();
            if (Build.VERSION.SDK_INT >= 26) {
            }
            playbackInfo.getVolumeControl();
            playbackInfo.getMaxVolume();
            playbackInfo.getCurrentVolume();
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onExtrasChanged(Bundle bundle) {
        y.E(bundle);
    }

    @Override // android.media.session.MediaController.Callback
    public final void onMetadataChanged(MediaMetadata mediaMetadata) {
        MediaMetadataCompat mediaMetadataCompat;
        androidx.mediarouter.app.p pVar = (androidx.mediarouter.app.p) this.f9298a.get();
        if (pVar != null) {
            C1935e c1935e = MediaMetadataCompat.f9249d;
            if (mediaMetadata != null) {
                Parcel obtain = Parcel.obtain();
                mediaMetadata.writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                mediaMetadataCompat = MediaMetadataCompat.CREATOR.createFromParcel(obtain);
                obtain.recycle();
                mediaMetadataCompat.f9254b = mediaMetadata;
            } else {
                mediaMetadataCompat = null;
            }
            pVar.a(mediaMetadataCompat);
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onPlaybackStateChanged(PlaybackState playbackState) {
        androidx.mediarouter.app.p pVar = (androidx.mediarouter.app.p) this.f9298a.get();
        if (pVar != null && pVar.f10116c == null) {
            pVar.b(PlaybackStateCompat.a(playbackState));
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onQueueChanged(List list) {
        MediaSessionCompat$QueueItem mediaSessionCompat$QueueItem;
        if (((androidx.mediarouter.app.p) this.f9298a.get()) != null && list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            for (Object obj : list) {
                if (obj != null) {
                    MediaSession.QueueItem queueItem = (MediaSession.QueueItem) obj;
                    mediaSessionCompat$QueueItem = new MediaSessionCompat$QueueItem(MediaDescriptionCompat.a(w.b(queueItem)), w.c(queueItem));
                } else {
                    mediaSessionCompat$QueueItem = null;
                }
                arrayList.add(mediaSessionCompat$QueueItem);
            }
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onQueueTitleChanged(CharSequence charSequence) {
    }

    @Override // android.media.session.MediaController.Callback
    public final void onSessionDestroyed() {
        androidx.mediarouter.app.p pVar = (androidx.mediarouter.app.p) this.f9298a.get();
        if (pVar != null) {
            pVar.d();
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onSessionEvent(String str, Bundle bundle) {
        y.E(bundle);
    }
}
