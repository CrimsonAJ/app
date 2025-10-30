package j3;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;

/* renamed from: j3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1447c {

    /* renamed from: a, reason: collision with root package name */
    public final AudioManager f19565a;

    /* renamed from: b, reason: collision with root package name */
    public final C1445b f19566b;

    /* renamed from: c, reason: collision with root package name */
    public SurfaceHolderCallbackC1438A f19567c;

    /* renamed from: d, reason: collision with root package name */
    public int f19568d;

    /* renamed from: e, reason: collision with root package name */
    public float f19569e = 1.0f;

    public C1447c(Context context, Handler handler, SurfaceHolderCallbackC1438A surfaceHolderCallbackC1438A) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        audioManager.getClass();
        this.f19565a = audioManager;
        this.f19567c = surfaceHolderCallbackC1438A;
        this.f19566b = new C1445b(this, handler);
        this.f19568d = 0;
    }

    public final void a() {
        if (this.f19568d == 0) {
            return;
        }
        int i9 = l4.y.f20553a;
        AudioManager audioManager = this.f19565a;
        if (i9 < 26) {
            audioManager.abandonAudioFocus(this.f19566b);
        }
        b(0);
    }

    public final void b(int i9) {
        float f9;
        if (this.f19568d != i9) {
            this.f19568d = i9;
            if (i9 == 3) {
                f9 = 0.2f;
            } else {
                f9 = 1.0f;
            }
            if (this.f19569e != f9) {
                this.f19569e = f9;
                SurfaceHolderCallbackC1438A surfaceHolderCallbackC1438A = this.f19567c;
                if (surfaceHolderCallbackC1438A != null) {
                    C1441D c1441d = surfaceHolderCallbackC1438A.f19226a;
                    c1441d.D0(1, 2, Float.valueOf(c1441d.f19295x0 * c1441d.f19242A.f19569e));
                }
            }
        }
    }

    public final int c(int i9, boolean z9) {
        a();
        if (!z9) {
            return -1;
        }
        return 1;
    }
}
