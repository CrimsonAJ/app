package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes.dex */
public final class J implements O {

    /* renamed from: a, reason: collision with root package name */
    public O[] f16300a;

    @Override // com.google.crypto.tink.shaded.protobuf.O
    public final a0 a(Class cls) {
        for (O o9 : this.f16300a) {
            if (o9.b(cls)) {
                return o9.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.O
    public final boolean b(Class cls) {
        for (O o9 : this.f16300a) {
            if (o9.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
