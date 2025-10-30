package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class b4 implements a4 {

    /* renamed from: a, reason: collision with root package name */
    public static final J1 f15447a;

    static {
        A6.i iVar = new A6.i(F1.a(), true, true);
        iVar.i("measurement.client.sessions.background_sessions_enabled", true);
        f15447a = iVar.i("measurement.client.sessions.enable_fix_background_engagement", false);
        iVar.i("measurement.client.sessions.immediate_start_enabled_foreground", true);
        iVar.i("measurement.client.sessions.enable_pause_engagement_in_background", true);
        iVar.i("measurement.client.sessions.session_id_enabled", true);
        iVar.g(0L, "measurement.id.client.sessions.enable_fix_background_engagement");
    }
}
