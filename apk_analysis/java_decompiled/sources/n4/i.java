package n4;

import A6.t;
import K5.p;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;
import java.nio.Buffer;
import java.util.concurrent.atomic.AtomicBoolean;
import l4.AbstractC1566a;
import l4.y;
import m4.o;

/* loaded from: classes.dex */
public final class i implements o, InterfaceC1650a {

    /* renamed from: i, reason: collision with root package name */
    public int f21186i;
    public SurfaceTexture j;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f21189m;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f21178a = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f21179b = new AtomicBoolean(true);

    /* renamed from: c, reason: collision with root package name */
    public final g f21180c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final t f21181d = new t();

    /* renamed from: e, reason: collision with root package name */
    public final p f21182e = new p();

    /* renamed from: f, reason: collision with root package name */
    public final p f21183f = new p();

    /* renamed from: g, reason: collision with root package name */
    public final float[] f21184g = new float[16];

    /* renamed from: h, reason: collision with root package name */
    public final float[] f21185h = new float[16];

    /* renamed from: k, reason: collision with root package name */
    public volatile int f21187k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f21188l = -1;

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0180, code lost:
    
        if (r6 == r11) goto L63;
     */
    @Override // m4.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(long r37, long r39, j3.M r41, android.media.MediaFormat r42) {
        /*
            Method dump skipped, instructions count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.i.a(long, long, j3.M, android.media.MediaFormat):void");
    }

    @Override // n4.InterfaceC1650a
    public final void b(long j, float[] fArr) {
        ((p) this.f21181d.f542d).a(j, fArr);
    }

    @Override // n4.InterfaceC1650a
    public final void c() {
        this.f21182e.b();
        t tVar = this.f21181d;
        ((p) tVar.f542d).b();
        tVar.f539a = false;
        this.f21179b.set(true);
    }

    public final void d(float[] fArr) {
        float[] fArr2;
        Object d9;
        GLES20.glClear(16384);
        try {
            AbstractC1566a.i();
        } catch (l4.g e8) {
            AbstractC1566a.u("SceneRenderer", "Failed to draw a frame", e8);
        }
        if (this.f21178a.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = this.j;
            surfaceTexture.getClass();
            surfaceTexture.updateTexImage();
            try {
                AbstractC1566a.i();
            } catch (l4.g e9) {
                AbstractC1566a.u("SceneRenderer", "Failed to draw a frame", e9);
            }
            if (this.f21179b.compareAndSet(true, false)) {
                Matrix.setIdentityM(this.f21184g, 0);
            }
            long timestamp = this.j.getTimestamp();
            p pVar = this.f21182e;
            synchronized (pVar) {
                d9 = pVar.d(timestamp, false);
            }
            Long l9 = (Long) d9;
            if (l9 != null) {
                t tVar = this.f21181d;
                float[] fArr3 = this.f21184g;
                float[] fArr4 = (float[]) ((p) tVar.f542d).e(l9.longValue());
                if (fArr4 != null) {
                    float f9 = fArr4[0];
                    float f10 = -fArr4[1];
                    float f11 = -fArr4[2];
                    float length = Matrix.length(f9, f10, f11);
                    float[] fArr5 = (float[]) tVar.f541c;
                    if (length != 0.0f) {
                        Matrix.setRotateM(fArr5, 0, (float) Math.toDegrees(length), f9 / length, f10 / length, f11 / length);
                    } else {
                        Matrix.setIdentityM(fArr5, 0);
                    }
                    if (!tVar.f539a) {
                        t.e((float[]) tVar.f540b, (float[]) tVar.f541c);
                        tVar.f539a = true;
                    }
                    Matrix.multiplyMM(fArr3, 0, (float[]) tVar.f540b, 0, (float[]) tVar.f541c, 0);
                }
            }
            f fVar = (f) this.f21183f.e(timestamp);
            if (fVar != null) {
                g gVar = this.f21180c;
                gVar.getClass();
                if (g.b(fVar)) {
                    gVar.f21169a = fVar.f21165c;
                    gVar.f21170b = new p(fVar.f21163a.f21162a[0]);
                    if (!fVar.f21166d) {
                        new p(fVar.f21164b.f21162a[0]);
                    }
                }
            }
        }
        Matrix.multiplyMM(this.f21185h, 0, fArr, 0, this.f21184g, 0);
        g gVar2 = this.f21180c;
        int i9 = this.f21186i;
        float[] fArr6 = this.f21185h;
        p pVar2 = gVar2.f21170b;
        if (pVar2 != null) {
            int i10 = gVar2.f21169a;
            if (i10 == 1) {
                fArr2 = g.j;
            } else if (i10 == 2) {
                fArr2 = g.f21168k;
            } else {
                fArr2 = g.f21167i;
            }
            GLES20.glUniformMatrix3fv(gVar2.f21173e, 1, false, fArr2, 0);
            GLES20.glUniformMatrix4fv(gVar2.f21172d, 1, false, fArr6, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i9);
            GLES20.glUniform1i(gVar2.f21176h, 0);
            try {
                AbstractC1566a.i();
            } catch (l4.g e10) {
                Log.e("ProjectionRenderer", "Failed to bind uniforms", e10);
            }
            GLES20.glVertexAttribPointer(gVar2.f21174f, 3, 5126, false, 12, (Buffer) pVar2.f4355c);
            try {
                AbstractC1566a.i();
            } catch (l4.g e11) {
                Log.e("ProjectionRenderer", "Failed to load position data", e11);
            }
            GLES20.glVertexAttribPointer(gVar2.f21175g, 2, 5126, false, 8, (Buffer) pVar2.f4356d);
            try {
                AbstractC1566a.i();
            } catch (l4.g e12) {
                Log.e("ProjectionRenderer", "Failed to load texture data", e12);
            }
            GLES20.glDrawArrays(pVar2.f4354b, 0, pVar2.f4353a);
            try {
                AbstractC1566a.i();
            } catch (l4.g e13) {
                Log.e("ProjectionRenderer", "Failed to render", e13);
            }
        }
    }

    public final SurfaceTexture e() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            AbstractC1566a.i();
            this.f21180c.a();
            AbstractC1566a.i();
            AbstractC1566a.j("No current context", !y.a(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT));
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            AbstractC1566a.i();
            int i9 = iArr[0];
            AbstractC1566a.d(36197, i9);
            this.f21186i = i9;
        } catch (l4.g e8) {
            AbstractC1566a.u("SceneRenderer", "Failed to initialize the renderer", e8);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f21186i);
        this.j = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: n4.h
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                i.this.f21178a.set(true);
            }
        });
        return this.j;
    }
}
