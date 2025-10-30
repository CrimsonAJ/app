package h6;

import com.google.crypto.tink.shaded.protobuf.InterfaceC1052x;

/* loaded from: classes.dex */
public enum Z implements InterfaceC1052x {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f17961a;

    Z(int i9) {
        this.f17961a = i9;
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f17961a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
