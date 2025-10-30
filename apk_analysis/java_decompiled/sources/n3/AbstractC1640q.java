package n3;

import android.media.MediaDrm;

/* renamed from: n3.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1640q {
    public static boolean a(Throwable th) {
        return th instanceof MediaDrm.MediaDrmStateException;
    }

    public static int b(Throwable th) {
        return l4.y.s(l4.y.t(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
    }
}
