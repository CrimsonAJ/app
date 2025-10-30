package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Handler;
import android.os.RemoteCallbackList;
import android.support.v4.media.MediaMetadataCompat;
import p0.C1835a;

/* loaded from: classes.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    public final MediaSession f9318a;

    /* renamed from: b, reason: collision with root package name */
    public final MediaSessionCompat$Token f9319b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9320c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public boolean f9321d = false;

    /* renamed from: e, reason: collision with root package name */
    public final RemoteCallbackList f9322e = new RemoteCallbackList();

    /* renamed from: f, reason: collision with root package name */
    public PlaybackStateCompat f9323f;

    /* renamed from: g, reason: collision with root package name */
    public MediaMetadataCompat f9324g;

    /* renamed from: h, reason: collision with root package name */
    public r f9325h;

    /* renamed from: i, reason: collision with root package name */
    public C1835a f9326i;

    public t(Context context) {
        MediaSession a5 = a(context);
        this.f9318a = a5;
        this.f9319b = new MediaSessionCompat$Token(a5.getSessionToken(), new s(this));
        a5.setFlags(3);
    }

    public MediaSession a(Context context) {
        return new MediaSession(context, "CastMediaSession");
    }

    public final r b() {
        r rVar;
        synchronized (this.f9320c) {
            rVar = this.f9325h;
        }
        return rVar;
    }

    public C1835a c() {
        C1835a c1835a;
        synchronized (this.f9320c) {
            c1835a = this.f9326i;
        }
        return c1835a;
    }

    public final PlaybackStateCompat d() {
        return this.f9323f;
    }

    public final void e(r rVar, Handler handler) {
        q qVar;
        synchronized (this.f9320c) {
            try {
                this.f9325h = rVar;
                MediaSession mediaSession = this.f9318a;
                if (rVar == null) {
                    qVar = null;
                } else {
                    qVar = rVar.f9312b;
                }
                mediaSession.setCallback(qVar, handler);
                if (rVar != null) {
                    rVar.i(this, handler);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void f(C1835a c1835a) {
        synchronized (this.f9320c) {
            this.f9326i = c1835a;
        }
    }
}
