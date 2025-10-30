package B4;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.util.Log;

/* loaded from: classes.dex */
public final class k extends T4.d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f709a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f710b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k(B4.f r2, android.content.Context r3) {
        /*
            r1 = this;
            r1.f710b = r2
            android.os.Looper r2 = android.os.Looper.myLooper()
            if (r2 != 0) goto Ld
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            goto L11
        Ld:
            android.os.Looper r2 = android.os.Looper.myLooper()
        L11:
            r0 = 0
            r1.<init>(r2, r0)
            android.content.Context r2 = r3.getApplicationContext()
            r1.f709a = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: B4.k.<init>(B4.f, android.content.Context):void");
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        PendingIntent activity;
        int i9 = message.what;
        if (i9 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i9);
            return;
        }
        int i10 = g.f696a;
        f fVar = this.f710b;
        Context context = this.f709a;
        int b9 = fVar.b(context, i10);
        int i11 = h.f702e;
        if (b9 != 1 && b9 != 2 && b9 != 3 && b9 != 9) {
            return;
        }
        Intent a5 = fVar.a(b9, context, "n");
        if (a5 == null) {
            activity = null;
        } else {
            activity = PendingIntent.getActivity(context, 0, a5, 201326592);
        }
        fVar.f(context, b9, activity);
    }
}
