package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.l3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0960l3 implements InterfaceC0955k3 {

    /* renamed from: a, reason: collision with root package name */
    public static final J1 f15532a;

    /* renamed from: b, reason: collision with root package name */
    public static final J1 f15533b;

    /* renamed from: c, reason: collision with root package name */
    public static final J1 f15534c;

    static {
        A6.i iVar = new A6.i(F1.a(), true, true);
        iVar.i("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f15532a = iVar.i("measurement.audience.refresh_event_count_filters_timestamp", false);
        f15533b = iVar.i("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f15534c = iVar.i("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }
}
