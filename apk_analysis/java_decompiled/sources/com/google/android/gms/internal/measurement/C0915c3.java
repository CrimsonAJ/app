package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.c3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0915c3 implements InterfaceC0910b3 {

    /* renamed from: a, reason: collision with root package name */
    public static final J1 f15454a;

    /* renamed from: b, reason: collision with root package name */
    public static final J1 f15455b;

    /* renamed from: c, reason: collision with root package name */
    public static final J1 f15456c;

    static {
        A6.i iVar = new A6.i(F1.a(), true, true);
        iVar.i("measurement.set_default_event_parameters_with_backfill.client.dev", false);
        iVar.i("measurement.set_default_event_parameters_with_backfill.service", true);
        iVar.g(0L, "measurement.id.set_default_event_parameters.fix_service_request_ordering");
        f15454a = iVar.i("measurement.set_default_event_parameters.fix_app_update_logging", true);
        f15455b = iVar.i("measurement.set_default_event_parameters.fix_deferred_analytics_collection", true);
        f15456c = iVar.i("measurement.set_default_event_parameters.fix_service_request_ordering", false);
        iVar.i("measurement.set_default_event_parameters.fix_subsequent_launches", true);
    }
}
