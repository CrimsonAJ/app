package j3;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import androidx.mediarouter.app.C0568d;
import l4.AbstractC1566a;

/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f19770a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f19771b;

    /* renamed from: c, reason: collision with root package name */
    public final SurfaceHolderCallbackC1438A f19772c;

    /* renamed from: d, reason: collision with root package name */
    public final AudioManager f19773d;

    /* renamed from: e, reason: collision with root package name */
    public C0568d f19774e;

    /* renamed from: f, reason: collision with root package name */
    public int f19775f;

    /* renamed from: g, reason: collision with root package name */
    public int f19776g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f19777h;

    public z0(Context context, Handler handler, SurfaceHolderCallbackC1438A surfaceHolderCallbackC1438A) {
        boolean z9;
        Context applicationContext = context.getApplicationContext();
        this.f19770a = applicationContext;
        this.f19771b = handler;
        this.f19772c = surfaceHolderCallbackC1438A;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
        AbstractC1566a.n(audioManager);
        this.f19773d = audioManager;
        this.f19775f = 3;
        this.f19776g = a(audioManager, 3);
        int i9 = this.f19775f;
        if (l4.y.f20553a >= 23) {
            z9 = audioManager.isStreamMute(i9);
        } else if (a(audioManager, i9) == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f19777h = z9;
        C0568d c0568d = new C0568d(3, this);
        try {
            l4.y.M(applicationContext, c0568d, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f19774e = c0568d;
        } catch (RuntimeException e8) {
            AbstractC1566a.Q("StreamVolumeManager", "Error registering stream volume receiver", e8);
        }
    }

    public static int a(AudioManager audioManager, int i9) {
        try {
            return audioManager.getStreamVolume(i9);
        } catch (RuntimeException e8) {
            AbstractC1566a.Q("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i9, e8);
            return audioManager.getStreamMaxVolume(i9);
        }
    }

    public final void b() {
        boolean z9;
        int i9 = this.f19775f;
        AudioManager audioManager = this.f19773d;
        int a5 = a(audioManager, i9);
        int i10 = this.f19775f;
        if (l4.y.f20553a >= 23) {
            z9 = audioManager.isStreamMute(i10);
        } else if (a(audioManager, i10) == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.f19776g == a5 && this.f19777h == z9) {
            return;
        }
        this.f19776g = a5;
        this.f19777h = z9;
        this.f19772c.f19226a.f19271l.e(30, new C1473y(a5, z9));
    }
}
