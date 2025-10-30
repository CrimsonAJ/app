package h6;

import com.google.crypto.tink.shaded.protobuf.InterfaceC1052x;

/* loaded from: classes.dex */
public enum r0 implements InterfaceC1052x {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f17969a;

    r0(int i9) {
        this.f17969a = i9;
    }

    public static r0 a(int i9) {
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        if (i9 != 4) {
                            return null;
                        }
                        return CRUNCHY;
                    }
                    return RAW;
                }
                return LEGACY;
            }
            return TINK;
        }
        return UNKNOWN_PREFIX;
    }

    public final int b() {
        if (this != UNRECOGNIZED) {
            return this.f17969a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
