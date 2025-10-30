package n4;

import A3.F;
import K5.p;
import android.opengl.GLES20;
import android.util.Log;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: i, reason: collision with root package name */
    public static final float[] f21167i = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    public static final float[] j = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    public static final float[] f21168k = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public int f21169a;

    /* renamed from: b, reason: collision with root package name */
    public p f21170b;

    /* renamed from: c, reason: collision with root package name */
    public F f21171c;

    /* renamed from: d, reason: collision with root package name */
    public int f21172d;

    /* renamed from: e, reason: collision with root package name */
    public int f21173e;

    /* renamed from: f, reason: collision with root package name */
    public int f21174f;

    /* renamed from: g, reason: collision with root package name */
    public int f21175g;

    /* renamed from: h, reason: collision with root package name */
    public int f21176h;

    public static boolean b(f fVar) {
        p[] pVarArr = fVar.f21163a.f21162a;
        if (pVarArr.length == 1 && pVarArr[0].f4353a == 0) {
            p[] pVarArr2 = fVar.f21164b.f21162a;
            if (pVarArr2.length == 1 && pVarArr2[0].f4353a == 0) {
                return true;
            }
        }
        return false;
    }

    public final void a() {
        try {
            F f9 = new F("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.f21171c = f9;
            this.f21172d = GLES20.glGetUniformLocation(f9.f50b, "uMvpMatrix");
            this.f21173e = GLES20.glGetUniformLocation(this.f21171c.f50b, "uTexMatrix");
            this.f21174f = this.f21171c.g("aPosition");
            this.f21175g = this.f21171c.g("aTexCoords");
            this.f21176h = GLES20.glGetUniformLocation(this.f21171c.f50b, "uTexture");
        } catch (l4.g e8) {
            Log.e("ProjectionRenderer", "Failed to initialize the program", e8);
        }
    }
}
