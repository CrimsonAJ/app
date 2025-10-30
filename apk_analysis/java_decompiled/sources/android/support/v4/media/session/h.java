package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final MediaController f9304a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9305b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f9306c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f9307d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final MediaSessionCompat$Token f9308e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver, android.os.ResultReceiver] */
    public h(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.f9308e = mediaSessionCompat$Token;
        MediaController mediaController = new MediaController(context, (MediaSession.Token) mediaSessionCompat$Token.f9272b);
        this.f9304a = mediaController;
        if (mediaSessionCompat$Token.a() == null) {
            ?? resultReceiver = new ResultReceiver(null);
            resultReceiver.f9267a = new WeakReference(this);
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, resultReceiver);
        }
    }

    public final void a() {
        MediaSessionCompat$Token mediaSessionCompat$Token = this.f9308e;
        if (mediaSessionCompat$Token.a() == null) {
            return;
        }
        ArrayList arrayList = this.f9306c;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            androidx.mediarouter.app.p pVar = (androidx.mediarouter.app.p) obj;
            g gVar = new g(pVar);
            this.f9307d.put(pVar, gVar);
            pVar.f10116c = gVar;
            try {
                mediaSessionCompat$Token.a().r(gVar);
                pVar.e(13, null, null);
            } catch (RemoteException e8) {
                Log.e("MediaControllerCompat", "Dead object in registerCallback.", e8);
            }
        }
        arrayList.clear();
    }

    public final void b(androidx.mediarouter.app.p pVar) {
        this.f9304a.unregisterCallback(pVar.f10114a);
        synchronized (this.f9305b) {
            if (this.f9308e.a() != null) {
                try {
                    g gVar = (g) this.f9307d.remove(pVar);
                    if (gVar != null) {
                        pVar.f10116c = null;
                        this.f9308e.a().r0(gVar);
                    }
                } catch (RemoteException e8) {
                    Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", e8);
                }
            } else {
                this.f9306c.remove(pVar);
            }
        }
    }
}
