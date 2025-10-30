package x8;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class H extends C2184d {

    /* renamed from: m, reason: collision with root package name */
    public final Socket f24617m;

    public H(Socket socket) {
        this.f24617m = socket;
    }

    @Override // x8.C2184d
    public final void j() {
        Socket socket = this.f24617m;
        try {
            socket.close();
        } catch (AssertionError e8) {
            if (v4.e.D(e8)) {
                w.f24682a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e8);
                return;
            }
            throw e8;
        } catch (Exception e9) {
            w.f24682a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e9);
        }
    }

    public final IOException k(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
