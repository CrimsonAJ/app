package com.google.crypto.tink.shaded.protobuf;

/* renamed from: com.google.crypto.tink.shaded.protobuf.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1047s implements O {

    /* renamed from: b, reason: collision with root package name */
    public static final C1047s f16401b = new C1047s(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16402a;

    public /* synthetic */ C1047s(int i9) {
        this.f16402a = i9;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.O
    public final a0 a(Class cls) {
        switch (this.f16402a) {
            case 0:
                if (AbstractC1050v.class.isAssignableFrom(cls)) {
                    try {
                        return (a0) AbstractC1050v.j(cls.asSubclass(AbstractC1050v.class)).i(3);
                    } catch (Exception e8) {
                        throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e8);
                    }
                }
                throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.O
    public final boolean b(Class cls) {
        switch (this.f16402a) {
            case 0:
                return AbstractC1050v.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
