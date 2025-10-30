package h6;

import com.google.crypto.tink.shaded.protobuf.InterfaceC1052x;

/* loaded from: classes.dex */
public enum O implements InterfaceC1052x {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f17946a;

    O(int i9) {
        this.f17946a = i9;
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f17946a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
