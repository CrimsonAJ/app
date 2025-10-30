package k4;

import android.system.ErrnoException;
import android.system.OsConstants;

/* renamed from: k4.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1523x {
    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(Throwable th) {
        if ((th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES) {
            return true;
        }
        return false;
    }
}
