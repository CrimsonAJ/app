package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0991s0 implements InterfaceC0924e2 {

    /* renamed from: b, reason: collision with root package name */
    public static final C0991s0 f15579b = new C0991s0(0);

    /* renamed from: c, reason: collision with root package name */
    public static final C0991s0 f15580c = new C0991s0(1);

    /* renamed from: d, reason: collision with root package name */
    public static final C0991s0 f15581d = new C0991s0(2);

    /* renamed from: e, reason: collision with root package name */
    public static final C0991s0 f15582e = new C0991s0(3);

    /* renamed from: f, reason: collision with root package name */
    public static final C0991s0 f15583f = new C0991s0(4);

    /* renamed from: g, reason: collision with root package name */
    public static final C0991s0 f15584g = new C0991s0(5);

    /* renamed from: h, reason: collision with root package name */
    public static final C0991s0 f15585h = new C0991s0(6);

    /* renamed from: i, reason: collision with root package name */
    public static final C0991s0 f15586i = new C0991s0(7);
    public static final C0991s0 j = new C0991s0(8);

    /* renamed from: k, reason: collision with root package name */
    public static final C0991s0 f15587k = new C0991s0(9);

    /* renamed from: l, reason: collision with root package name */
    public static final C0991s0 f15588l = new C0991s0(10);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15589a;

    public /* synthetic */ C0991s0(int i9) {
        this.f15589a = i9;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0924e2
    public final boolean a(int i9) {
        switch (this.f15589a) {
            case 0:
                if (i9 == 0 || i9 == 1 || i9 == 2 || i9 == 3 || i9 == 4) {
                    return true;
                }
                return false;
            case 1:
                switch (i9) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        return true;
                    default:
                        return false;
                }
            case 2:
                if (i9 == 0 || i9 == 1 || i9 == 2) {
                    return true;
                }
                return false;
            case 3:
                if (s8.e.j0(i9) != 0) {
                    return true;
                }
                return false;
            case 4:
                if (i9 == 0 || i9 == 1 || i9 == 2 || i9 == 3 || i9 == 4 || i9 == 5) {
                    return true;
                }
                return false;
            case 5:
                if (i9 == 0 || i9 == 1) {
                    return true;
                }
                return false;
            case 6:
                if (i9 == 1 || i9 == 2) {
                    return true;
                }
                return false;
            case 7:
                if (AbstractC0953k1.d(i9) != 0) {
                    return true;
                }
                return false;
            case 8:
                if (i9 == 0 || i9 == 1 || i9 == 2 || i9 == 3 || i9 == 4 || i9 == 5) {
                    return true;
                }
                return false;
            case 9:
                if (i9 == 0 || i9 == 1 || i9 == 2 || i9 == 3 || i9 == 4) {
                    return true;
                }
                return false;
            default:
                if (i9 == 0 || i9 == 1 || i9 == 2 || i9 == 3 || i9 == 4) {
                    return true;
                }
                return false;
        }
    }
}
