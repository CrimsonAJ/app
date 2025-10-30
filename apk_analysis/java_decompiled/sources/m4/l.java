package m4;

import A3.F;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.Log;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import l4.AbstractC1566a;

/* loaded from: classes.dex */
public final class l implements GLSurfaceView.Renderer {

    /* renamed from: h, reason: collision with root package name */
    public static final String[] f20793h = {"y_tex", "u_tex", "v_tex"};

    /* renamed from: i, reason: collision with root package name */
    public static final FloatBuffer f20794i = AbstractC1566a.r(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

    /* renamed from: a, reason: collision with root package name */
    public final m f20795a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f20796b = new int[3];

    /* renamed from: c, reason: collision with root package name */
    public final int[] f20797c = new int[3];

    /* renamed from: d, reason: collision with root package name */
    public final int[] f20798d = new int[3];

    /* renamed from: e, reason: collision with root package name */
    public final int[] f20799e = new int[3];

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f20800f = new AtomicReference();

    /* renamed from: g, reason: collision with root package name */
    public F f20801g;

    public l(m mVar) {
        this.f20795a = mVar;
        for (int i9 = 0; i9 < 3; i9++) {
            int[] iArr = this.f20798d;
            this.f20799e[i9] = -1;
            iArr[i9] = -1;
        }
    }

    public final void a() {
        int[] iArr = this.f20796b;
        try {
            GLES20.glGenTextures(3, iArr, 0);
            for (int i9 = 0; i9 < 3; i9++) {
                F f9 = this.f20801g;
                GLES20.glUniform1i(GLES20.glGetUniformLocation(f9.f50b, f20793h[i9]), i9);
                GLES20.glActiveTexture(33984 + i9);
                AbstractC1566a.d(3553, iArr[i9]);
            }
            AbstractC1566a.i();
        } catch (l4.g e8) {
            Log.e("VideoDecoderGLSV", "Failed to set up the textures", e8);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        if (this.f20800f.getAndSet(null) == null) {
        } else {
            throw new ClassCastException();
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i9, int i10) {
        GLES20.glViewport(0, 0, i9, i10);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        int[] iArr = this.f20797c;
        try {
            F f9 = new F("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
            this.f20801g = f9;
            GLES20.glVertexAttribPointer(f9.g("in_pos"), 2, 5126, false, 0, (Buffer) f20794i);
            iArr[0] = this.f20801g.g("in_tc_y");
            iArr[1] = this.f20801g.g("in_tc_u");
            iArr[2] = this.f20801g.g("in_tc_v");
            GLES20.glGetUniformLocation(this.f20801g.f50b, "mColorConversion");
            AbstractC1566a.i();
            a();
            AbstractC1566a.i();
        } catch (l4.g e8) {
            Log.e("VideoDecoderGLSV", "Failed to set up the textures and program", e8);
        }
    }
}
