package D4;

import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.internal.measurement.AbstractC0953k1;

/* renamed from: D4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerC0087f extends T4.d {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i9 = message.what;
        if (i9 != 1) {
            if (i9 != 2) {
                Log.wtf("BasePendingResult", AbstractC0953k1.j(i9, "Don't know how to handle message: "), new Exception());
                return;
            } else {
                ((BasePendingResult) message.obj).G(Status.f14658h);
                return;
            }
        }
        Pair pair = (Pair) message.obj;
        try {
            ((C4.p) pair.first).a((C4.o) pair.second);
        } catch (RuntimeException e8) {
            K k5 = BasePendingResult.f14664w;
            throw e8;
        }
    }
}
