package m4;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import l4.AbstractC1566a;
import l4.y;

/* loaded from: classes.dex */
public final class k extends Surface {

    /* renamed from: d, reason: collision with root package name */
    public static int f20788d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f20789e;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f20790a;

    /* renamed from: b, reason: collision with root package name */
    public final j f20791b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f20792c;

    public k(j jVar, SurfaceTexture surfaceTexture, boolean z9) {
        super(surfaceTexture);
        this.f20791b = jVar;
        this.f20790a = z9;
    }

    public static int a(Context context) {
        String eglQueryString;
        String eglQueryString2;
        int i9 = y.f20553a;
        if (i9 < 24 || ((i9 < 26 && ("samsung".equals(y.f20555c) || "XT1650".equals(y.f20556d))) || ((i9 < 26 && !context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) || (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) == null || !eglQueryString.contains("EGL_EXT_protected_content")))) {
            return 0;
        }
        if (i9 >= 17 && (eglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString2.contains("EGL_KHR_surfaceless_context")) {
            return 1;
        }
        return 2;
    }

    public static synchronized boolean d(Context context) {
        boolean z9;
        synchronized (k.class) {
            try {
                z9 = true;
                if (!f20789e) {
                    f20788d = a(context);
                    f20789e = true;
                }
                if (f20788d == 0) {
                    z9 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z9;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [m4.j, android.os.HandlerThread, java.lang.Thread, android.os.Handler$Callback, java.lang.Object] */
    public static k f(Context context, boolean z9) {
        boolean z10;
        int i9;
        boolean z11 = false;
        if (z9 && !d(context)) {
            z10 = false;
        } else {
            z10 = true;
        }
        AbstractC1566a.m(z10);
        ?? handlerThread = new HandlerThread("ExoPlayer:PlaceholderSurface");
        if (z9) {
            i9 = f20788d;
        } else {
            i9 = 0;
        }
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), handlerThread);
        handlerThread.f20784b = handler;
        handlerThread.f20783a = new l4.d(handler);
        synchronized (handlerThread) {
            handlerThread.f20784b.obtainMessage(1, i9, 0).sendToTarget();
            while (handlerThread.f20787e == null && handlerThread.f20786d == null && handlerThread.f20785c == null) {
                try {
                    handlerThread.wait();
                } catch (InterruptedException unused) {
                    z11 = true;
                }
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = handlerThread.f20786d;
        if (runtimeException == null) {
            Error error = handlerThread.f20785c;
            if (error == null) {
                k kVar = handlerThread.f20787e;
                kVar.getClass();
                return kVar;
            }
            throw error;
        }
        throw runtimeException;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f20791b) {
            try {
                if (!this.f20792c) {
                    j jVar = this.f20791b;
                    jVar.f20784b.getClass();
                    jVar.f20784b.sendEmptyMessage(2);
                    this.f20792c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
