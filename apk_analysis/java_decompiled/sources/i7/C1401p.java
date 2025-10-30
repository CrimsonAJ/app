package i7;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import l6.C1574f;

/* renamed from: i7.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1401p {

    /* renamed from: a, reason: collision with root package name */
    public final C1574f f18904a;

    /* renamed from: b, reason: collision with root package name */
    public final m7.j f18905b;

    public C1401p(C1574f firebaseApp, m7.j settings, E7.i backgroundDispatcher, c0 lifecycleServiceBinder) {
        kotlin.jvm.internal.h.e(firebaseApp, "firebaseApp");
        kotlin.jvm.internal.h.e(settings, "settings");
        kotlin.jvm.internal.h.e(backgroundDispatcher, "backgroundDispatcher");
        kotlin.jvm.internal.h.e(lifecycleServiceBinder, "lifecycleServiceBinder");
        this.f18904a = firebaseApp;
        this.f18905b = settings;
        Log.d(FirebaseSessionsRegistrar.TAG, "Initializing Firebase Sessions SDK.");
        firebaseApp.a();
        Context applicationContext = firebaseApp.f20587a.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(d0.f18848a);
            Y7.B.r(Y7.B.a(backgroundDispatcher), null, new C1400o(this, backgroundDispatcher, lifecycleServiceBinder, null), 3);
        } else {
            Log.e(FirebaseSessionsRegistrar.TAG, "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
        }
    }
}
