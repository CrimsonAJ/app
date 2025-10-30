package androidx.mediarouter.app;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;

/* loaded from: classes.dex */
public final class p implements IBinder.DeathRecipient {

    /* renamed from: a, reason: collision with root package name */
    public final android.support.v4.media.session.e f10114a = new android.support.v4.media.session.e(this);

    /* renamed from: b, reason: collision with root package name */
    public android.support.v4.media.session.f f10115b;

    /* renamed from: c, reason: collision with root package name */
    public android.support.v4.media.session.g f10116c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10117d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i.y f10118e;

    public p(i.y yVar, int i9) {
        this.f10117d = i9;
        this.f10118e = yVar;
    }

    public final void a(MediaMetadataCompat mediaMetadataCompat) {
        MediaDescriptionCompat a5;
        MediaDescriptionCompat a9;
        switch (this.f10117d) {
            case 0:
                if (mediaMetadataCompat == null) {
                    a5 = null;
                } else {
                    a5 = mediaMetadataCompat.a();
                }
                s sVar = (s) this.f10118e;
                sVar.f10169t0 = a5;
                sVar.q();
                sVar.p(false);
                return;
            default:
                if (mediaMetadataCompat == null) {
                    a9 = null;
                } else {
                    a9 = mediaMetadataCompat.a();
                }
                N n7 = (N) this.f10118e;
                n7.f10023j0 = a9;
                n7.g();
                n7.k();
                return;
        }
    }

    public void b(PlaybackStateCompat playbackStateCompat) {
        switch (this.f10117d) {
            case 0:
                s sVar = (s) this.f10118e;
                sVar.f10167s0 = playbackStateCompat;
                sVar.p(false);
                return;
            default:
                return;
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        e(8, null, null);
    }

    public final void d() {
        switch (this.f10117d) {
            case 0:
                s sVar = (s) this.f10118e;
                O0.c cVar = sVar.f10164q0;
                if (cVar != null) {
                    cVar.R(sVar.r0);
                    sVar.f10164q0 = null;
                    return;
                }
                return;
            default:
                N n7 = (N) this.f10118e;
                O0.c cVar2 = n7.f10020h0;
                if (cVar2 != null) {
                    cVar2.R(n7.f10022i0);
                    n7.f10020h0 = null;
                    return;
                }
                return;
        }
    }

    public final void e(int i9, Object obj, Bundle bundle) {
        android.support.v4.media.session.f fVar = this.f10115b;
        if (fVar != null) {
            Message obtainMessage = fVar.obtainMessage(i9, obj);
            obtainMessage.setData(bundle);
            obtainMessage.sendToTarget();
        }
    }

    public final void f(Handler handler) {
        if (handler == null) {
            android.support.v4.media.session.f fVar = this.f10115b;
            if (fVar != null) {
                fVar.f9300b = false;
                fVar.removeCallbacksAndMessages(null);
                this.f10115b = null;
                return;
            }
            return;
        }
        android.support.v4.media.session.f fVar2 = new android.support.v4.media.session.f(this, handler.getLooper());
        this.f10115b = fVar2;
        fVar2.f9300b = true;
    }

    public final void c(PlaybackStateCompat playbackStateCompat) {
    }
}
