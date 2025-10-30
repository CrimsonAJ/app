package n3;

import android.media.DeniedByServerException;
import android.media.NotProvisionedException;

/* renamed from: n3.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1639p {
    public static boolean a(Throwable th) {
        return th instanceof DeniedByServerException;
    }

    public static boolean b(Throwable th) {
        return th instanceof NotProvisionedException;
    }
}
