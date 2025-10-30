package T4;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public class d extends Handler {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Looper looper, int i9) {
        super(looper);
        switch (i9) {
            case 2:
                super(looper);
                Looper.getMainLooper();
                return;
            case 3:
            default:
                Looper.getMainLooper();
                return;
            case 4:
                super(looper);
                Looper.getMainLooper();
                return;
            case 5:
                super(looper);
                Looper.getMainLooper();
                return;
        }
    }
}
