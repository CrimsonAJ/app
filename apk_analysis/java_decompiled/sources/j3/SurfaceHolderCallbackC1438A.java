package j3;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* renamed from: j3.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SurfaceHolderCallbackC1438A implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1441D f19226a;

    public SurfaceHolderCallbackC1438A(C1441D c1441d) {
        this.f19226a = c1441d;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i9, int i10) {
        C1441D c1441d = this.f19226a;
        c1441d.getClass();
        Surface surface = new Surface(surfaceTexture);
        c1441d.G0(surface);
        c1441d.f19278o0 = surface;
        c1441d.z0(i9, i10);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C1441D c1441d = this.f19226a;
        c1441d.G0(null);
        c1441d.z0(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i9, int i10) {
        this.f19226a.z0(i9, i10);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i9, int i10, int i11) {
        this.f19226a.z0(i10, i11);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        C1441D c1441d = this.f19226a;
        if (c1441d.r0) {
            c1441d.G0(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C1441D c1441d = this.f19226a;
        if (c1441d.r0) {
            c1441d.G0(null);
        }
        c1441d.z0(0, 0);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
