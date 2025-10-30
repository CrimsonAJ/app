package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public enum M1 implements InterfaceC0919d2 {
    PURPOSE_RESTRICTION_NOT_ALLOWED(0),
    PURPOSE_RESTRICTION_REQUIRE_CONSENT(1),
    PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST(2),
    PURPOSE_RESTRICTION_UNDEFINED(3),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f15267a;

    M1(int i9) {
        this.f15267a = i9;
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f15267a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
