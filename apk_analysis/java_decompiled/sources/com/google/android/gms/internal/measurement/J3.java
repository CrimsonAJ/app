package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class J3 implements I3 {

    /* renamed from: a, reason: collision with root package name */
    public static final J1 f15240a;

    /* renamed from: b, reason: collision with root package name */
    public static final J1 f15241b;

    /* renamed from: c, reason: collision with root package name */
    public static final J1 f15242c;

    /* renamed from: d, reason: collision with root package name */
    public static final J1 f15243d;

    /* renamed from: e, reason: collision with root package name */
    public static final J1 f15244e;

    /* renamed from: f, reason: collision with root package name */
    public static final J1 f15245f;

    static {
        A6.i iVar = new A6.i(F1.a(), true, true);
        f15240a = iVar.i("measurement.test.boolean_flag", false);
        f15241b = iVar.g(-1L, "measurement.test.cached_long_flag");
        Double valueOf = Double.valueOf(-3.0d);
        Object obj = J1.f15231g;
        f15242c = new J1(iVar, "measurement.test.double_flag", valueOf, 2);
        f15243d = iVar.g(-2L, "measurement.test.int_flag");
        f15244e = iVar.g(-1L, "measurement.test.long_flag");
        f15245f = iVar.h("measurement.test.string_flag", "---");
    }
}
