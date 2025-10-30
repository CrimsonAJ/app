package n4;

import A6.r;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes.dex */
public final class j implements GLSurfaceView.Renderer, InterfaceC1652c {

    /* renamed from: a, reason: collision with root package name */
    public final i f21190a;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f21193d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f21194e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f21195f;

    /* renamed from: g, reason: collision with root package name */
    public float f21196g;

    /* renamed from: h, reason: collision with root package name */
    public float f21197h;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ k f21199k;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f21191b = new float[16];

    /* renamed from: c, reason: collision with root package name */
    public final float[] f21192c = new float[16];

    /* renamed from: i, reason: collision with root package name */
    public final float[] f21198i = new float[16];
    public final float[] j = new float[16];

    public j(k kVar, i iVar) {
        this.f21199k = kVar;
        float[] fArr = new float[16];
        this.f21193d = fArr;
        float[] fArr2 = new float[16];
        this.f21194e = fArr2;
        float[] fArr3 = new float[16];
        this.f21195f = fArr3;
        this.f21190a = iVar;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr3, 0);
        this.f21197h = 3.1415927f;
    }

    @Override // n4.InterfaceC1652c
    public final synchronized void a(float[] fArr, float f9) {
        float[] fArr2 = this.f21193d;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        float f10 = -f9;
        this.f21197h = f10;
        Matrix.setRotateM(this.f21194e, 0, -this.f21196g, (float) Math.cos(f10), (float) Math.sin(this.f21197h), 0.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        synchronized (this) {
            Matrix.multiplyMM(this.j, 0, this.f21193d, 0, this.f21195f, 0);
            Matrix.multiplyMM(this.f21198i, 0, this.f21194e, 0, this.j, 0);
        }
        Matrix.multiplyMM(this.f21192c, 0, this.f21191b, 0, this.f21198i, 0);
        this.f21190a.d(this.f21192c);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i9, int i10) {
        float f9;
        GLES20.glViewport(0, 0, i9, i10);
        float f10 = i9 / i10;
        if (f10 > 1.0f) {
            f9 = (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f10)) * 2.0d);
        } else {
            f9 = 90.0f;
        }
        Matrix.perspectiveM(this.f21191b, 0, f9, f10, 0.1f, 100.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        k kVar = this.f21199k;
        kVar.f21205e.post(new r(kVar, 23, this.f21190a.e()));
    }
}
