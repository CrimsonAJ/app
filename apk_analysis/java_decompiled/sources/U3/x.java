package U3;

import P5.S;
import java.io.Closeable;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import k4.M;
import l4.AbstractC1566a;
import o1.C1671f;

/* loaded from: classes.dex */
public final class x implements Closeable, AutoCloseable {

    /* renamed from: g, reason: collision with root package name */
    public static final Charset f7475g = O5.e.f5491c;

    /* renamed from: a, reason: collision with root package name */
    public final O0.c f7476a;

    /* renamed from: b, reason: collision with root package name */
    public final M f7477b = new M("ExoPlayer:RtspMessageChannel:ReceiverLoader");

    /* renamed from: c, reason: collision with root package name */
    public final Map f7478c = Collections.synchronizedMap(new HashMap());

    /* renamed from: d, reason: collision with root package name */
    public w f7479d;

    /* renamed from: e, reason: collision with root package name */
    public Socket f7480e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f7481f;

    public x(O0.c cVar) {
        this.f7476a = cVar;
    }

    public final void a(Socket socket) {
        this.f7480e = socket;
        this.f7479d = new w(this, socket.getOutputStream());
        this.f7477b.f(new v(this, socket.getInputStream()), new C1671f(22, this), 0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f7481f) {
            return;
        }
        try {
            w wVar = this.f7479d;
            if (wVar != null) {
                wVar.close();
            }
            this.f7477b.e(null);
            Socket socket = this.f7480e;
            if (socket != null) {
                socket.close();
            }
            this.f7481f = true;
        } catch (Throwable th) {
            this.f7481f = true;
            throw th;
        }
    }

    public final void d(S s9) {
        AbstractC1566a.n(this.f7479d);
        w wVar = this.f7479d;
        wVar.getClass();
        wVar.f7473c.post(new A6.r(wVar, new O5.g(y.f7489h, 0).a(s9).getBytes(f7475g), s9));
    }
}
