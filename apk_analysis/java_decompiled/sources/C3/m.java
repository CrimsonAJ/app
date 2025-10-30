package C3;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import m3.C1589b;

/* loaded from: classes.dex */
public interface m {
    void a();

    int d(MediaCodec.BufferInfo bufferInfo);

    void e(long j, int i9);

    void flush();

    void g(m4.h hVar, Handler handler);

    void h(int i9, boolean z9);

    void i(int i9);

    MediaFormat n();

    ByteBuffer o(int i9);

    void q(Surface surface);

    void r(int i9, C1589b c1589b, long j);

    void s(Bundle bundle);

    ByteBuffer u(int i9);

    int v();

    void w(int i9, int i10, long j, int i11);
}
