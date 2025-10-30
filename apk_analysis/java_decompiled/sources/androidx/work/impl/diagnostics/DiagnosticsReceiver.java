package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import e1.q;
import e1.r;
import f1.e;
import f1.k;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f10440a = q.j("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            String str = f10440a;
            q.d().a(str, "Requesting diagnostics", new Throwable[0]);
            try {
                k b02 = k.b0(context);
                List singletonList = Collections.singletonList(new r(DiagnosticsWorker.class).a());
                if (!singletonList.isEmpty()) {
                    new e(b02, null, 2, singletonList).f0();
                    return;
                }
                throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
            } catch (IllegalStateException e8) {
                q.d().c(str, "WorkManager is not initialized", e8);
            }
        }
    }
}
