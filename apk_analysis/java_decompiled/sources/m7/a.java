package m7;

import android.content.Context;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class a implements o {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f20866a;

    public a(Context appContext) {
        kotlin.jvm.internal.h.e(appContext, "appContext");
        Bundle bundle = appContext.getPackageManager().getApplicationInfo(appContext.getPackageName(), 128).metaData;
        this.f20866a = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // m7.o
    public final Boolean a() {
        Bundle bundle = this.f20866a;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override // m7.o
    public final Double b() {
        Bundle bundle = this.f20866a;
        if (bundle.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(bundle.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }

    @Override // m7.o
    public final Object c(E7.d dVar) {
        return A7.n.f558a;
    }

    @Override // m7.o
    public final X7.a d() {
        Bundle bundle = this.f20866a;
        if (bundle.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return new X7.a(Z0.a.A(bundle.getInt("firebase_sessions_sessions_restart_timeout"), X7.c.SECONDS));
        }
        return null;
    }
}
