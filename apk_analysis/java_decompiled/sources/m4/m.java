package m4;

import android.content.Context;
import android.opengl.GLSurfaceView;

/* loaded from: classes.dex */
public final class m extends GLSurfaceView implements n {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f20802b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final l f20803a;

    public m(Context context) {
        super(context, null);
        l lVar = new l(this);
        this.f20803a = lVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(lVar);
        setRenderMode(0);
    }

    public void setOutputBuffer(m3.j jVar) {
        l lVar = this.f20803a;
        if (lVar.f20800f.getAndSet(jVar) == null) {
            lVar.f20795a.requestRender();
            return;
        }
        throw new ClassCastException();
    }

    @Deprecated
    public n getVideoDecoderOutputBufferRenderer() {
        return this;
    }
}
