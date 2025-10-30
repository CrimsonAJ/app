package m4;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.Locale;
import l4.AbstractC1566a;
import l4.y;

/* loaded from: classes.dex */
public final class j extends HandlerThread implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public l4.d f20783a;

    /* renamed from: b, reason: collision with root package name */
    public Handler f20784b;

    /* renamed from: c, reason: collision with root package name */
    public Error f20785c;

    /* renamed from: d, reason: collision with root package name */
    public RuntimeException f20786d;

    /* renamed from: e, reason: collision with root package name */
    public k f20787e;

    public final void a(int i9) {
        boolean z9;
        boolean z10;
        int[] iArr;
        boolean z11;
        int[] iArr2;
        EGLSurface eglCreatePbufferSurface;
        boolean z12;
        boolean z13 = true;
        this.f20783a.getClass();
        l4.d dVar = this.f20783a;
        dVar.getClass();
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC1566a.j("eglGetDisplay failed", z9);
        int[] iArr3 = new int[2];
        AbstractC1566a.j("eglInitialize failed", EGL14.eglInitialize(eglGetDisplay, iArr3, 0, iArr3, 1));
        dVar.f20494c = eglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr4 = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, l4.d.f20491g, 0, eGLConfigArr, 0, 1, iArr4, 0);
        if (eglChooseConfig && iArr4[0] > 0 && eGLConfigArr[0] != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        Object[] objArr = {Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr4[0]), eGLConfigArr[0]};
        int i10 = y.f20553a;
        AbstractC1566a.j(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z10);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLDisplay eGLDisplay = dVar.f20494c;
        if (i9 == 0) {
            iArr = new int[]{12440, 2, 12344};
        } else {
            iArr = new int[]{12440, 2, 12992, 1, 12344};
        }
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr, 0);
        if (eglCreateContext != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC1566a.j("eglCreateContext failed", z11);
        dVar.f20495d = eglCreateContext;
        EGLDisplay eGLDisplay2 = dVar.f20494c;
        if (i9 == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            if (i9 == 2) {
                iArr2 = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
            } else {
                iArr2 = new int[]{12375, 1, 12374, 1, 12344};
            }
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay2, eGLConfig, iArr2, 0);
            if (eglCreatePbufferSurface != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            AbstractC1566a.j("eglCreatePbufferSurface failed", z12);
        }
        AbstractC1566a.j("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay2, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext));
        dVar.f20496e = eglCreatePbufferSurface;
        int[] iArr5 = dVar.f20493b;
        GLES20.glGenTextures(1, iArr5, 0);
        AbstractC1566a.i();
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr5[0]);
        dVar.f20497f = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(dVar);
        SurfaceTexture surfaceTexture2 = this.f20783a.f20497f;
        surfaceTexture2.getClass();
        if (i9 == 0) {
            z13 = false;
        }
        this.f20787e = new k(this, surfaceTexture2, z13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        this.f20783a.getClass();
        l4.d dVar = this.f20783a;
        dVar.f20492a.removeCallbacks(dVar);
        try {
            SurfaceTexture surfaceTexture = dVar.f20497f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, dVar.f20493b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = dVar.f20494c;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = dVar.f20494c;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = dVar.f20496e;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(dVar.f20494c, dVar.f20496e);
            }
            EGLContext eGLContext = dVar.f20495d;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(dVar.f20494c, eGLContext);
            }
            if (y.f20553a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = dVar.f20494c;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(dVar.f20494c);
            }
            dVar.f20494c = null;
            dVar.f20495d = null;
            dVar.f20496e = null;
            dVar.f20497f = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i9 = message.what;
        try {
            if (i9 != 1) {
                if (i9 == 2) {
                    try {
                        b();
                        return true;
                    } catch (Throwable th) {
                        try {
                            AbstractC1566a.u("PlaceholderSurface", "Failed to release placeholder surface", th);
                        } finally {
                            quit();
                        }
                    }
                }
            } else {
                try {
                    a(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                    return true;
                } catch (Error e8) {
                    AbstractC1566a.u("PlaceholderSurface", "Failed to initialize placeholder surface", e8);
                    this.f20785c = e8;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e9) {
                    AbstractC1566a.u("PlaceholderSurface", "Failed to initialize placeholder surface", e9);
                    this.f20786d = e9;
                    synchronized (this) {
                        notify();
                    }
                } catch (l4.g e10) {
                    AbstractC1566a.u("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                    this.f20786d = new IllegalStateException(e10);
                    synchronized (this) {
                        notify();
                    }
                }
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }
}
