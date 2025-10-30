package android.support.v4.media.session;

import android.content.Intent;
import android.media.Rating;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.ResultReceiver;
import android.support.v4.media.RatingCompat;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.ParcelImpl;
import p0.C1835a;

/* loaded from: classes.dex */
public final class q extends MediaSession.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f9310a;

    public q(r rVar) {
        this.f9310a = rVar;
    }

    public static void b(t tVar) {
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 28) {
            return;
        }
        MediaSession mediaSession = tVar.f9318a;
        String str = null;
        if (i9 >= 24) {
            try {
                str = (String) mediaSession.getClass().getMethod("getCallingPackage", null).invoke(mediaSession, null);
            } catch (Exception e8) {
                Log.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e8);
            }
        }
        if (TextUtils.isEmpty(str)) {
            str = "android.media.session.MediaController";
        }
        tVar.f(new C1835a(str, -1, -1));
    }

    public final t a() {
        t tVar;
        synchronized (this.f9310a.f9311a) {
            tVar = (t) this.f9310a.f9314d.get();
        }
        if (tVar != null && this.f9310a == tVar.b()) {
            return tVar;
        }
        return null;
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        IBinder asBinder;
        Z0.d dVar;
        t a5 = a();
        if (a5 != null) {
            y.E(bundle);
            b(a5);
            try {
                if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                    Bundle bundle2 = new Bundle();
                    MediaSessionCompat$Token mediaSessionCompat$Token = a5.f9319b;
                    d a9 = mediaSessionCompat$Token.a();
                    if (a9 == null) {
                        asBinder = null;
                    } else {
                        asBinder = a9.asBinder();
                    }
                    bundle2.putBinder("android.support.v4.media.session.EXTRA_BINDER", asBinder);
                    synchronized (mediaSessionCompat$Token.f9271a) {
                        dVar = mediaSessionCompat$Token.f9274d;
                    }
                    if (dVar != null) {
                        Bundle bundle3 = new Bundle();
                        bundle3.putParcelable("a", new ParcelImpl(dVar));
                        bundle2.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", bundle3);
                    }
                    resultReceiver.send(0, bundle2);
                } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                    r rVar = this.f9310a;
                    rVar.getClass();
                } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                    r rVar2 = this.f9310a;
                    bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX");
                    rVar2.getClass();
                } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                    r rVar3 = this.f9310a;
                    rVar3.getClass();
                } else if (!str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                    this.f9310a.getClass();
                }
            } catch (BadParcelableException unused) {
                Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
            }
            a5.f(null);
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCustomAction(String str, Bundle bundle) {
        t a5 = a();
        if (a5 != null) {
            y.E(bundle);
            b(a5);
            try {
                boolean equals = str.equals("android.support.v4.media.session.action.PLAY_FROM_URI");
                r rVar = this.f9310a;
                if (equals) {
                    y.E(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                    rVar.getClass();
                } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                    rVar.getClass();
                } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                    bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                    y.E(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                    rVar.getClass();
                } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                    bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                    y.E(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                    rVar.getClass();
                } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                    y.E(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                    rVar.getClass();
                } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                    bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                    rVar.getClass();
                } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                    bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE");
                    rVar.getClass();
                } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                    bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE");
                    rVar.getClass();
                } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                    y.E(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                    rVar.getClass();
                } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                    bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f);
                    rVar.getClass();
                } else {
                    rVar.b(str);
                }
            } catch (BadParcelableException unused) {
                Log.e("MediaSessionCompat", "Could not unparcel the data.");
            }
            a5.f(null);
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onFastForward() {
        t a5 = a();
        if (a5 == null) {
            return;
        }
        b(a5);
        this.f9310a.getClass();
        a5.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final boolean onMediaButtonEvent(Intent intent) {
        t a5 = a();
        if (a5 != null) {
            b(a5);
            boolean c3 = this.f9310a.c(intent);
            a5.f(null);
            if (!c3 && !super.onMediaButtonEvent(intent)) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPause() {
        t a5 = a();
        if (a5 == null) {
            return;
        }
        b(a5);
        this.f9310a.d();
        a5.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlay() {
        t a5 = a();
        if (a5 == null) {
            return;
        }
        b(a5);
        this.f9310a.e();
        a5.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromMediaId(String str, Bundle bundle) {
        t a5 = a();
        if (a5 == null) {
            return;
        }
        y.E(bundle);
        b(a5);
        this.f9310a.getClass();
        a5.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromSearch(String str, Bundle bundle) {
        t a5 = a();
        if (a5 == null) {
            return;
        }
        y.E(bundle);
        b(a5);
        this.f9310a.getClass();
        a5.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromUri(Uri uri, Bundle bundle) {
        t a5 = a();
        if (a5 == null) {
            return;
        }
        y.E(bundle);
        b(a5);
        this.f9310a.getClass();
        a5.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepare() {
        t a5 = a();
        if (a5 == null) {
            return;
        }
        b(a5);
        this.f9310a.getClass();
        a5.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromMediaId(String str, Bundle bundle) {
        t a5 = a();
        if (a5 == null) {
            return;
        }
        y.E(bundle);
        b(a5);
        this.f9310a.getClass();
        a5.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromSearch(String str, Bundle bundle) {
        t a5 = a();
        if (a5 == null) {
            return;
        }
        y.E(bundle);
        b(a5);
        this.f9310a.getClass();
        a5.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromUri(Uri uri, Bundle bundle) {
        t a5 = a();
        if (a5 == null) {
            return;
        }
        y.E(bundle);
        b(a5);
        this.f9310a.getClass();
        a5.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onRewind() {
        t a5 = a();
        if (a5 == null) {
            return;
        }
        b(a5);
        this.f9310a.getClass();
        a5.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSeekTo(long j) {
        t a5 = a();
        if (a5 == null) {
            return;
        }
        b(a5);
        this.f9310a.f(j);
        a5.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetPlaybackSpeed(float f9) {
        t a5 = a();
        if (a5 == null) {
            return;
        }
        b(a5);
        this.f9310a.getClass();
        a5.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetRating(Rating rating) {
        float f9;
        t a5 = a();
        if (a5 == null) {
            return;
        }
        b(a5);
        RatingCompat ratingCompat = null;
        if (rating != null) {
            int b9 = android.support.v4.media.e.b(rating);
            if (android.support.v4.media.e.e(rating)) {
                float f10 = 1.0f;
                switch (b9) {
                    case 1:
                        if (!android.support.v4.media.e.d(rating)) {
                            f10 = 0.0f;
                        }
                        ratingCompat = new RatingCompat(1, f10);
                        break;
                    case 2:
                        if (!android.support.v4.media.e.f(rating)) {
                            f10 = 0.0f;
                        }
                        ratingCompat = new RatingCompat(2, f10);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        float c3 = android.support.v4.media.e.c(rating);
                        if (b9 != 3) {
                            if (b9 != 4) {
                                if (b9 != 5) {
                                    Log.e("Rating", "Invalid rating style (" + b9 + ") for a star rating");
                                    break;
                                } else {
                                    f9 = 5.0f;
                                }
                            } else {
                                f9 = 4.0f;
                            }
                        } else {
                            f9 = 3.0f;
                        }
                        if (c3 >= 0.0f && c3 <= f9) {
                            ratingCompat = new RatingCompat(b9, c3);
                            break;
                        } else {
                            Log.e("Rating", "Trying to set out of range star-based rating");
                            break;
                        }
                        break;
                    case 6:
                        float a9 = android.support.v4.media.e.a(rating);
                        if (a9 >= 0.0f && a9 <= 100.0f) {
                            ratingCompat = new RatingCompat(6, a9);
                            break;
                        } else {
                            Log.e("Rating", "Invalid percentage-based rating value");
                            break;
                        }
                        break;
                }
            } else {
                switch (b9) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        ratingCompat = new RatingCompat(b9, -1.0f);
                        break;
                }
            }
            ratingCompat.getClass();
        }
        this.f9310a.getClass();
        a5.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToNext() {
        t a5 = a();
        if (a5 == null) {
            return;
        }
        b(a5);
        this.f9310a.g();
        a5.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToPrevious() {
        t a5 = a();
        if (a5 == null) {
            return;
        }
        b(a5);
        this.f9310a.h();
        a5.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToQueueItem(long j) {
        t a5 = a();
        if (a5 == null) {
            return;
        }
        b(a5);
        this.f9310a.getClass();
        a5.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onStop() {
        t a5 = a();
        if (a5 == null) {
            return;
        }
        b(a5);
        this.f9310a.getClass();
        a5.f(null);
    }
}
