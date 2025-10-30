package com.google.firebase.messaging;

import android.os.Binder;
import android.os.Process;
import android.util.Log;

/* loaded from: classes.dex */
public final class C extends Binder {

    /* renamed from: e, reason: collision with root package name */
    public final s4.i f16430e;

    public C(s4.i iVar) {
        this.f16430e = iVar;
    }

    public final void a(D d9) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "service received new intent via bind strategy");
            }
            h.access$000((h) this.f16430e.f22734a, d9.f16431a).b(new C0.e(0), new C3.v(21, d9));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
